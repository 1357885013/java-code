package myCode.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/*
 * 如何获得任意年份二月有多少天？
 * 
 * 1. 定位时间到该年3月1号
 * 2. 后退一天
 * 3. 获取当前是几号
 * 
 */
public class Demo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar time = Calendar.getInstance();

		time.set(1998,2,1);
		time.add(Calendar.DAY_OF_MONTH,-1);

		SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd");
		System.out.println("dateFormat = " + dateFormat.format(time.getTime()));
	}
}
