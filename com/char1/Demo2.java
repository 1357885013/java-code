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
 * 	������ȡ�ַ��ļ��ı����
 * 
 * int read() 
          	��ȡ�����ַ��� 
 	int read(char[] cbuf) 
          	���ַ��������顣 
	abstract  int read(char[] cbuf, int off, int len) 
          ���ַ����������ĳһ���֡� 
 */
public class Demo2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//�����ļ��ַ�������
		Reader r = new FileReader("e.txt");
		
		//����
		char a = (char)r.read();
		
		System.out.println(a);
		
		
		char [] cr = new char[10];
		
		int len;
		
		len = r.read(cr);
		
		System.out.println("��ȡ�����ַ�����"+len);
		System.out.println("��ȡ����������"+Arrays.toString(cr));
		
		//�ر���Դ
		r.close();
	}

}
