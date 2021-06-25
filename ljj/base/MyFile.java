package myCode;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Arrays;

/*
 * ·��
 * 		���·�����Ǵ���Ŀ��Ŀ¼��ʼ�ġ�
 */
public class MyFile {
    ////////window ϵͳ���ļ��к��ļ�ȷʵ����ͬ������ǰ�ļ��ܴ��ź�׺����Ȼô�з��֡�����
    ////////���file�ǲ����ļ���Ŀ¼�ģ����۴�����ʱ���ǲ�����/��β����Ϊ����Ҫ���֣������ļ��ʹ���Ŀ¼�����ֿ��ˣ�����ʶ������㲻�ô������Ǳ����Ѿ����ڵĶ�������ֱ�Ӷ�ȡʶ���֪�����ļ�����Ŀ¼��
    public static void main(String[] args) throws IOException, URISyntaxException {
        //���ֹ��췽ʽ��
        File file = new File("a.txt");
        file = new File("a/b/c.txt");    //����д·�������ļ��������ԡ�
        file = new File("a/b", "c.txt");    //���·�����ұ��ļ�����
        //file = new File(new URI("F:\\JAVA\\code\\myCode\\src\\a\\b\\c\\c.txt")); //Ҫ�þ���·��,���˾���·��Ҳ���쳣������
        //������Ŀ¼��file����
        File fu = new File("a/b/c");
        System.out.println("fu.mkdirs() = " + fu.mkdirs());
        System.out.println("fu.createNewFile() = " + fu.createNewFile());   //�����ļ�ʱ����ͬ���ļ���Ŀ¼���ڻ�ʧ�ܡ����� �ԣ��ļ���Ŀ¼�����ֳ�ͻ��
        System.out.println("fu.isDirectory() = " + fu.isDirectory());//������ز����ڽ�c�Ķ�������false������н�c��Ŀ¼���ļ��Ǿ͸���ʵ����
        file = new File(fu, "c.txt");    //�����ڼ���ǰʹ�ã����㴴���ļ��С�

        //����
        System.out.println("fu.mkdirs() = " + fu.mkdirs());//mkdir����ֻ����һ���ļ��У�������ļ��в����ڵĻ��ͻ����
        System.out.println("file.createNewFile() = " + file.createNewFile());//·�����ڲ��ܴ���

        System.out.println("fu.isDirectory()+fu.isFile()+fu.isAbsolute()+fu.exists() = " + fu.isDirectory() + fu.isFile() + fu.isAbsolute() + fu.exists());

        file.delete(); //ɾ����ʾ����һ���ļ���Ŀ¼��һ��·��ֻ��ʾһ���ļ����� Ŀ¼Ϊ��ʱ����ɾ��Ŀ¼��

        file.createNewFile();

        System.out.println("file.length() = " + file.length());    //�����ļ����ݳ��ȣ�һ��Ӣ�ĳ�Ϊ1��GBK���������ĳ�2��UTF-8�����ĳ�3.	//�����·������ʾһ��Ŀ¼���򷵻�ֵ�ǲ�ȷ���ġ�

        //file.renameTo(new File("a/a.txt"));//���в����������Զ�����Ŀ¼������Ŀ¼�ȴ����ã������File���Ǹ����췽���ܵþ�

        System.out.println("---------------------------�����·������:" + file.toString());
        System.out.println("file.getName()" + file.getName());
        System.out.println("file.getPath() = " + file.getPath());
        System.out.println("file.getAbsolutePath() = " + file.getAbsolutePath());
        System.out.println("file.getParent() = " + file.getParent());
        System.out.println("file.getParentFile() = " + file.getParentFile());

        file = new File("F:\\JAVA\\code\\myCode\\src\\a\\b\\c\\c.txt");
        //file.createNewFile();
        System.out.println("---------------------------�þ���·�����壺" + file.toString());
        System.out.println("file.getName()" + file.getName());
        System.out.println("file.getPath() = " + file.getPath());
        System.out.println("file.getAbsolutePath() = " + file.getAbsolutePath());
        System.out.println("file.getParent() = " + file.getParent());
        System.out.println("file.getParentFile() = " + file.getParentFile());


        new File("a/a.db").createNewFile();
        new File("a/b.html").createNewFile();
        new File("a/a.png").createNewFile();
        new File("a/a.txt").createNewFile();

        file = new File("a/");    //����a����Ӳ���/����ʶ���Ŀ¼��
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

    public static boolean delDirectory(File dir) { //ɾ��Ŀ¼��ǿ��ɾ����
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
            dir.delete();//��д����ˡ�ֻɾ�ļ�����ɾĿ¼�˾͡�
        } else if (dir.isFile()) {
            dir.delete();
            return true;
        } else
            return false;
        return true;

    }

}
