<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- http://localhost:8080/MySecondServlet/jsp/JSTL/CoreLogic.jsp -->
	<h2>jstl core c: logic</h2>
	<c:set var="salary" scope="session" value="${2000}" />
	<c:if test="${ salary >0}">
		<div>salary is ${salary}</div>
	</c:if>
	<c:choose>
		<c:when test="${ salary >2000}">
			<div>salary is over ${salary}</div>
		</c:when>
		<c:when test="${ salary <=2000}">
			<div>salary is lower ${salary}</div>
		</c:when>
		<c:otherwise>
			<div>salary is salary</div>
		</c:otherwise>
	</c:choose>
	
</body>
</html>