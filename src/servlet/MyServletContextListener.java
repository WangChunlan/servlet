package servlet;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * @author wangchunlan
 * @ClassName MyServletContextListener.java
 * @Description
 * @createTime 2019年04月04日 16:51:00
 */
public class MyServletContextListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        System.out.println("MyServletContextListener:contextInitialized 方法被调用 ");
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        System.out.println("MyServletContextListener:contextDestroyed 方法被调用 ");

    }
}
