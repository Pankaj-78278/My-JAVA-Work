package com.masai.doa;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.masai.bean.Complain;
import com.masai.bean.Engineer;
import com.masai.exception.ComplainException;
import com.masai.exception.EngineerException;
import com.masai.utility.DBUtil;

public interface Engineerdoa {
	
	public static Engineer checkEngineer(String username , String password) throws EngineerException {
		String msg="ENGINEER NOT FOUND ";
		Engineer eng= null;
		int flag=0;
		
		try (Connection conn = DBUtil.provideConnection()){
			PreparedStatement ps =  conn.prepareStatement("select * from engineer "
					+ "where username = ? and password = ?");
			
			 ps.setString(1,username);
			 ps.setString(2, password);
			 
			 ResultSet rs =  ps.executeQuery();
			 
			 if(rs.next()) {
				 flag=1;
				 
				 msg="Enginner Login Successful ";
			 }else {
				 throw new EngineerException("Invalid Username or Password ");
			 }
			
			
		} catch (SQLException e) {
			throw new EngineerException(e.getMessage());
			
		}
		System.out.println(msg);
		
		
		if(flag==1) {
		eng=  new Engineer(username,password);
		}
		
		return eng;
		
	
		
	
	}
	
	
	public static String regNewEngineer(String username , String password) throws EngineerException {
		String msg="Registration failed ";
		
		try(Connection conn = DBUtil.provideConnection()) {
			
			PreparedStatement ps = conn.prepareStatement("insert into engineer values (?,?)");
			ps.setString(1, username);
			ps.setString(2, password);
			
			int x = ps.executeUpdate();
			if(x>0) msg="Engineer Registration Successful ";
			else {
				throw new EngineerException("Engineer Registration failed ");
			}
			
		} catch (SQLException e) {
			throw new EngineerException(e.getMessage());
		}
		
		return msg;
	}
	
	
	
	public List<Complain> getCompsOfYou(Engineer eng) throws ComplainException;
	
	public String updateCompStatus(int compid,String status,Engineer eng) throws ComplainException;
	
	public List<Complain> getCompHistory(Engineer eng) throws ComplainException;
	
	public String changePass(String newPass,Engineer eng) throws EngineerException;

}
