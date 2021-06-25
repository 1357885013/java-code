package ljj.base.collection;

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
public class MyLinkedHashMap {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //创建Map对象
        Map<String, String> map = new LinkedHashMap<String, String>();

        //添加元素
        map.put("jack", "rose");

        map.put("tom", "rose");
        map.put("xiyangyang", "lanyangyang");
        map.put("abc", null);
        map.put("bc", null);

        map.put("abc", null);

        map.put("tom",map.remove("tom"));

        System.out.println("keySet 遍历输出");
        Set<String> keys = map.keySet();
        for (String p : keys) {
            String value = map.get(p);
            System.out.println("key=" + p + "  value=" + value);
        }


    }

}
