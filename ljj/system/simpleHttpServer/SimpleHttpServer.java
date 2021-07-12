package ljj.system.simpleHttpServer;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class SimpleHttpServer {
    public static File FileRoot = new File("C:\\Users\\ljj\\Documents\\★ WorkSpace\\MY\\java-code\\ljj\\system\\simpleHttpServer\\");

    public static void main(String[] args) {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(200, 200, 3000, TimeUnit.SECONDS, new ArrayBlockingQueue<Runnable>(100));

        try (ServerSocket serverSocket = new ServerSocket(80)) {
            Socket socket;
            while ((socket = serverSocket.accept()) != null) {
                // 延时
//                System.out.println(socket.getInputStream().available());
//                System.out.println(socket.getInputStream().available());
//                System.out.println(socket.getInputStream().available());

                // chrome 由于插件存在,会发送两个请求,一个是空. 所以看可读取内容长度, 是0就丢弃. 正常请求刚连接是可读取内容长度也是0 .
                // 直接看available 会在没内容发过来时关闭连接.
                // todo: 读不到url就直接返回错误. 不在这里判断
//                if (socket.getInputStream().available() != 0) {
                    System.out.println("提交任务 : " + socket);
                    executor.execute(new HttpRequestHandler(socket));
//                } else {
//                    socket.close();
//                    System.out.println("丢弃空请求 : " + socket);
//                }
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
            try {
                System.out.println(Thread.currentThread().getName() + "  " + socket);
                InputStream input = socket.getInputStream(); //获得套接字输入流
                OutputStream output = socket.getOutputStream(); //获得套接字输出流
                Request request = new Request(input);
                request.parse();
                Response response = new Response(output, request);
                response.sendResource();
                socket.close();
                this.socket = null;
            } catch (IOException e) {
                e.printStackTrace();
                System.exit(1);
            }
        }
    }
}
