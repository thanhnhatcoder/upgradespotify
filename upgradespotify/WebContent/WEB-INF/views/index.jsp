<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> 
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
     <style><%@include file="/resource/css/style.css"%></style>
    <link rel="stylesheet" href="style.css">
    <title>Upgradeshop</title>
</head>
<body>
<jsp:include page ="header.jsp"></jsp:include>
    <section class ="banner">
        <div class="container_text_">
            <p>Bạn đang muốn nâng cấp tài khoản spotify ?</p>
            <h2>HÃY DÙNG DỊCH VỤ NÂNG CẤP CỦA CHÚNG TÔI</h2>
            <a class="buykey" href ="${pageContext.request.contextPath}/buy" style="text-decoration:none">MUA NGAY</a>
        </div>
    </section>
    <section class="section_margin">
        <div class="container">
            <div class="top">
            <p class="section-intro__title">Sử dụng dịch vụ ngay bây giờ</p>
            <h2 class="primary-text">Tại sao lại sử dụng dịch vụ chúng tôi ?</h2>
             </div>
            <div class="center">
                <div class="support">
                    <div class="icon">
                        <img src="s1.png" alt="">
                    </div>
                    <h3>GIÁ RẺ</h3>
                    <p>Dịch vụ của chúng tôi luôn đưa ra những <br> mức giá hợp lý, phải chăng.</p>
                </div>
                <div class="support">
                    <div class="icon">
                        <img src="s2.png" alt="">
                    </div>
                    <h3>BẢO HÀNH</h3>
                    <p>Bạn bị mất premium ? Đừng lo, chúng tôi có hệ thống 24/24 cung cấp cho bạn bảo hành.</p>
                </div>
                <div class="support">
                    <div class="icon">
                        <img src="s3.png" alt="">
                    </div>
                    <h3>HỆ THỐNG TỰ ĐỘNG</h3>
                    <p>Một khi bạn đã mua key, bạn có thể nâng cấp trên website một cách dễ dàng và tự động.</p>
                </div>
            </div>
            <div class="bottom">
                <a class="buttonindex mr-3 mb-2" href="#faq" style="text-decoration:none">TÌM HIỂU THÊM</a>
                <a class="buttonindex mb-2" href ="${pageContext.request.contextPath}/buy" style="text-decoration:none">MUA NGAY</a>
            </div>
        </div>
    </section>
    <section class="picture">
        <h1 style="color:white; text-align: center;">Features designed for you</h1>
    </section>
    <section id="faq">
        <div class="container">
            <header class="section_header"> 
                <h3>Các câu hỏi thường gặp</h3>
                <p>Các câu hỏi liên quan đến dịch vụ chúng tôi.</p>
                 </header>
                 <ul id="faq-list" class="wow fadeInUp">
                    <li>
                      <p style="color:#3D1B82;"><b>Tài khoản của tôi sẽ được premium trong bao lâu ?</b></p>
                      
                        <p>
                         Nó có thể từ 1 ngày cho đến 1 năm. Thời gian dự kiến ​​trung bình là khoảng 2-3 tháng. Bảo hành của chúng tôi có nghĩa là bạn sẽ nhận được premium sau khi bị mất 
                        </p>
                     
                    </li>
          
                    <li>
                        <p style="color:#3D1B82;"><b>Đất nước của tôi không được đề cập, tôi vẫn có thể sử dụng dịch vụ này chứ?</b></p>
                     <p>
                          Có bạn có thể. Thay đổi quốc gia của bạn trên hồ sơ Spotify của bạn hoặc tạo tài khoản với VPN ở nước có sẵn hàng (ví dụ: Hoa Kỳ). Tài khoản Spotify mới của bạn sẽ có trụ sở tại Hoa Kỳ, vì vậy bạn sẽ có thể dùng lời mời của Hoa Kỳ với tài khoản đó. Sau khi liên kết lời mời đến tài khoản và làm cho nó trở nên premium account, chỉ cần tắt VPN và tận hưởng nó !
                        </p>
                      
                    </li>
          
                    <li>
                        <p style="color:#3D1B82;"><b>Bạn có cần thông tin đăng nhập của tôi không?</b></p>
                        <p>
                          Không, chúng tôi sẽ không bao giờ yêu cầu thông tin đăng nhập của bạn.
                        </p>
                     
                    </li>
          
                    <li>
                        <p style="color:#3D1B82;"><b>Bạn sẽ bảo hành tài khoản của tôi trong bao lâu ?</b></p>
                        <p>
                          Tùy thuộc vào gói của bạn mua. Và đa số là bạn sẽ rất khó bị mất premium .
                        </p>
                     
                    </li>
          
                    <li>
                        <p style="color:#3D1B82;"><b>Tôi nên làm gì khi được thông báo “You need to live at the same address” ?</b></p>
                       
                         <p>
                          Nếu đây là trường hợp bạn đã nhập địa chỉ không chính xác. Sao chép và dán địa chỉ trang web cung cấp cho bạn, còn nếu bạn nhập địa chỉ chính xác nhưng vẫn bị là do tài khoản của bạn không trùng với địa điểm bạn tạo account, vui lòng đọc lại câu hỏi 2 
                        </p>
                    
                    </li>
          
                    <li>
                        <p style="color:#3D1B82;"><b>Bạn có một câu hỏi nhưng nó không được đề cập ở đây ? </b></p>
                      <p>
                          Hãy liên hệ với chúng tôi bất cứ lúc nào! Bạn có thể nhắn tin cho chúng tôi. <a class="nav-link" href="https://www.facebook.com/messages/t/thanhnhat9903" target="_blank">Facebook </a>
                        </p>
                    
                    </li>
          
                  </ul>
        </div>
    </section>
    <footer class="footer-area">
        <div class="container">
                <h2>About us</h2>
                <p>
                  Chỉ với mức giá phải chăng, bạn có thể nâng cấp tài khoản của mình lên premium. <br><br>
                  Hệ thống của chúng tôi hoạt động với hệ thống gia đình của Spotify
                </p>
              
            </div>
          </div>
        </div>
        <div class="footer-bottom">
          <div class="container">
            <div class="row align-items-center">
              <p class="col-lg-8 col-sm-12 footer-text m-0 text-center text-lg-left">
    © Copyright <script>document.write(new Date().getFullYear());</script>2020 UpgradeShop | All rights reserved </p>
            </div>
          </div>
        </div>
      </footer>
</body>
</html>