package algorithm;

public class LongestPalindrome {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("aabcc"));
        System.out.println(longestPalindrome("babad"));
        System.out.println(longestPalindrome("a1jkojkljoinfjiowhuh3u2j4o32ng4u098hjsfodjo"));
    }

    public static String longestPalindrome(String s) {
        if (s.length() == 1) return s;
        String result = "";
//        int length = s.length();
        for (int i = 0; i < s.length() - 1; i++) {
            boolean end1 = false, end2 = false;
            for (int j = 1; ; j++) {
                //ollo式
                if (!end1 && !(i - j + 1 >= 0 && i + j < s.length() && s.charAt(i - j + 1) == s.charAt(i + j))) {
                    end1 = true;
                    int jj = j - 1;
                    if (result.length() < 2 * jj)
                        result = s.substring(i - jj + 1, i + jj + 1);
                }
                //olo式
                if (!end2 && !(i - j >= 0 && i + j < s.length() && s.charAt(i - j) == s.charAt(i + j))) {
                    end2 = true;
                    int jj = j - 1;
                    if (result.length() < 2 * jj + 1)
                        result = s.substring(i - jj, i + jj + 1);
                }
                if (end1 && end2)
                    break;
            }
        }
        return result;
    }
}
