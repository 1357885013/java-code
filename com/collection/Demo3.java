package com.collection;

import java.util.ArrayList;
import java.util.Collection;

/*
 * boolean addAll(Collection c)��ָ�� collection �е�����Ԫ�ض���ӵ��� collection ��
 * 
 * boolean removeAll(Collection<?> c)�Ƴ��� collection ����ЩҲ������ָ�� collection �е�����Ԫ�أ�
 *
 * boolean retainAll(Collection<?> c)�������� collection ����ЩҲ������ָ�� collection ��Ԫ��
 *
 *boolean containsAll(Collection<?> c)����� collection ����ָ�� collection �е�����Ԫ��
 */
public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection c = new ArrayList();
		
		c.add("abc");
		c.add("xyz");
		
		Collection c1 = new ArrayList();
		
		c1.add("c1c1c1");
		
		c1.addAll(c);
		
		System.out.println(c1);
		
		//c1.removeAll(c);
		
		System.out.println(c1);
		
		c1.retainAll(c);
		
		System.out.println(c1);
		
		c1.add("ijk");
		
		c.add("123");
		
		System.out.println(c1.containsAll(c));
		
	}

}
