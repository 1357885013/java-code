package com.date;

import java.util.Calendar;

/*
 * 如何获得任意年份二月有多少天？
 * 
 * 1. 定位时间到该年3月1号
 * 2. 后退一天
 * 3. 获取当前是几号
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
