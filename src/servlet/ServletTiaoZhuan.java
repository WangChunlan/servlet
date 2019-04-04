package servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

/**
 * @author wangchunlan
 * @ClassName GetParam.java
 * @Description
 * @createTime 2019年04月04日 09:07:00
 */
public class ServletTiaoZhuan extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      // 获取中文的参数乱码
        req.setCharacterEncoding("UTF-8");
        String name = req.getParameter("name");
        String password = req.getParameter("password");
        System.out.println("name:" + name + ";\n  password=" + password);
        if("admin".equals(name)&&"123".equals(password)){
            req.getRequestDispatcher("success.jsp").forward(req,resp);
        }else{
            // 客户端跳转：301 (永久跳转)；302(临时跳转)  浏览器 F12 可以查看
            // 302 临时跳转
//            resp.sendRedirect("fail.jsp");
            // 301 永久跳转
            resp.setStatus(301);
            resp.setHeader("Location", "fail.jsp");
        }


    }
}
