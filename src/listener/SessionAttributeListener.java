package listener;

import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

/**
 * @author wangchunlan
 * @ClassName SessionAttributeListener.java
 * @Description
 * @createTime 2019年06月06日 14:30:00
 */
public class SessionAttributeListener implements HttpSessionAttributeListener {

    @Override
    public void attributeAdded(HttpSessionBindingEvent e) {

        System.out.println("session 增加属性 ");
        System.out.println("属性是" + e.getName());
        System.out.println("值是" + e.getValue());

    }

    @Override
    public void attributeRemoved(HttpSessionBindingEvent e) {
        // TODO Auto-generated method stub
        System.out.println("session 移除属性 ");

    }

    @Override
    public void attributeReplaced(HttpSessionBindingEvent e) {
        // TODO Auto-generated method stub
        System.out.println("session 替换属性 ");

    }
}
