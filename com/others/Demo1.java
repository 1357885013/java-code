package com.others;
/*
 * 线程的死锁现象
 * 	
 * 线程相关类
 * 	Timer
 * 
 * 	Lock
 * 
 *  线程池
 *  
 *  线程通信
 *  
 * 线程生命周期（重点）
 * 
 * ThreadLocal（本地线程）
 */
public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DeadRunnable d = new DeadRunnable();
		
		Thread babaThread = new Thread(d, "father");
		
		Thread erZiThread = new Thread(d,"son");
		
		babaThread.start();
		erZiThread.start();
	}

}
