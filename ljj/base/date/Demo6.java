package myCode.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/*
 * ��λ��������ݶ����ж����죿
 * 
 * 1. ��λʱ�䵽����3��1��
 * 2. ����һ��
 * 3. ��ȡ��ǰ�Ǽ���
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
