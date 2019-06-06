<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/4/3
  Time: 17:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>servlet  调用流程</title>
  </head>
  <body>

  <a href="hello">首页：Invoke Generic Servlet(调用  Generic Servlet)</a>
  <form action="loginInvokeService" method="post">
    姓名：<input name="name" value="" type="text"><br/>
    密码：<input name="password" value="" type="password"><br/>
    <input type="submit" name="登录">
  </form>
获取参数

  <form action="register" method="get">
账号：<input type="text" name="name" ><br/>
    爱好：   LOL<input type="checkbox" name="hobits" value="lol">
       DOTA<input type="checkbox" name="hobits" value="dota"> <br>
    <input type="submit" value="注册">

  </form>


  </body>
</html>
