package com.list;

import java.util.ArrayList;
import java.util.List;

/*
 * List:元素有序，可重复；用户可以精确元素的插入位置，元素有索引，根据索引处理元素
 * 
 * void add(int index, E element) 
          在列表的指定位置插入指定元素（可选操作）。 
          
    E remove(int index)移除列表中指定位置的元素
    
    E set(int index,
      E element)用指定元素替换列表中指定位置的元素
      
      E get(int index)返回列表中指定位置的元素。
 */
public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List l = new ArrayList();
		
		l.add("abc");
		l.add("ijk");
		l.add("123");
		
		l.add(2,"xyz");
		
		System.out.println(l);
		
		
		l.remove(3);
		
		System.out.println(l);
		
		
		l.set(1, "jack");
		System.out.println(l);
		
		
		System.out.println(l.get(1));
		
		//遍历集合
		for(int i = 0;i<l.size();i++){
			System.out.println(l.get(i));
		}
	}

}
