package tools;

import java.util.HashMap;
import java.util.Map;

// 把字符串形式的数组转成java的
public class JsToJava {
    private static void mapToArray(String t) {
        t = t.trim();
        StringBuilder sb = new StringBuilder();
        String[] mapItems = t.split(",");
        Map<String, String> map = new HashMap<>();
        if (mapItems.length > 0 && mapItems[0].length() > 0)
            for (String mapItem : mapItems) {
                String[] split = mapItem.split(":");
                map.put(split[0], split[1]);
            }
        for (int i = 0; i <= 29; i++) {
            if (map.containsKey(Integer.toString(i))) {
                sb.append(map.get(Integer.toString(i)));
                sb.append(",");
            } else
                sb.append("-1,");
        }
        sb.deleteCharAt(sb.length() - 1);
        System.out.println("{"+sb+"},");
    }

    public static void main(String[] args) {
        mapToArray("1:1,0:2,2:3,4:5,5:8,6:11,7:13,8:15,9:17,10:19,11:21,12:23,13:27,14:28,15:25,16:26,17:29,18:30,19:31,21:33,20:35,3:38,23:2,22:41,24:1,26:1,25:1,27:48,28:51,29:49");
        // 1
        mapToArray("0:1,1:1,22:1,23:1,24:1,25:1,26:1");
        mapToArray("0:2,22:2,23:2,21:45,26:46");
        mapToArray("3:4");
        mapToArray("");
        mapToArray("4:6,3:7");

        mapToArray("");
        mapToArray("");
        mapToArray("5:9,3:10");
        mapToArray("");
        mapToArray("");
        // 11
        mapToArray("3:12");
        mapToArray("");
        mapToArray("6:36,3:14");
        mapToArray("");
        mapToArray("8:16");

        mapToArray("");
        mapToArray("9:18");
        mapToArray("");
        mapToArray("3:20");
        mapToArray("");
        // 21
        mapToArray("3:22");
        mapToArray("");
        mapToArray("3:24");
        mapToArray("");
        mapToArray("");

        mapToArray("");
        mapToArray("");
        mapToArray("");
        mapToArray("");
        mapToArray("");
        // 31
        mapToArray("");
        mapToArray("");
        mapToArray("");
        mapToArray("");
        mapToArray("0:35,1:35,2:35,3:35,4:35,5:35,6:35,7:35,8:35,9:35,10:35,11:35,12:35,13:35,14:35,15:35,16:35,17:35,18:35,19:35,20:32,21:35,22:35,23:35,24:35,26:35,25:35");

        mapToArray("0:36,1:36,2:36,3:36,4:36,5:36,6:37,7:36,8:36,9:36,10:36,11:36,12:36,13:36,14:36,15:36,16:36,17:36,18:36,19:36,20:36,21:36,22:36,23:36,24:36,26:36,25:36");
        mapToArray("0:36,1:36,2:36,3:36,4:36,5:36,6:37,7:34,8:36,9:36,10:36,11:36,12:36,13:36,14:36,15:36,16:36,17:36,18:36,19:36,20:36,21:36,22:36,23:36,24:36,26:36,25:36");
        mapToArray("3:50");
        mapToArray("0:39,22:39");
        mapToArray("0:40,23:40,24:40,22:40,26:40");
        // 41
        mapToArray("0:39,25:42");
        mapToArray("0:40,23:40,24:40,26:40");
        mapToArray("0:43,23:43,22:43,26:46");
        mapToArray("0:44,23:44,22:44");
        mapToArray("0:43,23:43,22:43");

        mapToArray("0:44,23:44,22:44,4:47,5:47");
        mapToArray("0:44,23:44,22:44");
        mapToArray("27:48");
        mapToArray("");
        mapToArray("");
        // 51
        mapToArray("");
        mapToArray("");
    }
}
