package myCode;

public class TypeRange {

    public static void main(String[] args) {
        for (int ii = -128; ii <= 127; ii++)
            System.out.println(ii + " = " + Integer.toBinaryString(ii)); //正解

        class Reg {
            private final int digit = 7;  //减1
            private boolean[] code = new boolean[digit + 1];

            private Reg() {
                super();
            }

            private Reg(String s) {
                char[] chars = s.toCharArray();
                int j = digit;
                for (int i = chars.length - 1; i >= 0; i--, j--) {
                    code[j] = chars[i] == '1';
                }
                if (j >= 0) {
                    do {
                        code[j] = false;
                        j--;
                    } while (j >= 0);
                }
            }

            @Override
            public boolean equals(Object obj) {
                if (!(obj instanceof Reg))
                    return super.equals(obj);
                for (int i = 0; i <= digit; i++) {
                    if (code[i] != ((Reg) obj).code[i])
                        return false;
                }
                return true;
            }

            @Override
            public String toString() {
                StringBuilder s = new StringBuilder();
                for (int i = 0; i <= code.length - 1; i++) {
                    s.append(code[i] ? '1' : '0');
                }
                return s.toString();
            }

            private void add() {  //二进制加1
                boolean flag = true;
                for (int i = code.length - 1; i >= 0 && flag; i--) {
                    if (!code[i]) {
                        code[i] = true;
                        flag = false;
                    } else {
                        code[i] = false;
                        flag = true;
                    }
                }
            }
        }
        Reg reg = new Reg();
        Reg regEnd = new Reg("0");
        do {
            try {
//                System.out.println(reg + "  " + Short.parseShort(reg.toString(), 2)); //1000 0000 0000 0000 超出范围
                System.out.println(reg + "  " + Byte.parseByte(reg.toString(), 2));   //1000 0000 就超出范围了
            } catch (NumberFormatException e) {
                System.out.println(reg + "  out of range");
            }
            reg.add();
        } while (!reg.equals(regEnd));

        System.out.println(Short.parseShort("-00011", 2));

    }

}

