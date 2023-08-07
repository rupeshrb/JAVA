<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="skyblue" text="red">
<% 
out.println("hello jsp");
%>
<%= Math.random() %>
<%!
int f(){
	int a=10;
	int b=5;
	return a+b;
}
%>
<%= f() %>

</body>
</html>