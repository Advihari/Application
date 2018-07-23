package com.mypackage;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCDemo {


	public static void main(String[] args) throws Exception {
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "javamay", "javamay");
		Statement stmt=conn.createStatement();
		int result= stmt.executeUpdate("insert into employee values(389,'ha',50000,23)");
		System.out.println(result);
		
//		while(res.next())
//		{
//		String empname=rs.getString("empname");
//		int salary=rs.getInt("salary");
//		int age=rs.getInt("age");
		
		}

	}


