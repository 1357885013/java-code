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
        //ǿת
        Person p = (Person) o;

        int result = 0;
        result = this.age - p.age;

        if (result == 0) {
            result = this.name.compareTo(p.name);
        }

        return result;
    }

//	 * ����������ͬ����ϣ��ֵ�϶�һ��
//	 *
//	 * ��ϣֵ��һ�����������ݿ϶���ͬ
//	 * ��ϣֵ��ͬ������˵����������һ����ͬ
//	 *
//	 *
//	 * hashCode��һ���������ж�Ԫ�ز�ͬ
//	 * ���ǲ����ж�Ԫ����ͬ��

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + age;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }


    //�����ж�Ԫ����ͬ
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
