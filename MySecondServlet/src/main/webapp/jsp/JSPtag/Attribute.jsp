<%@ page language="java" contentType="text/html; charset=BIG5"
	pageEncoding="BIG5"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="BIG5">
<title>Attribute and Show</title>
</head>
<body>
<!-- http://localhost:8080/MySecondServlet/jsp/JSPtag/Attribute.jsp -->
<%@ page import="java.util.*" %>
<h2>this is JSP tag</h2>
	<%
		 int int1 = 22; 
		 pageContext.setAttribute("int1",int1);
	%>
	<span> JSP getAttribute from int1
		<%= pageContext.getAttribute("int1") %>
	</span>
	<div>
		<span >< %      % > scriptlet</span>
		<span >< %@     % > 指令</span>
		<span >< %=     % > 運算式</span>
	</div>
</body>
</html>