<%--
  Created by IntelliJ IDEA.
  User: Mr.Rac
  Date: 2018/12/5
  Time: 9:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>宿舍管理系统</title>
    <style type="text/css">
        body {
            background-image: url('/Images/LoginBg.jpg');
            background-position: center;
            background-size: cover;
            background-repeat: no-repeat;
        }
        #title {
            text-align: center;
            font-size: 20px;
        }
        .text {
            display:inline-block;
            width:620px;
            text-align:right;
            font-size: 30px;
        }
        .box {
            height: 40px;
            width: 200px;
        }
        .sub {
            text-align: center;
            vertical-align: middle;
            height: 40px;
        }
        #error {
            color: red;
            text-align: center;
            font-size: 10px;
        }
    </style>
</head>
<body>
<div id="title">
    <h1><strong>校园宿舍管理系统</strong></h1>
</div>
<div>
    <br><br><br><br><br><br><br><br>
</div>
<div id="input">
    <p id="error">${msg}</p>
    <form action="/login" >
        <span class="text">身份：</span>
        <select name="cars" class="box">
            <option value="dalao">系统管理员</option>
            <option value="student">学生</option>
        </select><br>
        <span class="text">用户名：</span>
        <input type="text" name="username" class="box"><br>
        <span class="text">密码：</span>
        <input type="password" name="password" class="box"><br><br>
        <div class="sub">
            <input type="submit" value="登录" style="font-size: 25px">
        </div>
    </form>
</div>
</body>
</html>
