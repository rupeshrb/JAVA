package com.date_base;
import com.demo.Add_Dept_Bean;

import oracle.jdbc.pool.OracleDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertData {
	Connection conn;
	//conn=GetOracleConnection.getMyOracleConn();
	PreparedStatement pst;
	String qry="insert into dept1 values(?,?)";
	OracleDataSource ods;
	public InsertData(){
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
	}
	public int insertData(Add_Dept_Bean adb) {
	int row=0;	
	try {
		pst =conn.prepareStatement(qry);
		pst.setInt(1, Integer.parseInt(adb.getDeptId()));
		pst.setString(2,adb.getDeptName() );
		row =pst.executeUpdate();
	
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return row;
	}
	
}

