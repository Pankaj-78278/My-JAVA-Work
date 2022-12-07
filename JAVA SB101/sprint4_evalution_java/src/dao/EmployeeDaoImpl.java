package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import dbUtility.Utility;
import model.Employee;
//empId: int primary key auto_increment
//ename: varchar(12) not null
//address: varchar(12)
//email: varchar(20) not null unique
//password: varchar(12)
//salary: int
//deptId: int


public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public String reisterEmployee(Employee employee) {
		String result="Not inserted";
		
		try(Connection conn=Utility.provide_connection()) {
			PreparedStatement ps=conn.prepareStatement("insert into Employee (empid,ename,address,email,password,salary,deptid) values(?,?,?,?)");
			
			int x=ps.executeUpdate();	
			
			
			
			if(x>0) {
				result="Employee register succesful";
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		

		return result;
	}

	
}
