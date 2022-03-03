<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>EasyPostForm</title>
</head>
<body>
<!-- http://localhost:8080/MySecondServlet/jsp/PostForm.jsp -->
<h2>Input your username and password</h2>
	<form method="post" action="../PostForm">
		username : <input type="text" name="username">
		password : <input type="password" name="password"> 
		<input type="submit">
	</form>
</body>
</html>