<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/4/9
  Time: 16:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" import="java.util.*" %>
<html>
<head>
    <title>one</title>
    <style type="text/css">
        table {
            border-collapse: collapse;
            margin: 0 auto;
            text-align: center;
        }

        table td, table th {
            border: 1px solid #cad9ea;
            color: #666;
            height: 30px;
        }

        table thead th {
            background-color: #CCE8EB;
            width: 100px;
        }

        table tr:nth-child(odd) {
            background: #fff;
        }

        table tr:nth-child(even) {
            background: #F5FAFA;
        }
    </style>


</head>
<body>
你好呀<br/>
<%=new Date().toLocaleString()%>

<div>
    <table width="90%" class="table">
        <caption>
            <h2>
                导航表</h2>
        </caption>
        <thead>
        <tr>
            <th>Listener</th>
            <th> Listener监听对象</th>
            <th> 参考资料</th>
            <th> 单耗</th>
        </tr>
        </thead>
        <tr>
            <td colspan="4">
                Listener 的作用是用于监听 web应用的创建和销毁，以及在其上attribute发生的变化。<br/>
                web应用即ServletContext对象(jsp的隐式对象application)<br/>
                除了对web应用的监听外，还能监听session和request的生命周期，以及他们的attribute发生的变化。<br/>
                <a href="http://how2j.cn/k/listener/listener-tutorials/604.html">listener 教程 </a>
            </td>
        </tr>
        <tr>
            <td> 对Context的监听分生命周期的监听，和Context上Attribute变化的监听两种。 </td>
            <td> <a href="listener/testContext.jsp" >ServletContextListener 、 ServletContextAttributeListener</a></td>
            <td> 1.34</td>
            <td> 213</td>
        </tr>
        <tr>
            <td> 对Session的监听分生命周期的监听，和Session上Attribute变化的监听两种。 </td>
            <td> <a href="listener/testSession.jsp" >HttpSessionListener 、 HttpSessionAttributeListener</a></td>
            <td> 1.34</td>
            <td> 213</td>
        </tr>
        <tr>
            <td> 对Request的监听分生命周期的监听，和Request上Attribute变化的监听两部分。 </td>
            <td> <a href="listener/testRequest.jsp" >ServletRequestListener  、  ServletRequestAttributeListener</a></td>
            <td> 1.34</td>
            <td> 213</td>
        </tr>
        <tr>
            <td colspan="4"><a href="listener/demo/checkOnlineNumber.jsp" >统计在线人数 </a></td>
        </tr>
        <tr>
            <td colspan="4"> Listener 的作用是用于监听 web应用的创建和销毁，以及在其上attribute发生的变化。 </td>

        </tr>
    </table>

    <table width="90%" class="table">
        <caption>
            <h2>
                filter 过滤器</h2>
        </caption>
        <thead>
        <tr>
            <th>filter</th>
            <th> Listener监听对象</th>
            <th> 参考资料</th>
            <th> 单耗</th>
        </tr>
        </thead>
        <tr>
            <td colspan="4">
                中文处理<br/>
                登录验证
                <a href="http://how2j.cn/k/filter/filter-tutorial/588.html">过滤器 FILTER 教程 </a>
            </td>
        </tr>
        <tr>
            <td> 对Context的监听分生命周期的监听，和Context上Attribute变化的监听两种。 </td>
            <td> <a href="listener/testContext.jsp" >ServletContextListener 、 ServletContextAttributeListener</a></td>
            <td> 1.34</td>
            <td> 213</td>
        </tr>
        <tr>
            <td> 对Session的监听分生命周期的监听，和Session上Attribute变化的监听两种。 </td>
            <td> <a href="listener/testSession.jsp" >HttpSessionListener 、 HttpSessionAttributeListener</a></td>
            <td> 1.34</td>
            <td> 213</td>
        </tr>
        <tr>
            <td> 对Request的监听分生命周期的监听，和Request上Attribute变化的监听两部分。 </td>
            <td> <a href="listener/testRequest.jsp" >ServletRequestListener  、  ServletRequestAttributeListener</a></td>
            <td> 1.34</td>
            <td> 213</td>
        </tr>
        <tr>
            <td colspan="4"><a href="listener/demo/checkOnlineNumber.jsp" >统计在线人数 </a></td>
        </tr>
        <tr>
            <td colspan="4"> Listener 的作用是用于监听 web应用的创建和销毁，以及在其上attribute发生的变化。 </td>

        </tr>
    </table>


</div>

</body>
</html>
