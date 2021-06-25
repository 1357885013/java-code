package ljj.base;


import ljj.common.User;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

/*  Stream：流式编程  简化集合操作 */
public class MyStream {

    public static void main(String[] args) {
        new Thread(
                () -> {
                    System.out.println("hello");
                    System.out.println("淀山湖");
                }
        ).start();

        int aaa = 10;//局部变量在匿名内部类中可以使用，但是默认就是final
        TreeSet<User> set = new TreeSet<>(
                (p1, p2) -> {
                    int result;
                    result = p1.getAge() - p2.getAge();
                    if (result == 0) {
                        result = p1.getName().compareTo(p2.getName());
                    }

                    return result;
                }
        );

        List<User> list2 = new ArrayList<>();

        User p1 = new User("jack", 20);
        User p2 = new User("rose", 12);
        User p3 = new User("lily", 13);
        User p4 = new User("tony", 17);

        list2.add(p1);
        list2.add(p2);
        list2.add(p3);
        list2.add(p4);
        list2.add(new User("tony", 17));

        Stream<User> stream = list2.stream();

//        stream.filter((p) -> {
//            return p.getAge() > 13;
//        }).forEach((p) -> System.out.println(p.getName() + " " + p.getAge()));
        stream.filter((p) -> p.getAge() > 13).forEach(person -> System.out.println(person.getAge()));

        list2.stream().map((a) -> a.getAge()).forEach(age -> System.out.print(age + " "));
        list2.stream().map(User::getAge).forEach(System.out::println);     //方法引用，method reference？？？  todo

        list2.stream().parallel().forEach(System.out::println); //并行计算。 只有一个findAny()的结果会受影响。

        //取出长度大于3的字符串存成新list
        List<String> collect1 = Stream.of("one", "two", "three", "four")
                .filter(e -> e.length() > 3)
                .peek(e -> System.out.println("Filtered value: " + e))
                .map(String::toUpperCase)
                .peek(e -> System.out.println("Mapped value: " + e))
                .collect(toList());

        list2.stream().sorted(Comparator.comparingInt(User::getAge)).skip(2).forEach(System.out::println);
        list2.stream().sorted((a, b) -> a.getAge() - b.getAge()).skip(2).forEach(System.out::println);
        System.out.println("-----");
        list2.stream().sorted((a, b) -> a.getAge() - b.getAge()).limit(3).forEach(System.out::println);
        int age = list2.stream().max(Comparator.comparingInt(User::getAge)).get().getAge();

        String[] words = {"Hello", "World"};
        Arrays.stream(words)     //imported
                .map(word -> word.split(""))
                .forEach(((String[] ss) -> System.out.println(Arrays.toString(ss))));
        System.out.println("-----");

        Arrays.stream(words)
                .flatMap(s -> Stream.of(s.split("")))
                .forEach(System.out::println);

        List<User> asList = list2.stream().collect(Collectors.toList());
        System.out.println("list2.stream().collect(Collectors.averagingInt(Person::getAge))" + list2.stream().collect(Collectors.averagingInt(User::getAge)));
        System.out.println("list2.stream().collect(Collectors.summingLong(Person::getAge)) = " + list2.stream().collect(Collectors.summingLong(User::getAge)));
        System.out.println("list2.stream().collect(Collectors.summingLong(Person::getAge)) = " + list2.stream().collect(Collectors.mapping(p -> p.getName(), toSet())));

        //The following will classify Person objects by city:
        Map<Integer, List<User>> peopleByCity
                = list2.stream().collect(groupingBy(User::getAge));
        peopleByCity.forEach((k, v) -> System.out.println(k + "  " + v));

        //The following will classify Person objects by state and city, cascading two Collectors together:
        list2.stream().collect(groupingBy(User::getAge,
                mapping(User::getName, toSet())))
                .forEach((k, v) -> System.out.println(k + "  " + v));

//        Map<String, Map<Integer, List<User>>> peopleByStateAndCity
//                = list2.stream().collect(groupingBy(User::getName,
//                groupingBy(User::getAge)));

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

        System.out.println("将年龄加3");
//        List<Person> result = list2.stream().map(person -> {
//            person.setAge(person.getAge() + 3);
//            return person;
//        }).collect(toList());
        List<User> result = list2.stream().peek(person -> person.setAge(person.getAge() + 3)).collect(toList());
        System.out.println(Arrays.toString(list2.toArray()));
        System.out.println(Arrays.toString(result.toArray()));

        System.out.println("约归操作");
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 0, 23);
        System.out.println(nums.stream().reduce(Integer::sum));
        System.out.println(nums.stream().reduce((a, b) -> a * b));
        System.out.println(nums.stream().reduce(Integer::max));
        Map<String, User> collect = list2.stream().collect(toMap(User::getName, p -> p));
        System.out.println("年龄最大的人");
        System.out.println(list2.stream().reduce((left, now) -> left.getAge() > now.getAge() ? left : now));
    }
}
