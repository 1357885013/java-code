package com.others;
/*
 * �߳�ͨ��
 * 
 * ������������
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
