<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
<head>
<base href="<%=basePath%>">
<meta charset="ISO-8859-1">
<title>ADD DEPARTMENT</title>
</head>
<body>
<form action="pages/bean_store.jsp">
<input type="text" name="dept_id" placeholder="dept_id"/>
<input type="text" name="dept_name" placeholder="dept_name"/>
<input type="submit" placeholder="submit"/>
</form>
</body>
</html>