package algorithm;

//����һ������ n���뷵�س���Ϊ n ������Ԫ�� (a, e, i, o, u) ����Ұ� �ֵ������� ���ַ���������
//
// �ַ��� s �� �ֵ������� ��Ҫ���㣺����������Ч�� i��s[i] ����ĸ���е�λ�������� s[i+1] ��ͬ���� s[i+1] ֮ǰ��
//
//
//
// ʾ�� 1��
//
//
//���룺n = 1
//�����5
//���ͣ�����Ԫ����ɵ� 5 ���ֵ����ַ���Ϊ ["a","e","i","o","u"]
//
//
// ʾ�� 2��
//
//
//���룺n = 2
//�����15
//���ͣ�����Ԫ����ɵ� 15 ���ֵ����ַ���Ϊ
//["aa","ae","ai","ao","au","ee","ei","eo","eu","ii","io","iu","oo","ou","uu"]
//ע�⣬"ea" ���Ƿ���������ַ�������Ϊ 'e' ����ĸ���е�λ�ñ� 'a' ����
//
//
// ʾ�� 3��
//
//
//���룺n = 33
//�����66045
//
//
//
//
// ��ʾ��
//
//
// 1 <= n <= 50
//
// Related Topics ��ѧ ��̬�滮 �����㷨
// ? 49 ? 0


import java.util.Arrays;

//leetcode submit region begin(Prohibit modification and deletion)
class countVowelStrings {
    // todo : ����һ�� 5-27
    public int countVowelStrings(int n) {
        if(n==1)return 5;
        //��������Ҷ��
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
