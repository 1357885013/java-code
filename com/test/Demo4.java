package com.test;

import java.util.Scanner;

/*
 * ģ��һ�������ݵĵ�¼����
 * 
 */
public class Demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���û������û���������
		System.out.println("����������û���������");
		
		Scanner sc = new Scanner(System.in);
		
		String username = sc.next();
		
		String password = sc.next();
		
		if(username.equals("root") && password.equals("root")){
			System.out.println("��¼�ɹ�");
		}else{
			System.out.println("��¼ʧ��");
		}
	}
}
