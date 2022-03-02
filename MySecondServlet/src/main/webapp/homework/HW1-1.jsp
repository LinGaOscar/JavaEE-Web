<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="BIG5">
<title>Home Work 1-1</title>
</head>
<body>
	<div align="center">
		<div>
			<h2>We Love Home Work</h2>
			<p>Name : Wanda</p>
			<p>Age : 34 已成年</p>
			<p>Hello , Im Wanda ,34 years old , I am an adult</p>
		</div>

		<hr>

		<div>
			<h2>Get request form JSP with scriptlet</h2>
			<%
			String userName = request.getParameter("username");
			int userAge = Integer.valueOf(request.getParameter("userage"));
			%>
			<p>
				Name :
				<%=userName%></p>
			<p>
				Age :
				<%=userAge%>
				<%
				if (userAge >= 18) {
					out.print("已成年");
				} else {
					out.print("未成年");
				}
				%>
			</p>
			<p>Hello , Im Name , Age years old , I am an adult/underage</p>
		</div>

		<hr>

		<div>
			<h2>Get request form JSP with JSTL</h2>
			<c:set var="arr" value="${param}" />
			<p>Name :${arr.username}</p>
			<p>
				Age :${arr.userage}
				<c:choose>
					<c:when test="${arr.userage >=18}">
						<span>已成年</span>>
					</c:when>
					<c:otherwise>
						<span>未成年</span>
					</c:otherwise>
				</c:choose>
			</p>
			<p>Hello , Im Name , Age years old , I am an adult/underage</p>
		</div>

	</div>
</body>
</html>