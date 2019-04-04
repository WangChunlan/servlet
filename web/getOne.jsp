<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/4/4
  Time: 14:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用AJAX以JSON方式获取数据</title>
    <script type="text/javascript" src="jquery.min.js"></script>
</head>
<body>
<input type="button" value="通过AJAX获取一个Hero对象" id="sender">

<div id="messageDiv"></div>

<script>
    $('#sender').click(function(){
        var url="getOneServlet";
        $.post(
            url,
            function(data) {
                var json=JSON.parse(data);
                var name =json.hero.name;
                var hp = json.hero.hp;
                $("#messageDiv").html("英雄名称："+name + "<br>英雄血量:" +hp );
            });
    });
</script>
</body>
</html>
