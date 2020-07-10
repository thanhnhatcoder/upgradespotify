<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
 <style><%@include file="/resource/css/style.css"%></style>
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>
	<h1>Administration</h1>

	<table border="2" style="color:green">
		<tr>
			<th>Key</th>
			<th>Invite Link</th>
			<th>Adress</th>
			<th>Country</th>
			<th>User</th>
 			<th>Action1</th>
 			

		</tr>
		<c:forEach items="${spotifyList}" var="spotify">
			<tr>
				<td>${spotify.key}</td>
				<td>${spotify.invite_link}</td>
				<td>${spotify.address}</td>
				<td>${spotify.country}</td>
				<td>${spotify.username}</td>
				
				<td>
					<a href ="deleteKey?key=${spotify.key}">Delete</a>
				</td>
				
			</tr>
		</c:forEach>
	</table>
		 <a href ="${pageContext.request.contextPath}/insertKey">ADD KEY </a> 
</body>
</html>