package com.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 * Iterator<E> iterator() :迭代器是集合中的一个内部类，通过外部类的方法得到内部类对象
          返回在此 collection 的元素上进行迭代的迭代器。 
          
          
          class ArrayList{
          	public Iterator<E> iterator(){
          		return new MyIterator();
          	}
          
          	private class MyIterator implements Iterator{
          	
          	}
          }
 */
public class Demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection c = new ArrayList();
		
		c.add("abc");
		c.add("xyz");
		c.add("ijk");
		
		//遍历集合
		//得到当前集合的迭代器对象
		
		/*
		 * 
		 * boolean hasNext() ：没有移动指针
          		如果仍有元素可以迭代，则返回 true。 
 			E next() ：移动指针
          		返回迭代的下一个元素。 
		 */
		Iterator it = c.iterator();
		
		//判断是否下一个元素
		while(it.hasNext()){
			//获取下一个元素，并强制类型转换
			String s = (String)it.next();
			//输出结果
			System.out.println(s);
		}
	}

}
