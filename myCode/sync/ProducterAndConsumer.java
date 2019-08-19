package myCode.sync;

/*
 * 线程通信
 *
 * 生产者消费者
 *
 *
 */
public class ProducterAndConsumer {

    public static void main(String[] args) {
        Product p = new Product();

        new Thread(() -> {
            while (true) {
                p.sell();
            }
        }).start();

        new Thread(() -> {
            while (true) {
                p.product();
            }
        }).start();
    }

    public static class Product {
        Object o = new Object();
        private int num = 10;//数量不能超过10

        public void product() {
            synchronized (o) {
                if (num == 10) {
                    //线程等待
                    try {
                        o.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    num++;
                    System.out.println("生产者：生产" + num + "号商品");
                    o.notify();//唤醒消费者线程
                }
            }
        }

        public void sell() {
            synchronized (o) {
                if (num == 0) {
                    try {
                        o.wait();//当前线程等待
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    System.out.println("消费者：消费" + num + "号商品");
                    num--;

                    o.notify();//唤醒生产者线程
                }

            }
        }
    }

}
