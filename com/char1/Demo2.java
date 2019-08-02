package com.char1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;

/*
 * Reader
 * 
 * FileReader:
 * 	用来读取字符文件的便捷类
 * 
 * int read() 
          	读取单个字符。 
 	int read(char[] cbuf) 
          	将字符读入数组。 
	abstract  int read(char[] cbuf, int off, int len) 
          将字符读入数组的某一部分。 
 */
public class Demo2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//创建文件字符输入流
		Reader r = new FileReader("e.txt");
		
		//读入
		char a = (char)r.read();
		
		System.out.println(a);
		
		
		char [] cr = new char[10];
		
		int len;
		
		len = r.read(cr);
		
		System.out.println("读取到的字符个数"+len);
		System.out.println("读取到的内容是"+Arrays.toString(cr));
		
		//关闭资源
		r.close();
	}

}
