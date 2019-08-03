package myCode.stream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

/*
 * OutputStream���ֽ������  �˳������Ǳ�ʾ����ֽ�����������ĳ���
 * 
 * 			���ࣺFileOutputStream
 * 
 * 					�ļ�����������ڽ�����д�� File 
 * 
 * 			���췽����public FileOutputStream(File file)
 * 						����һ����ָ�� File �����ʾ���ļ���д�����ݵ��ļ������
 * 					public FileOutputStream(File file,
                        boolean append):appendΪtrue������׷��
 * 
 * 			
 * public abstract void write(int b)����ָ����һ���ֽ�д�������� (����д����)
 * 						
 * public void write(byte[] b)��һ��дһ���ֽ����� 
 * 								д����  �Ƚ��ַ���תΪ�ֽ�����(getBytes())---->write(by);
 * public void write(byte[] b,
                  int off,
                  int len):д�ֽ������е�һ����
 * 
 * public void close():�رմ���������ͷ�������йص�����ϵͳ��Դ
 */
public class MyFileOutputStream {

    public static void main(String[] args) throws IOException {
        //����Ŀ���ļ���File����
        FileOutputStream out = new FileOutputStream("myCode/stream/a.txt");
        out.write(97);
        byte[] bytes = new byte[]{1, 2, 3, 4};
        out.write(new byte[]{-50, -46, 'c', '\''});
        out.write(new byte[]{10, -42, -48, -50, -60, -78, -69, -60, -36, -45, -61, -95, -82, -95, -81, -51, -7, 98, 121, 116, 101, -64, -17, -73, -59});
        out.write(new byte[]{-42, -48, -50, -60, -78, -69, -60, -36, -45, -61, -95, -82, -95, -81, -51, -7, 98, 121, 116, 101, -64, -17, -73, -59});
        out.write(new byte[]{-48, -50, -60, -78, -69, -60, -36, -45, -61, -95, -82, -95, -81, -51, -7, 98, 121, 116, 101, -64, -17, -73, -59});
        out.write(new byte[]{-50, -60, -78, -69, -60, -36, -45, -61, -95, -82, -95, -81, -51, -7, 98, 121, 116, 101, -64, -17, -73, -59});

        String str = "\n���Ĳ����á�����byte���";
        System.out.println(Arrays.toString(str.getBytes()));

        out.write(str.getBytes());

        out.close();


//��ϰchannel
//        FileOutputStream out = new FileOutputStream("a.txt", true);
//        out.write("12345".getBytes());
//        FileInputStream in = new FileInputStream("a.txt");
//        byte[] text = new byte[10];
//        int read = in.read(text);
//        System.out.println("new String(text) = " + new String(text));
//        FileChannel channel = in.getChannel();
//
//        ByteBuffer byteBuffer = ByteBuffer.allocate(4);
//        channel.read(byteBuffer);
//
//        System.out.println("channel.position() = " + channel.position());
//        System.out.println(new String(byteBuffer.array()));
//
//        byte[] bytes = new byte[32];
//        byteBuffer = ByteBuffer.wrap(bytes);
//        System.out.println(byteBuffer);
    }

}
