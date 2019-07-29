package com.string;
/*
 * public String toLowerCase()方法   转成小写

   public String toUpperCase()方法 转换为大写的 String。
   
   public String concat(String str)方法
 */
public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abc";
		
		System.out.println(s.toUpperCase().toLowerCase());
		
		String s1 = "ijk";
		
		System.out.println(s1.concat(s));
		
	}

}
