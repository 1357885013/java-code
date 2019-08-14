package myCode;

public class StringIter {
    public static int countUpcase = 0, countLowCase = 0;

    public static void main(String[] args) {
        String s = "Beautful Day";
        itea(s, new method() {//转成小写
            public void handle(char[] c, int i) {
                if (c[i] < 'Z' && c[i] > 'A') {//A排在a后在ascii上
                    c[i] += 'a';
                    c[i] -= 'A';
                }
            }
        });
        itea(s, new method() {//数大小写的个数
            @Override
            public void handle(char[] c, int i) {
                if (c[i] < 'Z' && c[i] > 'A') {
                    countUpcase++;
                } else if (c[i] < 'z' && c[i] > 'a') {
                    countLowCase++;
                }
            }
        });
        System.out.println("countLowCase = " + countLowCase);
        System.out.println("countUpcase = " + countUpcase);
    }

    public static void itea(String s, method m) {//遍历String中的每一个字符并自定义处理函数
        char[] c = s.toCharArray();
        for (int i = 0; i < c.length; i++) {
            m.handle(c, i);
            System.out.print(c[i]);
        }
        System.out.println();
    }

    interface method {
        public void handle(char[] c, int i);
    }

}


