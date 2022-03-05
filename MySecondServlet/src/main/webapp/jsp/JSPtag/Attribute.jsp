<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Attribute and Show</title>
</head>
<body>
<!-- http://localhost:8080/MySecondServlet/jsp/JSPtag/Attribute.jsp -->
<%@ page import="java.util.*" %>
<h2>this is JSP tag</h2>
	<%
		 int salary = 22000; 
		 pageContext.setAttribute("MySalary",salary);
	%>
	<span> JSP getAttribute from MySalary
		<%= pageContext.getAttribute("MySalary") %>
	</span>
	<div>
		<span >< %      % > scriptlet</span>
		<span >< %@     % > 指令</span>
		<span >< %=     % > 運算式</span>
	</div>
</body>
</html>