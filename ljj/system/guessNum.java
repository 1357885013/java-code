package ljj.system;

import java.util.Scanner;

class guessNum {
    /*
    �����֣�1-100��
        1. ���������
        2. ѭ��
            ��ʾ�û���������
                �Ƚ�����������������

                    ��������ֵ������������ʾ�û��н��ˣ�ֹͣѭ��

                    �������ֲ����������
                        �жϵ�ǰ�ǵڼ��λ���
                            ��������һ�λ��᣺��ʾ û�н�
                            ������ǣ�
                                    �жϴ�С��ϵ����ʾ���˻���С��

    */
    public static void main(String[] args) {
        int answer = (int) Math.floor(Math.random() * 100);
        System.out.println(answer);
        int tryCount = 8;
        Scanner s = new Scanner(System.in);

        for (int i = 1; i <= 8; i++) {
            if (s.hasNextInt()) {
                int t = s.nextInt();
                if (t == answer) {
                    System.out.println("bingo");
                    break;
                } else if (t < answer)
                    System.out.println("try bigger num");
                else if (t > answer)
                    System.out.println("try smaller num");
            }
        }
        System.out.println("try smaller num");
    }
}
