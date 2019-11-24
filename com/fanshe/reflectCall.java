package com.fanshe;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.Properties;

public class reflectCall {

    public static void main(String[] args) throws Exception {
        //����properties�ļ�
        Properties properties = new Properties();
        ClassLoader classLoader = reflectCall.class.getClassLoader();
        InputStream resource = classLoader.getResourceAsStream("./com/fanshe/reflectCall.properties");
        System.out.println(resource);
        properties.load(resource);
        //��properties�ļ�������
        String className = properties.getProperty("className");
        String method = properties.getProperty("method");

        //��������������
        Class<?> aClass = Class.forName(className);
        //��ȡ�޲ι��캯��������ʵ��
        Constructor<?> constructor = aClass.getDeclaredConstructor();
        constructor.setAccessible(true);
        Object instance = constructor.newInstance();

        //��ȡ���������÷���
        Method method1 = aClass.getDeclaredMethod(method);
        method1.setAccessible(true);
        method1.invoke(instance);

    }
}
