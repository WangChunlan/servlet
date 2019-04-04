##servlet demo
参考网站： <br/>
1.[how2j.cn](http://how2j.cn/k/servlet/servlet-eclipse/558.html)	<br/>
2.[javaTpoint](https://www.javatpoint.com/GenericServlet-class)

----
###1.运行程序
整个启动过程，及停止tomcat控制台打印：<br/>
``` Connected to server  ``` [由tomcat而来]<br/>
``` servlet is initialized ``` [程序本身]<br/>
``` servlet is destroyed  ``` [程序本身] <br/>
``` Disconnected from server ``` [由tomcat而来]<br/>


### 2.servlet 生命周期
实例化 --> 初始化(init)-->提供服务(service)-->销毁(destroy)--> 被回收
[servlet 生命周期](http://how2j.cn/k/servlet/servlet-lifecycle/550.html)


### 3.servlet 跳转
> 登录成功与失败的跳转


服务端跳转：
客户端转发

### 4.servlet 自启动
> 有的时候会有这样的业务需求： 
tomcat一启动，就需要执行一些初始化的代码，比如校验数据库的完整性等。 
但是Servlet的生命周期是在用户访问浏览器对应的路径开始的。如果没有用户的第一次访问，就无法执行相关代码。 
这个时候，就需要Servlet实现自启动 即，伴随着tomcat的启动，自动启动初始化，在初始化方法init()中，就可以进行一些业务代码的工作了。

##### `` load-on-startup ``
在web.xml中，配置 Servlet的地方，增加一句
 ```<load-on-startup>10</load-on-startup>`````
取值范围是1-99;即表明该Servlet会随着Tomcat的启动而初始化。
同时，为 MiniServlet  提供一个init(ServletConfig) 方法，验证自启动

如图所示，在tomcat完全启动之前，就打印了 First servlet is initialized
<load-on-startup>10</load-on-startup> 中的10表示启动顺序
如果有多个Servlet都配置了自动启动，数字越小，启动的优先级越高

### 5. servlet request 常见的方法
[servlet request 常见的方法](http://how2j.cn/k/servlet/servlet-request/555.html)

#####获取请求头信息：  req.getHeaderNames()
访问HelloServlet获取如下头信息:
host: 主机地址
user-agent: 浏览器基本资料
accept: 表示浏览器接受的数据类型
accept-language: 表示浏览器接受的语言
accept-encoding: 表示浏览器接受的压缩方式，是压缩方式，并非编码
connection: 是否保持连接
cache-control: 缓存时限

##### 服务端传参
setAttribute和getAttribute可以用来在进行服务端跳转的时候，在不同的Servlet之间进行数据共享
### 6. servlet response 常见的方法
[servlet response 常见的方法](http://how2j.cn/k/servlet/servlet-response/556.html)
##### 设置响应编码
他们的区别在于
1. response.setContentType("text/html; charset=UTF-8");
不仅发送到浏览器的内容会使用UTF-8编码，而且还通知浏览器使用UTF-8编码方式进行显示。所以总能正常显示中文
2. response.setCharacterEncoding("UTF-8"); 
仅仅是发送的浏览器的内容是UTF-8编码的，至于浏览器是用哪种编码方式显示不管。 所以当浏览器的显示编码方式不是UTF-8的时候，就会看到乱码，需要手动再进行一次设置



##### 301或者302客户端跳转
客户端有两种跳转
302 表示临时跳转
301 表示永久性跳转

302就是前面在客户端跳转章节用到过的
response.sendRedirect("fail.html");
301要使用另外的手段：
response.setStatus(301);
response.setHeader("Location", "fail.html");

### 6. servlet 上传文件
[servlet 上传文件](http://how2j.cn/k/servlet/servlet-upload/587.html#nowhere)

上传功能需要两个第三方的包：
  ```commons-io-1.4.jar```和```commons-fileupload-1.2.2.jar```
[commons-io.jar](http://commons.apache.org/proper/commons-io/download_io.cgi)
[commons-fileupload.jar](http://commons.apache.org/proper/commons-fileupload/download_fileupload.cgi)
