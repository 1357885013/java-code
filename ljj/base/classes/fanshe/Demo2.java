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
        //��ȡ�����������
        Student student = new Student();

        Class c = Student.class;
          c = student.getClass();
          c = Class.forName("fanshe.Student");

        Method[] methods = c.getMethods();
        Method[] declareMethods = c.getDeclaredMethods();  //ֻ���Լ�����д�ĺ������������̳еġ���
        System.out.println("Arrays.toString(methods) = " + Arrays.toString(methods));
        System.out.println("Arrays.toString(declareMethods) = " + Arrays.toString(declareMethods));


        System.out.println("Arrays.toString(c.getAnnotations()) = " + Arrays.toString(c.getAnnotations()));

        System.out.println("c.getPackage().getName() = " + c.getPackage().getName());

        System.out.println("c.getSuperclass().getName() = " + c.getSuperclass().getName());
        System.out.println("c.getCanonicalName() = " + c.getCanonicalName());
        System.out.println("c.getSimpleName() = " + c.getSimpleName()); //����������������
        System.out.println("c.getTypeName() = " + c.getTypeName());
        System.out.println("c.getModifiers() = " + c.getModifiers());//���δʣ�0��public
        System.out.println("c.getName() = " + c.getName());//��������������

        System.out.println("---------------------------------");

        //��ȡ����ĳ�Ա����
        Method[] m = c.getMethods();

        //��������
        for (Method method1 : m) {
            String name = method1.getName();
            int modify = method1.getModifiers();
            Class returnType = method1.getReturnType();
            Parameter[] psParameters = method1.getParameters();

            System.out.print("����������" + name + "  ���η�" + modify + "  ����ֵ����" + returnType + "   ");

            for (Parameter parameter : psParameters) {
                System.out.print("  " + parameter.getName() + " " + parameter.getType());
            }

            System.out.println();
        }
        System.out.println("----------------------------------");

        Method m1 = c.getMethod("show");

        //��ȡ���췽��
        Constructor<Student> sConstructor = c.getConstructor(String.class, int.class);

        Student s = sConstructor.newInstance("jack", 12);

        System.out.println(s);

        m1.invoke(s); //����

        /*
         * ��Ա����Ҳ��һ������
         */
        System.out.println("----------------------------------");
        Field[] fields = c.getFields();   //��Ա����

        for (Field field : fields) {
            System.out.println(field.getName() + "  " + field.getType());
        }

        System.out.println("----------------------------------");

        /*
         * ���췽��
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

