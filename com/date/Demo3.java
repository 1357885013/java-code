package com.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/*
 * public static Calendar getInstance()使用默认时区和语言环境获得一个日历
 * 
 * public int get(int field)返回给定日历字段的值
 * 				public static final int YEAR指示年的 get 和 set 的字段数字。
 */
public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//当前系统时间
		Calendar c = Calendar.getInstance();
		
		//获取日历中的年的值
		System.out.println(c.get(Calendar.YEAR));
		
		System.out.println(c.get(Calendar.MONTH));
		
		System.out.println(c.get(Calendar.DAY_OF_MONTH));
		System.out.println(c.get(Calendar.HOUR));
		System.out.println(c.get(Calendar.MINUTE));
		System.out.println(c.get(Calendar.SECOND));

		//设置日历中字段值
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
