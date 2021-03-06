package servlet;

/**
 * @author wangchunlan
 * @ClassName HeroAddServlet.java
 * @Description
 * @createTime 2019年04月04日 13:37:00
 */
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Hero;
import dao.HeroDAO;

public class HeroAddServlet extends HttpServlet {
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // 注释掉下面一行 使用过滤器 代替该功能
//        request.setCharacterEncoding("UTF-8");

        Hero hero = new Hero();
        hero.setName(request.getParameter("name"));
        hero.setHp(Float.parseFloat(request.getParameter("hp")));
        hero.setDamage(Integer.parseInt(request.getParameter("damage")));

        new HeroDAO().add(hero);

        response.sendRedirect("/listHero");

    }
}