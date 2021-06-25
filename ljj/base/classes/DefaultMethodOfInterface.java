package ljj.base.classes;

public class DefaultMethodOfInterface {

    public static void main(String[] args) {
        MyZi zi = new MyZi();
        zi.show();

        MyInter.test1();
    }

}

interface MyInter {
    default public void show() {
        System.out.println("'接口 show");
    }

    public static void test1() {
        System.out.println("接口静态方法");
    }
}

class MyZi implements MyInter {
    @Override
    public void show() {
        System.out.println("子类show");
    }
}