package com.date;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * public Date()���� Date ���󲢳�ʼ���˶����Ա�ʾ��������ʱ��   ��ȡ��ǰϵͳʱ��
 * 
 * public Date(long date) ָ��ʱ�� ���� Date ���󲢳�ʼ���˶���
 * 
 * 
 *  public long getTime()  date����-long
	public void setTime(long time)  long---date����
 */
public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date = new Date();
		
		System.out.println(date);
		
		
		Date date2 = new Date(1000000000000l);
		System.out.println(date2);
		
		System.out.println(date2.getTime());
		
		date2.setTime(1000000000);
		System.out.println(date2);
		
		
		//ָ������ģʽ
		String pattern = "yyyy��MM��dd�� HH:mm:ss:S";
				//System
		//�������ڸ�ʽ������
		SimpleDateFormat df = new SimpleDateFormat(pattern);
		//��ʽ������
		/*
		 * public final String format(Date date)��һ�� Date ��ʽ��Ϊ����/ʱ���ַ���
		 */
		String result = df.format(1000000000000l);
		System.out.println(result);
	}

}
