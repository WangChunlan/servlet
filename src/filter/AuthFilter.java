package filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author wangchunlan
 * @ClassName AuthFilter.java
 * @Description
 * @createTime 2019年06月06日 15:58:00
 */
@WebFilter
public class AuthFilter implements Filter {
    @Override
    public void destroy() {

    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
            throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) res;

        String uri = request.getRequestURI();
//        if (uri.endsWith("login.html") || uri.endsWith("login")) {
        if (uri.endsWith("loginInvokeServiceMethod.jsp") || uri.endsWith("loginInvokeServiceMethod")) {
            chain.doFilter(request, response);
            return;
        }

        String userName = (String) request.getSession().getAttribute("userName");
        if (null == userName) {
//            response.sendRedirect("login.html");
            response.sendRedirect("loginInvokeServiceMethod.jsp");
            return;
        }

        chain.doFilter(request, response);
    }

    @Override
    public void init(FilterConfig arg0) throws ServletException {

    }
}
