package myCode.tcp;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class BioServer {

    public static void main(String[] args) throws Exception {
        //创建服务端口，绑定本机端口
        ServerSocket serverSocket = new ServerSocket(20000);

        //获取发送端的对象
        Socket socket = serverSocket.accept(); //阻塞到有连接接入，单线程只能处理一个连接

        //从Socket对象中获取数据
        InputStream is = socket.getInputStream();

        byte[] b = new byte[1024];

        FileOutputStream dOutputStream = new FileOutputStream(new File("F:\\OLD\\2.asf"));

        int len;

        while ((len = is.read(b)) != -1) {
            dOutputStream.write(b, 0, len);
        }

        socket.close();
        serverSocket.close();
    }
}
