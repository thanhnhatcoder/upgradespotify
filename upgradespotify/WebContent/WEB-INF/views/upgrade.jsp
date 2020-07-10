<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
     <style><%@include file="/resource/css/style.css"%></style>
    <title>Upgradeinhere</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>
   <jsp:include page ="header.jsp"></jsp:include>
    <section class ="banner">
        <div class="container_text_">
            <h2 style="font-family:inherit;">NÂNG CẤP</h2>
            </div>
    </section>
    <div class="container2">
        <div class="section-intro text-center pb-98px">
          <p class="section-intro__title">Địa chỉ bạn nhận được luôn hợp lệ, ngay cả khi không phải từ cùng một quốc gia!</p>
          <h2 class="primary-text">NHẬP KEY CỦA BẠN VÀ CHỌN QUỐC GIA</h2>
          <img src="img/home/section-style.png" alt="">
        </div>
        <form class="form-row justify-content-center">
          <div class="col-sm-3">
            <p align="center"><strong> Key </strong></p> 
            <input id="key" name="textSearch" type="text" class="form-control" placeholder="Nhập key của bạn vào"><input name="username" style="width:1px" value="${login}" >
            <br>
            <p align="center">
                <input id ="sm" type="submit" value="Upgrade">
            <p align="center"> 
            <div style="color:black; margin-top:25px; font-family: Raleway">
             		<div style ="color:red">${errorMessage}</div>
		<c:forEach items ="${searchList}" var="spotify">
			
			</p><div style="color:black; margin-top:25px; font-family: Raleway">
	
            <div id="result_text"><a style="color: green" href ="${spotify.invite_link}">${spotify.invite_link}</a></div>
            <div id="result_address">Address : ${spotify.address}</div>
            <div id="result_link" style="color: red">Country : ${spotify.country}</div>
          </div>
			</tr>
		</c:forEach>
		</p>
          </div>
        </form>
      </div>
  
  <br><br>
</body>
</html>