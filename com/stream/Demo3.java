package com.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

/*
 * public int read(byte[] b,
                int off,
                int len)
         throws IOException将输入流中最多 len 个数据字节读入 byte 数组。
 */
public class Demo3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("b");
		
		byte [] by = new byte [10];
		
		int len = fis.read(by, 3, 5);
		
		System.out.println("真正读取的个数是"+len);
		
		System.out.println("读取内容是"+Arrays.toString(by));
		
		
		fis.close();
	}

}
