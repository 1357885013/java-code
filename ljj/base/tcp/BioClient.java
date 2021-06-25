package myCode.tcp;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class BioClient {
    public static void main(String[] args) throws Exception, IOException {
        //创建Socket，指定连接的IP地址和端口号  创建连接，
        Socket s = new Socket(InetAddress.getLocalHost(), 20000);

        //获取输出流对象
        OutputStream os = s.getOutputStream();

        FileInputStream fisFileInputStream = new FileInputStream(new File("F:\\OLD\\1.asf"));

        byte[] b = new byte[1024];

        int len;

        while ((len = fisFileInputStream.read(b)) != -1) {
            os.write(b, 0, len);
        }
        //关闭端口
        s.close();
    }
}
