package myCode.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * 解析日期
 * 
 * String---Date
 * 
 * "2019-10-10 10:10:10"
 */
public class Demo2 {

	public static void main(String[] args) throws ParseException {
		String pattern = "yyyy年MM月dd日 HH:mm:ss:S";
		SimpleDateFormat df = new SimpleDateFormat(pattern);
		String result = df.format(1000000000000L);    //这里传date类型和long都行。
		System.out.println(result); //2019年07月30日 09:00:45:860

		Date date = df.parse(result);
		System.out.println(date);//
	}

}
