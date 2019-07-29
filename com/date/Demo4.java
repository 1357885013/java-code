package com.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * 请计算你来到这个世界多少天了?
 *
 *
 */
public class Demo4 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        //日期字符串
        String birthday = "1997-07-01";

        //创建日期格式化对象
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");

        //解析日期
        Date birth;

        try {
            birth = df.parse(birthday);
            //获取当前系统时间
            Date now = new Date();

            //时间差（毫秒）
            long time = now.getTime() - birth.getTime();
            //单位换算
            int days = (int) (time / 1000 / 60 / 60 / 24);

            System.out.println(days);
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


    }

}
