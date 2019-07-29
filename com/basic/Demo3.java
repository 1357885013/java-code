package com.basic;
/*
 * 基本数据类型的自动装箱   自动拆箱
 */
public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//自动装箱：基本数据类型的变量可以直接赋值给基本数据类型包装类
		Integer i = 200;
		
		System.out.println(i);
		
		Integer i1 = 100;
		
		//自动拆箱：基本数据类型包装类直接进行算数运算。
		Integer a = i - i1;//先拆箱--后装箱
		
		System.out.println(a);
	}

}
