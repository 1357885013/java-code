package com.others;
/*
 * �̵߳���������
 * 	
 * �߳������
 * 	Timer
 * 
 * 	Lock
 * 
 *  �̳߳�
 *  
 *  �߳�ͨ��
 *  
 * �߳��������ڣ��ص㣩
 * 
 * ThreadLocal�������̣߳�
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
