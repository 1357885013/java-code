package fanshe;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.Arrays;

public class Demo2 {

    @Test
    public void test2() {
        int[] a = new int[]{1, 2, 3, 4};
        System.out.println("a.getClass().getTypeName() = " + a.getClass().getTypeName());
    }
    public static void main(String[] args) throws Exception, SecurityException {
        // TODO Auto-generated method stub
        //获取该类的类类型
        Student student = new Student();

        Class c = Student.class;
          c = student.getClass();
          c = Class.forName("fanshe.Student");

        Method[] methods = c.getMethods();
        Method[] declareMethods = c.getDeclaredMethods();  //只有自己亲自写的函数，不包含继承的。。
        System.out.println("Arrays.toString(methods) = " + Arrays.toString(methods));
        System.out.println("Arrays.toString(declareMethods) = " + Arrays.toString(declareMethods));


        System.out.println("Arrays.toString(c.getAnnotations()) = " + Arrays.toString(c.getAnnotations()));

        System.out.println("c.getPackage().getName() = " + c.getPackage().getName());

        System.out.println("c.getSuperclass().getName() = " + c.getSuperclass().getName());
        System.out.println("c.getCanonicalName() = " + c.getCanonicalName());
        System.out.println("c.getSimpleName() = " + c.getSimpleName()); //不包括包名的类名
        System.out.println("c.getTypeName() = " + c.getTypeName());
        System.out.println("c.getModifiers() = " + c.getModifiers());//修饰词，0是public
        System.out.println("c.getName() = " + c.getName());//包括包名的类名

        System.out.println("---------------------------------");

        //获取该类的成员方法
        Method[] m = c.getMethods();

        //遍历数组
        for (Method method1 : m) {
            String name = method1.getName();
            int modify = method1.getModifiers();
            Class returnType = method1.getReturnType();
            Parameter[] psParameters = method1.getParameters();

            System.out.print("方法名称是" + name + "  修饰符" + modify + "  返回值类型" + returnType + "   ");

            for (Parameter parameter : psParameters) {
                System.out.print("  " + parameter.getName() + " " + parameter.getType());
            }

            System.out.println();
        }
        System.out.println("----------------------------------");

        Method m1 = c.getMethod("show");

        //获取构造方法
        Constructor<Student> sConstructor = c.getConstructor(String.class, int.class);

        Student s = sConstructor.newInstance("jack", 12);

        System.out.println(s);

        m1.invoke(s); //调用

        /*
         * 成员变量也是一个对象
         */
        System.out.println("----------------------------------");
        Field[] fields = c.getFields();   //成员变量

        for (Field field : fields) {
            System.out.println(field.getName() + "  " + field.getType());
        }

        System.out.println("----------------------------------");

        /*
         * 构造方法
         */
        Constructor[] cs = c.getConstructors();

        for (Constructor constructor : cs) {
            System.out.println(constructor.getName() + "  " + constructor.getParameterCount());
        }


    }

}


class Student {
    public String name;
    public int age;

    public Student() {
        super();
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void show() {
        System.out.println("show====" + name + "  " + age);
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + "]";
    }


}

