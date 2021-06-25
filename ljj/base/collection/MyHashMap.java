package ljj.base.collection;

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

        System.out.println("keySet �������");
        Set<String> keys = map.keySet();
        for (String p : keys) {
            String value = map.get(p);
            System.out.println("key=" + p + "  value=" + value);
        }

        System.out.println("--- ---");
        Set<Map.Entry<String, String>> entryEntries = map.entrySet();
        for (Map.Entry<String, String> entry : entryEntries) { //Map.Entry �Ǽ�ֵ�Լ���
            String keyString = entry.getKey();
            String valueString = entry.getValue();
//            map.put("fds","fdsfdf");
//            map.remove(entry.getKey());    // ���쳣
            System.out.println("key=" + keyString + "  value=" + valueString);
        }
        System.out.println("--- ---");
        Iterator<String> iterator = map.keySet().iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            map.put("fdsfd","fsdfd");
            if (next.equals("bc"))
                iterator.remove();  // �ӳ�ɾ��, ֻ�ܵ���һ��
            System.out.println(next);
        }
         iterator = map.keySet().iterator();
        System.out.println("--- ---");
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(next);
        }
        System.out.println("---r---");

        // ���� values
        Collection<String> values = map.values();

        for (String string : values) {
            System.out.println(string);
        }


        Collection<String> c = new ArrayList<String>();
        Collections.addAll(c, "abc", "xyz", "wdasd");
        System.out.println(c);
    }

}
