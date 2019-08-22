package myCode;

/*
 * StringBuffer:线程安全的可变字符序列,一个类似于 String 的字符串缓冲区
 * 
 * 
 * 构造方法
 * 	StringBuffer() 
          构造一个其中不带字符的字符串缓冲区，其初始容量为 16 个字符  自动扩容
          
    StringBuffer(String str) :String---StringBuffer
          构造一个字符串缓冲区，并将其内容初始化为指定的字符串内容。
 * 
 */
public class MyStringBuffer {

    public static void main(String[] args) {
        System.out.println("new StringBuffer().append('a').append(1.3).append(100).append(10000) = " + new StringBuffer().append('a').append(1.3).append(100).append(10000));

        System.out.println("new StringBuffer(\"abcdefg\").insert(7,'h') = " + new StringBuffer("abcdefg").insert(7, 'h'));

        System.out.println("new StringBuffer(\"abcdefg\").delete(1,3) = " + new StringBuffer("abcdefg").delete(1, 3));
        System.out.println("new StringBuffer(\"abcdefg\").append(true).deleteCharAt(2) = " + new StringBuffer("abcdefg").append(true).deleteCharAt(2));

        System.out.println("new StringBuffer(\"abcdefg\").replace(1, 6, \"hate\") = " + new StringBuffer("abcdefg").replace(1, 2, "xxxx"));
        System.out.println("new StringBuffer(\"abcdefg\").replace(1, 6, \"hate\") = " + new StringBuffer("abcdefg").replace(1, 6, "xxxx"));

        System.out.println("new StringBuffer(\"abcdefg\").reverse() = " + new StringBuffer("abcdefg").reverse());

        System.out.println("new StringBuffer(\"abcdefg\").substring(2, 5) = " + new StringBuffer("abcdefg").substring(2, 5));
        System.out.println("new StringBuffer(\"abcdef\").charAt(2) = " + new StringBuffer("abcdef").charAt(2));
        System.out.println("new StringBuffer(\"abcdef\").codePointAt(2) = " + new StringBuffer("abcdef").codePointAt(2));
    }

}
