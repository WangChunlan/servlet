package servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author wangchunlan
 * @ClassName GetParam.java
 * @Description
 * @createTime 2019年04月04日 09:07:00
 */
public class GetParam extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      // 获取中文的参数乱码
        // 方式2：
//        req.setCharacterEncoding("UTF-8");
        String name = req.getParameter("name");
        String password = req.getParameter("password");

        // 方式1：
        byte[] bytes=  name.getBytes("ISO-8859-1");
        name = new String(bytes,"UTF-8");

        byte[] bytes1=password.getBytes("ISO-8859-1");
        password=new String(bytes1,"UTF-8");

        System.out.println("name:" + name + ";\n  password=" + password);
    }
}
