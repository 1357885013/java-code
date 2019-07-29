package com.string;
/*
 *  public String replace(char oldChar, char newChar)方法
 *  				返回一个新的字符串
 *  
	public String[] split(String regex)方法
					根据给定正则表达式的匹配拆分此字符串。
	
	public String trim()方法:去空白
	
	public int compareTo(String anotherString)方法
		如果参数字符串等于此字符串，则返回值 0；如果此字符串按字典顺序小于字符串参数，则返回一个小于 0 的值；
		如果此字符串按字典顺序大于字符串参数，则返回一个大于 0 的值
	public int compareToIgnoreCase(String str)方法:按字典顺序比较两个字符串
 
 */
public class Demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abc";
		
		String s1 = s.replace('b', '1');
		
		System.out.println(s1+"   "+s);
		
		String s2 = "I Love String";
		String str = s2.replace("Love", "Hate");
		
		System.out.println(str);
		
		
		String s3 = ",abc,ijk,xyz";
		//abc,ijk,xyz
		//,
		String [] result = s3.split(",");
		
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
		
		String result1 = "  abc  ".trim();
		
		System.out.println(result1);
		
		//System.out.println(s > s1);
		
		System.out.println("a".compareTo("b"));
		
		
		System.out.println("b".compareTo("a"));
		
						//97             65
		System.out.println("a".compareTo("A"));
		
		System.out.println("a".compareToIgnoreCase("A"));
	}

}
