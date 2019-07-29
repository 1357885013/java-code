package com.string;
/*
 *  public char[] toCharArray() 方法:将此字符串转换为一个新的字符数组
 *  
 *  
	public byte[] getBytes()方法
				使用平台的默认字符集将此 String 编码为 byte 序列，并将结果存储到一个新的 byte 数组中
				

	重写toString方法
	
	
	public static String copyValueOf(char[]?data)及其重载方法:字符数组转字符串
	
	
	public static String valueOf(boolean?b)及其重载方法

 */
public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "今天";
		char [] cs = s.toCharArray();
		
		for (int i = 0; i < cs.length; i++) {
			System.out.println(cs[i]);
		}
		
		
		
		
		byte [] by = s.getBytes();
		
		for (int i = 0; i < by.length; i++) {
			System.out.print(by[i]+" ");
		}
		
		
		char [] cs1 = {'明','天','周','五'};
		
		String str = String.copyValueOf(cs1);
		
		System.out.println(str);
		
		boolean b = false;
		
		String str1 = String.valueOf(b);
		
		System.out.println(str1);
		
		//输出的都是字符串
		/*
		 * 
		 */
		System.out.println(false);
		
		System.out.println(100);
		
		String s1 = String.valueOf(null);
		
		System.out.println(s1);
		
	}

}
