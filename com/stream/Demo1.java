package com.stream;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/*
 * IO流
 * 		不同设备之间的数据传输
 * 
 * IO框架
 * 		java提供一系列的类用于输入和输出
 * 
 * 按流方向
 * 		输入流
 * 		输出流
 * 数据分
 * 		字符流
 * 		字节流
 * 
 * 字符流
 * 		Reader：字符输入流
 * 				FileReader:文件字符输入流
 * 				BufferedReader：高效字符输入流
 * 		Writer：字符输出流
 * 				FileWriter：文件字符输出流
 * 				BufferedWriter：高效字符输出流
 * 
 * 
 * 字节流
 * 		InputStream：字节输入流
 * 			  FileInputStream：文件字节输入流
 * 			  BufferedInputStream：高效字节输入流
 *		OutputStream：字节输出流
 *			FileOutputStream：文件字节输出流
 *			BufferedOutputStream：高效字节输出流
 * 
 * 
 * 
 * OutputStream：字节输出流  此抽象类是表示输出字节流的所有类的超类
 * 
 * 			子类：FileOutputStream
 * 
 * 					文件输出流是用于将数据写出 File 
 * 
 * 			构造方法：public FileOutputStream(File file)
 * 						创建一个向指定 File 对象表示的文件中写入数据的文件输出流
 * 					public FileOutputStream(File file,
                        boolean append):append为true，代表追加
 * 
 * 			
 * public abstract void write(int b)：将指定的一个字节写入此输出流 (不能写汉字)
 * 						
 * public void write(byte[] b)：一次写一个字节数组 
 * 								写汉字  先将字符串转为字节数组(getBytes())---->write(by);
 * public void write(byte[] b,
                  int off,
                  int len):写字节数组中的一部分
					
 * 
 * public void close():关闭此输出流并释放与此流有关的所有系统资源
 */
public class Demo1 {

    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
        //创建目标文件的File对象
        File file = new File("b");

        //创建输出流对象
        OutputStream os = new FileOutputStream("b", true);

        //换行
        String str = "\n";

        os.write(str.getBytes());

        //写出一个字节
        os.write(97);

        os.write('b');



        //定义字节数组
        byte[] by = {99, 100, 101, 102};
        os.write(by, 1, 2);


        //字符串-----字节数组
        String string = "我爱你中国";
        byte[] bys = string.getBytes();

        for (int i = 0; i < bys.length; i++) {
            System.out.println(bys[i]);
        }


        os.write(bys);
        //关闭资源
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
