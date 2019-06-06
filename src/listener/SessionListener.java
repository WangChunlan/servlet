package listener;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * @author wangchunlan
 * @ClassName SessionListener.java
 * @Description
 * @createTime 2019年06月06日 13:21:00
 */
public class SessionListener implements HttpSessionListener {
    @Override
    public void sessionCreated(HttpSessionEvent httpSessionEvent) {
        System.out.println("监听到 session 创建, sessionid 是： " + httpSessionEvent.getSession().getId());
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent httpSessionEvent) {
        System.out.println("监听到 session 销毁, sessionid 是： " + httpSessionEvent.getSession().getId());
    }
}
