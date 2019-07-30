package com.date;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * public Date()分配 Date 对象并初始化此对象，以表示分配它的时间   获取当前系统时间
 * 
 * public Date(long date) 指定时间 分配 Date 对象并初始化此对象
 * 
 * 
 *  public long getTime()  date对象-long
	public void setTime(long time)  long---date对象
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
		
		
		//指定日期模式
		String pattern = "yyyy年MM月dd日 HH:mm:ss:S";
				//System
		//创建日期格式化对象
		SimpleDateFormat df = new SimpleDateFormat(pattern);
		//格式化日期
		/*
		 * public final String format(Date date)将一个 Date 格式化为日期/时间字符串
		 */
		String result = df.format(1000000000000l);
		System.out.println(result);
	}

}
