package com.stream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/*
 * BufferedInputStream:��Ч�ֽ�������
 * 	�ڴ��� BufferedInputStream ʱ���ᴴ��һ���ڲ�����������
 * 	�����ڲ�����������ȡ�˶��������ȡ��ʱ����Ǵ��ڲ���������ȡ
 * 
 */
public class Demo5 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//������ͨ�ֽ�������
		InputStream is = new FileInputStream("d.txt");
		
		//������Ч��
		BufferedInputStream bis = new BufferedInputStream(is);
		
		//����
		int b = bis.read();
		System.out.println(b);
		
		byte [] by = new byte [10];
		int len;
		
		len = bis.read(by);
		
		System.out.println("��ȡ���ֽڸ�����"+len);
		System.out.println("��ȡ��������"+Arrays.toString(by));
		
		//�ر���Դ
		bis.close();
	}

}
