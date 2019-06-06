package servlet;

/**
 * @author wangchunlan
 * @ClassName GetManyServlet.java
 * @Description
 * @createTime 2019年04月04日 14:44:00
 */
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Hero;
import net.sf.json.JSONSerializer;
import org.apache.commons.lang.StringUtils;

public class GetManyServlet extends HttpServlet {
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<Hero> heros = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Hero hero = new Hero();
            hero.setName("name"+i);
            hero.setHp(500+i);
            heros.add(hero);
        }

        String result =JSONSerializer.toJSON(heros).toString();

        response.setContentType("text/html;charset=utf-8");
        response.getWriter().print(result);
    }
    public static void main(String[] args) {
      /*  List<Hero> heros = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Hero hero = new Hero();
            hero.setName("name"+i);
            hero.setHp(500+i);
            heros.add(hero);
        }

        System.out.println(JSONSerializer.toJSON(heros).toString());*/
        Map<String,String> map=new HashMap<>();
        map.put("tenantIds","201286");
        map.put("branchIds","1609,1519");
        buildMap(map);

    }


    public static String buildMap(Map<String, String> map) {
        StringBuffer sb = new StringBuffer();
        if (map.size() > 0) {
            for (String key : map.keySet()) {
                sb.append(key + "=");
                if (StringUtils.isEmpty(map.get(key))) {
                    sb.append("&");
                } else {
                    String value = map.get(key);
                    try {
                        value = URLEncoder.encode(value, "UTF-8");
                    } catch (UnsupportedEncodingException e) {
                        e.printStackTrace();
                    }
                    sb.append(value + "&");
                }
            }
        }
        System.out.println(sb.toString());
        return sb.toString();
    }

}
