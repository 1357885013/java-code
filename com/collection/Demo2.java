package com.collection;

import java.util.ArrayList;
import java.util.Collection;
/*
 * 
 * boolean contains(Object o)����� collection ����ָ����Ԫ�أ��򷵻� true��  ������equals��������ֵ�й�
 */
public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection c = new ArrayList();
		
		Person p = new Person("jack",20);
		
		Person p1 = new Person("rose",21);
		
		c.add(p);
		c.add(p1);
		
		
		//ɾ��Ԫ��
		//c.remove(p);//ɾ���ɹ�
		//c.remove(new Person("jack",20));//ɾ��ʧ�� ԭ�򣺱Ƚ�Ԫ����ͬ��ʱ�򣬵���Ԫ�ص�equals���������
		//�����equals����д���Ƚϵ��ǵ�ַ��ɾ��ʧ�ܣ������Ҫͨ�������ж���ͬ�Ļ���������дequals����
		
		
		//�Ƿ����
		System.out.println(c.contains(p));
		
		System.out.println(c.contains(new Person("jack",20)));//
		
		
		System.out.println(c.toString());
		
		System.out.println(c.size());
		
		c.clear();
		
		System.out.println(c.isEmpty());
	}

}
