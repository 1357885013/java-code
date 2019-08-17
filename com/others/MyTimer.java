package com.others;

import java.util.Timer;
import java.util.TimerTask;

/*
 * Timer:定时器
 * 
 * Timer() 
          创建一个新计时器。
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
