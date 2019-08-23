package myCode;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

/*
 * Stream：流式编程  简化集合操作
 *
 *
 */
public class MyStream {

    public static void main(String[] args) {
        new Thread(
                () -> {
                    System.out.println("hello");
                    System.out.println("淀山湖");
                }
        ).start();

        int aaa = 10;//局部变量在匿名内部类中可以使用，但是默认就是final
        TreeSet<Person> set = new TreeSet<Person>(
                (p1, p2) -> {

                    int result;
                    result = p1.getAge() - p2.getAge();
                    if (result == 0) {

                        result = p1.getName().compareTo(p2.getName());
                    }

                    return result;
                }
        );

        List<Person> list2 = new ArrayList<Person>();

        Person p1 = new Person("jack", 20);
        Person p2 = new Person("rose", 12);
        Person p3 = new Person("lily", 13);
        Person p4 = new Person("tony", 17);

        list2.add(p1);
        list2.add(p2);
        list2.add(p3);
        list2.add(p4);
        list2.add(new Person("tony", 17));

        Stream<Person> stream = list2.stream();

        stream.filter((p) -> {
            return p.getAge() > 13;
        }).forEach((p) -> System.out.println(p.getName() + " " + p.getAge()));
//        System.out.println("stream.count() = " + stream.count());


        list2.stream().map((a) -> a.getAge()).forEach(age -> System.out.println(age));
        list2.stream().map(Person::getAge).forEach(System.out::println);     //方法引用，method reference？？？  todo


        list2.stream().parallel().forEach(System.out::println); //并行计算。 只有一个findAny()的结果会受影响。

        Stream.of("one", "two", "three", "four")
                .filter(e -> e.length() > 2)
                .peek(e -> System.out.println("Filtered value: " + e))
                .map(String::toUpperCase)
                .peek(e -> System.out.println("Mapped value: " + e))
                .collect(toList());

        list2.stream().sorted((a, b) -> a.getAge() - b.getAge()).skip(2).forEach(p -> System.out.println(p));
        System.out.println("-----");
        list2.stream().sorted((a, b) -> a.getAge() - b.getAge()).limit(3).forEach(p -> System.out.println(p));


        String[] words = {"Hello", "World"};
        Arrays.stream(words)     //imported
                .map(word -> word.split(""))
                .forEach(((String[] ss) -> System.out.println(Arrays.toString(ss))));
        System.out.println("-----");


        Arrays.stream(words)
                .flatMap(s -> Stream.of(s.split("")))
                .forEach(System.out::println);

        List<Person> asList = list2.stream().collect(Collectors.toList());
        System.out.println("list2.stream().collect(Collectors.averagingInt(Person::getAge))" + list2.stream().collect(Collectors.averagingInt(Person::getAge)));
        System.out.println("list2.stream().collect(Collectors.summingLong(Person::getAge)) = " + list2.stream().collect(Collectors.summingLong(Person::getAge)));
        System.out.println("list2.stream().collect(Collectors.summingLong(Person::getAge)) = " + list2.stream().collect(Collectors.mapping(p -> p.getName(), toSet())));

        //The following will classify Person objects by city:
        Map<Integer, List<Person>> peopleByCity
                = list2.stream().collect(groupingBy(Person::getAge));
        peopleByCity.forEach((k, v) -> System.out.println(k + "  " + v));

        //The following will classify Person objects by state and city, cascading two Collectors together:
        list2.stream().collect(groupingBy(Person::getAge,
                mapping(Person::getName, toSet())))
                .forEach((k, v) -> System.out.println(k + "  " + v));

        Map<String, Map<Integer, List<Person>>> peopleByStateAndCity
                = list2.stream().collect(groupingBy(Person::getName,
                groupingBy(Person::getAge)));

        //Stream<String> words = lines.flatMap(line -> Stream.of(line.split(" +")));
        //stream.distinct().forEach((p)->System.out.println(p));

//        stream.filter((p) -> p.getAge() >= 15).forEach((p) -> System.out.println(p));

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

        // stream.map((p) -> p.getName()).forEach((s) -> System.out.println(s));

    }

}
 class Person {
    private String name;
    private int age;

    public Person() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Person(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + age;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Person other = (Person) obj;
        if (age != other.age)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }


}