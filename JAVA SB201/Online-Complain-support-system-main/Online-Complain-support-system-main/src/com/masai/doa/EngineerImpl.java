package com.masai.doa;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.masai.bean.Complain;
import com.masai.bean.Engineer;
import com.masai.exception.ComplainException;
import com.masai.exception.EngineerException;
import com.masai.utility.DBUtil;

public class EngineerImpl implements Engineerdoa {

	@Override
	public List<Complain> getCompsOfYou(Engineer eng) throws ComplainException {
		List<Complain> complist = new ArrayList<>();
		
		try(Connection conn = DBUtil.provideConnection()) {
			
			PreparedStatement ps =  conn.prepareStatement("select c.cid,c.status,c.des,c.category,c.emp_username from complain c inner join"
					+ " eng_com ec on c.cid=ec.cid and ec.eng_username=? and c.status !='completed'");
			ps.setString(1,eng.getUsername());
			
			ResultSet rs =  ps.executeQuery();
			
			boolean flag=true;
			
			while(rs.next()) {	
				flag=false;
				int cid = rs.getInt("c.cid");
				String status = rs.getString("c.status");
				String des = rs.getString("c.des");
				String category = rs.getString("c.category");
				String emp_username = rs.getString("c.emp_username");
				Complain comp = new Complain(cid,status,des,category,emp_username);
				complist.add(comp);
			}
			if(flag) {
			  throw new ComplainException("No Complains Found ");
			}
		    
			
		} catch (SQLException e) {
			throw new ComplainException(e.getMessage());
		}
		
		
		
		return complist;
		
	}

	@Override
	public String updateCompStatus(int compid ,String status,Engineer eng) throws ComplainException {
		String msg="not updated ";
		
		try(Connection conn = DBUtil.provideConnection()) {
			
			PreparedStatement ps =  conn.prepareStatement("update complain c inner join eng_com ec on c.cid=ec.cid and c.cid=? "
					+ "and ec.cid=? and ec.eng_username=? set c.status=?;");
		
			ps.setInt(1, compid);
			ps.setInt(2, compid);
			ps.setString(3, eng.getUsername());
			ps.setString(4, status);
			
			int x =ps.executeUpdate();
			if(x>0) msg="status updated successfully ";
			else {
				throw new ComplainException("Complain Updation Failed ");
			}
			
			
			
		} catch (SQLException e) {
			throw new ComplainException(e.getMessage());
		}
		
		return msg;
	}

	@Override
	public List<Complain> getCompHistory(Engineer eng) throws ComplainException{
		List<Complain> complist = new ArrayList<>();
		
		try(Connection conn = DBUtil.provideConnection()) {
			
			PreparedStatement ps =  conn.prepareStatement("select c.cid,c.status,c.des,c.category,c.emp_username from "
					+ "complain c inner join eng_com ec on"
					+ " c.cid=ec.cid and ec.eng_username=?;");
			
			ps.setString(1,eng.getUsername());
			ResultSet rs =  ps.executeQuery();
			
			boolean flag=true;
			
			while(rs.next()) {
				flag=false;
				int cid = rs.getInt(1);
				String status = rs.getString(2);
				String des = rs.getString(3);
				String category = rs.getString(4);
				String emp_username= rs.getString(5);
				
				Complain comp = new Complain(cid,status,des,category,emp_username);
				complist.add(comp);
				
			}
			
			if(flag) {
				throw new ComplainException("Complain Not History Found ");
			}
			
		} catch (SQLException e) {
			throw new ComplainException(e.getMessage());
		}
		
		
		
		
		return complist;
	}

	@Override
	public String changePass(String newPass,Engineer eng) throws EngineerException {
		String msg = "password not updated ";
		
		try (Connection conn = DBUtil.provideConnection()){
			
			PreparedStatement ps = conn.prepareStatement("update engineer set password = ? where username=?");
			ps.setString(1, newPass);
			ps.setString(2, eng.getUsername());
			
			int x = ps.executeUpdate();
			if(x>0) msg="Password Updated Successfully ";
			else {
				throw new EngineerException("Engineer Password Updation Failed ");
			}
			
		} catch (SQLException e) {
			throw new EngineerException(e.getMessage());
		}
		
		
		return msg;
	}

}
