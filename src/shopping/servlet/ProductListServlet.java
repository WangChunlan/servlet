package shopping.servlet;

import shopping.dao.ProductDAO;
import shopping.entity.Product;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @author wangchunlan
 * @ClassName ProductListServlet.java
 * @Description
 * @createTime 2019年06月11日 14:12:00
 */
//@WebServlet("/jsp/servlet/shopping/listProduct")
@WebServlet("/listProduct")
public class ProductListServlet  extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Product> products = new ProductDAO().ListProduct();
        request.setAttribute("products", products);
        request.getRequestDispatcher("/jsp/servlet/shopping/listProduct.jsp").forward(request, response);
    }
}
