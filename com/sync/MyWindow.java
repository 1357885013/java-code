package com.sync;

/*
 * 卖票的业务
 */
public class MyWindow implements Runnable {
	static int a = 100;
	Object obj = new Object();
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true){
				if(a % 2 == 0){
					synchronized (this) {
						if(a >= 1){
						System.out.println(Thread.currentThread().getName()+"卖第"+a+"张票");
						a--;
						}
					}
				}else{
					sell();
				}
				
				
			}
			
		}
		
	
	
	//方法锁对象就是this
	//静态方法锁对象是当前类对象
	public static synchronized void sell(){
		if(a >= 1){
			System.out.println(Thread.currentThread().getName()+"卖第"+a+"张票");
			a--;
		}

	}
	
}
