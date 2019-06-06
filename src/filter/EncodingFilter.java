package filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author wangchunlan
 * @ClassName EncodingFilter.java
 * @Description
 * @createTime 2019年06月06日 15:41:00
 */
public class EncodingFilter implements Filter {

    @Override
    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
            throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) res;
        request.setCharacterEncoding("UTF-8");
        chain.doFilter(request, response);
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        //获得web.xml 中filter的名称
        String name = filterConfig.getFilterName();
        System.out.println("EncodingFilter: 过滤器 "+name);
        //当前filter初始化参数
        String parm = filterConfig.getInitParameter("aaa");
        System.out.println(parm);
        //获得servletContext
        filterConfig.getServletContext();
        System.out.println(filterConfig.getServletContext());
    }

}