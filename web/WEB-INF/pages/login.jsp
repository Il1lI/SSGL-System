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
        #input {
            text-align: center;
            font-size: 30px;
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
    <p id="error"></p>
    <form action="/login" >
        身份：
            <select name="cars">
                <option value="dalao">系统管理员</option>
                <option value="student">学生</option>
            </select>
        <br>
        用户名：<input type="text" name="username"><br>
        密码：<input type="password" name="password"><br>
        <input type="submit">
    </form>
</div>
</body>
</html>
