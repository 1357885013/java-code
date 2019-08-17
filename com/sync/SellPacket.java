package com.sync;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
 * ��վ��Ʊ
 * ����---ҵ����Ʊ���������ݣ���
 * synchronized (������) {
				��Ҫ ͬ���Ĵ���	
	}
	
	�������������  ����߳�ʹ����ͬ��������ʹ�ò�ͬ���������޷���ɶ���̵߳�ͬ������
	*
	* ��������ͨ��
 */
public class SellPacket {

    public static void main(String[] args) {
        CopyOfMyWindow mWindow = new CopyOfMyWindow();

        Thread t1 = new Thread(mWindow, "С��");
        Thread t2 = new Thread(mWindow, "С��");
        Thread t3 = new Thread(mWindow, "С��");

        t1.start();
        t2.start();
        t3.start();

    }

    public static class MyWindow implements Runnable {
        static int a = 100;
        Object obj = new Object();

        //�������������this
        //��̬�����������ǵ�ǰ�����
        public static synchronized void sell() {
            if (a >= 1) {
                System.out.println(Thread.currentThread().getName() + "����" + a + "��Ʊ");
                a--;
            }
        }

        @Override
        public void run() {
            while (true) {
                if (a % 2 == 0) {
                    synchronized (this) {
                        if (a >= 1) {
                            System.out.println(Thread.currentThread().getName() + "����" + a + "��Ʊ");
                            a--;
                        }
                    }
                } else {
                    sell();
                }
            }
        }
    }

    public static class CopyOfMyWindow implements Runnable {
        static int a = 100;

        Lock l = new ReentrantLock();

        @Override
        public void run() {
            while (true) {
                try {
                    l.lock();

                    if (a >= 1) {
                        System.out.println(Thread.currentThread().getName() + "����" + a + "��Ʊ");
                        a--;
                    }
                } finally {
                    l.unlock();
                }
            }
        }
    }
}
