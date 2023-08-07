package com.jdbc;

import java.sql.Connection;
import java.sql.Statement;

import oracle.jdbc.pool.OracleDataSource;

public class database {
	public static void main(String[] args) {
		 
		Connection con;
		Statement st;
		String qry="insert into empdata values(7,'react')";
		OracleDataSource ods;
		try {
			ods=new OracleDataSource();
			ods.setUser("system");
			ods.setPassword("1234");
			ods.setPortNumber(1521);
			ods.setDriverType("thin");
			ods.setDatabaseName("xe");
			ods.setServerName("localhost");
			con=ods.getConnection();
			st=con.createStatement();
			int row =st.executeUpdate(qry);
			if(row>0)
				System.out.println("sucess");
		}
		catch(Exception e) {
			e.printStackTrace();
//			ods.close();
		}
		}
}
