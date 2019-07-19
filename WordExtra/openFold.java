package WordExtra;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Method;

public class openFold {

    public static void main(String[] args) throws IOException {


        listDirectory(selectFold());
    }

    public static File selectFold() {
        File dir = null;
        JFileChooser jf = new JFileChooser();
        //jf.setSelectedFile(new File("c:\\我的报表.xls"));
        jf.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int value = jf.showSaveDialog(null);
        jf.setFileHidingEnabled(false);
        if (value == JFileChooser.APPROVE_OPTION) {
            dir = jf.getSelectedFile();
        }
        return dir;
    }

    public static void listDirectory(File dir) throws IOException {


        if (!dir.exists())
            throw new IllegalArgumentException("目录：" + dir + "不存在.");
        if (!dir.isDirectory()) {
            throw new IllegalArgumentException(dir + "不是目录。");
        }
        /*String[] filenames=dir.list();//返回的是字符串数组 直接子的名称 不包含子目录
        for(String string:filenames){
            System.out.println(dir+"\\"+string);
        }*/
        //如果要遍历子目录下的内容就需要构造File对象做递归操作，File提供了直接返回File对象的API
        File[] files = dir.listFiles();
        //for(File file:files){
        //System.out.println(file);
        if (files != null && files.length > 0) {
            for (File file : files) {
                if (file.isDirectory())
                    //递归
                    listDirectory(file);
                else
                {
                    wordExtra.extra(readFile(file));
                    System.out.println(file);
                }
            }
        }
    }
    public static String readFile(File file)
    {
        String s = "";
        try {
            BufferedReader bufr = new BufferedReader(new FileReader(file));
            String line = null;
            while ((line = bufr.readLine()) != null) {
                s+=(line+" ");
            }
            bufr.close();
        } catch (IOException e2) {
            throw new RuntimeException("打开异常");
        }
        return s;
    }
}
