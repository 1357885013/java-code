package com.char1;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/*
 * �ַ���
 * 	Writer��д���ַ����ĳ�����
 * 	ά����һ��������  ��ִ��flush��д��ʧ��
 * FileWriter���ļ��ַ������  ����д���ַ��ļ��ı����
 * 
 * 	
 *  void write(char[] cbuf) 
          		д���ַ����顣 
	abstract  void write(char[] cbuf, int off, int len) 
          		д���ַ������ĳһ���֡� 
          		
 	void write(int c) 
          		д�뵥���ַ��� 
          		
          		
          		
 	void write(String str) 
          		д���ַ����� 
 	void write(String str, int off, int len) 
          		д���ַ�����ĳһ���֡� 
 */
public class Demo1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//�����ļ��ַ������
		Writer os = new FileWriter("e.txt");
		
		
		//д��
		os.write('a');
		os.write('��');
		
		os.write("���𣿲���");
		
		
		
		//�ر���Դ
		
		os.close();
		
		
	}

}
