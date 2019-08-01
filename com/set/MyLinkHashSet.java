package com.set;

import java.util.LinkedHashSet;

/*
 * set集合遍历
 * 1.使用普通迭代器
 * 2. 增强for循环
 * 
 * 
 * 增强for循环：数组，集合
 * 
 * for(元素数据类型 变量名:集合名){
 *    
 * }
 * 
 * 原理：就是普通迭代器，使用增强for循环不能再遍历的过程中修改集合的长度。
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
