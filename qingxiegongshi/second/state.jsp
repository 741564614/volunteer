<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
   <head>
      <title>青协工时系统-报名状态</title>
      <meta charset="utf-8">
      <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0,user-scalable=no">
      <!-- 引入 Bootstrap -->
      
      <link rel="stylesheet" href="css/bootstrap.min.css">
      <script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
      <script src="js/bootstrap.min.js"></script>
      <link rel="stylesheet" href="../css/common.css">
      <style ></style>
   </head>
   <body>
        <div class="top">
                <div class="back">
                    <a href="../user.jsp"><img src="../img/icon/返回 (5).png"></a>
                </div>
                <div class="title">报名状态</div>
        </div>
       <div class="content">
           <table>
               <tr>
                    <th>已报名项目</th><th>报名状态</th>
               </tr>
               <tr>
                   <td>
                       青协项目1
                   </td>
                   <td>
                       审核
                   </td>
               </tr>
               <tr>
                    <td>
                        青协项目2
                    </td>
                    <td>
                        审核
                    </td>
                </tr>
                <tr>
                   <td>
                       青协项目4
                   </td>
                   <td>
                       正在进行
                   </td>
               </tr>
           </table>
        </div>
   </body>

   </html>