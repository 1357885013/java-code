package com.test;
/*
 * 将字符串首字母变为大写，其余字母变为小写
 * miNg tiAn fanG jIa
 */
public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "miNg tiAn fanG jIa";
		
		String result = "";
		
		String [] arr = s.split(" ");
		
		for (int i = 0; i < arr.length; i++) {
			//获取单词的首部和尾部
			String header = arr[i].substring(0,1);
			
			//直接变大写
			String headerDa = header.toUpperCase();
			
			//获取尾部
			String body = arr[i].substring(1);
			
			String bodyXiao = body.toLowerCase();
			
			//组成新单词
			String newWord = headerDa+bodyXiao;
			
			result = result + newWord+" ";
			
		}
		
		System.out.println(result);
	}

}
