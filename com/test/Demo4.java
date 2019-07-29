package com.test;

import java.util.Scanner;

/*
 * 模拟一个假数据的登录动作
 * 
 */
public class Demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//请用户输入用户名和密码
		System.out.println("请输入你的用户名和密码");
		
		Scanner sc = new Scanner(System.in);
		
		String username = sc.next();
		
		String password = sc.next();
		
		if(username.equals("root") && password.equals("root")){
			System.out.println("登录成功");
		}else{
			System.out.println("登录失败");
		}
	}
}
