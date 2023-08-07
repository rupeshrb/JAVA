package com.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.jdbc.utility.GetOracleConnection;

public class reslt_set {
public static void main(String[] args) {
	Connection conn;
	conn=GetOracleConnection.getMyOracleConn();
	PreparedStatement pst;
	String qry="select * from empdata";
	ResultSet rs;
	try {
		pst =conn.prepareStatement(qry);
		//pst.setInt(1, Integer.parseInt(args[0]));

		rs = pst.executeQuery();
		//looping thru the result set
		while(rs.next()) {
			System.out.print("record no "+rs.getRow()+"\t");
			System.out.print("id is "+rs.getInt("empid")+"\t\t");
			System.out.println("name is "+ rs.getString("ename")+"\t");
	}
//		if(rs.next()) {
//			System.out.println("name is "+ rs.getString("ename"));
//		}
//		else {
//			System.out.println("rec not existing");
//		}
//		
	
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}

