package com.lamda;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyZi zi = new MyZi();
		zi.show();
		
		MyInter.test1();
	}

}

interface MyInter{
	default public void show(){
		System.out.println("'�ӿ� show");
	}
	
	public static void test1(){
		System.out.println("�ӿھ�̬����");
	}
}

class MyZi implements MyInter{
	@Override
	public void show() {
		System.out.println("����show");
	}
}