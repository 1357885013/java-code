package com.collection;

import java.util.ArrayList;
import java.util.Collection;

/*
 * Collection:
 * 
 * 	boolean add(E e):���Ԫ��
 * 
 * boolean remove(Object o):ɾ��Ԫ��
 */
public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�������϶���  ��̬
		Collection c = new ArrayList();
		
		//����Ԫ��
		String s = "abc";
		
		int a = 100;
		
		boolean b = false;
		
		double d = 3.4;
		
		//��Ԫ�ط��뼯����
		c.add(s);
		c.add(a);
		c.add(b);
		c.add(d);
		
		//ɾ��Ԫ��
		c.remove("abc");
		
		c.remove(false);
		
		//�������
		System.out.println(c);
	}

}
