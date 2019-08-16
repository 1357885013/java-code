package com.fanshe;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class Demo2 {

	public static void main(String[] args) throws Exception, SecurityException {
		// TODO Auto-generated method stub
		//获取该类的类类型
		Class c = Class.forName("com.fanshe.Stduent");
		
		//获取该类的成员方法
		Method[] m = c.getMethods();
		
		//遍历数组
		for (Method method : m) {
			String name = method.getName();
			int modify = method.getModifiers();
			Class returnType = method.getReturnType();
		   	Parameter[] psParameters = method.getParameters();
		   	
		   	System.out.print("方法名称是"+name+"  修饰符"+modify+"  返回值类型"+returnType+"   ");
		   	
		   	for (Parameter parameter : psParameters) {
				System.out.print("  "+parameter.getName()+" "+parameter.getType());
			}
		   	
		   	System.out.println();
		}
		
		Method m1 = c.getMethod("show");
		
		//获取构造方法
		Constructor<Student> sConstructor = c.getConstructor(String.class,int.class);
				
		Student s = sConstructor.newInstance("jack",12);
				
		System.out.println(s);
		
		
		m1.invoke(s);
		
		/*
		 * 成员变量也是一个对象
		 */
		
		Field[] fields = c.getFields();
		
		for (Field field : fields) {
			System.out.println(field.getName()+"  "+field.getType());
		}
		
		/*
		 * 构造方法
		 */
		Constructor []  cs = c.getConstructors();
		
		for (Constructor constructor : cs) {
			System.out.println(constructor.getName()+"  "+constructor.getParameterCount());
		}
		
		
		
		
	}

}


class Student{
	public String name;
	public int age;
	
	public  Student() {
		super();
	}
	
	public Student(String name,int age){
		this.name = name;
		this.age = age;
	}
	
	public void show(){
		System.out.println("show===="+name+"  "+age);
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	
	
}

