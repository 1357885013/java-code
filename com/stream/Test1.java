package com.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/*
 * 读取文件的内容
 */
public class Test1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//创建流对象
		InputStream is = new FileInputStream("./src/com/digui/Demo1.java");
		
		//定义数组
		byte [] by = new byte [100];
		
		//存储真正读取的字节个数
		int len;
		
		while((len = is.read(by)) != -1){
			System.out.println(new String(by,0,len));
		}
	}

}
