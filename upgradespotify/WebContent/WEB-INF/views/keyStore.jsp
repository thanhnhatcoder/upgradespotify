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
	
<form class="spotifyliststore">
<br>
 <input name="username" style="width:0.1px;height:0.1px;float:right;"  value="${login}">
 <input id ="sm" type="submit" style="padding-left: 25px;padding-right: 25px;background-color:green;color:white" value="Open"> 

 </form>

	<table border="2" style="color:green">
		<tr>
			<th>Key</th>
			<th>Invite Link</th>
			<th>Adress</th>
			<th>Country</th>
			<th>User</th>
 			
		</tr>
		<c:forEach items="${keyStore}" var="spotify">
			<tr>
				<td>${spotify.key}</td>
				<td>${spotify.invite_link}</td>
				<td>${spotify.address}</td>
				<td>${spotify.country}</td>
				<td>${spotify.username}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>