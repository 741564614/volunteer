<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
   <head>
      <title>青协工时系统-账户管理</title>
      <meta charset="utf-8">
      <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0,user-scalable=no">
      <!-- 引入 Bootstrap -->
      
      <link rel="stylesheet" href="css/bootstrap.min.css">
      <script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
      <script src="js/bootstrap.min.js"></script>
      <link rel="stylesheet" href="../css/common.css">
      
   </head>
   <body>
        <div class="top">
                <div class="back">
                    <a href="../user.jsp"><img src="../img/icon/返回 (5).png"></a>
                </div>
                <div class="title">账户管理</div>
        </div>
       <div class="content">
            <ul class="item">
                <li>修改密码</li>
                <li><a href="change.jsp">修改个人信息</a></li>
                <li>帮助反馈</li>
                <li>切换账号</li>
                <li>退出</li>
               
            </ul>
        </div>
   </body>

   </html>