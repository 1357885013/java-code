package com.lamda;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*
 * Stream：流式编程  简化集合操作
 * 
 * 
 */
public class Demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Person> list2 = new ArrayList<Person>();
		
		Person p1 = new Person("jack",20);
		Person p2 = new Person("rose",12);
		Person p3 = new Person("lily",13);
		Person p4 = new Person("tony",17);
		
		list2.add(p1);
		list2.add(p2);
		list2.add(p3);
		list2.add(p4);
		list2.add(new Person("tony",17));
		
		Stream<Person> stream = list2.stream();
		
		//stream.distinct().forEach((p)->System.out.println(p));
		
		//stream.filter((p)->p.getAge()>=15).forEach((p)->System.out.println(p));
		
		//stream.limit(2).forEach((p)->System.out.println(p));
		
		//stream.sorted((o1,o2)->o1.getAge()-o2.getAge()).forEach((p)->System.out.println(p));
		
		/*Person optional = stream.min((o1,o2)->o1.getAge()-o2.getAge()).get();
		System.out.println(optional);*/
		
		/*Person maxPerson = stream.max((o1,o2)->o1.getAge()-o2.getAge()).get();
		System.out.println(maxPerson);*/
		
		//int a = stream.parallel().mapToInt(p->p.getAge()).sum();
		
		/*IntStream is = stream.parallel().mapToInt((p)->p.getAge());
		
		IntSummaryStatistics sum = is.summaryStatistics();
		
		System.out.println(sum.getCount());
		System.out.println(sum.getAverage());
		System.out.println(sum.getMax());
		
		System.out.println(sum.getMin());
		System.out.println(sum.getSum());*/
		
		stream.map((p)->p.getName()).forEach((s)->System.out.println(s));
		
	}

}
