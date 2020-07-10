<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
 <style><%@include file="/resource/css/style.css"%></style>
<title>Insert title here</title>

</head>
<body>
<jsp:include page="header.jsp"></jsp:include>

<form action ="${pageContext.request.contextPath}/insertKey" 
 method="post" enctype ="multipart/form-data" >
 
 <input type ="text" name = "key" placeholder ="Key"> <br>
  <input type ="text" name = "invite_link" placeholder ="Invite Link"> <br>
   <input type ="text" name = "address" placeholder ="Address"> <br>
    <input type ="text" name = "country" placeholder ="Country"> <br>
    
    <input type ="submit" value ="Add"> <br>
 </form>
</body>
</html>