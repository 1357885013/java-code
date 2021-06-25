package algorithm;

//���������� n���ҵ����ɸ���ȫƽ���������� 1, 4, 9, 16, ...��ʹ�����ǵĺ͵��� n������Ҫ����ɺ͵���ȫƽ�����ĸ������١�
//
// ����һ������ n �����غ�Ϊ n ����ȫƽ������ �������� ��
//
// ��ȫƽ���� ��һ����������ֵ������һ��������ƽ�������仰˵����ֵ����һ�������Գ˵Ļ������磬1��4��9 �� 16 ������ȫƽ�������� 3 �� 11 ���ǡ�
//
//
//
//
// ʾ�� 1��
//
//
//���룺n = 12
//�����3
//���ͣ�12 = 4 + 4 + 4
//
// ʾ�� 2��
//
//
//���룺n = 13
//�����2
//���ͣ�13 = 4 + 9
//
//
// ��ʾ��
//
//
// 1 <= n <= 104
//
// Related Topics ����������� ��ѧ ��̬�滮
// ? 760 ? 0


//leetcode submit region begin(Prohibit modification and deletion)
class NumSquares {
    public static void main(String[] args) {
        System.out.println(numSquares(1));
        System.out.println(numSquares(12));
        System.out.println(numSquares(1232));
    }

    public static int numSquares(int n) {
        int maxSqrt = (int) Math.floor(Math.sqrt(n));
        int[] dp = new int[n + 1];
        for (int i = 0; i < dp.length; i++) {
            dp[i] = i;
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= Math.sqrt(i); j++) {
                dp[i] = Math.min(dp[i], dp[i - j * j] + 1);
            }
        }
        return dp[n];
    }
}
//leetcode submit region end(Prohibit modification and deletion)

