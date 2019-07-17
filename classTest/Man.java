package classTest;

public class Man {
    public static int count;
    public String name;
    public String sex;
    public double tall;

    public Man(String name, String sex, double d) {
        this.name = name;
        this.sex = sex;
        this.tall = d;
        this.count++;
    }

    public Man(String name, String sex) {
        this.name = name;
        this.sex = sex;
        this.count++;
    }

    public Man(String name) {
        this.name = name;
        this.count++;
    }

    public void eat() {
        System.out.println("eat");
    }

    public void sleep() {
        System.out.println("sleep");
    }
}