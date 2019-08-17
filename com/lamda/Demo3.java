package com.lamda;

import java.util.TreeSet;

/*
 * Runnable接口
 */
public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Thread(
				()->{System.out.println("hello");System.out.println("淀山湖");}
				).start();
		
		int a = 10;//局部变量在匿名内部类中可以使用，但是默认就是final
		TreeSet<Person> set = new TreeSet<Person>(
				(p1,p2)->{
					
					int result;
					result = p1.getAge()-p2.getAge();
					if(result == 0){
						
						result = p1.getName().compareTo(p2.getName());
					}
					
					return result;
				}
				);
		a = 30;
		Person p1 = new Person("jack",20);
		Person p2 = new Person("rose",12);
		Person p3 = new Person("lily",13);
		Person p4 = new Person("tony",17);
		
		set.add(p1);
		set.add(p2);
		set.add(p3);
		set.add(p4);
		
		System.out.println(set);
	}

}
