package com.example.clouds;

import com.alibaba.fastjson.JSON;
import com.example.common.model.request.server2.TestRequest;
import java.nio.charset.Charset;
import org.apache.commons.io.IOUtils;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHeaders;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.entity.mime.content.StringBody;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

/**
 * @author Liq
 * @date 2019/9/12
 */
public class Tests {

    static final String RZSJ_URL = "http://localhost:33000/server2/con8";

    public static String sendLogs(String xtid,String logsXml) throws Exception {
        String result=null;
        CloseableHttpClient httpclient = HttpClients.createDefault();
        try {
            HttpPost httppost = new HttpPost(RZSJ_URL);

            HttpEntity reqEntity = MultipartEntityBuilder
                .create()
                .addPart("name",new StringBody(xtid, ContentType.APPLICATION_JSON))
                .addPart("age", new StringBody(logsXml, ContentType.APPLICATION_JSON))
                .build();
            httppost.setEntity(reqEntity);
            CloseableHttpResponse response = httpclient.execute(httppost);
            try {
                HttpEntity resEntity = response.getEntity();
                if (resEntity != null) {
                    result = IOUtils.toString(resEntity.getContent(),"utf-8")    ;
                    System.out.println("返回结果:"+result);
                }
                EntityUtils.consume(resEntity);
                return result;
            } finally {
                response.close();
            }
        } finally {
            httpclient.close();
        }
    }



    public static String videoPost(String cookie, String json) {
        String url = "http://localhost:33000/server2/con3";
        HttpPost httpPost = new HttpPost(url);
        httpPost.addHeader(HttpHeaders.ACCEPT, ContentType.APPLICATION_JSON.toString());
        httpPost.addHeader(HttpHeaders.CONTENT_TYPE, ContentType.APPLICATION_JSON.toString());
        httpPost.setEntity(new StringEntity(json, Charset.forName("utf-8")));
        CloseableHttpClient httpclient = HttpClients.createDefault();
        try {
            CloseableHttpResponse response = httpclient.execute(httpPost);
            return EntityUtils.toString(response.getEntity());
        } catch (Exception e) {

        }
        return "";

    }








    public static void main(String[] args) throws Exception {
//        分配的xtid
        String xtid="11111";
        //xml文件的内容
        String logsXml="1111";
//        TestRequest request = new TestRequest();
//        request.setName(xtid);
//        request.setAge(logsXml);
//        String s = videoPost(null, JSON.toJSONString(request));
//        System.out.println(s);
        sendLogs(xtid, logsXml);
        System.out.println("=========");
    }

}
