package myCode.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * �������������������������?
 *
 *
 */
public class DaysLives {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        //�����ַ���

        SimpleDateFormat dateFormat = new SimpleDateFormat("YYYY-MM-dd");
        Date brithDay = null;
        try {
            brithDay = dateFormat.parse("1994-07-28");
        } catch (ParseException e) {
            System.out.println("e.getMessage() = " + e.getMessage());
        }
        Date now = new Date();
        System.out.println("(now.getTime()-brithDay.get) = " + (now.getTime() - brithDay.getTime()) / 1000 / 60 / 60 / 24);

    }

}
