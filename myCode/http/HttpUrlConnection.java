//package http;
//import java.net.HttpURLConnection;
//import java.net.URI;
//
//import org.apache.http.HttpResponse;
//import org.apache.http.HttpStatus;
//import org.apache.http.client.methods.HttpGet;
//import org.apache.http.client.methods.HttpPost;
//import org.apache.http.client.utils.URIBuilder;
//import org.apache.http.entity.StringEntity;
//import org.apache.http.impl.client.CloseableHttpClient;
//import org.apache.http.impl.client.DefaultHttpClient;
//import org.apache.http.impl.client.HttpClients;
//import org.apache.http.util.EntityUtils;
//
//public class HttpUrlConnection {
//
//    public static String getHttpData(String host, String servUri, String reString) throws Exception {
//        StringBuffer sb = new StringBuffer();
//        sb.append("getHttpData:host:" + host + ",servUri:" + servUri + ",reString:" + reString);
//        String strResp = null;
//        try {
//            URI uri = new URIBuilder().setScheme("http").setHost(host).setPath(servUri)
//                    .setParameter("strInfo", reString).build();
//            HttpGet httpGet = new HttpGet(uri);
//            CloseableHttpClient client3 = HttpClients.createDefault();
//            HttpResponse resp;
//            resp = client3.execute(httpGet);
//            if (resp.getStatusLine().getStatusCode() == HttpURLConnection.HTTP_OK) {
//                strResp = EntityUtils.toString(resp.getEntity());
//                logger.info("the return result:{}", strResp);
//            } else {
//                logger.info("Error Response:", resp.getStatusLine().toString());
//                throw new CommonBusinessException(CommonConstants.TASK_RELEASE_WCF,
//                        CommonConstants.TASK_RELEASE_WCF_DESC);
//            }
//        } catch (Exception e) {
//            logger.error(sb.toString() + ":" + e.getMessage(), e.getCause());
//            throw new CommonBusinessException(CommonConstants.TASK_RELEASE_WCF, CommonConstants.TASK_RELEASE_WCF_DESC);
//        }
//        return strResp;
//    }
//
//}
