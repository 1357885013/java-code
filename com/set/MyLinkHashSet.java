package com.set;

import java.util.LinkedHashSet;

/*
 * set���ϱ���
 * 1.ʹ����ͨ������
 * 2. ��ǿforѭ��
 * 
 * 
 * ��ǿforѭ�������飬����
 * 
 * for(Ԫ���������� ������:������){
 *    
 * }
 * 
 * ԭ��������ͨ��������ʹ����ǿforѭ�������ٱ����Ĺ������޸ļ��ϵĳ��ȡ�
 */
public class MyLinkHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet set = new LinkedHashSet();
		
		
		set.add(100);
		set.add(20);
		set.add(30);

		//set.add("anc");
		
		for(Object o:set){
			Integer i = (Integer)o;
			System.out.println(i);
		}
	}

}
