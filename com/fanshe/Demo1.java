package com.fanshe;
/*
 * ����
 * Class�� 
 * 	Class ���ʵ����ʾ�������е� Java Ӧ�ó����е���ͽӿ�
 */
public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		//���������
		MyClass myClass = new MyClass();
		
		//�� ����
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
//��Class��ʵ������
class MyClass{
	
}
