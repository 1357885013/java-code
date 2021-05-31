package fanshe;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Demo3 {

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        MyClassLoader my = new MyClassLoader("E:\\¿Î³Ì\\¿Î³Ì±Ê¼Ç\\2 java\\day04\\code");
        Class c = my.findClass("Method2");
        Object o = c.newInstance();
        Method m = c.getMethod("getMax", int.class, int.class);
        Object o1 = m.invoke(o, 10, 20);
        System.out.println(o1);
    }
}
