package com.set;

public class Person /*implements Comparable*/ {
    String name;
    int age;

    public Person() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Person(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "name=" + name + " age" + age;
    }


    public int compareTo(Object o) {
        // TODO Auto-generated method stub
        //强转
        Person p = (Person) o;

        int result = 0;
        result = this.age - p.age;

        if (result == 0) {
            result = this.name.compareTo(p.name);
        }

        return result;
    }

//	 * 对象内容相同：哈希吗值肯定一样
//	 *
//	 * 哈希值不一样：对象内容肯定不同
//	 * 哈希值相同，不能说明对象内容一定相同
//	 *
//	 *
//	 * hashCode不一样，用来判断元素不同
//	 * 但是不能判断元素相同。

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + age;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }


    //用来判断元素相同
    @Override
    public boolean equals(Object obj) {
        System.out.println("=-=-===");
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
