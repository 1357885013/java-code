package ljj.system.simpleHttpServer;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class MySimpleHttpServer {
    public static File FileRoot = new File("C:\\Users\\ljj\\Documents\\★ WorkSpace\\MY\\java-code\\ljj\\system\\simpleHttpServer");

    public static void main(String[] args) {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(20, 100, 3000, TimeUnit.SECONDS, new ArrayBlockingQueue<Runnable>(100));

        try (ServerSocket serverSocket = new ServerSocket(80)) {
            Socket socket;
            while ((socket = serverSocket.accept()) != null) {
                executor.execute(new HttpRequestHandler(socket));
            }
        } catch (IOException e) {
            System.out.println("监听80失败");
            e.printStackTrace();
        }
    }

    static class HttpRequestHandler implements Runnable {
        private Socket socket;

        public HttpRequestHandler(Socket socket) {
            this.socket = socket;
        }

        @Override
        public void run() {
            try (PrintWriter out = new PrintWriter(socket.getOutputStream());
                 BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));) {

                String line;

                // 大BUG , 会一直等待, 这是一个阻塞方法, 会等到有输入为止, 所以为死循环.   会阻塞在 private native int socketRead0(FileDescriptor fd,
                //                                   byte b[], int off, int len,
                //                                   int timeout)
                socket.shutdownInput();
                while ((line = in.readLine()) != null) {
                    System.out.println(line);
                }

                socket.setKeepAlive(false);
//                BufferedWriter out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
//                out.println("HTTP/1.1 200 OK");
//                out.println("Server: Molly");
//                out.println("Content-Type: text");
//                out.println("Content-length: 1");
//                out.println("");
//                out.println("hello");
//                out.flush();
//                out.flush();
//                out.flush();
                String errorMessage = "HTTP/1.1 404 File Not Found \r\n"
                        + "Content-Type: text/html \r\n"
                        + "Content-Length: 23 \r\n"
                        + "\r\n"
                        + "<h1>File Not Found</h1>";
                System.out.println(errorMessage);
                socket.getOutputStream().write(errorMessage.getBytes());

                socket.getOutputStream().close();
                out.close();
                in.close();
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

