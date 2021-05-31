package myCode;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class RandomUtil {
    private static Random random = new Random();
    /**
     * ×ó±ÕÓÒ±Õ
     */
    static int nextInt(int begin, int end) {
        return random.nextInt(end - begin + 1) + begin;
    }

    public static void main(String[] args) {
        Set<Integer> result = new TreeSet<>();
        int i = 300;
        while(i-- >0){
            result.add(RandomUtil.nextInt(0,9));
        }
        result.forEach(System.out::println);
        System.out.println("count:"+result.size());
    }
}
