package servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

/**
 * @author wangchunlan
 * @ClassName LoginInvokeService.java
 * @Description
 * @createTime 2019年04月04日 09:35:00
 */
public class LoginInvokeService extends HttpServlet {
    public LoginInvokeService() {
        System.out.println("无论访问了多少次 LoginInvokeService  LoginInvokeService 构造方法 只会执行一次，所以Servlet是单实例的");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("获取单值参数 name:" + req.getParameter("name"));

        String[] hobits = req.getParameterValues("hobits");
        System.out.println("获得具有多值的参数 hobits: " + Arrays.asList(hobits));

        System.out.println("通过getParamterMap 遍历所有的参数：");
        Map<String, String[]> parameters = req.getParameterMap();
        Set<String> paramNames = parameters.keySet();
        for (String param : paramNames) {
            String[] value = parameters.get(param);
            System.out.println(param + ":" + Arrays.asList(value));
        }

        Cookie[] cookies = req.getCookies();
        for (Cookie item : cookies) {
            System.out.println("name:" + item.getName() + ";value=" + item.getValue());

        }
        System.out.println("------------------------设置响应内容  --------------------------");
        try {
            resp.setDateHeader("Expires", 0);
            resp.setHeader("Cache-Control", "no-cache");
            resp.setHeader("pragma", "no-cache");
            resp.getWriter().println("<h1>Hello Servlet!</h1>" + cookies[0].getValue());
            resp.getWriter().println(new Date().toLocaleString());


            PrintWriter pw = resp.getWriter();
            pw.println("<h1>Hello Servlet</h1>");


        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // request 获取参数
        String name = req.getParameter("name");
        String password = req.getParameter("password");

        // request 常用方法：
        System.out.println("浏览器发送请求时完整URL(包括协议 、主机名、端口):" + req.getRequestURL());
        System.out.println("浏览器发送请求的资源名部分（去掉了协议和主机名）:" + req.getRequestURI());
        System.out.println("请求行中的参数部分（只能看get方式的参数）:" + req.getQueryString());
        System.out.println("浏览器所处的客户机的IP 地址:" + req.getRemoteAddr());
        System.out.println("浏览器所处的客户机的主机名:" + req.getRemoteHost());
        System.out.println("浏览器所处的客户机使用的网络端口:" + req.getRemotePort());
        System.out.println("服务器地址的IP :" + req.getLocalAddr());
        System.out.println("服务器地址的主机名 :" + req.getLocalName());
        System.out.println("得到客户机的请求方式 :" + req.getMethod());
        //获取参数
        System.out.println("获取单值的参数  :" + req.getParameter("name"));
        System.out.println("用于获取具有多值的参数 :" + req.getParameterValues("name"));
        System.out.println("用于获取遍历所有的参数 req.getParameterMap() :");

        System.out.println("------------------------获取头部信息--------------------------");
        // 获取头部信息
        System.out.println("获取浏览器传递的头信息:" + req.getHeader("user-agent"));
        System.out.println("获取浏览器传递所有的头部信息:" + req.getHeaderNames());
        // 遍历
        Enumeration<String> headerNames = req.getHeaderNames();
        while (headerNames.hasMoreElements()) {
            String header = headerNames.nextElement();
            String value = req.getHeader(header);
            System.out.printf("%s\t%s%n", header, value);
        }
        System.out.println("--------------------end--------------------------");


        // response 返回响应
        //--->响应乱码问题
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();
        out.write("这是在测试 servlet 的调用流程");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.service(req, resp);
    }

    @Override
    public void destroy() {

        System.out.println(" tomcat 停止 时  ，销毁");
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("init 方法是一个实例方法，所以会在构造方法执行后执行。无论访问了多少次 LoginInvokeService  init初始化 只会执行一次");
    }
}
