package com.map;

import java.util.HashMap;
import java.util.Map;

/*
 * Map<K,V>:˫�м���
 * 	K:��������(Ψһ��Լ����ͨ��key��ȡ��Ӧ��value)
 * V��ֵ������
 * 
 * HashMap���ײ��ǹ�ϣ��  �ǲ�ͬ����  �ٶȿ�
 * Hashtable���ײ��ǹ�ϣ��  Hashtable ��ͬ����  �ٶ���
 * LinkedHashMap���ײ��ǹ�ϣ���������ṹ
 * TreeMap�����ṹ���Լ�������Ȼ����
 */
public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����Map����
		Map<String,String> map = new HashMap<String,String>();
		
		//����Ԫ��
		map.put("jack", "rose");
		
		map.put("tom", "rose");
		
		map.put("xiyangyang", "huitailang");
		
		
		map.put("xiyangyang", "lanyangyang");
		
		
		System.out.println(map);
		
		System.out.println(map.get("tom"));
		
	}

}