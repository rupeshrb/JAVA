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
<title>Insert title here</title>
</head>
<body>
<% 
//response.sendRedirect("pages/demo.jsp");
response.sendRedirect("pages/login.jsp?type=1");

%>
</body>
</html>	