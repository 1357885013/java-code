package ljj.base.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;

public class CrimsonHandler implements InvocationHandler {
    private Object obj;

    public CrimsonHandler(Object obj) {
        super();
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before");
        System.out.println(method.getName());
        System.out.println(method.getDeclaringClass().getName());
        //根据类名字不同做不同操作
        switch (method.getDeclaringClass().getName()) {
            case "myCode.proxy.Crimson":
                System.out.println("call out() in interface Crimson");
                break;
            case "myCode.proxy.Dettan":
                System.out.println("call out() in interface Dettan");
                break;
            case "myCode.proxy.CoolInterface":
                System.out.println("call out() in interface CoolInterface");
                System.out.println(method.invoke(obj, args));
        }

        method.getClass();//class java.lang.reflect.Method

        //获取注解,只能获取到接口上的注解
        System.out.println(Arrays.toString(method.getAnnotations()));
        System.out.println("after");
        return null;
    }
}
