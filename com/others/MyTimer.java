package com.others;

import java.util.Timer;
import java.util.TimerTask;

/*
 * Timer:��ʱ��
 * 
 * Timer() 
          ����һ���¼�ʱ����
 */
public class MyTimer {

	public static void main(String[] args) {

		new Timer().schedule(new TimerTask() {
			@Override
			public void run() {
				System.out.println("fds");
			}
		}, 1000, 1000);
	}

}
