package ljj.base.threads;

import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;

public class Piped {
    public static void main(String[] args) throws IOException {
        PipedWriter writer = new PipedWriter();
        PipedReader reader = new PipedReader();
        // 将输入输出管道进行绑定,否则会排除IOException异常
        writer.connect(reader);

        new Thread(new Print(reader), "print").start();

        // 往管道里写内容
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
                // 从管道里读取内容并输出.
                while ((receive = reader.read()) != -1) {
                    System.out.print((char) receive);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
