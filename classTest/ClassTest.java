package classTest;

public class ClassTest {

    public static void main(String[] arg) {
        Man man1 = new Man("name1", "male", 1.7);
        Man man2 = new Man("name2");
        System.out.println(Man.count);
        man1.eat();
    }

}
	

