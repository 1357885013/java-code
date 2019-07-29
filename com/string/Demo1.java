package com.string;
/*
 *  public int length()方法 返回此字符串的长度
 *  
	public char charAt(int index)方法 返回指定索引处的 char 值  索引范围为从 0 到 length() - 1
	
	
	public int indexOf(int ch)及其重载方法
				                    返回指定子字符串在此字符串中第一次出现处的索引
				        返回-1代表没有找到            
				        
	int indexOf(int ch, int fromIndex) 
          		返回在此字符串中第一次出现指定字符处的索引，从指定的索引开始搜索 			                    
				                    
	public int lastIndexOf(int ch)及其重载方法
	
	
	public String substring(int beginIndex)及其重载方法
			返回一个新的字符串，它是此字符串的一个子字符串
	public String substring(int beginIndex,
                        int endIndex): beginIndex - 起始索引（包括）。endIndex - 结束索引（不包括）。 

 */
public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abc";
		
		System.out.println(s.length());
		
		System.out.println("java".length());
		
		char c = s.charAt(2);
		
		System.out.println(c);
		
		String s1 = "I Love You";
		
		String s2 = "you";
		
		int index = s1.indexOf(s2);
		
		System.out.println(index);
		
		
		System.out.println(s1.indexOf('o'));
		
		
		System.out.println(s1.indexOf('o', 5));
		
		
		
		System.out.println(s1.lastIndexOf('o'));
		
		
		String newStr = s1.substring(3);
		
		System.out.println(newStr);
		
		
		String newStr1 = s1.substring(4, 8);
		System.out.println(newStr1);
	}

}
