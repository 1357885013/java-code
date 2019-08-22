package myCode.tcp;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class BioServer {

    public static void main(String[] args) throws Exception {
        //��������˿ڣ��󶨱����˿�
        ServerSocket serverSocket = new ServerSocket(20000);

        //��ȡ���Ͷ˵Ķ���
        Socket socket = serverSocket.accept(); //�����������ӽ��룬���߳�ֻ�ܴ���һ������

        //��Socket�����л�ȡ����
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
