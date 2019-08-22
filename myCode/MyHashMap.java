package myCode;

import java.util.*;

/*
 * Map<K,V>:双列集合
 * 	K:键的类型(唯一性约束，通过key获取对应的value)
 * V：值的类型
 *
 * HashMap：底层是哈希表  是不同步的  速度快
 * Hashtable：底层是哈希表  Hashtable 是同步的  速度慢
 * LinkedHashMap：底层是哈希表和链表结构
 * TreeMap：树结构，对键进行自然排序
 */
public class MyHashMap {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //创建Map对象
        Map<String, String> map = new HashMap<String, String>();

        //添加元素
        map.put("jack", "rose");

        map.put("tom", "rose");

        map.put("xiyangyang", "huitailang");


        map.put("xiyangyang", "lanyangyang");
        map.put("abc", null);
        map.put("bc", null);

        map.putIfAbsent("tom", "rose`s mom");

        System.out.println("map = " + map.remove("ja"));
        System.out.println("map = " + map.remove("jack", "r"));

        System.out.println("map.replace(\"xiyangyang\",\"mmp\") = " + map.replace("xiyangyang", "mmp"));
        System.out.println(map);
        System.out.println(map);

        System.out.println(map.get("tom"));

        Set<String> keys = map.keySet();
        for (String p : keys) {
            String value = map.get(p);
            System.out.println("key=" + p + "  value=" + value);
        }

        Set<Map.Entry<String, String>> entryEntries = map.entrySet();

        for (Map.Entry<String, String> entry : entryEntries) { //Map.Entry 是键值对集合
            String keyString = entry.getKey();
            String valueString = entry.getValue();

            System.out.println("key=" + keyString + "  value=" + valueString);
        }

        Collection<String> values = map.values();

        for (String string : values) {
            System.out.println(string);
        }


        Collection<String> c = new ArrayList<String>();
        Collections.addAll(c, "abc", "xyz", "wdasd");
        System.out.println(c);
    }

}
