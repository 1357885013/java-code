package ljj.base.proxy;

import java.lang.reflect.Proxy;

public class Main {
    public static void main(String[] args) {
        CrimsonHandler handler = new CrimsonHandler(new Cool());

        Crimson crimsonProxy = (Crimson) Proxy.newProxyInstance(Crimson.class.getClassLoader(), new Class[]{Crimson.class}, handler);
        crimsonProxy.out();

        Dettan dettanProxy = (Dettan) Proxy.newProxyInstance(Dettan.class.getClassLoader(), new Class[]{Dettan.class}, handler);
        dettanProxy.out();

        CoolInterface coolProxy = (CoolInterface) Proxy.newProxyInstance(CoolInterface.class.getClassLoader(), new Class[]{CoolInterface.class}, handler);
        System.out.println(coolProxy.out("a", "b"));
    }
}

