package com.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/*
 * InputStream:��ʾ�ֽ���������������ĳ���
 * 
 * FileInputStream ���ļ�ϵͳ�е�ĳ���ļ��л�������ֽ�
 * 
 * 		FileInputStream(File file) 
 * 		FileInputStream(String name)
 * 
 * 
 *  ����
 *  	abstract  int read() �����������ж�ȡ���ݵ���һ���ֽ�   �����������ĩβ���򷵻� -1��
 *  
 *  	public int read(byte[] b):һ�ζ�ȡһ�����飺����ֵ����������ȡ���ֽڸ���  ����ﵽ�ļ�ĩβ����-1

 */
public class Demo2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//����������
		InputStream is = new FileInputStream("b");
		
		
		//����
		int b = is.read();
		
		System.out.println((char)b);
		
		
		//��������ֽڻ�����
		byte [] by = new byte[1024];
		int len = is.read(by);
		
		System.out.println("��ȡ����"+len);
		
		//�ֽ�----���ַ���   
		System.out.println("��ȡ��������"+new String(by,0,len));
		
		
		//�ر�������
		is.close();
		
	}

}
