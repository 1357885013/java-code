package com.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/*
 * public static Calendar getInstance()ʹ��Ĭ��ʱ�������Ի������һ������
 * 
 * public int get(int field)���ظ��������ֶε�ֵ
 * 				public static final int YEARָʾ��� get �� set ���ֶ����֡�
 */
public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��ǰϵͳʱ��
		Calendar c = Calendar.getInstance();
		
		//��ȡ�����е����ֵ
		System.out.println(c.get(Calendar.YEAR));
		
		System.out.println(c.get(Calendar.MONTH));
		
		System.out.println(c.get(Calendar.DAY_OF_MONTH));
		System.out.println(c.get(Calendar.HOUR));
		System.out.println(c.get(Calendar.MINUTE));
		System.out.println(c.get(Calendar.SECOND));

		//�����������ֶ�ֵ
		c.set(Calendar.YEAR, 2020);
		
		System.out.println(c.get(Calendar.YEAR));
		
		
		//c.add(Calendar.MONTH, 10);
		
		System.out.println(c);
		
		//Calendar---Date--SimpleDateformat
		
		Date date = c.getTime();
		
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		String result = df.format(date);
		System.out.println(result);
		
	}

}
