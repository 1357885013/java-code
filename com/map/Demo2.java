package com.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * key的类型是Person类型
 * 
 * HashMap判断key唯一性原理：与HashSet一样
 */
public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Person, String> map = new HashMap<Person, String>();
		
		Person k1 = new Person("jack",20);
		
		Person k2 = new Person("tony",30);
		
		Person k3 = new Person("rose",12);
		
		map.put(k1, "biber");
		map.put(k2, "lady gaga");
		map.put(k3, "ben");
		
		//map.put(k2, "Obama");
		map.put(new Person("tony",30), "Obama");
		
		System.out.println(map);
		
		
		/*
		 * Map 遍历
		 * 
		 * 1.获取map中所有的键的set集合，遍历set集合，通过key获取对应的值
		 * 2. 获取map中的键值对的set集合，遍历set集合，获取键和值
		 */
		
		Set<Person> keys = map.keySet();
		
		for(Person p:keys){
			String value = map.get(p);
			System.out.println("key="+p+"  value="+value);
		}
		
		
		Set<Map.Entry<Person, String>> entryEntries = map.entrySet();
		
		for (Map.Entry<Person, String> entry : entryEntries) {
			Person keyString = entry.getKey();
			String valueString = entry.getValue();
			
			System.out.println("key="+keyString+"  value="+valueString);
		}
		
		Collection<String> values = map.values();
		
		for (String string : values) {
			System.out.println(string);
		}
	}

}
