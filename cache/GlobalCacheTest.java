package cache;

import ljj.common.User;
import org.junit.jupiter.api.Test;

public class GlobalCacheTest {
    @Test
    public void test() {
        User user1 = new User();
        user1.setName("111");
        User user2 = new User();
        user2.setName("222");
        User user3 = new User();
        user3.setName("333");
        User user4 = new User();
        user4.setName("444");

        GlobalCache.remove("111111");
        GlobalCache.put("111111", user1);
        GlobalCache.put("111111", user1);
        GlobalCache.remove("111111");
        GlobalCache.put("111111", user1);

        GlobalCache.print();
        GlobalCache.update(user1);
        GlobalCache.print();
        GlobalCache.put("222222", user2);
        GlobalCache.put("333333", user3);
        GlobalCache.put("444444", user4);
        System.out.println("get(111) "+((User)GlobalCache.get("111111")).getName());
        System.out.println("get(null) "+GlobalCache.get(null));

        GlobalCache.print();
        GlobalCache.remove("111111");
        GlobalCache.print();
        GlobalCache.remove("222222");
        GlobalCache.remove("333333");
        GlobalCache.remove("444444");
        GlobalCache.print();
    }

}
