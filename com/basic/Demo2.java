package com.basic;
/*
 * String---int
 * 
 *  int intValue() 
          以 int 类型返回该 Integer 的值 
          
    public static Integer valueOf(String s):返回保存指定的 String 的值的 Integer 对象
    
    
    public static int parseInt(String s):字符串转整数
 */
public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "100";
		//String ---Integer---int
		Integer i = new Integer(s);
		
		int i1 = i.intValue();
		
		System.out.println(i1);
		
		
		//String--Integer--int
		Integer i3 = Integer.valueOf(s);
		int i4 = i3.intValue();
		
		System.out.println(i4);
		
		int i5 = Integer.parseInt(s);
		
		System.out.println(i5);
		
	}

}
