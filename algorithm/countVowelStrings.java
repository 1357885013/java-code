package algorithm;

//给你一个整数 n，请返回长度为 n 、仅由元音 (a, e, i, o, u) 组成且按 字典序排列 的字符串数量。
//
// 字符串 s 按 字典序排列 需要满足：对于所有有效的 i，s[i] 在字母表中的位置总是与 s[i+1] 相同或在 s[i+1] 之前。
//
//
//
// 示例 1：
//
//
//输入：n = 1
//输出：5
//解释：仅由元音组成的 5 个字典序字符串为 ["a","e","i","o","u"]
//
//
// 示例 2：
//
//
//输入：n = 2
//输出：15
//解释：仅由元音组成的 15 个字典序字符串为
//["aa","ae","ai","ao","au","ee","ei","eo","eu","ii","io","iu","oo","ou","uu"]
//注意，"ea" 不是符合题意的字符串，因为 'e' 在字母表中的位置比 'a' 靠后
//
//
// 示例 3：
//
//
//输入：n = 33
//输出：66045
//
//
//
//
// 提示：
//
//
// 1 <= n <= 50
//
// Related Topics 数学 动态规划 回溯算法
// ? 49 ? 0


import java.util.Arrays;

//leetcode submit region begin(Prohibit modification and deletion)
class countVowelStrings {
    // todo : 再做一遍 5-27
    public int countVowelStrings(int n) {
        if(n==1)return 5;
        //计算树的叶子
        int[] s = new int[n + 1];
        int sum = 0;
        Arrays.fill(s, 5);
        boolean exit = false;
        while (!exit) {
            sum++;
            s[n]--;
            if (s[n] > 0) continue;
            int i = 1;
            for (; n - i > 0; i++) {
                if (s[n - i] >= 2) {
                    s[n - i]--;
                    if (n - i == 1 && s[n - i] == 1)
                        exit = true;
                    break;
                }
            }
            while (i-- >= 1) {
                s[n - i] = s[n - i - 1];
            }
        }
        return ++sum;
    }

    public static void main(String[] args) {
        countVowelStrings s = new countVowelStrings();
        System.out.println(s.countVowelStrings(1));
    }
}
//leetcode submit region end(Prohibit modification and deletion)
