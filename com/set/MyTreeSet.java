package com.set;

import java.util.Comparator;
import java.util.TreeSet;

public class MyTreeSet {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        TreeSet set = new TreeSet(
                new Comparator<Person>() {

                    @Override
                    public int compare(Person o1, Person o2) {
                        //ǿת
                        Person p1 = (Person) o1;
                        Person p = (Person) o2;

                        int result = 0;
                        result = p1.age - p.age;

                        if (result == 0) {
                            result = p1.name.compareTo(p.name);
                        }
                        return result;
                    }
                }
        );

        Person p = new Person("jacka", 20);
        Person p1 = new Person("jack", 20);
        Person p2 = new Person("tony", 30);

        set.add(p);
        set.add(p1);
        set.add(p2);

        System.out.println(set);
    }

}
