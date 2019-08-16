package com.tcp;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/*
 * TCP���������ӣ������ݴ���
 * 
 * 
 * Socket
 * 	public Socket(InetAddress address,
              int port)
       throws IOException����һ�����׽��ֲ��������ӵ�ָ�� IP ��ַ��ָ���˿ں�
      OutputStream getOutputStream() 
          ���ش��׽��ֵ�������� 
       
    ServerSocket���������׽��ֵȴ�����ͨ�����紫��
 */
public class Demo1 {

	public static void main(String[] args) throws Exception, IOException {
		// TODO Auto-generated method stub
		//����Socket��ָ�����ӵ�IP��ַ�Ͷ˿ں�  �������ӣ�
		Socket s = new Socket(InetAddress.getLocalHost(),10000);
		
		//��ȡ���������
		OutputStream os = s.getOutputStream();
		
		
		FileInputStream fisFileInputStream = new FileInputStream(new File("E:/1.mp4"));
		
		byte [] b = new byte [1024];
		
		int len;
		
		while((len = fisFileInputStream.read(b)) != -1){
			os.write(b, 0, len);
		}
		
		//�رն˿�
		s.close();
		
		
	}

}
