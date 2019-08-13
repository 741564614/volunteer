<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
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
      <link rel="stylesheet" href="css/index.css">
      <!-- HTML5 Shiv 和 Respond.js 用于让 IE8 支持 HTML5元素和媒体查询 -->
      <!-- 注意： 如果通过 file://  引入 Respond.js 文件，则该文件无法起效果 -->
      <!--[if lt IE 9]>
         <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
         <script src="https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js"></script>
      <![endif]-->
      <script>
      	function load(){
      		if(${ sessionScope.account}!=null){
      			$("#login1").hide();
      		}
      	}
      </script>
   </head>
   <body onload="load()">
       <!-- 头部 -->
       <div class="container top navbar-fixed-top">
                <div class="top-left">
                    <div class="glyphicon glyphicon-user"></div>
                </div>
                <div class="top-middle"><div>武汉理工—青协</div></div>
                <div class="top-right" id="login1">
                    <a class="dropdown-item" data-toggle="modal" data-target="#myModal"><span class="glyphicon glyphicon-user"></span> 注册</a>&nbsp;&nbsp;
                    <a class="dropdown-item" data-toggle="modal" data-target="#myModal2"><span class="glyphicon glyphicon-log-in"></span> 登录</a>
                </div>
       </div>
       <form method="post" action="Login" class="form-horizontal" role="form">
        <div class="modal fade" id="myModal2" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
            <!--  定义模态框，过渡效果为淡入，id为myModal,tabindex=-1可以禁用使用tab切换，aria-labelledby用于引用模态框的标题，aria-hidden=true保持模态框在触发前窗口不可见  -->
            <div class="modal-dialog">
                <!--  显示模态框对话框模型（若不写下一个div则没有颜色）  -->
                <div class="modal-content">
                    <!--  显示模态框白色背景，所有内容都写在这个div里面  -->

                    <div class="btn-info modal-header">
                        <!--  模态框标题  -->
                        <h4>登录</h4>
                        <!--  标题内容  -->
                    </div>

                    <div class="modal-body">
                        <!--  模态框内容，我在此处添加一个表单 -->
                        <form class="form-horizontal" role="form">
                            <div class="form-group">
                                <label for="account" class="col-sm-3 control-label">用户名</label>
                                <div class="col-sm-9">
                                    <input type="text" name="account" class="form-control well"
                                        placeholder="请输入用户名" />
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="password" class="col-sm-2 control-label">密码</label>
                                <div class="col-sm-9">
                                    <input type="password" name="password" class="form-control well"
                                        placeholder="请输入密码" />
                                </div>
                            </div>

                        </form>
                    </div>

                    <div class="modal-footer">
                        <!--  模态框底部样式，一般是提交或者确定按钮 -->
                        <button type="submit" class="btn btn-info">确定</button>
                        <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
                    </div>

                </div><!-- /.modal-content -->
            </div>
        </div> <!-- /.modal -->
    </form>
       <!--轮播图-->
       <div class="container slider">
        <div id="myCarousel" class="carousel slide">
            <!-- 轮播（Carousel）指标 -->
            <ol class="carousel-indicators">
                <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
                <li data-target="#myCarousel" data-slide-to="1"></li>
                <li data-target="#myCarousel" data-slide-to="2"></li>
            </ol>   
            <!-- 轮播（Carousel）项目 -->
            <div class="carousel-inner">
                <div class="item active">
                    <img src="img/1.jpg" class="img-responsive" alt="First slide">
                </div>
                <div class="item">
                    <img src="img/2.jpg"  class="img-responsive" alt="Second slide">
                </div>
                <div class="item">
                    <img src="img/3.jpg"  class="img-responsive" alt="Third slide">
                </div>
            </div>
            <!-- 轮播（Carousel）导航 -->
            <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
                <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
                <span class="sr-only">Previous</span>
            </a>
            <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
                <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
                <span class="sr-only">Next</span>
            </a>
        </div>
       </div>
       <!-- 中部导航 -->
       <div class="container middle">
            <ul id="myTab" class="nav nav-tabs ">
                    <li class="active">
                        <a href="#home" data-toggle="tab">
                            活动通知
                        </a>
                    </li>
                    <li><a href="#prepare" data-toggle="tab">正在招募</a></li>
                    <li><a href="#happening" data-toggle="tab">正在进行</a></li>
            </ul>
                <div id="myTabContent" class="tab-content">
                    <div class="tab-pane fade in active" id="home">
                        <ul>
                            <!-- 通知 -->
                            <c:forEach items="${sessionScope.projectlist}" var="post" varStatus="vs">
	       						<li click="open(${vs.count} )">${post.projectname }</li>
	  						</c:forEach>
                        </ul>
                    </div>
                    <div class="tab-pane fade" id="prepare">
                         <ul>
                            <c:forEach items="${sessionScope.projectlist}" var="post">
	       						<li>${post.projectname }</li>
	  						</c:forEach>
                        </ul>
                    </div>
                    <div class="tab-pane fade" id="happening">
                         <ul>
                            <c:forEach items="${sessionScope.projectlist}" var="post">
	       						<li>${post.projectname }</li>
	  						</c:forEach>
                        </ul>
                    </div>
                </div>
       </div>
       <!--底部导航-->
       <div class="container foot">
           <div class="foot-left">
                <a href="index.jsp"><img src="img/icon/首页 (2).png"><br><span>志愿服务</span></a>
            </div>
           <div class="foot-right">
                <a href="user.jsp"><img src="img/icon/我的 (2).png"><br><span>个人中心</span></a>
            </div>
       </div>
   </body>
</html>