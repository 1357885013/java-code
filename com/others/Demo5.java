package com.others;

public class Demo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintNumber p = new PrintNumber();
		
		new Thread(){
			public void run() {
				while(true){
					p.print1();
				}
				
			};
		}.start();
		
		new Thread(){
			public void run() {
				while(true){
				p.print2();
				}
			};
		}.start();
		
		
		new Thread(){
			public void run() {
				while(true){
				p.print3();
				}
			};
		}.start();
		
		
		new Thread(){
			public void run() {
				while(true){
				p.print4();
				}
			};
		}.start();
	}

}
