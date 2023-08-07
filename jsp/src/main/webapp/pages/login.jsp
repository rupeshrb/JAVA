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
if(request.getParameter("type").equals("0")){
	out.println("sorry ,please try again");
}

%>
<form action="loginAuth">
<input type="text" name="username" placeholder="name" />
<input type="password" name="password" placeholder="password" />
<input type="submit" value="login" />
</form>
</body>
</html>