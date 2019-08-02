package com.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/*
 * InputStream:表示字节输入流的所有类的超类
 * 
 * FileInputStream 从文件系统中的某个文件中获得输入字节
 * 
 * 		FileInputStream(File file) 
 * 		FileInputStream(String name)
 * 
 * 
 *  方法
 *  	abstract  int read() ：从输入流中读取数据的下一个字节   如果到达流的末尾，则返回 -1。
 *  
 *  	public int read(byte[] b):一次读取一个数组：返回值代表真正读取的字节个数  如果达到文件末尾返回-1

 */
public class Demo2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//创建流对象
		InputStream is = new FileInputStream("b");
		
		
		//读入
		int b = is.read();
		
		System.out.println((char)b);
		
		
		//定义读入字节缓冲区
		byte [] by = new byte[1024];
		int len = is.read(by);
		
		System.out.println("读取到了"+len);
		
		//字节----》字符串   
		System.out.println("读取的内容是"+new String(by,0,len));
		
		
		//关闭流对象
		is.close();
		
	}

}
