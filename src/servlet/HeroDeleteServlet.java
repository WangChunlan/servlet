package servlet;

/**
 * @author wangchunlan
 * @ClassName HeroDeleteServlet.java
 * @Description
 * @createTime 2019年04月04日 13:49:00
 */

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.HeroDAO;

public class HeroDeleteServlet extends HttpServlet {

    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int id = Integer.parseInt(request.getParameter("id"));

        new HeroDAO().delete(id);

        response.sendRedirect("/listHero");

    }
}