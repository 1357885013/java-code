package myCode;

import java.util.Arrays;

public class Char {
    public static void main(String[] args) {
        char c = 57;
        System.out.println("c = " + c); //c = {
        byte b1 = 10;
        byte b2 = 20;
        int b3 = b1 + b2;//错误: 不兼容的类型: 从int转换到byte可能会有损失
        System.out.println(b3);
        c = '9';
        System.out.println("c = " + (int) c); //c = {
        c = ' ';
        c = '\n';
        c = '\f';
        c = '\t';
        c = '\u0000';

        System.out.println("Character.getNumericValue('a') = " + Character.getNumericValue('a'));

        int number = 9;
        char cNumber = (char) (number + '0');
        System.out.println("Number " + number + " to char is:" + cNumber);

        int number1 = 9;
        char cNumber1 = String.valueOf(number1).charAt(0);
        System.out.println("Number " + number1 + " to char is:" + cNumber1);

        //char类型转int类型
        char cNumber2 = '3';
        int number2 = cNumber2 - '0';
        System.out.println("Char " + cNumber2 + " to number is:" + number2);

        String split = "123哈喽";
        char[] splits = split.toCharArray();
        System.out.println(Arrays.toString(splits));
    }

}

