package com.list;

import java.util.ArrayList;
import java.util.List;

/*
 * List:Ԫ�����򣬿��ظ����û����Ծ�ȷԪ�صĲ���λ�ã�Ԫ����������������������Ԫ��
 * 
 * void add(int index, E element) 
          ���б��ָ��λ�ò���ָ��Ԫ�أ���ѡ�������� 
          
    E remove(int index)�Ƴ��б���ָ��λ�õ�Ԫ��
    
    E set(int index,
      E element)��ָ��Ԫ���滻�б���ָ��λ�õ�Ԫ��
      
      E get(int index)�����б���ָ��λ�õ�Ԫ�ء�
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
		
		//��������
		for(int i = 0;i<l.size();i++){
			System.out.println(l.get(i));
		}
	}

}
