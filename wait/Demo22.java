package wait;

class Demo22 {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}

/*

老师｛
	姓名
	年龄

	abstract 上课();

｝


基础班老师 extends 老师


	上课(){java基础，javaweb基础}


就业班老师 extends 老师


	上课(){ssh框架...}

*/

abstract class Teacher {
    private String name;
    private int age;

    Teacher() {
    }

    Teacher(String name, int age) {
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

    abstract void teach();
}

class BasicTeacher extends Teacher {
    BasicTeacher() {
    }

    BasicTeacher(String name, int age) {
        super(name, age);
    }

    public void teach() {
        System.out.println("java基础");
    }


}
