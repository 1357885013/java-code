package tools;

import java.util.Scanner;

public class calcScreen {
    public static void main(String[] args) {
        double width;
        double height;
        float size;
        double scaleW;
        double scaleH;
        float inc2cm = 2.54f;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入屏幕大小");
        size = scanner.nextFloat();

        System.out.println("请输入屏幕比例的长度");
        scaleW = scanner.nextFloat();
        scaleW = Math.pow(scaleW, 2);
        System.out.println("请输入屏幕比例的宽度");
        scaleH = scanner.nextFloat();
        scaleH = Math.pow(scaleH, 2);

        float temp = (size * inc2cm);
        temp = (float) Math.pow(temp, 2d);

        width = temp / (scaleH + scaleW) * scaleW;
        width = Math.sqrt(width);

        height = temp / (scaleH + scaleW) * scaleH;
        height = Math.sqrt(height);

        System.out.println("width:" + width);
        System.out.println("height:" + height);
    }
}
