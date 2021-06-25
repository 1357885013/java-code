package ljj.base;


import org.junit.jupiter.api.Test;

public class TestFont {
    @Test
    public void test() {
        System.out.println("\033[30;45;1m" + " title 1 " + "\033[0m");
        System.out.println("|   \033[30;44;1m" + " title 2 " + "\033[0m");
        System.out.println("|   |   \033[30;46;1m" + " title 3 " + "\033[0m");
        System.out.println("|   |   |   \033[2m" + "content 1" + "\033[0m");
        System.out.println("|   |   |   \033[1m" + "content 2" + "\033[0m");
        System.out.println("|   |   |   \033[30;1m" + "content 3" + "\033[0m");
        System.out.println("|   |   |   \033[31;2m" + "error" + "\033[0m");
        System.out.println("|   |   |   \033[31;1m" + "error title" + "\033[0m");
        System.out.println("|   |   |   \033[33;2m" + "warn" + "\033[0m");
        System.out.println("|   |   |   \033[33;1m" + "warn title" + "\033[0m");

        System.out.println();

        System.out.println("\033[0m" + "0m" + "\033[0m");
        System.out.println("\033[1m" + "1m" + "\033[0m");
        System.out.println("\033[2m" + "2m" + "\033[0m");
        System.out.println("\033[3m" + "3m" + "\033[0m");
        System.out.println("\033[4m" + "4m" + "\033[0m");
        System.out.println("\033[5m" + "5m" + "\033[0m");
        System.out.println("\033[6m" + "6m" + "\033[0m");
        System.out.println("\033[7m" + "7m" + "\033[0m");
        System.out.println("\033[8m" + "8m" + "\033[0m");
        System.out.println("\033[9m" + "9m" + "\033[0m");
        System.out.println();
        System.out.println("\033[30m30m\033[0m");
        System.out.println("\033[31m31m\033[0m");
        System.out.println("\033[32m32m\033[0m");
        System.out.println("\033[33m33m\033[0m");
        System.out.println("\033[34m34m\033[0m");
        System.out.println("\033[35m35m\033[0m");
        System.out.println("\033[36m36m\033[0m");
        System.out.println("\033[37m37m\033[0m");
        System.out.println();
        System.out.println("\033[40m" + "40m" + "\033[0m");
        System.out.println("\033[41m" + "41m" + "\033[0m");
        System.out.println("\033[42m" + "42m" + "\033[0m");
        System.out.println("\033[43m" + "43m" + "\033[0m");
        System.out.println("\033[44m" + "44m" + "\033[0m");
        System.out.println("\033[45m" + "45m" + "\033[0m");
        System.out.println("\033[46m" + "46m" + "\033[0m");
        System.out.println("\033[47m" + "47m" + "\033[0m");
        System.out.println();
        System.out.println("\033[31;4m     我滴个颜什     \033[0m     \033[32;4m     我滴个颜什     \033[0m");
        System.out.println("\033[31;4m     我滴个颜什     \033[0m     \033[32;4m     我滴个颜什     \033[0m");

    }
}
