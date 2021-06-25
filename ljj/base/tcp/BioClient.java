package myCode.tcp;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class BioClient {
    public static void main(String[] args) throws Exception, IOException {
        //����Socket��ָ�����ӵ�IP��ַ�Ͷ˿ں�  �������ӣ�
        Socket s = new Socket(InetAddress.getLocalHost(), 20000);

        //��ȡ���������
        OutputStream os = s.getOutputStream();

        FileInputStream fisFileInputStream = new FileInputStream(new File("F:\\OLD\\1.asf"));

        byte[] b = new byte[1024];

        int len;

        while ((len = fisFileInputStream.read(b)) != -1) {
            os.write(b, 0, len);
        }
        //�رն˿�
        s.close();
    }
}
