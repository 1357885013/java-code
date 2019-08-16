package com.tcp;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/*
 * TCP：创建连接，大数据传输
 * 
 * 
 * Socket
 * 	public Socket(InetAddress address,
              int port)
       throws IOException创建一个流套接字并将其连接到指定 IP 地址的指定端口号
      OutputStream getOutputStream() 
          返回此套接字的输出流。 
       
    ServerSocket：服务器套接字等待请求通过网络传入
 */
public class Demo1 {

	public static void main(String[] args) throws Exception, IOException {
		// TODO Auto-generated method stub
		//创建Socket，指定连接的IP地址和端口号  创建连接，
		Socket s = new Socket(InetAddress.getLocalHost(),10000);
		
		//获取输出流对象
		OutputStream os = s.getOutputStream();
		
		
		FileInputStream fisFileInputStream = new FileInputStream(new File("E:/1.mp4"));
		
		byte [] b = new byte [1024];
		
		int len;
		
		while((len = fisFileInputStream.read(b)) != -1){
			os.write(b, 0, len);
		}
		
		//关闭端口
		s.close();
		
		
	}

}
