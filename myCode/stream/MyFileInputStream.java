package myCode.stream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/*
 * InputStream:��ʾ�ֽ���������������ĳ���
 *
 * FileInputStream ���ļ�ϵͳ�е�ĳ���ļ��л�������ֽ�
 *
 * 		FileInputStream(File file)
 * 		FileInputStream(String name)
 *
 *
 *  ����
 *  	abstract  int read() �����������ж�ȡ���ݵ���һ���ֽ�   �����������ĩβ���򷵻� -1��
 *
 *  	public int read(byte[] b):һ�ζ�ȡһ�����飺����ֵ����������ȡ���ֽڸ���  ����ﵽ�ļ�ĩβ����-1

 */
public class MyFileInputStream {

    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
        //����������
        int length = 0;
        //FileInputStream input = new FileInputStream("myCode/stream/MyFileOutputStream.java");
        BufferedInputStream input = new BufferedInputStream(new FileInputStream("./com/stream/MyFileOutputStream.java"));
        byte[] bytes = new byte[10];

        input.read(bytes, 3, 5);//off ��ָ��byte��ʱ��ƫ�ƣ�
        System.out.print(new String(bytes, 3, 5));
        input.read(bytes, 2, 8); //��ȡ֮ǰ���鲻��ա�����
        System.out.print(new String(bytes, 2, 8));
        input.read(bytes, 5, 5); //ÿ�ζ�ȡ����ס�˶�ȡλ�á�
        System.out.print(new String(bytes, 5, 5));

        do {
            length = input.read(bytes);
            System.out.print(new String(bytes, 0, length, "GBK"));
            //System.out.println("length = " + length);
        } while (length > 0);  //ÿ�ζ�ȡһbyte���飬�������鶨���С�Ļ��ͻ��кö����ı�����롣
        //���һ�ζ�ȡʱ�����ܻ�������飬��ʱ���Ҫ��read�����ķ���ֵ�����ˡ�

        input.close();
    }

}
