package myCode;

public class number {
    public static void main(String[] args){
        System.out.println("args = " + args);

        int a =10,b=3;
        float aF =10,bF=3;
        int vInt = a/b;
        float vFloat= a/b;

        System.out.println("a/b = " + a / b);
        System.out.println("vInt = " + vInt);
        System.out.println("vFloat = " + vFloat);

        vFloat = aF/b;

        System.out.println("vFloat = " + vFloat);
        a /= bF;
        System.out.println("a = " + a);
    }
}
