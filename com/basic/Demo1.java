package com.basic;
/*
 * 基本数据类型包装类 
 * 
 * Byte
 * Short
 * 
 * Long
 * 
 * Float
 * Double
 * 
 * Character
 * 
 * Boolean
 * 
 * 
 * Integer：
 * 能在 int 类型和 String 类型之间互相转换，还提供了处理 int 类型时非常有用的其他一些常量和方法
 * 
 * Integer(int value) 
          构造一个新分配的 Integer 对象，它表示指定的 int 值
          
   public Integer(String s):构造一个新分配的 Integer 对象，

   
   
   public static String toString(int i)返回一个表示指定整数的 String 对象
 */
public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer i = new Integer(100);
		System.out.println(i);

		Integer i1 = new Integer("1000");
		System.out.println(i1);
		
		
		/*
		 * int --- String
		 */
		int a = 20;
		
		String s = a+"";
		
		System.out.println(s);
		
		
		/*
		 * int --integer ---String
		 */
		Integer i2 = new Integer(a);
		
		String s2 = i2.toString();
		
		System.out.println(s2);
		
		
		/*
		 * int--String
		 */
		String s3 = Integer.toString(a);
		System.out.println(s3);
	}

}
