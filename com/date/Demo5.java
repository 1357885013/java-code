package com.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/*
 * ��ȡ��������ʱ�� 
 * 
 */
public class Demo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��ȡ��ǰʱ��
		//Date date = new Date();
		
		//����Calendar����
		Calendar c = Calendar.getInstance();
		
		//�޸����ϵ��ֶ�-1
		c.add(Calendar.DAY_OF_MONTH, -1);
		
		//��ʽ��
		Date date = c.getTime();
		
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		String result = df.format(date);
		
		System.out.println(result);
	}

}
