package com.sync;
/*
 * ��վ��Ʊ
 * ����---ҵ����Ʊ���������ݣ���
 * 
 * �߳����ݰ�ȫ����
 * 	1. ����̹߳������ݣ��޸�����
 *  2. �߳������
 *  3. ����߳�
 *  
 * �����javaͬ�����ƣ����߳���һ���ִ���������ִ�У������̲߳ſ�����ռ
 * 
 * ͬ��������ʽ
 * synchronized (������) {
				��Ҫ ͬ���Ĵ���	
	}
	
	�������������  ����߳�ʹ����ͬ��������ʹ�ò�ͬ���������޷���ɶ���̵߳�ͬ������
 *
 * ͬ������
 *  
 */
public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CopyOfMyWindow mWindow = new CopyOfMyWindow();
		
		Thread t1 = new Thread(mWindow,"С��");
		Thread t2 = new Thread(mWindow,"С��");
		Thread t3 = new Thread(mWindow,"С��");
		
		
		t1.start();
		t2.start();
		t3.start();
		
		
	}

}
