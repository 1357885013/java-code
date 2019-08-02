package com.stream;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/*
 * BufferedOutputStream:该类实现缓冲的输出流。
 * 
 * 		public BufferedOutputStream(OutputStream out)
 * 
 * 写出成功，必须执行flush()方法
 * 调用close(）也可以刷新成功，因为close方法调用了flush
		*/
public class Demo4 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//创建普通流对象
		OutputStream os = new FileOutputStream("d.txt");
		
		//创建高效流
		BufferedOutputStream bos = new BufferedOutputStream(os);
		
		//写出  缓冲区
		bos.write('a');
		byte [] b = {100,101,102,103};
		bos.write(b);
		
		bos.write(b, 1, 2);
		
		bos.flush();
		//关闭资源
		//bos.close();
		
	}

}
