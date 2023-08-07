<%@ page language="java" import="com.demo.Add_Dept" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
<head>
<base href="<%=basePath%>">
<title>bean_store</title>
</head>
<body>
<!-- injecting data into the bean from a form-->
<jsp:useBean id="dept" class="com.demo.Add_Dept">

<jsp:setProperty name="dept" param="dept_id" property = "dept_id"/>
<jsp:setProperty name="dept" param="dept_name" property = "dept_name"/>
<!-- fetching the property value -->

<jsp:getProperty name="dept" property ="dept_name"/>|

</jsp:useBean>
<h1>dept detail are </h1>
${dept.dept_id}
${dept.dept_name}
</body>
</html>