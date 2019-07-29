package com.test;
/*
 * 给定一个字符串找到子串在字符串中出现的	
 * 次数。String s = "abc123456abcxxxabc"中的"abc"
 *
 */
public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abc123456abcxxxabc";
		//定义计数变量
		int count = 0;
		
		//定义出现的索引变量
		int index;
		
		//定义查找的起始的索引
		int i = 0;
		while((index = s.indexOf("abc",i)) != -1){
			//找到了
			count++;
			//重新定位要查找的起始索引
			i = index + 3;
		}
		
		System.out.println(count);
	}

}
