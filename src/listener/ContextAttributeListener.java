package listener;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;

/**
 * @author wangchunlan
 * @ClassName ContextAttributeListener.java
 * @Description
 * @createTime 2019年06月06日 13:08:00
 */
public class ContextAttributeListener implements ServletContextAttributeListener {
    @Override
    public void attributeAdded(ServletContextAttributeEvent servletContextAttributeEvent) {
        System.out.println("增加属性 ");
        System.out.println("属性是" + servletContextAttributeEvent.getName());
        System.out.println("值是" + servletContextAttributeEvent.getValue());
    }

    @Override
    public void attributeRemoved(ServletContextAttributeEvent servletContextAttributeEvent) {
        System.out.println("移除属性 ");
    }

    @Override
    public void attributeReplaced(ServletContextAttributeEvent servletContextAttributeEvent) {
        System.out.println("替换属性");
    }
}
