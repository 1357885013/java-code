package classTest;

class extend {
    public static void main(String[] args) {
        Student s = new Student("jack", 10, 0x15);
        System.out.println(s.getName() + "  " + s.getAge() + "  " + s.getSno() + s.t);
        s.study();
        s.eat1();
    }
}

class Person {
    public static String t = "fd";
    //��Ա����
    private String name;
    private int age;

    //���췽��
    Person() {

    }

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void eat1() {

        System.out.println("�Է�~~����");
    }

    public String getName() {
        return name;
    }

    //set��get����
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //��Ա����
    public void eat() {
        System.out.println("�Է�~~����");
    }

    public void eat(String s) {
        System.out.println("�Է�~~����");
    }

}

class Student extends Person {
    //��Ա����
    private int sno;


    //���췽��
    Student() {
        super();
        //this("jack",20);//extend.java:94: ����: ��this�ĵ��ñ����ǹ������еĵ�һ�����
    }


    Student(String name, int age, int sno) {

        super(name, age);//extend.java:99: ����: ��super�ĵ��ñ����ǹ������еĵ�һ�����
        this.sno = sno;

    }

    public int getSno() {
        return sno;
    }

    //set��get����
    public void setSno(int sno) {
        this.sno = sno;
    }

    //��Ա����
    public void study() {
        System.out.println("�ú�ѧϰ����������");
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


