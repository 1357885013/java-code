package com.sync;

/*
 * ��Ʊ��ҵ��
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
						System.out.println(Thread.currentThread().getName()+"����"+a+"��Ʊ");
						a--;
						}
					}
				}else{
					sell();
				}
				
				
			}
			
		}
		
	
	
	//�������������this
	//��̬�����������ǵ�ǰ�����
	public static synchronized void sell(){
		if(a >= 1){
			System.out.println(Thread.currentThread().getName()+"����"+a+"��Ʊ");
			a--;
		}

	}
	
}
