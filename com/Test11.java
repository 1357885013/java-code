package com;

import org.junit.jupiter.api.Test;

public class Test11 {
    @Test
    public void test() {
        System.out.println(11 - 1 >> 1);
        System.out.println(10 - 1 >> 1);
        System.out.println(1024 >> 1);
        System.out.println(1024 >> 2);
        System.out.println(1024 << 1);
        System.out.println(1024 << 2);
    }

    @Test
    public void test2() {
        int[] a = new int[]{1, 2, 3, 4};
        System.out.println("a.getClass().getTypeName() = " + a.getClass().getTypeName());
    }
}