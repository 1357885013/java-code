package com.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * �������������������������?
 *
 *
 */
public class Demo4 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        //�����ַ���
        String birthday = "1997-07-01";

        //�������ڸ�ʽ������
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");

        //��������
        Date birth;

        try {
            birth = df.parse(birthday);
            //��ȡ��ǰϵͳʱ��
            Date now = new Date();

            //ʱ�����룩
            long time = now.getTime() - birth.getTime();
            //��λ����
            int days = (int) (time / 1000 / 60 / 60 / 24);

            System.out.println(days);
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


    }

}
