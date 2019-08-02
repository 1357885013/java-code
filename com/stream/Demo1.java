package com.stream;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/*
 * IO��
 * 		��ͬ�豸֮������ݴ���
 * 
 * IO���
 * 		java�ṩһϵ�е���������������
 * 
 * ��������
 * 		������
 * 		�����
 * ���ݷ�
 * 		�ַ���
 * 		�ֽ���
 * 
 * �ַ���
 * 		Reader���ַ�������
 * 				FileReader:�ļ��ַ�������
 * 				BufferedReader����Ч�ַ�������
 * 		Writer���ַ������
 * 				FileWriter���ļ��ַ������
 * 				BufferedWriter����Ч�ַ������
 * 
 * 
 * �ֽ���
 * 		InputStream���ֽ�������
 * 			  FileInputStream���ļ��ֽ�������
 * 			  BufferedInputStream����Ч�ֽ�������
 *		OutputStream���ֽ������
 *			FileOutputStream���ļ��ֽ������
 *			BufferedOutputStream����Ч�ֽ������
 * 
 * 
 * 
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
public class Demo1 {

    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
        //����Ŀ���ļ���File����
        File file = new File("b");

        //�������������
        OutputStream os = new FileOutputStream("b", true);

        //����
        String str = "\n";

        os.write(str.getBytes());

        //д��һ���ֽ�
        os.write(97);

        os.write('b');



        //�����ֽ�����
        byte[] by = {99, 100, 101, 102};
        os.write(by, 1, 2);


        //�ַ���-----�ֽ�����
        String string = "�Ұ����й�";
        byte[] bys = string.getBytes();

        for (int i = 0; i < bys.length; i++) {
            System.out.println(bys[i]);
        }


        os.write(bys);
        //�ر���Դ
        //os.close();

        FileOutputStream out = new FileOutputStream("a.txt", true);
        out.write("12345".getBytes());
        FileInputStream in = new FileInputStream("a.txt");
        byte[] text = new byte[10];
        int read = in.read(text);
        System.out.println("new String(text) = " + new String(text));
        FileChannel channel = in.getChannel();

        ByteBuffer byteBuffer = ByteBuffer.allocate(4);
        channel.read(byteBuffer);

        System.out.println("channel.position() = " + channel.position());
        System.out.println(new String(byteBuffer.array()));

        byte[] bytes = new byte[32];
        byteBuffer = ByteBuffer.wrap(bytes);
        System.out.println(byteBuffer);
    }

}
