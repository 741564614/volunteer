<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
   <head>
      <title>青协工时系统</title>
      <meta charset="utf-8">
      <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0,user-scalable=no">
      <!-- 引入 Bootstrap -->
      
      <link rel="stylesheet" href="css/bootstrap.min.css">
      <script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
      <script src="js/bootstrap.min.js"></script>
      <link rel="stylesheet" href="css/user.css">
    </head>
<body>
    <div class="container top">
        <div class="back">
            <img src="img/icon/编辑.png"/>
        </div>
        <div class="logo">
            <img src="img/logo.jpg">
        </div>
        <div class="name"><span>${ sessionScope.name}</span></div>
        <div class="note"><span>${ sessionScope.account}</span></div>
    </div>
    <div class="container">
        <ul>
            <li><a href="second/notice.jsp"><img  src="img/icon/通知.png">&nbsp;&nbsp;&nbsp;通知消息</a></li>
            <li><a href="second/require.jsp"><img  src="img/icon/历史.png">&nbsp;&nbsp;&nbsp;工时查询</a></li>
        </ul>
        <ul>
            <li><a href="second/state.jsp"><img  src="img/icon/通知.png">&nbsp;&nbsp;&nbsp;报名状态</a></li>
            <li><a href="Getuserproject"><img  src="img/icon/报告.png">&nbsp;&nbsp;&nbsp;参与项目</a></li>
        </ul>
        <ul>
            <li><a href="second/setting.jsp"><img  src="img/icon/设置 (1).png">&nbsp;&nbsp;&nbsp;账户管理</a></li>
        </ul>
    </div>
    <!--底部导航-->
    <div class="container foot navbar-fixed-bottom">
            <div class="foot-left">
                 <a href="index.jsp"><img src="img/icon/首页 (2).png"><br><span>志愿服务</span></a>
             </div>
            <div class="foot-right">
                 <a href="user.jsp"><img src="img/icon/我的 (2).png"><br><span>个人中心</span></a>
             </div>
    </div>
</body>
</html>