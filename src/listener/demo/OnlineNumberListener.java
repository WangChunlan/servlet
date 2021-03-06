package listener.demo;
import javax.servlet.ServletContext;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
/**
 * 统计在线人数
 * @author wangchunlan
 * @ClassName OnlineNumberListener.java
 * @Description
 * @createTime 2019年06月06日 14:56:00
 */
@WebListener   //在此注明以下类是监听器
public class OnlineNumberListener implements HttpSessionListener {

    @Override
    public void sessionCreated(HttpSessionEvent e) {

        ServletContext application = e.getSession().getServletContext(); // 这儿就是jsp 中的application
        Integer online_number = (Integer) application.getAttribute("online_number");
        if (null == online_number)
            online_number = 0;
        online_number++;
        application.setAttribute("online_number", online_number);
        System.out.println("新增一位在线用户");
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent e) {
        ServletContext application = e.getSession().getServletContext();
        Integer online_number = (Integer) application.getAttribute("online_number");
        if(null==online_number){
            online_number = 0;
        }
        else
            online_number--;
        application.setAttribute("online_number", online_number);
        System.out.println("一位用户离线");
    }
}
