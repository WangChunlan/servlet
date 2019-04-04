package servlet;

/**
 * @author wangchunlan
 * @ClassName GetOneServlet.java
 * @Description
 * @createTime 2019年04月04日 14:37:00
 */
import java.io.IOException;
import java.io.Writer;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Hero;
import net.sf.json.JSONObject;

public class GetOneServlet extends HttpServlet {
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Hero hero = new Hero();
        hero.setName("盖伦");
        hero.setHp(353);
        JSONObject json= new JSONObject();
        json.put("hero", JSONObject.fromObject(hero));
        response.setContentType("text/html;charset=utf-8");
        response.getWriter().print(json);
    }
}