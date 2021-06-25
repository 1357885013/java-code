package myCode.classTest;

class TestExtend {
    public static void main(String[] args) {
        Student s = new Student("jack", 10, 0x15);
        System.out.println(s.getName() + "  " + s.getAge() + "  " + s.getSno() + s.t);
        s.study();
        s.eat1();
    }
}

class Person {
    public static String t = "fd";
    private String name;
    private int age;

    Person() {
    }

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void eat1() {
        System.out.println("吃饭~~！！");
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

    public void eat() {
        System.out.println("吃饭~~！！");
    }

    public void eat(String s) {
        System.out.println("吃饭~~！！");
    }
}

class Student extends Person {

    private int sno;

    Student() {
        super();
        //this("jack",20);//extend.java:94: 错误: 对this的调用必须是构造器中的第一个语句
    }

    Student(String name, int age, int sno) {
        super(name, age);//extend.java:99: 错误: 对super的调用必须是构造器中的第一个语句
        this.sno = sno;
    }

    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    public void study() {
        System.out.println("好好学习，天天向上");
    }

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void eat(String s) {
        super.eat();
    }
}
