package com.others;

import java.util.Timer;
import java.util.TimerTask;

/*
 * Timer:��ʱ��
 * 
 * Timer() 
          ����һ���¼�ʱ����
 */
public class Demo2 {

	public static void main(String[] args) {

		Timer t = new Timer();
		t.schedule(new TimerTask() {
			@Override
			public void run() {
				System.out.println("fuck you !");
			}
		}, 1200l,2000);



		
		
		
	}

}
