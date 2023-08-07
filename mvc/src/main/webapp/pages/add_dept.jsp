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
<title>Insert title here</title>
</head>
<body>

<form action="pages/bean_store.jsp">
<input type="text" name="deptId" placeholder="enter id" />
<input type="text" name="deptName" placeholder="enter name" />
<input type="submit" value="add dept"/>
</form>

</body>
</html>