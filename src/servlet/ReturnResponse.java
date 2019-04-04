package servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author wangchunlan
 * @ClassName GetParam.java
 * @Description
 * @createTime 2019年04月04日 09:07:00
 */
public class ReturnResponse extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      // 获取中文的参数乱码
        req.setCharacterEncoding("UTF-8");
        String name = req.getParameter("name");
        String password = req.getParameter("password");
        System.out.println("name:" + name + ";\n  password=" + password);
        String html=null;
        if("admin".equals(name)&&"123".equals(password)){
            html="<div style='color:green'>success</div><br/>";
        }else{
            html="<div style='color:red'>fial</div><br/>";
        }
        html+="  <a href='returnResponse.jsp'>登录界面(调用  post,返回响应，控制台输出)</a><br/>";
        // 响应中文乱码
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter pw=resp.getWriter();
        pw.write(html);
    }
}
