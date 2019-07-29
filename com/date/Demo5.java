package com.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/*
 * 获取昨天的这个时刻 
 * 
 */
public class Demo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//获取当前时刻
		//Date date = new Date();
		
		//创建Calendar对象
		Calendar c = Calendar.getInstance();
		
		//修改日上的字段-1
		c.add(Calendar.DAY_OF_MONTH, -1);
		
		//格式化
		Date date = c.getTime();
		
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		String result = df.format(date);
		
		System.out.println(result);
	}

}
