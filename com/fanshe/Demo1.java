package com.fanshe;
/*
 * 反射
 * Class类 
 * 	Class 类的实例表示正在运行的 Java 应用程序中的类和接口
 */
public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		//对象的类型
		MyClass myClass = new MyClass();
		
		//类 类型
		Class c = myClass.getClass();
		
		Class c1 = MyClass.class;
		
		System.out.println(c == c1);
		
		try {
			Class c3 = Class.forName("com.fanshe.MyClass");
			System.out.println(c3 == c);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
//是Class的实例对象
class MyClass{
	
}
