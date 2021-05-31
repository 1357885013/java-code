package debug;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
//给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。
//
// 示例 1:
//
// 输入: s = "anagram", t = "nagaram"
//输出: true
//
//
// 示例 2:
//
// 输入: s = "rat", t = "car"
//输出: false
//
// 说明:
//你可以假设字符串只包含小写字母。
//
// 进阶:
//如果输入字符串包含 unicode 字符怎么办？你能否调整你的解法来应对这种情况？
// Related Topics 排序 哈希表
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

    //正确, 慢
    public boolean isAnagram1(String s, String t) {
        if (s.length() != t.length()) return false;
        char[] ss = s.toCharArray();
        char[] tt = t.toCharArray();
        Arrays.sort(ss);
        Arrays.sort(tt);
        return Arrays.equals(ss, tt);
    }

    //错误解法,错误认为构成一样就可以了,其实数量也要一样
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
