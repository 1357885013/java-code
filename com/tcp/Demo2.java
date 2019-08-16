package com.tcp;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
/*
 * public Socket accept()
              throws IOException侦听并接受到此套接字的连接
              
              
    InputStream getInputStream() 
          返回此套接字的输入流。 
 */
public class Demo2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//创建服务端口，绑定本机端口
		ServerSocket serverSocket = new ServerSocket(10000);
		
		//获取发送端的对象
		Socket socket = serverSocket.accept();
		
		//从Socket对象中获取数据
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
