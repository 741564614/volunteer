<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
   <head>
      <title>青协工时系统-修改资料</title>
      <meta charset="utf-8">
      <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0,user-scalable=no">
      <!-- 引入 Bootstrap -->
      
      <link rel="stylesheet" href="css/bootstrap.min.css">
      <script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
      <script src="js/bootstrap.min.js"></script>
      <link rel="stylesheet" href="../css/common.css">
      <link rel="stylesheet" href="../css/change.css">
   </head>
   <body>
        <div class="top">
            <div class="back">
                <a href="../user.jsp"><img src="../img/icon/返回 (5).png"></a>
            </div>
            <div class="title">修改资料</div>
        </div>
       <div class="content">
           <div class="picture">
                <div class="logo">
                    <img src="../img/logo.jpg">
                </div>
                <span>点击上传头像:</span>
           </div>
        <form action="..\Updateuser"> 
            <ul>
                <li><span>姓&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;名：</span><input name="name" value="${ sessionScope.name}" ></input></li>                                    
                <li><span>联系电话：</span><input name="tel" value="${ sessionScope.tel}" ></input></li>
                <li><span>学&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;院：</span><input name="major" value="${ sessionScope.email}" ></input></li>
                <li><span>专业班级：</span><input name="email" value="${ sessionScope.major}" ></input></li>
            </ul>
            <div class="finish"><button type="submit">确认修改</button></div>
        </form>
        </div>
   </body>

   </html>