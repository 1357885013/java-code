package com.collection;

import java.util.ArrayList;
import java.util.Collection;
/*
 * 
 * boolean contains(Object o)如果此 collection 包含指定的元素，则返回 true。  与对象的equals方法返回值有关
 */
public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection c = new ArrayList();
		
		Person p = new Person("jack",20);
		
		Person p1 = new Person("rose",21);
		
		c.add(p);
		c.add(p1);
		
		
		//删除元素
		//c.remove(p);//删除成功
		//c.remove(new Person("jack",20));//删除失败 原因：比较元素相同的时候，调用元素的equals方法，如果
		//该类的equals不重写，比较的是地址，删除失败；如果想要通过内容判断相同的话，必须重写equals方法
		
		
		//是否包含
		System.out.println(c.contains(p));
		
		System.out.println(c.contains(new Person("jack",20)));//
		
		
		System.out.println(c.toString());
		
		System.out.println(c.size());
		
		c.clear();
		
		System.out.println(c.isEmpty());
	}

}
