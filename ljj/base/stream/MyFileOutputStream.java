package myCode.stream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

/*
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
public class MyFileOutputStream {

    public static void main(String[] args) throws IOException {
        //创建目标文件的File对象
        FileOutputStream out = new FileOutputStream("myCode/stream/a.txt");
        out.write(97);
        byte[] bytes = new byte[]{1, 2, 3, 4};
        out.write(new byte[]{-50, -46, 'c', '\''});
        out.write(new byte[]{10, -42, -48, -50, -60, -78, -69, -60, -36, -45, -61, -95, -82, -95, -81, -51, -7, 98, 121, 116, 101, -64, -17, -73, -59});
        out.write(new byte[]{-42, -48, -50, -60, -78, -69, -60, -36, -45, -61, -95, -82, -95, -81, -51, -7, 98, 121, 116, 101, -64, -17, -73, -59});
        out.write(new byte[]{-48, -50, -60, -78, -69, -60, -36, -45, -61, -95, -82, -95, -81, -51, -7, 98, 121, 116, 101, -64, -17, -73, -59});
        out.write(new byte[]{-50, -60, -78, -69, -60, -36, -45, -61, -95, -82, -95, -81, -51, -7, 98, 121, 116, 101, -64, -17, -73, -59});

        String str = "\n中文不能用‘’往byte里放";
        System.out.println(Arrays.toString(str.getBytes()));

        out.write(str.getBytes());

        out.close();


//练习channel
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
