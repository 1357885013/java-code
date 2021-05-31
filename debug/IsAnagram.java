package debug;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
//���������ַ��� s �� t ����дһ���������ж� t �Ƿ��� s ����ĸ��λ�ʡ�
//
// ʾ�� 1:
//
// ����: s = "anagram", t = "nagaram"
//���: true
//
//
// ʾ�� 2:
//
// ����: s = "rat", t = "car"
//���: false
//
// ˵��:
//����Լ����ַ���ֻ����Сд��ĸ��
//
// ����:
//��������ַ������� unicode �ַ���ô�죿���ܷ������Ľⷨ��Ӧ�����������
// Related Topics ���� ��ϣ��
// ? 387 ? 0
public class IsAnagram {
    public static void main(String[] args) {
        System.out.println(new IsAnagram().isAnagram("anagram", "nagaram"));
        System.out.println(new IsAnagram().isAnagram("rat", "cat"));
        System.out.println(new IsAnagram().isAnagram("rrat", "cat"));
        System.out.println(new IsAnagram().isAnagram("rrat", "aart"));
    }

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        HashMap<Character, Integer> flag = new HashMap<>();
        int l;
        for (char each : s.toCharArray()) {
            if(flag.containsKey(each)) {
                l = t.indexOf(each, flag.get(each));
            }else{
                l = t.indexOf(each);
            }
            if (l == -1) return false;
            flag.put(each,l+1);
        }
        return true;
    }

    //��ȷ, ��
    public boolean isAnagram1(String s, String t) {
        if (s.length() != t.length()) return false;
        char[] ss = s.toCharArray();
        char[] tt = t.toCharArray();
        Arrays.sort(ss);
        Arrays.sort(tt);
        return Arrays.equals(ss, tt);
    }

    //����ⷨ,������Ϊ����һ���Ϳ�����,��ʵ����ҲҪһ��
    public boolean isAnagramError(String s, String t) {
        if (s.length() != t.length()) return false;
        char[] ss = s.toCharArray();
        HashSet<Character> sss = new HashSet<Character>();
        for (char each : ss) {
            sss.add(each);
        }
        char[] tt = t.toCharArray();
        HashSet<Character> ttt = new HashSet<Character>();
        for (char each : tt) {
            ttt.add(each);
        }
        for (char each : ttt) {
            if (!sss.remove(each))
                return false;
        }
        return sss.isEmpty();
    }
}
