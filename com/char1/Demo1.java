package com.char1;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/*
 * 字符流
 * 	Writer：写出字符流的抽象类
 * 	维护了一个缓冲区  不执行flush，写出失败
 * FileWriter：文件字符输出流  用来写出字符文件的便捷类
 * 
 * 	
 *  void write(char[] cbuf) 
          		写入字符数组。 
	abstract  void write(char[] cbuf, int off, int len) 
          		写入字符数组的某一部分。 
          		
 	void write(int c) 
          		写入单个字符。 
          		
          		
          		
 	void write(String str) 
          		写入字符串。 
 	void write(String str, int off, int len) 
          		写入字符串的某一部分。 
 */
public class Demo1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//创建文件字符输出流
		Writer os = new FileWriter("e.txt");
		
		
		//写出
		os.write('a');
		os.write('你');
		
		os.write("好吗？不好");
		
		
		
		//关闭资源
		
		os.close();
		
		
	}

}
