package com.stream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/*
 * BufferedInputStream:高效字节输入流
 * 	在创建 BufferedInputStream 时，会创建一个内部缓冲区数组
 * 	填充该内部缓冲区（读取了多个），读取的时候就是从内部缓冲区读取
 * 
 */
public class Demo5 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//创建普通字节输入流
		InputStream is = new FileInputStream("d.txt");
		
		//创建高效流
		BufferedInputStream bis = new BufferedInputStream(is);
		
		//读入
		int b = bis.read();
		System.out.println(b);
		
		byte [] by = new byte [10];
		int len;
		
		len = bis.read(by);
		
		System.out.println("读取的字节个数是"+len);
		System.out.println("读取的内容是"+Arrays.toString(by));
		
		//关闭资源
		bis.close();
	}

}
