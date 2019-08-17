package com.sync;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
 * 车站卖票
 * 窗口---业务（卖票（共享数据））
 * synchronized (锁对象) {
				需要 同步的代码	
	}
	
	锁对象：任意对象  多个线程使用相同的锁对象。使用不同的锁对象，无法完成多个线程的同步操作
	*
	* 这俩可以通用
 */
public class SellPacket {

    public static void main(String[] args) {
        CopyOfMyWindow mWindow = new CopyOfMyWindow();

        Thread t1 = new Thread(mWindow, "小王");
        Thread t2 = new Thread(mWindow, "小张");
        Thread t3 = new Thread(mWindow, "小李");

        t1.start();
        t2.start();
        t3.start();

    }

    public static class MyWindow implements Runnable {
        static int a = 100;
        Object obj = new Object();

        //方法锁对象就是this
        //静态方法锁对象是当前类对象
        public static synchronized void sell() {
            if (a >= 1) {
                System.out.println(Thread.currentThread().getName() + "卖第" + a + "张票");
                a--;
            }
        }

        @Override
        public void run() {
            while (true) {
                if (a % 2 == 0) {
                    synchronized (this) {
                        if (a >= 1) {
                            System.out.println(Thread.currentThread().getName() + "卖第" + a + "张票");
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
                        System.out.println(Thread.currentThread().getName() + "卖第" + a + "张票");
                        a--;
                    }
                } finally {
                    l.unlock();
                }
            }
        }
    }
}
