package myCode.sync;
/*
 * �̵߳���������
 *
 * �߳������
 * 	Timer
 *
 * 	Lock
 *
 *  �̳߳�
 *
 *  �߳�ͨ��
 *
 * �߳��������ڣ��ص㣩
 *
 * ThreadLocal�������̣߳�
 */
public class DeadRunable {

	public static void main(String[] args) {
		DeadRunnable d = new DeadRunnable();

		Thread babaThread = new Thread(d, "father");

		Thread erZiThread = new Thread(d,"son");

		babaThread.start();
		erZiThread.start();
	}
	static class DeadRunnable implements Runnable {
		//��Դ
		private String page = "���Ծ�";
		private String toy = "���";


		@Override
		public void run() {
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
					}
				}
			}

		}
	}
}

