package servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author wangchunlan
 * @ClassName LoginInvokeServiceMethod.java
 * @Description
 * @createTime 2019年04月04日 09:47:00
 */
public class LoginInvokeServiceMethod extends HttpServlet {

    public LoginInvokeServiceMethod() {
        System.out.println("LoginInvokeServiceMethod  无参构造方法，只创建一次，单例模式");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPut(req, resp);
    }


    /**
     *  实际上：在执行doGet 或 dopost 会先执行service方法，由service 方法判断到底是执行 doGet 还是 doPost
     *  可以发现，service(), doGet(), doPost() 三种方式的参数列表都是一样的。
     *   所以，有时候也会直接重写service()方法，在其中提供相应的服务，就不用区分到底是get还是post了。
     *  比如把前面的登录的LoginServlet，改为提供service方法，也可以达到相同的效果
     *
     * @param: req
     * @param: resp
     * @Description
     * @author wangchunlan
     * @createTime 2019/4/4 9:51
     */
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name=req.getParameter("name");
        String password=req.getParameter("password");

        String html=null;
        if("admin".equals(name)&&password.equals(password)){

//            html="<div style='color:green'>success </div>";
            // 将登陆名保存到session 中
            req.getSession().setAttribute("userName",name);
            req.getRequestDispatcher("success.jsp").forward(req,resp);
        }else{
            html="<div style='color:red'>fail </div>";
            req.getRequestDispatcher("fail.jsp").forward(req,resp);
        }
//        PrintWriter out=resp.getWriter();
//        out.write(html);

    }

    @Override
    public void destroy() {
        super.destroy();
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
    }
}
