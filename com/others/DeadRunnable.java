package com.others;

public class DeadRunnable implements Runnable {
    //��Դ
    private String page = "���Ծ�";
    private String toy = "���";


    @Override
    public void run() {
        // TODO Auto-generated method stub
        if (Thread.currentThread().getName().equals("father")) {
            synchronized (toy) {
                System.out.println("�ְ֣�������ߣ���Ҫ�Ծ�");
                synchronized (page) {
                    System.out.println("�ְ֣������˿��Ծ�");
                }
            }
        } else if (Thread.currentThread().getName().equals("son")) {
            synchronized (page) {
                System.out.println("����:�����Ծ���Ҫ���");
                synchronized (toy) {
                    System.out.println("���ӣ����������");
                    //}
                }
            }
        }

    }
}
