package myCode;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regex {
    public static void main(String args[]) {
        String content = "I am noob " +
                "from runoob.com.";

        String pattern = ".*runoob.*";

        boolean isMatch = Pattern.matches(pattern, content);
        Pattern.compile(pattern).matcher(content).matches();//和上一句意思效果相同
        System.out.println("字符串中是否包含了 'runoob' 子字符串? " + isMatch);
        // 按指定模式在字符串查找
        String line = "This order was placed for QT3000! OK?";
        pattern = "((\\D*)(\\d+)(.*))";

        // 创建 Pattern 对象
        // 现在创建 matcher 对象
        Matcher m = Pattern.compile(pattern).matcher(line);

        if (m.find()) {
            System.out.println("Found value: " + m.group(0));
            System.out.println("Found value: " + m.group(1));
            System.out.println("Found value: " + m.group(2));
            System.out.println("Found value: " + m.group(3));
        } else {
            System.out.println("NO MATCH");
        }
    }
}
