package algorithm;

public class Reverse {
    //����һ�� 32 λ���з������� x ������ x ��ÿλ�ϵ����ַ�ת��Ľ����
//
// �����ת���������� 32 λ���з��������ķ�Χ [?231, 231 ? 1] ���ͷ��� 0��
//���軷��������洢 64 λ�������з��Ż��޷��ţ���
//
//
//
// ʾ�� 1��
//
//
//���룺x = 123
//�����321
//
//
// ʾ�� 2��
//
//
//���룺x = -123
//�����-321
//
//
// ʾ�� 3��
//
//
//���룺x = 120
//�����21
//
//
// ʾ�� 4��
//
//
//���룺x = 0
//�����0
//
//
//
//
// ��ʾ��
//
//
// -231 <= x <= 231 - 1
//
// Related Topics ��ѧ
// ? 2529 ? 0


    //leetcode submit region begin(Prohibit modification and deletion)
    public int reverse(int x) {
        if (x < 10 && x > -10) return x;
        boolean isNegative;
        if (isNegative = (x < 0)) x = -x;
        long result = 0;
        while (x >= 1) {
            if (result == 0)
                result = x % 10;
            else
                result = result * 10 + x % 10;
            if (result >= Math.pow(2, 31) - 1)
                return 0;
            x /= 10;
        }
        if (isNegative) result = -result;
        return (int) result;
    }
//leetcode submit region end(Prohibit modification and deletion)

}
