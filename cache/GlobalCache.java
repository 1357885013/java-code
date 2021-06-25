package cache;



import ljj.common.User;

import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class GlobalCache {
    private static Map<String, Object> cache = new HashMap<>();
    private static Map<String, Long> cacheTime = new HashMap<>();

    public GlobalCache() {

    }

    public static Object put(String key, Object value) {
        return cache.put(key, value);
    }

    public static Object putWithTime(String key, Object value) {
        cacheTime.put(key, new Date().getTime() + 1000 * 60 * 5);
        return cache.put(key, value);
    }

    public static Object get(String key) {
        Long aLong = cacheTime.get(key);
        if (aLong != null) {
            if (new Date().getTime() > aLong) {
                cacheTime.remove(key);
                cache.remove(key);
                return null;
            } else {
                cacheTime.replace(key, new Date().getTime() + 1000 * 60 * 5);
            }
        }
        return cache.get(key);
    }

    public static Object remove(String mac) {
        clearOld();
        cacheTime.remove(mac);
        return cache.remove(mac);
    }

    public static void clearOld() {
        HashSet<String> watiForDelete = new HashSet<>();
        for (Map.Entry<String, Long> entry : cacheTime.entrySet()) {
            if (new Date().getTime() > entry.getValue()) {
                watiForDelete.add(entry.getKey());
            }
        }
        for (String each : watiForDelete) {
            cache.remove(each);
            cacheTime.remove(each);
        }
    }

    public static boolean update(Object value) {
        for (Map.Entry<String, Object> entry : cache.entrySet()) {
            if (value.equals(entry.getKey())) {
                entry.setValue(value);
                return true;
            }
        }
        return false;
    }

    public static void remove(User user) {
        for (Map.Entry<String, Object> entry : cache.entrySet()) {
            if (user.equals(entry.getValue())) {
                cache.remove(entry.getKey());
                cacheTime.remove(entry.getKey());
                return;
            }
        }
    }

    public static void print() {
        System.out.println("\\/  \\/  \\/  \\/  print GlobalCache begin  \\/  \\/  \\/  \\/");
        for (Map.Entry<String, Object> entry : cache.entrySet()) {
            if (entry.getValue() instanceof User)
                System.out.println(((User) entry.getValue()).getName());
            else
                System.out.println(entry.getValue());
        }
        System.out.println("/\\  /\\  /\\  /\\  print GlobalCache begin  /\\  /\\  /\\  /\\");
    }
}
