package com.stream;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/*
 * BufferedOutputStream:����ʵ�ֻ�����������
 * 
 * 		public BufferedOutputStream(OutputStream out)
 * 
 * д���ɹ�������ִ��flush()����
 * ����close(��Ҳ����ˢ�³ɹ�����Ϊclose����������flush
		*/
public class Demo4 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//������ͨ������
		OutputStream os = new FileOutputStream("d.txt");
		
		//������Ч��
		BufferedOutputStream bos = new BufferedOutputStream(os);
		
		//д��  ������
		bos.write('a');
		byte [] b = {100,101,102,103};
		bos.write(b);
		
		bos.write(b, 1, 2);
		
		bos.flush();
		//�ر���Դ
		//bos.close();
		
	}

}
