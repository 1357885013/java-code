package myCode.stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 复制视频
 *
 * (普通流：一次一个字节,一次一个字节数组)
 *
 * 高效流：一次一个字节，一次一个字节数组
 *
 *
 * E:\课程\课程笔记\3 javaoop\day10\video\map.mp4
 *
 * E:\1.mp4
 */
public class CopyFile {

    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
        //创建流对象
        FileInputStream srcFile = new FileInputStream("E:\\课程\\课程笔记\\3 javaoop\\code\\IOTest\\src\\com\\digui\\Demo1.java");

        FileOutputStream destFile = new FileOutputStream("E:\\1.java");


        //复制  一次一个字节   一次一个字节数组
        byte[] by = new byte[10];

        int len;

        while ((len = srcFile.read(by)) != -1) {
            //写出
            destFile.write(by, 0, len);
        }

        //关闭资源
        srcFile.close();
        destFile.close();

    }

}
