package stateMachine;

public class TestStatusMathine {
    public static void main(String[] args) {
        System.out.println(isNumber("f.e"));
        System.out.println(isNumber("  +832.8998e-123   "));
        System.out.println(isNumber("0.0"));
        System.out.println(isNumber("+.123"));
        System.out.println(isNumber("12."));
    }

    enum InputType {space, sign, digit, dot, exponent, invalid}

    public static boolean isNumber(String s) {
        short[][] ss = new short[][]{
                {0, 1, 2, 3, -1, -1},
                {-1, -1, 2, 3, -1, -1},
                {8, -1, 2, 4, 5, -1},
                {-1, -1, 4, -1, -1, -1},
                {8, -1, 4, -1, 5, -1},
                {-1, 6, 7, -1, -1, -1},
                {-1, -1, 7, -1, -1, -1},
                {8, -1, 7, -1, -1, -1},
                {8, -1, -1, -1, -1, -1}
        };

        short state = 0;
        InputType inputType;
        for (short i = 0; i < s.length(); i++) {
            char v = s.charAt(i);
            switch (v) {
                case ' ':
                    inputType = InputType.space;
                    break;
                case '.':
                    inputType = InputType.dot;
                    break;
                case '+':
                case '-':
                    inputType = InputType.sign;
                    break;
                case 'e':
                case 'E':
                    inputType = InputType.exponent;
                    break;
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                    inputType = InputType.digit;
                    break;
                default:
                    inputType = InputType.invalid;
                    break;
            }
            if ((state = ss[state][inputType.ordinal()]) == -1)
                return false;
        }
        return state == 2 || state == 4 || state == 7 || state == 8;
    }
}
