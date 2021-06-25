package fanshe;

import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Properties;

public class reflectCall {

    public static void main(String[] args) throws Exception {
        //加载properties文件
        Properties properties = new Properties();
        ClassLoader classLoader = reflectCall.class.getClassLoader();
        InputStream resource = classLoader.getResourceAsStream("fanshe/reflectCall.properties");
        System.out.println(resource);
        properties.load(resource);
        //读properties文件的属性
        String className = properties.getProperty("className");
        String method = properties.getProperty("method");

        //根据类名创建类
        Class<?> aClass = Class.forName(className);
        //获取无参构造函数并创建实例
        Constructor<?> constructor = aClass.getDeclaredConstructor();
        constructor.setAccessible(true);
        Object instance = constructor.newInstance();

        //获取方法并调用方法
        Method method1 = aClass.getDeclaredMethod(method);
        method1.setAccessible(true);
        method1.invoke(instance);

    }
}
