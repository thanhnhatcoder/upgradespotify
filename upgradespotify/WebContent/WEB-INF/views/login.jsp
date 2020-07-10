<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login</title>
    <style><%@include file="/resource/css/style.css"%></style>
    <style><%@include file="/resource/css/2.css"%></style>
</head>
<body>
 <jsp:include page ="header.jsp"></jsp:include>
 <br> <br> <br> <br> <br> <br> <br> <br> <br>
    <form action ="${pageContext.request.contextPath}/login" method ="post">
    <div class="main" >
        <div class="brand" >
        <div class="boder">
        <div style ="color:red">${errorMessage}</div>
       <%--   <div style ="color:red">${doneMessage}</div> --%>
            <h1> 
            <img src="bookmanagerr/WebContent/WEB-INF/img/12.png" style="width: 90px; height: 90px;" >
            </h1>
            <p>Username</p>
            <input id="edt" type ="text" value="" name ="username" size="30"  required >
            <p>Password</p>
            <input id="edt" type ="text" value="" name="password"  size="30">
        </br> </br> </br> 
             <input id ="sm" type="submit" value="Sign In"> </br>
             </div>
             <div class ="noacc">
              
             </div>
            
        </div>
            
    </div>
</form>
</body>
</html>