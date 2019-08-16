package com.fanshe;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class Demo2 {

	public static void main(String[] args) throws Exception, SecurityException {
		// TODO Auto-generated method stub
		//��ȡ�����������
		Class c = Class.forName("com.fanshe.Stduent");
		
		//��ȡ����ĳ�Ա����
		Method[] m = c.getMethods();
		
		//��������
		for (Method method : m) {
			String name = method.getName();
			int modify = method.getModifiers();
			Class returnType = method.getReturnType();
		   	Parameter[] psParameters = method.getParameters();
		   	
		   	System.out.print("����������"+name+"  ���η�"+modify+"  ����ֵ����"+returnType+"   ");
		   	
		   	for (Parameter parameter : psParameters) {
				System.out.print("  "+parameter.getName()+" "+parameter.getType());
			}
		   	
		   	System.out.println();
		}
		
		Method m1 = c.getMethod("show");
		
		//��ȡ���췽��
		Constructor<Student> sConstructor = c.getConstructor(String.class,int.class);
				
		Student s = sConstructor.newInstance("jack",12);
				
		System.out.println(s);
		
		
		m1.invoke(s);
		
		/*
		 * ��Ա����Ҳ��һ������
		 */
		
		Field[] fields = c.getFields();
		
		for (Field field : fields) {
			System.out.println(field.getName()+"  "+field.getType());
		}
		
		/*
		 * ���췽��
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

