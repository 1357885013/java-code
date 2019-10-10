package myCode.classTest;

public class Man {
    public static int count;
    public String name;
    private String sex;
    private double tall;

    public Man(String name, String sex, double d) {
        this.name = name;
        this.sex = sex;
        this.tall = d;
        count++;
    }

    public Man(String name, String sex) {
        this.name = name;
        this.sex = sex;
        count++;
    }

    public Man(String name) {
        this.name = name;
        count++;
    }

    public void eat() {
        System.out.println("eat");
    }

    public void sleep() {
        System.out.println("sleep");
    }
}