<%@ page language="java" import="java.sql.*,oracle.jdbc.pool.OracleDataSource" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body><from>
<select>
<% 
Connection con;
Statement st;
PreparedStatement pst;
ResultSet rs;
String qry="select * from config";
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
	pst =con.prepareStatement(qry);
	
	rs = pst.executeQuery();
	while(rs.next()){
		%>
		<option><%= rs.getString(2) %></option>
		<%
		}
}
catch(Exception e){
	e.printStackTrace();
}	%>
</select>
</form>
</body>
</html>