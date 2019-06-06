<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019-06-06
  Time: 14:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"  pageEncoding="UTF-8"%>
<html>
<head>
    <title>session</title>
</head>
<body>

<%
    session.setAttribute("test", 1);
    session.setAttribute("test", 2);
    session.removeAttribute("test");
%>
<h1>session  </h1>
请查看控制台，将在在控制台中输出！
</body>
</html>
