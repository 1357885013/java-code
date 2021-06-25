package myCode;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Arrays;

/*
 * 路径
 * 		相对路径都是从项目根目录开始的。
 */
public class MyFile {
    ////////window 系统下文件夹和文件确实不能同名，以前文件总带着后缀名竟然么有发现。。。
    ////////这个file是不分文件和目录的，不论创建的时候是不是以/结尾。因为不需要区分，创建文件和创建目录方法分开了，不用识别，如果你不用创建，是本身已经存在的东西，那直接读取识别就知道是文件还是目录。
    public static void main(String[] args) throws IOException, URISyntaxException {
        //四种构造方式。
        File file = new File("a.txt");
        file = new File("a/b/c.txt");    //这里写路径或者文件名都可以。
        file = new File("a/b", "c.txt");    //左边路径，右边文件名。
        //file = new File(new URI("F:\\JAVA\\code\\myCode\\src\\a\\b\\c\\c.txt")); //要用绝对路径,用了绝对路径也抛异常？？？
        //创建父目录的file对象
        File fu = new File("a/b/c");
        System.out.println("fu.mkdirs() = " + fu.mkdirs());
        System.out.println("fu.createNewFile() = " + fu.createNewFile());   //创建文件时，有同名文件或目录存在会失败。。。 对，文件和目录有名字冲突。
        System.out.println("fu.isDirectory() = " + fu.isDirectory());//如果本地不存在叫c的东西返回false，如果有叫c的目录或文件那就根据实际来
        file = new File(fu, "c.txt");    //这种在剪切前使用，方便创建文件夹。

        //创建
        System.out.println("fu.mkdirs() = " + fu.mkdirs());//mkdir（）只创建一个文件夹，如果父文件夹不存在的话就会出错。
        System.out.println("file.createNewFile() = " + file.createNewFile());//路径存在才能创建

        System.out.println("fu.isDirectory()+fu.isFile()+fu.isAbsolute()+fu.exists() = " + fu.isDirectory() + fu.isFile() + fu.isAbsolute() + fu.exists());

        file.delete(); //删除表示的这一个文件或目录，一个路径只表示一个文件！！ 目录为空时才能删除目录。

        file.createNewFile();

        System.out.println("file.length() = " + file.length());    //返回文件内容长度，一个英文长为1，GBK编码下中文长2，UTF-8下中文长3.	//如果此路径名表示一个目录，则返回值是不确定的。

        //file.renameTo(new File("a/a.txt"));//剪切操作，不会自动创建目录，所以目录先创建好，配合用File的那个构造方法很得劲

        System.out.println("---------------------------用相对路径定义:" + file.toString());
        System.out.println("file.getName()" + file.getName());
        System.out.println("file.getPath() = " + file.getPath());
        System.out.println("file.getAbsolutePath() = " + file.getAbsolutePath());
        System.out.println("file.getParent() = " + file.getParent());
        System.out.println("file.getParentFile() = " + file.getParentFile());

        file = new File("F:\\JAVA\\code\\myCode\\src\\a\\b\\c\\c.txt");
        //file.createNewFile();
        System.out.println("---------------------------用绝对路径定义：" + file.toString());
        System.out.println("file.getName()" + file.getName());
        System.out.println("file.getPath() = " + file.getPath());
        System.out.println("file.getAbsolutePath() = " + file.getAbsolutePath());
        System.out.println("file.getParent() = " + file.getParent());
        System.out.println("file.getParentFile() = " + file.getParentFile());


        new File("a/a.db").createNewFile();
        new File("a/b.html").createNewFile();
        new File("a/a.png").createNewFile();
        new File("a/a.txt").createNewFile();

        file = new File("a/");    //这里a后面加不加/都会识别成目录。
        File[] files = file.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                String temp = pathname.getName();
                if (temp.contains(".")) {
                    String[] strs = temp.split("\\.");
                    temp = strs[strs.length - 1].toLowerCase();
                    switch (temp) {
                        case "txt":
                        case "html":
                        case "css":
                        case "js":
                            return true;
                        default:
                            return false;
                    }
                }
                return false;
            }
        });

        System.out.println("(files) = " + Arrays.toString(files));

        delDirectory(new File("a"));
    }

    public static boolean delDirectory(File dir) { //删除目录，强力删除。
        if (dir.isDirectory()) {

            File[] files = dir.listFiles();
            if (files.length == 0) {
                dir.delete();
                return true;
            } else {
                for (File file : files) {
                    if (file.isFile())
                        file.delete();
                    else
                        delDirectory(file);
                }
            }
            dir.delete();//忘写这个了。只删文件，不删目录了就。
        } else if (dir.isFile()) {
            dir.delete();
            return true;
        } else
            return false;
        return true;

    }

}
