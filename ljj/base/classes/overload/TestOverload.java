package ljj.base.classes.overload;

public class TestOverload {
    void pri(byte a){ System.out.println("byte"+a); }
    void pri(char a){ System.out.println("char"+a); }
    void pri(short a){ System.out.println("short"+a); }
    void pri(int a){ System.out.println("int"+a); }
//    void pri(long a){ System.out.println("long"+a); }
//    void pri(float a){ System.out.println("float"+a); }
    void pri(double a){ System.out.println("double"+a); }

    public static void main(String[] args) {
        TestOverload t = new TestOverload();
        t.pri(10000000000000000000000000000.121212D);
        t.pri(1231232L);  // float  , 先往大的转换
    }
}
