package com.others;
/*
 * ��Ʒ��
 */
public class Product {
	private int num = 10;//�������ܳ���10
	
	Object o = new Object();
	
	public void product(){
		synchronized (o) {
			if(num == 10){
				//�̵߳ȴ�
				try {
					o.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}else{
				num++;
				System.out.println("�����ߣ�����"+num+"����Ʒ");
				o.notify();//�����������߳�
			}
			
		}
	}
	
	
	public void sell(){
		synchronized (o) {
			if(num == 0){
				try {
					o.wait();//��ǰ�̵߳ȴ�
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}else{
				System.out.println("�����ߣ�����"+num+"����Ʒ");
				num--;
				
				o.notify();//�����������߳�
			}
			
		}
	}
}
