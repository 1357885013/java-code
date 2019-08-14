package com.others;

public class DeadRunnable implements Runnable {
    //资源
    private String page = "考试卷";
    private String toy = "玩具";


    @Override
    public void run() {
        // TODO Auto-generated method stub
        if (Thread.currentThread().getName().equals("father")) {
            synchronized (toy) {
                System.out.println("爸爸：我有玩具，想要试卷");
                synchronized (page) {
                    System.out.println("爸爸：我有了考试卷");
                }
            }
        } else if (Thread.currentThread().getName().equals("son")) {
            synchronized (page) {
                System.out.println("儿子:我有试卷，想要玩具");
                synchronized (toy) {
                    System.out.println("儿子：我有了玩具");
                    //}
                }
            }
        }

    }
}
