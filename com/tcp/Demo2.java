package com.tcp;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
/*
 * public Socket accept()
              throws IOException���������ܵ����׽��ֵ�����
              
              
    InputStream getInputStream() 
          ���ش��׽��ֵ��������� 
 */
public class Demo2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//��������˿ڣ��󶨱����˿�
		ServerSocket serverSocket = new ServerSocket(10000);
		
		//��ȡ���Ͷ˵Ķ���
		Socket socket = serverSocket.accept();
		
		//��Socket�����л�ȡ����
		InputStream is = socket.getInputStream();
		
		byte [] b = new byte[1024];
		
		
		FileOutputStream dOutputStream = new FileOutputStream(new File("D:/1.mp4"));
		
		int len;
		
		while((len = is.read(b)) != -1){
			dOutputStream.write(b, 0, len);
		}
		
		socket.close();
		serverSocket.close();
		
	}

}
