package com.lamda;


import java.util.ArrayList;
import java.util.List;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>();
		
		list.add("jack");
		list.add("rose");
		list.add("tony");
		list.add("lily");
		
		list.forEach((s)->System.out.println(s));
		
		List<Person> list2 = new ArrayList<Person>();
		
		Person p1 = new Person("jack",20);
		Person p2 = new Person("rose",12);
		Person p3 = new Person("lily",13);
		Person p4 = new Person("tony",17);
		
		list2.add(p1);
		list2.add(p2);
		list2.add(p3);
		list2.add(p4);
		
		list2.forEach((p)->p.setAge(p.getAge()+10));
		
		list2.forEach((p)->{System.out.println(p);});
		
		//System::out::println("a");
	}

}
