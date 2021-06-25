package ljj.base.collection;

import ljj.common.User;

import java.util.Comparator;
import java.util.TreeSet;

public class MyTreeSet {

    public static void main(String[] args) {
        // TreeSet 含有set的所有方法。
        TreeSet<User> set = new TreeSet<User>(
                new Comparator<User>() {
                    @Override
                    public int compare(User o1, User o2) {  //参数按插入顺序传入，若返回值>0，就交换顺序。
                        int result = 0;
                        result = ((User) o1).getAge() - ((User) o2).getAge();
                        if (result == 0) {
                            result = ((User) o1).getName().compareTo(((User) o2).getName());
                        }
                        return result;
                    }
                }
        );

        set.add(new User("a", 30));
        set.add(new User("c", 40));
        set.add(new User("d", 50));
        set.add(new User("b", 60));
        set.add(new User("f", 70));
        set.add(new User("ea", 30));
        set.add(new User("eb", 30));

        System.out.println(set);

        System.out.println("set.first() = " + set.first());
        System.out.println("set.last() = " + set.last());
        System.out.println(set);
        System.out.println("set.higher(new User(\"dddd\",20)) = " + set.higher(new User("d", 50)));
        System.out.println("set.lower(new User(\"dddd\",20)) = " + set.lower(new User("d", 50)));
        System.out.println("set.pollFirst() = " + set.pollFirst());
        System.out.println("set.pollLast() = " + set.pollLast());

        System.out.println(set);

        System.out.println("set.ceiling(new User(\"d\", 50)) = " + set.ceiling(new User("d", 50)));
        System.out.println("set.floor(new User(\"d\", 50)) = " + set.floor(new User("d", 50)));

        for (Object o : set) {
            System.out.println(o);
        }
    }

}
