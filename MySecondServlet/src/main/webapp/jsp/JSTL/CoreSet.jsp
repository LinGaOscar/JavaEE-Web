<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert JSTL Core</title>
</head>
<body>
<!-- http://localhost:8080/MySecondServlet/jsp/JSTL/CoreSet.jsp -->
<h2> jstl core c:set</h2>
	<c:set var="salary" scope="session" value="${2000*2}" />
	<div>
		My salary is <c:out value="${salary}" />
	</div>
	<div>
		salary is ${salary}
	</div>
</body>
</html>