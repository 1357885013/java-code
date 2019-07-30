package com.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 * Iterator<E> iterator() :�������Ǽ����е�һ���ڲ��࣬ͨ���ⲿ��ķ����õ��ڲ������
          �����ڴ� collection ��Ԫ���Ͻ��е����ĵ������� 
          
          
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
		
		//��������
		//�õ���ǰ���ϵĵ���������
		
		/*
		 * 
		 * boolean hasNext() ��û���ƶ�ָ��
          		�������Ԫ�ؿ��Ե������򷵻� true�� 
 			E next() ���ƶ�ָ��
          		���ص�������һ��Ԫ�ء� 
		 */
		Iterator it = c.iterator();
		
		//�ж��Ƿ���һ��Ԫ��
		while(it.hasNext()){
			//��ȡ��һ��Ԫ�أ���ǿ������ת��
			String s = (String)it.next();
			//������
			System.out.println(s);
		}
	}

}
