<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019-06-06
  Time: 13:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    application.setAttribute("test", 1);
    application.setAttribute("test", 2);
    application.removeAttribute("test");
%>
<h1>application  </h1>
请查看控制台，将在在控制台中输出！
</body>
</html>
