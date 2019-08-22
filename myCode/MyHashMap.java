package myCode;

import java.util.*;

/*
 * Map<K,V>:˫�м���
 * 	K:��������(Ψһ��Լ����ͨ��key��ȡ��Ӧ��value)
 * V��ֵ������
 *
 * HashMap���ײ��ǹ�ϣ��  �ǲ�ͬ����  �ٶȿ�
 * Hashtable���ײ��ǹ�ϣ��  Hashtable ��ͬ����  �ٶ���
 * LinkedHashMap���ײ��ǹ�ϣ�������ṹ
 * TreeMap�����ṹ���Լ�������Ȼ����
 */
public class MyHashMap {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //����Map����
        Map<String, String> map = new HashMap<String, String>();

        //���Ԫ��
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

        for (Map.Entry<String, String> entry : entryEntries) { //Map.Entry �Ǽ�ֵ�Լ���
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
