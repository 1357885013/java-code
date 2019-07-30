package com.collection;

import java.util.ArrayList;
import java.util.Collection;

/*
 * Collection:
 * 
 * 	boolean add(E e):添加元素
 * 
 * boolean remove(Object o):删除元素
 */
public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建集合对象  多态
		Collection c = new ArrayList();
		
		//创建元素
		String s = "abc";
		
		int a = 100;
		
		boolean b = false;
		
		double d = 3.4;
		
		//将元素放入集合中
		c.add(s);
		c.add(a);
		c.add(b);
		c.add(d);
		
		//删除元素
		c.remove("abc");
		
		c.remove(false);
		
		//输出集合
		System.out.println(c);
	}

}
