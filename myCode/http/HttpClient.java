package http;

import org.apache.hc.client5.http.classic.methods.HttpGet;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.CloseableHttpResponse;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.apache.hc.core5.http.HttpEntity;
import org.apache.hc.core5.http.HttpException;
import org.apache.hc.core5.http.io.entity.EntityUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;
import java.nio.charset.StandardCharsets;

public class HttpClient {
    private static final CloseableHttpClient httpclient = HttpClients.createDefault();
    private static final HttpGet httpGet = new HttpGet("");
    private static String uri = "http://127.0.0.1:8090/api/admin/posts?more=true&admin_token=e8e7640bd61f46dfaa1027203e830a82&a=";

    public static void sendGet(int i) throws IOException {
        httpGet.setUri(URI.create(uri + i));
        // The underlying HTTP connection is still held by the response object
        // to allow the response content to be streamed directly from the network socket.
        // In order to ensure correct deallocation of system resources
        // the user MUST call CloseableHttpResponse#close() from a finally clause.
        // Please note that if response content is not fully consumed the underlying
        // connection cannot be safely re-used and will be shut down and discarded
        // by the connection manager.
        try (CloseableHttpResponse response1 = httpclient.execute(httpGet)) {
            System.out.println(response1.getCode() + " " + response1.getReasonPhrase());
            HttpEntity entity1 = response1.getEntity();
            BufferedReader reader = new BufferedReader(new InputStreamReader(entity1.getContent(), StandardCharsets.UTF_8));

            String line;
            while ((line = reader.readLine()) != null)
                System.out.println(line);

            // do something useful with the response body
            // and ensure it is fully consumed
            EntityUtils.consume(entity1);
        }

//            HttpPost httpPost = new HttpPost("http://httpbin.org/post");
//            List<NameValuePair> nvps = new ArrayList<>();
//            nvps.add(new BasicNameValuePair("username", "vip"));
//            nvps.add(new BasicNameValuePair("password", "secret"));
//            httpPost.setEntity(new UrlEncodedFormEntity(nvps));
//
//            try (CloseableHttpResponse response2 = httpclient.execute(httpPost)) {
//                System.out.println(response2.getCode() + " " + response2.getReasonPhrase());
//                HttpEntity entity2 = response2.getEntity();
//                // do something useful with the response body
//                // and ensure it is fully consumed
//                EntityUtils.consume(entity2);
//            }
    }

    public static void main(String[] args) throws HttpException, IOException {
        for (int i = 0; i < 1000; i++) {
            System.out.println(i);
            sendGet(i);
        }
    }
}

