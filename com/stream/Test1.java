package com.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/*
 * ��ȡ�ļ�������
 */
public class Test1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//����������
		InputStream is = new FileInputStream("./src/com/digui/Demo1.java");
		
		//��������
		byte [] by = new byte [100];
		
		//�洢������ȡ���ֽڸ���
		int len;
		
		while((len = is.read(by)) != -1){
			System.out.println(new String(by,0,len));
		}
	}

}
