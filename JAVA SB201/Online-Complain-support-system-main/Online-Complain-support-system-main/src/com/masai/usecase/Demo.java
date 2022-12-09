package com.masai.usecase;

import java.sql.Connection;

import com.masai.utility.DBUtil;

public class Demo {

	public static void main(String[] args) {
		Connection conn = DBUtil.provideConnection();
		System.out.println(conn!=null);

	}

}
