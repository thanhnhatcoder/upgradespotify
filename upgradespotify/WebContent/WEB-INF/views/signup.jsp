<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<style><%@include file="/resource/css/style.css"%></style>
<style><%@include file="/resource/css/2.css"%></style>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="2.css">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Registed</title>

</head>
<body>
	<jsp:include page ="header.jsp"></jsp:include>
	<br><br><br><br><br><br><br><br><br><br><br>
    <div class="main" >
        <div class="brand" >
        <div class="boder">
         <div style ="color:red">${errorMessage}</div>
            <h1> 
            <img src="12.png" style="width: 90px; height: 90px;" >
            </h1>  
            <form action ="${pageContext.request.contextPath}/signup" 
 method="post">  
            <p>Username</p>
            <input id="edt" type ="text" name ="username" value="" size="30">
            <p>E-mail</p>
            <input id="edt" type ="text" name ="email"  value="" size="30">
            <p>Password</p>
            <input id="edt" type ="text" name ="password" value="" size="30">
            <p>Confirm Password </p>
            <input id="edt" type ="text" value="" size="30">
            
        </br> </br> </br> 
            <input id ="sm" type="submit" value="Sign Up">
            </div>
            <div class ="noacc">
              
             </div>
        </div>
            
    </div>
</body>
</html>