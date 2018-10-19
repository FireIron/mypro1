<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/9/25
  Time: 20:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>111</h1>
<h1><a href="user/change">点击跳转</a></h1>
    <form action="user/form" method="post">
        用户名称：<input name="name" type="text"></br>
        用户年龄：<input name="age" type="text"></br>
        <hr>
        用户账户名称：<input name="list[0].name" type="text"></br>
        用户账户金额：<input name="list[0].money" type="text"></br>
        <hr>
        用户账户名称：<input name="list[1].name" type="text"></br>
        用户账户金额：<input name="list[1].money" type="text"></br>
        <hr>
        用户名称：<input name="map['one'].name" type="text"></br>
        用户金额：<input name="map['one'].money" type="text"></br>
        <hr>
        用户名称：<input name="map['two'].name" type="text"></br>
        用户金额：<input name="map['two'].money" type="text"></br>
        <hr>
        用户名称：<input name="account.name" type="text"></br>
        用户金额：<input name="account.money" type="text"></br>
        <input type="submit" value="提交">
    </form>
    <hr/>
    <form action="user/form1" method="post">
        用户名称：<input name="name" type="text"></br>
        用户金额：<input name="money" type="text"></br>
        日期：<input name="date" type="text">
        <input type="submit" value="提交">
    </form>
    <form action="user/form2" method="post">
        用户名称：<input name="name" type="text"></br>
        用户金额：<input name="money" type="text"></br>
        日期：<input name="date" type="text">
        <input type="submit" value="提交">
    </form>
</body>
</html>
