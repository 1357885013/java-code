package com.basic;
/*
 * �����������Ͱ�װ�� 
 * 
 * Byte
 * Short
 * 
 * Long
 * 
 * Float
 * Double
 * 
 * Character
 * 
 * Boolean
 * 
 * 
 * Integer��
 * ���� int ���ͺ� String ����֮�以��ת�������ṩ�˴��� int ����ʱ�ǳ����õ�����һЩ�����ͷ���
 * 
 * Integer(int value) 
          ����һ���·���� Integer ��������ʾָ���� int ֵ
          
   public Integer(String s):����һ���·���� Integer ����

   
   
   public static String toString(int i)����һ����ʾָ�������� String ����
 */
public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer i = new Integer(100);
		System.out.println(i);

		Integer i1 = new Integer("1000");
		System.out.println(i1);
		
		
		/*
		 * int --- String
		 */
		int a = 20;
		
		String s = a+"";
		
		System.out.println(s);
		
		
		/*
		 * int --integer ---String
		 */
		Integer i2 = new Integer(a);
		
		String s2 = i2.toString();
		
		System.out.println(s2);
		
		
		/*
		 * int--String
		 */
		String s3 = Integer.toString(a);
		System.out.println(s3);
	}

}
