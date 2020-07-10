<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="style.css">
<meta charset="UTF-8">
</head>
    <header class="header_area">
<div class="menu_left">
	<a href ="${pageContext.request.contextPath}/home" style="color: black;float : left; text-decoration: none">UpgradeShop.me</a>
	<div style="height: 20px;color: black; padding-left : 850px ; float:left ; font-size : 13px;">
	<p>Hello ${login} !!!  </p>
	</div>
	<br>
	<a href ="${pageContext.request.contextPath}/logout" style="color: green; ; float:right ; font-size : 12px; ">Logout</a>
	</div>
</div>
<div class="menu_right">
	<ul>
		<li><a href="${pageContext.request.contextPath}/home">Home</a></li>
		<li><a href="${pageContext.request.contextPath}/upgrade">Nâng cấp</a></li>
		<li><a href="${pageContext.request.contextPath}/administration">Admin</a></li>
		<li><a
			href="https://www.facebook.com/messages/t/Netflix-Spotify-%C6%AFu-%C4%90%C3%A3i-109531930663427/">Liên lạc</a></li>
		<li><a href="${pageContext.request.contextPath}/login">Đăng nhập</a></li>
		<li><a href="${pageContext.request.contextPath}/signup">Đăng kí</a></li>
	</ul>
	<a class="buy_header" href="${pageContext.request.contextPath}/buy">MUA NGAY</a>
	<br>
	<a style= "float:right; margin-top : 10px ; padding : 15px" href="${pageContext.request.contextPath}/keyStore">Key Store</a>
	
</div>
</header>
<br><br><br>

<body>

</body>
</html>