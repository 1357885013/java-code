package com.sync;
/*
 * 车站卖票
 * 窗口---业务（卖票（共享数据））
 * 
 * 线程数据安全问题
 * 	1. 多个线程共享数据，修改数据
 *  2. 线程随机性
 *  3. 多个线程
 *  
 * 解决：java同步机制，让线程中一部分代码完整的执行，其他线程才可以抢占
 * 
 * 同步代码块格式
 * synchronized (锁对象) {
				需要 同步的代码	
	}
	
	锁对象：任意对象  多个线程使用相同的锁对象。使用不同的锁对象，无法完成多个线程的同步操作
 *
 * 同步方法
 *  
 */
public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CopyOfMyWindow mWindow = new CopyOfMyWindow();
		
		Thread t1 = new Thread(mWindow,"小王");
		Thread t2 = new Thread(mWindow,"小张");
		Thread t3 = new Thread(mWindow,"小李");
		
		
		t1.start();
		t2.start();
		t3.start();
		
		
	}

}
