<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/4/4
  Time: 11:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>上传文件</title>
</head>
<body>
<form action="upload" method="post" enctype="multipart/form-data">
    名称：<input name="name" type="text"><br/>
    头像：<input name="filePath" type="file"><br/>
    <input type="submit" value="上传">
</form>

</body>
</html>
