package com.masai.doa;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.masai.bean.Comp_Assign_Eng;
import com.masai.bean.Complain;
import com.masai.bean.Employee;
import com.masai.exception.ComplainException;
import com.masai.exception.EmployeeException;
import com.masai.utility.DBUtil;

public interface Employeedoa {
	
	public static Employee checkEmployee(String username , String password)throws EmployeeException {
		String msg = "EMPLOYEE NOT FOUND ";
		Employee emp = null;
		int flag=0;
		
		try(Connection conn = DBUtil.provideConnection()) {
			
			PreparedStatement ps =  conn.prepareStatement("select * from employee where username = ? and "
					+ "password = ? ");
			
			ps.setString(1, username);
			ps.setString(2, password);
			
			 ResultSet rs =  ps.executeQuery();
			 
			 if(rs.next()) {
				 msg="Employee Login Suceessful";
				 flag=1;
			 }else {
				 throw new EmployeeException("Invalid Employee Details ");
			 }
			  
			
		} catch (SQLException e) {
			throw new EmployeeException(e.getMessage());
		}
		
		if(flag==1)
		 emp = new Employee(username,password);
		
		System.out.println(msg);
		return emp;
	}
	
	public static String regEmployee(String username, String password) throws EmployeeException {
		String msg = "Technical Error Registration Failed ";
		
		try(Connection conn = DBUtil.provideConnection()) {
			
			PreparedStatement ps =  conn.prepareStatement("insert into employee values(?,?)");
			
			ps.setString(1, username);
			ps.setString(2, password);
			
			int x = ps.executeUpdate();
			if(x>0) msg="Employee Registration successful";
			else {
				throw new EmployeeException("Employee Registration Failed ");
			}
			
			
			
			
		} catch (SQLException e) {
			throw new EmployeeException(e.getMessage());
		}
		
		
		return msg;
	}
	
	
	public String regAComp(String status,String des, String category,Employee emp) throws ComplainException;
	
	public Comp_Assign_Eng getCompDetails(int compid,Employee emp) throws ComplainException;
	
	public List<Complain> getYourCompHistory(Employee emp) throws ComplainException;
	
	public String changePass(String newPass,Employee emp) throws EmployeeException;

}
