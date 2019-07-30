package com.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/*
 * 获取昨天的这个时刻
 *
 */
public class Demo5 {

    public static void main(String[] args) {
        Calendar time = Calendar.getInstance();
        time.add(Calendar.DAY_OF_MONTH,-1);
        SimpleDateFormat dateFormat=new SimpleDateFormat("YYYY-MM-dd  HH:mm:ss:SS");
        System.out.println("dateFormat.format(time.getTime()) = " + dateFormat.format(time.getTime()));

    }
}