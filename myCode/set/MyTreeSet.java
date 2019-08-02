package myCode.set;

import java.util.Comparator;
import java.util.TreeSet;

public class MyTreeSet {

    public static void main(String[] args) {
        // TreeSet 含有set的所有方法。
        TreeSet<Person> set = new TreeSet<Person>(
                new Comparator<Person>() {
                    @Override
                    public int compare(Person o1, Person o2) {  //参数按插入顺序传入，若返回值>0，就交换顺序。
                        int result = 0;
                        result = ((Person) o1).age - ((Person) o2).age;
                        if (result == 0) {
                            result = ((Person) o1).name.compareTo(((Person) o2).name);
                        }
                        return result;
                    }
                }
        );

        set.add(new Person("a", 30));
        set.add(new Person("c", 40));
        set.add(new Person("d", 50));
        set.add(new Person("b", 60));
        set.add(new Person("f", 70));
        set.add(new Person("ea", 30));
        set.add(new Person("eb", 30));

        System.out.println(set);

        System.out.println("set.first() = " + set.first());
        System.out.println("set.last() = " + set.last());
        System.out.println("set.higher(new Person(\"dddd\",20)) = " + set.higher(new Person("d", 50)));
        System.out.println("set.lower(new Person(\"dddd\",20)) = " + set.lower(new Person("d", 50)));
        System.out.println("set.pollFirst() = " + set.pollFirst());
        System.out.println("set.pollLast() = " + set.pollLast());

        System.out.println(set);

        System.out.println("set.ceiling(new Person(\"d\", 50)) = " + set.ceiling(new Person("d", 50)));
        System.out.println("set.floor(new Person(\"d\", 50)) = " + set.floor(new Person("d", 50)));

        for (Object o : set) {
            System.out.println(o);
        }
    }

}
