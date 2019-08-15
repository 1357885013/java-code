package com.sync;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
 * 卖票的业务
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
                    System.out.println(Thread.currentThread().getName() + "卖第" + a + "张票");
                    a--;
                }
            } finally {
                l.unlock();
            }


        }
    }


}
			
		
	

