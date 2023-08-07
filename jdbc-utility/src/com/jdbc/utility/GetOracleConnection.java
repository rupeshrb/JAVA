package com.jdbc.utility;
import java.sql.Connection;
import java.sql.SQLException;


import oracle.jdbc.pool.OracleDataSource;

public class GetOracleConnection {
public static OracleDataSource ods;
public static Connection conn;
public GetOracleConnection() throws SQLException{
	
}
public static Connection getMyOracleConn() {
	try {
		ods=new OracleDataSource();
		ods.setUser("system");
		ods.setPassword("1234");
		ods.setPortNumber(1521);
		ods.setDriverType("thin");
		ods.setDatabaseName("xe");
		ods.setServerName("localhost");
		conn=ods.getConnection();
	
	}
	catch(Exception e) {
		e.printStackTrace();
//		ods.close();
	}
	return conn;
	}
}
