<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019-06-06
  Time: 14:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"   pageEncoding="UTF-8"%>
<html>
<head>
    <title>request</title>
</head>
<body>

<%
    request.setAttribute("test", 1);
    request.setAttribute("test", 2);
    request.removeAttribute("test");
%>
<h1>request  </h1>
请查看控制台，将在在控制台中输出！

</body>
</html>
