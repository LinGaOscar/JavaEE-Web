<%@ page language="java" contentType="text/html; charset=BIG5"
	pageEncoding="BIG5"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="BIG5">
<title>Attribute and Show</title>
</head>
<body>
<%@ page import="java.util.*" %>
<h2>this is JSP tag</h2>
	<%
		 int int1 = 22; 
	%>
	<%
		 pageContext.setAttribute("int1",int1);
	%>
	<span> JSP getAttribute from int1
		<%=
			 pageContext.getAttribute("int1")
		%>
	</span>
	<div>
		<span >< %      % > scriptlet</span>
		<span >< %@     % > ���O</span>
		<span >< %=     % > �B�⦡</span>
	</div>
</body>
</html>