package myCode;

import java.util.Arrays;

/*
 * String:String 类代表字符串 . Java 程序中的所有字符串字面值（如 "abc" ）都作为此类的实例
 *
 * 构造方法：
 * public String(String original)初始化一个新创建的 String 对象，使其表示一个与参数相同的字符序列

 * 特殊性：
 *   1. 创建方式特殊
 * 	 2. 字符串是常量；它们的值在创建之后不能更改。
 *   3. 因为 String 对象是不可变的，所以可以共享
 *   4. 字符串在作为参数传递的时候，不符合引用数据类型
 */
public class MyString {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String s = "Liu JiJiang`s english name is Dettan";//基本数据类型的表现形式
        s = s.trim();
        int l = s.indexOf('e');//区分大小写，参数可以以为char，string。第二个参数可以带起始搜索位置（包含）
        int r = s.indexOf('h', l + 6); //返回-1是没找到。
        System.out.println(s.charAt(l));//
        System.out.println("s.contains(\"liujijiang\") = " + s.contains("liu"));
        System.out.println("s.contains(\"liujijiang\") = " + s.contains("Liu"));
        System.out.println("s.endsWith(\"an\") = " + s.endsWith("an"));

        System.out.println(s.substring(l, l + 7));//english  //包含左边不包含右边，正好左边+长度=右边
        System.out.println(s.substring(l, l + 7));//english
        System.out.println(s.substring(l, r + 1));//english

        System.out.println();
        String[] ss = s.split("\\W");//根据正则来分割，这里相当于用空格和`来分割。
        System.out.println(Arrays.toString(ss));

        System.out.println("s = " + s);
        System.out.println("\"word\".matches(\"word\") = " + "word".matches(".*"));//注意了，是匹配不是包含
        System.out.println("\"word\".matches(\"word\") = " + "word".matches("\\w*"));


        s = s.replaceAll("\\W", "|");//看清参数，有的不是用正则匹配
        System.out.println(s);
        System.out.println("s.replace('L','l') = " + s.replace('L', 'l'));
        System.out.println("s.replace(\"Dettan\",\"bala\") = " + s.replace("Dettan", "bala"));
        System.out.println("s.trim() = " + s.trim());


        char[] chars = s.toCharArray();//转成字符数组后可以用来自己处理逻辑
        System.out.println("Arrays.toString(chars) = " + Arrays.toString(chars));

        byte[] bytes = s.getBytes();
        System.out.println("Arrays.toString(bytes) = " + Arrays.toString(bytes));

        int myInt = 123456;
        System.out.println(String.valueOf(myInt));

        "abc".compareTo("bcd");//按字典顺序比较，区分大小写

        String sss = "helloworld";
        String s2 = "hello";
        String s3 = "world";
        System.out.println(sss == "hello" + "world");
        System.out.println(sss == s2 + s3);

        System.out.println("String.valueOf(123) = " + String.valueOf(123));

        test(s2);  //字符串在作为参数传递的时候，不符合引用数据类型
        System.out.println("s = " + s2);
    }


    public static void test(String a) {
        a = a + "abc";//修改的是a的引用
        System.out.println(a);//111abc
    }

}
