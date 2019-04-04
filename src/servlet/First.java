package servlet;

import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author wangchunlan
 * @ClassName First.java
 * @Description
 * @createTime 2019年04月03日 17:54:00
 */
public class First  implements Servlet {

    ServletConfig config=null;

    public void init(ServletConfig config){
        this.config=config;
        System.out.println("First servlet is initialized");
    }

    public void service(ServletRequest req, ServletResponse res)
            throws IOException,ServletException {

        res.setContentType("text/html");





        PrintWriter out=res.getWriter();
        out.print("<html><body>");
        out.print("<b>hello simple servlet</b>");
        out.print("</body></html>");

    }
    public void destroy(){System.out.println("servlet is destroyed：停止tomcat 会打印这句话，");}
    public ServletConfig getServletConfig(){return config;}
    public String getServletInfo(){return "copyright 2007-1010";}
}
