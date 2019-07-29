package com.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * 解析日期
 * 
 * String---Date
 * 
 * "2019-10-10 10:10:10"
 */
public class Demo2 {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		String s = "2019-10-10 10:10:10";
		
		//创建日期格式化对象
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		//解析日期
		Date date = df.parse(s);
		
		
		System.out.println(date);
	}

}
