package myCode.stream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/*
 * InputStream:表示字节输入流的所有类的超类
 *
 * FileInputStream 从文件系统中的某个文件中获得输入字节
 *
 * 		FileInputStream(File file)
 * 		FileInputStream(String name)
 *
 *
 *  方法
 *  	abstract  int read() ：从输入流中读取数据的下一个字节   如果到达流的末尾，则返回 -1。
 *
 *  	public int read(byte[] b):一次读取一个数组：返回值代表真正读取的字节个数  如果达到文件末尾返回-1

 */
public class MyFileInputStream {

    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
        //创建流对象
        int length = 0;
        //FileInputStream input = new FileInputStream("myCode/stream/MyFileOutputStream.java");
        BufferedInputStream input = new BufferedInputStream(new FileInputStream("./com/stream/MyFileOutputStream.java"));
        byte[] bytes = new byte[10];

        input.read(bytes, 3, 5);//off 是指往byte存时的偏移，
        System.out.print(new String(bytes, 3, 5));
        input.read(bytes, 2, 8); //读取之前数组不清空。。。
        System.out.print(new String(bytes, 2, 8));
        input.read(bytes, 5, 5); //每次读取都记住了读取位置。
        System.out.print(new String(bytes, 5, 5));

        do {
            length = input.read(bytes);
            System.out.print(new String(bytes, 0, length, "GBK"));
            //System.out.println("length = " + length);
        } while (length > 0);  //每次读取一byte数组，所以数组定义的小的话就会有好多中文变成乱码。
        //最后一次读取时，可能会填不满数组，这时候就要用read（）的返回值控制了。

        input.close();
    }

}
