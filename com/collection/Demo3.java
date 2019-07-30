package com.collection;

import java.util.ArrayList;
import java.util.Collection;

/*
 * boolean addAll(Collection c)将指定 collection 中的所有元素都添加到此 collection 中
 * 
 * boolean removeAll(Collection<?> c)移除此 collection 中那些也包含在指定 collection 中的所有元素（
 *
 * boolean retainAll(Collection<?> c)仅保留此 collection 中那些也包含在指定 collection 的元素
 *
 *boolean containsAll(Collection<?> c)如果此 collection 包含指定 collection 中的所有元素
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
