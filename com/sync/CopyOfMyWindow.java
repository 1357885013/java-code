package com.sync;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
 * ��Ʊ��ҵ��
 */
public class CopyOfMyWindow implements Runnable {
    static int a = 100;

    Lock l = new ReentrantLock();

    @Override
    public void run() {
        // TODO Auto-generated method stub
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
			
		
	

