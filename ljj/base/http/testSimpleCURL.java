package http;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class testSimpleCURL {
    private static ProcessBuilder process = new ProcessBuilder();

    public static void main(String[] args) {

        String[] cmds = {"curl", "https://www.baidu.com"};//必须分开写，不能有空格
        for (int i = 0; i < 1000; i++) {
            cmds = "curl -X GET \"http://127.0.0.1:8090/api/admin/posts?more=true&admin_token=e8e7640bd61f46dfaa1027203e830a82\" -H \"accept: */*\" -H \"ADMIN-Authorization: e8e7640bd61f46dfaa1027203e830a82\"".split(" ");
            System.out.println(i);
            execCurl(cmds);
        }
    }

    //这里执行cmds命令
    public static void execCurl(String[] cmds) {
        process.command(cmds);
        Process p;
        try {
            p = process.start();
            BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream(), StandardCharsets.UTF_8));
//            StringBuilder builder = new StringBuilder();
            String line = null;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
//                builder.append(line);
//                builder.append(System.getProperty("line.separator"));
            }
//            return builder.toString();

        } catch (IOException e) {
            System.out.print("error");
            e.printStackTrace();
        }
//        return null;
    }
}