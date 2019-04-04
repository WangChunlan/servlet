package servlet;

/**
 * @author wangchunlan
 * @ClassName SubmitServlet.java
 * @Description
 * @createTime 2019年04月04日 14:20:00
 */
import entity.Hero;
import net.sf.json.JSONObject;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class SubmitServlet extends HttpServlet {
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String data =request.getParameter("data");

        System.out.println("服务端接收到的数据是：" +data);
        JSONObject json=JSONObject.fromObject(data);
        System.out.println("转换为JSON对象之后是："+ json);

        Hero hero = (Hero)JSONObject.toBean(json,Hero.class);
        System.out.println("转换为Hero对象之后是："+hero);
    }
}