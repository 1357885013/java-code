package ljj.system.string;

/*
 * ����һ���ַ����ҵ��Ӵ����ַ����г��ֵ�
 * ������String s = "abc123456abcxxxabc"�е�"abc"
 *
 */
public class IteaMatchedSubString {

    public static void main(String[] args) {
        String s = "abc123456abcxxxabc";
        //�����������
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
