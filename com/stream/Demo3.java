package com.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

/*
 * public int read(byte[] b,
                int off,
                int len)
         throws IOException������������� len �������ֽڶ��� byte ���顣
 */
public class Demo3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("b");
		
		byte [] by = new byte [10];
		
		int len = fis.read(by, 3, 5);
		
		System.out.println("������ȡ�ĸ�����"+len);
		
		System.out.println("��ȡ������"+Arrays.toString(by));
		
		
		fis.close();
	}

}
