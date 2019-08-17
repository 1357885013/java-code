package com.sync;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ConcurrentPriABCInOrder {
    /*
    �����߳��������ABC��������bug��Ϊ��չ��signal()�Ĳ������������ԣ�����signal()ִ��ʱû���߳���wait�ͻ�ֱ��ִ����һ�䣬�͵�ʲôҲû������
    �����������һ��int���ͱ�ʶ������Ǹ���
     */
    public static void main(String[] args) {
//        PrintNumber p = new Demo5.PrintNumber();     //bug �㷨
        PrintNumberB p = new ConcurrentPriABCInOrder.PrintNumberB();    //23 46776     ��ȷ�㷨
//        PrintNumberC p = new Demo5.PrintNumberC();    //33 42672   �������㷨  ����conditionҲ��ʵ�֣�ֻ����cpuռ�ýϸߡ�

        new Thread(() -> {
            while (true) {
                p.funA();
            }
        }).start();

        new Thread(() -> {
            while (true) {
                p.funB();
            }
        }).start();

        new Thread(() -> {
            while (true) {
                p.funC();
            }
        }).start();
//        p.lock.lock();
//        try {
//            p.a.signal();
//        } finally {
//            p.lock.unlock();
//        }
    }


    final static class PrintNumber {

        Lock lock = new ReentrantLock();
        int ca = 0, cb = 0, cc = 0;
        Condition a = lock.newCondition();
        Condition b = lock.newCondition();
        Condition c = lock.newCondition();

        public void funA() {
            try {
                lock.lock();
                a.await();
                System.out.println(ca++ + "  A");
                b.signal();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }

        public void funB() {
            try {
                lock.lock();
                b.await();
                System.out.println(cb++ + "  B");
                c.signal();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }

        public void funC() {
            try {
                lock.lock();
                c.await();
                System.out.println(cc++ + "  C");
                a.signal();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }
    }

    static class PrintNumberB {
        Lock lock = new ReentrantLock();

        Condition A = lock.newCondition();
        Condition B = lock.newCondition();
        Condition C = lock.newCondition();
        Condition D = lock.newCondition();

        int i = 1;

        public void funA() {

            lock.lock();
            try {
                if (i == 1) {
                    System.out.println("1");
                    i++;
                    //����2
                    B.signal();
                } else {
                    try {
                        A.await();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

            } finally {
                lock.unlock();
            }

        }


        public void funB() {
            lock.lock();
            try {
                if (i == 2) {
                    System.out.println("2");
                    i++;
                    C.signal();
                } else {
                    try {
                        B.await();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

            } finally {
                lock.unlock();
            }
        }


        public void funC() {
            lock.lock();
            try {
                if (i == 3) {
                    System.out.println("3");
                    i = 1;
                    A.signal();
                } else {
                    try {
                        C.await();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

            } finally {
                lock.unlock();
            }
        }
    }

    static class PrintNumberC {
        Lock lock = new ReentrantLock();

        int i = 1;

        public void funA() {

            lock.lock();
            try {
                if (i == 1) {
                    System.out.println("1");
                    i++;
                }
            } finally {
                lock.unlock();
            }
        }


        public void funB() {
            lock.lock();
            try {
                if (i == 2) {
                    System.out.println("2");
                    i++;
                }
            } finally {
                lock.unlock();
            }
        }


        public void funC() {
            lock.lock();
            try {
                if (i == 3) {
                    System.out.println("3");
                    i = 1;
                }
            } finally {
                lock.unlock();
            }
        }
    }
}
