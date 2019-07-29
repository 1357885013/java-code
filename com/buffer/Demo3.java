package com.buffer;
/*
 *  public StringBuffer replace(int start, int end, String str):替换
	public StringBuffer reverse()：翻转
	public String substring(int start)：截取
			返回一个新的 String，它包含此字符序列当前所包含的字符子序列
	public String substring(int start, int end)：截取
	
	
	public String toString()返回此序列中数据的字符串表示形式  StringBuffer--String

 */
public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer("i love stringbuffer");
		
		sb.replace(2, 6, "hate");
		
		System.out.println(sb);
		
		
		System.out.println(sb.reverse());
		
		
		String s = sb.substring(2, 5);
		
		System.out.println(s);
		
		
		String s1 = sb.toString();
		
		System.out.println(s1);
		
	}

}
