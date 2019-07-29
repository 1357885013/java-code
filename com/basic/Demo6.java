package com.basic;
/*
 * System:系统类
 * 
 * public static void exit(int status)：退出程序
 * 
 * public static long currentTimeMillis()返回以毫秒为单位的当前时间
 * 
 * public static Properties getProperties():获取系统相关属性
 */
public class Demo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(System.currentTimeMillis());
		
		//System.exit(0);
		
		System.out.println(System.currentTimeMillis());
		
		System.out.println(System.getProperties());
	}

}
