package com.others;

import java.util.Timer;
import java.util.TimerTask;

/*
 * Timer:定时器
 * 
 * Timer() 
          创建一个新计时器。
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
