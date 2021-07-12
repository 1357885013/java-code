package ljj.base.threads;

import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;

public class Piped {
    public static void main(String[] args) throws IOException {
        PipedWriter writer = new PipedWriter();
        PipedReader reader = new PipedReader();
        // ����������ܵ����а�,������ų�IOException�쳣
        writer.connect(reader);

        new Thread(new Print(reader), "print").start();

        // ���ܵ���д����
        int receive;
        while ((receive = System.in.read()) != -1)
            writer.write(receive);
    }

    private static class Print implements Runnable {
        private static PipedReader reader;

        Print(PipedReader reader) {
            this.reader = reader;
        }

        @Override
        public void run() {
            int receive;
            try {
                // �ӹܵ����ȡ���ݲ����.
                while ((receive = reader.read()) != -1) {
                    System.out.print((char) receive);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
