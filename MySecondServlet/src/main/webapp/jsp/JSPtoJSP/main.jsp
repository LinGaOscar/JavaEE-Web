<%@ page language="java" contentType="text/html; charset=BIG5"
	pageEncoding="BIG5"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="BIG5">
<title>Insert title here</title>
</head>
<body>
<body>
	<h1>Using GET Method to Read Form Data</h1>
	<ul>
		<li><p>
				<b>First Name:</b>
				<%=request.getParameter("first_name")%>
			</p></li>
		<li><p>
				<b>Last Name:</b>
				<%=request.getParameter("last_name")%>
			</p></li>
	</ul>
	
	<h1>Using declaration</h1>
</body>


</html>