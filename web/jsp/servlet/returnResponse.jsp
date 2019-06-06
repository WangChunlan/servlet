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
    <title>返回响应</title>
  </head>
  <body>

  <a href="hello">首页：Invoke Generic Servlet(调用  Generic Servlet)</a>
  <form action="returnResponse" method="post">
    姓名：<input name="name" value="" type="text"><br/>
    密码：<input name="password" value="" type="password"><br/>
    <input type="submit" name="登录">
  </form>
  </body>
</html>
