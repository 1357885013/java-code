package com.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * ��������
 * 
 * String---Date
 * 
 * "2019-10-10 10:10:10"
 */
public class Demo2 {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		String s = "2019-10-10 10:10:10";
		
		//�������ڸ�ʽ������
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		//��������
		Date date = df.parse(s);
		
		
		System.out.println(date);
	}

}
