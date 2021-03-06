package myCode;

import org.junit.jupiter.api.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regex {
    public static void main(String args[]) {
        // 1. �Ƿ�ƥ��
        String content = "I am noob " +
                "from runoob.com.";
        String pattern = ".*runoob.*";

        boolean isMatch = Pattern.matches(pattern, content);
        boolean matches = Pattern.compile(pattern).matcher(content).matches();//����һ����˼Ч����ͬ
        System.out.println("�ַ������Ƿ������ 'runoob' ���ַ���? " + isMatch);



        // 1. ��������ƥ����.  ��ָ��ģʽ���ַ�������
        String line = "This order was placed for QT3000! OK?";
        pattern = "((\\D*)(\\d+)(.*))";

        Matcher m = Pattern.compile(pattern).matcher(line);


        if (m.find()) {
            System.out.println("Found value 0: " + m.group(0));
            System.out.println("Found value 1: " + m.group(1));
            System.out.println("Found value 2: " + m.group(2));
            System.out.println("Found value 3: " + m.group(3));
            System.out.println("Found value 4: " + m.group(4));
            System.out.println("Found value 5: " + m.group(5));
        } else {
            System.out.println("NO MATCH");
        }
    }

    @Test
    public void test(){
        String phone = "17639316842";
        boolean matches = phone.matches("^1[3456789]\\d{9}$");
        System.out.println(matches);
    }
}
