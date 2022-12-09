package com.masai.doa;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.masai.bean.Complain;
import com.masai.bean.Engineer;
import com.masai.bean.HOD;
import com.masai.exception.ComplainException;
import com.masai.exception.EngineerException;
import com.masai.exception.HODException;
import com.masai.utility.DBUtil;

public interface HODdoa {
	
	public static HOD checkHOD(String username ,String password)throws HODException {
		String msg = "ADMIN NOT FOUND ";
		HOD hod = null;
		int flag=0;
		
		try(Connection conn = DBUtil.provideConnection()){
		PreparedStatement ps = conn.prepareStatement("select * from hod where username=? and password= ? ");
			ps.setString(1, username);
			ps.setString(2, password);
			ResultSet rs =  ps.executeQuery();
			if(rs.next()) {
				flag=1;
				msg="HOD Login Successful";
			}else {
				throw new HODException("invalid Username or Password ");
			}
		
		}catch (SQLException e) {
			throw new HODException(e.getMessage());
		}
		
		if(flag==1)
		hod = new HOD(username,password);
		
		
		
		System.out.println(msg);
		return hod;
	}
	
	
	
	public List<Engineer> getAllEng() throws EngineerException;
	
	public String deleteAnEng(String username) throws EngineerException;
	
	public List<Complain> getAllComp() throws ComplainException;
	
	public String assignCompToEng(int compid,String eng_username) throws ComplainException;
	
}
