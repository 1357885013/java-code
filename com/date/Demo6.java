package com.date;

import java.util.Calendar;

/*
 * ��λ��������ݶ����ж����죿
 * 
 * 1. ��λʱ�䵽����3��1��
 * 2. ����һ��
 * 3. ��ȡ��ǰ�Ǽ���
 * 
 */
public class Demo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar c = Calendar.getInstance();
		
		c.set(Calendar.YEAR, 1988);
		c.set(Calendar.MONTH, 2);
		c.set(Calendar.DAY_OF_MONTH, 1);
		
		c.add(Calendar.DAY_OF_MONTH, -1);
		
		System.out.println(c.get(Calendar.DAY_OF_MONTH));
	}

}
