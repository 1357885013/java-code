package com.buffer;
/*
 * StringBuffer:线程安全的可变字符序列,一个类似于 String 的字符串缓冲区
 * 
 * 
 * 构造方法
 * 	StringBuffer() 
          构造一个其中不带字符的字符串缓冲区，其初始容量为 16 个字符  自动扩容
          
    StringBuffer(String str) :String---StringBuffer
          构造一个字符串缓冲区，并将其内容初始化为指定的字符串内容。
 * 
 */
public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建字符串缓冲区
		StringBuffer buffer = new StringBuffer();
		
				System.out.println(buffer);
		
		buffer.append(true);
		
		System.out.println(buffer);
		
		
		/*
		 * 将数据类型转为字符串，追加的
		 * 
		 */
//		buffer.append('a');
//		buffer.append(1.3);
//		buffer.append("你好");
//		buffer.append(100);
//		Student s = new Student();
//		s.name = "jack";
//		s.age = 20;
//		buffer.append(s);
		
		buffer.append('a')
		.append(1.3)
		.append(100)
		.append(10000);
		
		System.out.println(buffer);
		
		
		StringBuffer sb = new StringBuffer("abc");
		
		System.out.println(sb);
		
		
		sb.insert(1, 123);
		
		System.out.println(sb);
		
		sb.append(true).deleteCharAt(2);
		
		System.out.println(sb);
	}

}
