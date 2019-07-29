package com.test;
/*
 * 统计一个字符串中大小写的个数
 * 
 * 1. 定义两个变量
 * 2. 遍历字符串
 * 		判断字母是大写  a++;
 * 		如果是小写  b++;
 * 
 * 3. 输出ab
 */
public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Ming Tian Fang Jia";
		
		int a = 0;
		int b = 0;
		
		for(int i = 0;i<str.length();i++){
			char c = str.charAt(i);
			
			if(c >= 'a' && c <= 'z'){
				a++;
			}else if(c >= 'A' && c <= 'Z'){
				b++;
			}
		}
		
		
		System.out.println("小写有"+a+"  大写有"+b);
	}

}
