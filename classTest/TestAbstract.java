package myCode.classTest;

public abstract class TestAbstract {
    protected abstract void protectedMethod();

    public abstract void publicMethod();

//    abstract void defaultMethod();

    static void testStatic() {
        System.out.println("fuck");
    }

    synchronized void testSync() {
        System.out.println("asshole");
    }
}
