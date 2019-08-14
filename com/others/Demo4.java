package com.others;
/*
 * 线程通信
 * 
 * 生产者消费者
 * 
 * 
 */
public class Demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p = new Product();
		
		new Thread(){
			@Override
			public void run() {
				while(true){
					p.sell();
				}
			}
		
		}.start();
		
		
		new Thread(){
			@Override
			public void run() {
				while(true){
					p.product();
				}
			}
			
		}.start();
	}

}
