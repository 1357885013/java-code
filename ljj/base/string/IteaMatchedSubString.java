package ljj.system.string;

/*
 * 给定一个字符串找到子串在字符串中出现的
 * 次数。String s = "abc123456abcxxxabc"中的"abc"
 *
 */
public class IteaMatchedSubString {

    public static void main(String[] args) {
        String s = "abc123456abcxxxabc";
        //定义计数变量
        int count = 0;

        int index = 0;

        String findString = "abc";
        while ((index = s.indexOf(findString, index)) != -1) {
            count++;
            System.out.println("index = " + index);
            index += findString.length();
        }

        System.out.println("count = " + count);
    }

}
