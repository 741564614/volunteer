<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
   <head>
      <title>青协工时系统-工时查询</title>
      <meta charset="utf-8">
      <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0,user-scalable=no">
      <!-- 引入 Bootstrap -->
      
      <link rel="stylesheet" href="css/bootstrap.min.css">
      <script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
      <script src="js/bootstrap.min.js"></script>
      <link rel="stylesheet" href="../css/common.css">
      <script language="javascript" type="text/javascript"> 
        window.onload=function(){ 
        //设置年份的选择 
        var myDate= new Date(); 
        var startYear=myDate.getFullYear()-10;//起始年份 
        var endYear=myDate.getFullYear()+10;//结束年份 
        var obj=document.getElementById('myYear') 
        for (var i=startYear;i<=endYear;i++) 
        { 
        obj.options.add(new Option(i,i)); 
        } 
        obj.options[obj.options.length-11].selected=1; 
        } 
        </script>
      
   </head>
   <body>
        <div class="top">
                <div class="back">
                    <a href="../user.jsp"><img src="../img/icon/返回 (5).png"></a>
                </div>
                <div class="title">工时查询</div>
        </div>
       <div class="content">
           <ul class="item">
               <li><span>总工时数：</span><span>${sessionScope.hours }</span></li>
               <li>
                   <span>查看学期工时数：<select id="myYear"></select> <input type=""/></span>
                </li>
                <table>
                        <tr>
                            <th>已参与项目</th><th>获得工时数</th>
                         </tr>
                    <c:forEach items="${sessionScope.project}" var="post">
	       				<tr>
                             <td>${post.projectname }</td><td>${post.hour }</td>
                         </tr>
	  				</c:forEach>     
                   </table>
           </ul>
           
        </div>
   </body>

   </html>