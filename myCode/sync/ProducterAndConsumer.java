package myCode.sync;

/*
 * �߳�ͨ��
 *
 * ������������
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
        private int num = 10;//�������ܳ���10

        public void product() {
            synchronized (o) {
                if (num == 10) {
                    //�̵߳ȴ�
                    try {
                        o.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    num++;
                    System.out.println("�����ߣ�����" + num + "����Ʒ");
                    o.notify();//�����������߳�
                }
            }
        }

        public void sell() {
            synchronized (o) {
                if (num == 0) {
                    try {
                        o.wait();//��ǰ�̵߳ȴ�
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    System.out.println("�����ߣ�����" + num + "����Ʒ");
                    num--;

                    o.notify();//�����������߳�
                }

            }
        }
    }

}
