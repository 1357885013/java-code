package myCode.stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * ������Ƶ
 *
 * (��ͨ����һ��һ���ֽ�,һ��һ���ֽ�����)
 *
 * ��Ч����һ��һ���ֽڣ�һ��һ���ֽ�����
 *
 *
 * E:\�γ�\�γ̱ʼ�\3 javaoop\day10\video\map.mp4
 *
 * E:\1.mp4
 */
public class CopyFile {

    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
        //����������
        FileInputStream srcFile = new FileInputStream("E:\\�γ�\\�γ̱ʼ�\\3 javaoop\\code\\IOTest\\src\\com\\digui\\Demo1.java");

        FileOutputStream destFile = new FileOutputStream("E:\\1.java");


        //����  һ��һ���ֽ�   һ��һ���ֽ�����
        byte[] by = new byte[10];

        int len;

        while ((len = srcFile.read(by)) != -1) {
            //д��
            destFile.write(by, 0, len);
        }

        //�ر���Դ
        srcFile.close();
        destFile.close();

    }

}
