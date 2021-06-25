package myCode.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * ��������
 * 
 * String---Date
 * 
 * "2019-10-10 10:10:10"
 */
public class Demo2 {

	public static void main(String[] args) throws ParseException {
		String pattern = "yyyy��MM��dd�� HH:mm:ss:S";
		SimpleDateFormat df = new SimpleDateFormat(pattern);
		String result = df.format(1000000000000L);    //���ﴫdate���ͺ�long���С�
		System.out.println(result); //2019��07��30�� 09:00:45:860

		Date date = df.parse(result);
		System.out.println(date);//
	}

}
