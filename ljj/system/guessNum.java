package ljj.system;

import java.util.Scanner;

class guessNum {
    /*
    猜数字（1-100）
        1. 生成随机数
        2. 循环
            提示用户输入数字
                比较输入的数字与随机数

                    输入的数字等于随机数：提示用户中奖了，停止循环

                    输入数字不等于随机数
                        判断当前是第几次机会
                            如果是最后一次机会：提示 没中奖
                            如果不是：
                                    判断大小关系，提示大了还是小了

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
