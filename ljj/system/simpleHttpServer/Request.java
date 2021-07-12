package ljj.system.simpleHttpServer;

import java.io.IOException;
import java.io.InputStream;

public class Request {
    private InputStream input;
    private String uri = null;

    public Request(InputStream input) {
        this.input = input;
    }

    public void parse() {               //uri分析
        StringBuffer request = new StringBuffer(2);
        int i;
        byte[] buffer = new byte[2];
        int total;
        try {
            // 获取流里还有效的数量
            total = input.available();
            // 如果为空要等一下, 有可能发的慢.
//            if(total==0)
//                Thread.sleep(300);
            while (total > 0) {
                i = input.read(buffer);
                total = input.available();
                for (int j = 0; j < i; j++) {
                    request.append((char) buffer[j]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            i = -1;
        }
//        catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        System.out.print(request);

        uri = parseUri(request.toString());
    }

    private String parseUri(String requestString) {
        int index1, index2;
        index1 = requestString.indexOf(' ');
        //POST //examples/default.jsp HTTP/1.1
        if (index1 != -1) {
            index2 = requestString.indexOf(' ', index1 + 1); //从第一个空格开始，寻找到最后一个空格为止
            if (index2 > index1)
                return requestString.substring(index1 + 1, index2); //返回等同一个文件目录
        }
        return null;
    }

    public String getUri() {
        return uri;
    }
}
