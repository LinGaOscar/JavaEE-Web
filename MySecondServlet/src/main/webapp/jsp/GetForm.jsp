<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>EasyGetForm</title>
</head>
<body>
<!-- http://localhost:8080/MySecondServlet/jsp/GetForm.jsp -->
	<h2>Input your name</h2>
	<form method="get" action="../GetForm">
		name : <input type="text" name="username"> 
		<input	type="submit">
	</form>
</body>
</html>