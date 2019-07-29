package com.basic;

public class MatnApi {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int a = Math.abs(-100);
        System.out.println(a);

        double d = Math.ceil(3.4);
        System.out.println((int) d);


        double d2 = Math.floor(3.4);
        System.out.println(d2);

        double d3 = Math.nextUp(3.4);
        System.out.println(d3);

        d3 = Math.nextDown(3.4);
        System.out.println(d3);

        d3 = Math.nextAfter(3.4, 1);
        System.out.println(d3);

        d3 = Math.nextAfter(3.4, -1);
        System.out.println(d3);

        d3 = Math.rint(2.5);
        System.out.println(d3);
 d3 = Math.rint(2.2);
        System.out.println(d3);
 d3 = Math.rint(2.7);
        System.out.println(d3);
        d3 = Math.rint(3.5);
        System.out.println(d3);




    }

}
