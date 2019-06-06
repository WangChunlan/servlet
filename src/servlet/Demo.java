package servlet;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wangchunlan
 * @ClassName Demo.java
 * @Description
 * @createTime 2019年04月11日 14:07:00
 */
public class Demo {
    public static void main(String[] args) {
        Map<String, Map<String, String>> partitionInfos = new HashMap<String, Map<String, String>>();

        Map<String, String> partitionInfo1=new HashMap<>();
        Map<String, String> partitionInfo2 =new HashMap<>();
        partitionInfo1.put("3183","2268");
        partitionInfo1.put( "2881","2268");
        partitionInfos.put("zc1-3",partitionInfo1);




    }
}
