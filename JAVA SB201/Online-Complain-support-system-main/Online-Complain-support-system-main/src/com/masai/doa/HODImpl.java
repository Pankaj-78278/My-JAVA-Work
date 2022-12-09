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

public class HODImpl implements HODdoa{


	@Override
	public List<Engineer> getAllEng() throws EngineerException{
		List<Engineer> englist= new ArrayList<>();
		
		try(Connection conn = DBUtil.provideConnection()) {
			
			PreparedStatement ps = conn.prepareStatement("select * from engineer");
			
			ResultSet rs =  ps.executeQuery();
			
			boolean flag=true;
			
			while(rs.next()) {
				flag=false;
				String username= rs.getString("username");
				String password = rs.getString("password");
				Engineer eng = new Engineer(username,password);
				englist.add(eng);
			}
			
			if(flag) {
				throw new EngineerException("Engineer Not Found ");
			}
			  
		
			
			
		} catch (SQLException e) {
			throw new EngineerException(e.getMessage());
		}
		

		
		return englist;
		}

	@Override
	public String deleteAnEng(String username) throws EngineerException {
		String msg="deletion failed ";
		
		
		
		try(Connection conn = DBUtil.provideConnection()) {
			
			PreparedStatement ps =  conn.prepareStatement("delete from engineer where username = ?");
			ps.setString(1, username);
			
			int x = ps.executeUpdate();
			if(x>0) msg=username+" successfully deleted ";
			else {
				throw new EngineerException("Engineer Not Found ");
			}
			
			
		} catch (SQLException e) {
			throw new EngineerException(e.getMessage());
		}
		
		
		return msg;
	}

	@Override
	public List<Complain> getAllComp() throws ComplainException{
		List<Complain> complist = new ArrayList<>();
		
		try (Connection conn = DBUtil.provideConnection()){
			
			PreparedStatement ps = conn.prepareStatement("select * from complain where status='raised'");
			
			ResultSet rs =  ps.executeQuery();
			
			boolean flag=true;
			
			while(rs.next()) {
				flag=false;
				int cid = rs.getInt("cid");
				String status = rs.getString("status");
				String des = rs.getString("des");
				String category = rs.getString("category");
				String emp_username= rs.getString("emp_username");
				
				Complain comp = new Complain(cid,status,des,category,emp_username);
				complist.add(comp);
				
			}
			
			if(flag) {
				throw new ComplainException("Complain Not Found ");
			}
			
			
			
			
		} catch (SQLException e) {
			throw new ComplainException(e.getMessage());
		}
		
		
		
		return complist;
	}

	@Override
	public String assignCompToEng(int compid, String eng_username)throws ComplainException{
		String msg=compid+" is not assigned "+eng_username+" successfully ";
		
		try(Connection conn = DBUtil.provideConnection()) {
			
			PreparedStatement ps = conn.prepareStatement("insert into eng_com values(?,?)");
			ps.setInt(1, compid);
			ps.setString(2, eng_username);
			PreparedStatement ps2 = conn.prepareStatement("update complain set status='assigned' where cid=?");
			ps2.setInt(1, compid);
			int y = ps2.executeUpdate();
			
			int x  = ps.executeUpdate();
			
			if(x>0 && y>0 ) msg="Complaint "+compid+" is assigned "+eng_username+" successfully ";
			else {
				throw new ComplainException("Values you enter Are Not matching ");
			}
			
			
			
			
			
			
		} catch (SQLException e) {
			throw new ComplainException(e.getMessage());
		}
		
		
		return msg;
		
	}

}
