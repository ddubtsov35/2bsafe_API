package com.dubtsov._2bsafe.Response;

import com.dubtsov._2bsafe.Functions.ContentClearFlag;
import com.dubtsov._2bsafe.Functions.ListRegisteredUsersClass;
import com.sun.javafx.scene.layout.region.Margins;
import okhttp3.*;

import javax.net.ssl.*;
import java.io.IOException;
import java.security.cert.CertificateException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by user on 10.07.17.
 */
public class ResponseClass {

    private String prefixUrl = "http://lkn.safec.ru";
    private String postmanToken = "6890b6c8-e300-4787-0233-b79a28139bf3";
    private String url;
    private Map<String, String> content;
    private OkHttpClient client = new OkHttpClient();
    private Response response;
    private static String sessionId = "";

    public ResponseClass(String postmanToken, String url, HashMap<String, String> content){
        this.content = new LinkedHashMap<>();
        this.postmanToken = postmanToken;
        this.url = url;
        this.content = content;
    }

    public ResponseClass(String url, HashMap<String, String> content){
        this.content = new LinkedHashMap<>();
        this.url = url;
        this.content = content;
    }

    public ResponseClass(){}

    private String convertHashContentToBodyString(){
        System.out.println("content " + content);
        String result = "";
        if(!this.content.isEmpty()) {
            for (Map.Entry entry : content.entrySet()) {
                try {
                    Integer.parseInt(entry.getValue().toString());
                } catch(NumberFormatException e) {
                    result = result + ", " + "\"" + entry.getKey() + "\"" + ":" + "\"" + entry.getValue() + "\"";
                    continue;
                }
                //0 для выборки всех пользователей sortf
                if(Integer.parseInt(entry.getValue().toString())  == 0) {
                    result = result + ", " + "\"" + entry.getKey() + "\"" + ":" + entry.getValue();
                } else{
                    result = result + ", " + "\"" + entry.getKey() + "\"" + ":" + "\"" + entry.getValue() + "\"";
                }
                continue;
            }
        } else{
            return result;
        }
        result = result.substring(2, result.length());
        System.out.println(result);
        return result;
    }

    private Request getRequest(){
        MediaType mediaType = MediaType.parse("application/json");
        RequestBody body = RequestBody.create(mediaType, "{" + convertHashContentToBodyString() + "}");
        Request request = new Request.Builder()
                .url(url)
                .post(body)
                .addHeader("content-type", "application/json")
                .addHeader("cache-control", "no-cache")
                .addHeader("postman-token", postmanToken)
                .addHeader("cookie", sessionId)
                .build();
        System.out.println("REQUEST ");
        System.out.println(request.toString());
        System.out.println();
       /* if(ContentClearFlag.isContentClearFlag()) {
            content.clear();
        }*/
        return request;
    }

    public Response getResponse() throws IOException {
        response = client.newCall(getRequest()).execute();
        System.out.println("Response: " + response.code());
        System.out.println();

        ListRegisteredUsersClass listRegisteredUsersClass = new ListRegisteredUsersClass();
        String ses = listRegisteredUsersClass.getSessionId(response.headers().toString());
        setSessionId(ses);
        return response;
    }

    /*private static OkHttpClient getUnsafeOkHttpClient() {
        try {
            // Create a trust manager that does not validate certificate chains
            final TrustManager[] trustAllCerts = new TrustManager[] {
                    new X509TrustManager() {
                        @Override
                        public void checkClientTrusted(java.security.cert.X509Certificate[] chain, String authType) throws CertificateException {
                        }

                        @Override
                        public void checkServerTrusted(java.security.cert.X509Certificate[] chain, String authType) throws CertificateException {
                        }

                        @Override
                        public java.security.cert.X509Certificate[] getAcceptedIssuers() {
                            return new java.security.cert.X509Certificate[]{};
                        }
                    }
            };

            // Install the all-trusting trust manager
            final SSLContext sslContext = SSLContext.getInstance("SSL");
            sslContext.init(null, trustAllCerts, new java.security.SecureRandom());
            // Create an ssl socket factory with our all-trusting manager
            final SSLSocketFactory sslSocketFactory = sslContext.getSocketFactory();

            OkHttpClient.Builder builder = new OkHttpClient.Builder();
            builder.sslSocketFactory(sslSocketFactory, (X509TrustManager)trustAllCerts[0]);
            builder.hostnameVerifier(new HostnameVerifier() {
                @Override
                public boolean verify(String hostname, SSLSession session) {
                    return true;
                }
            });

            OkHttpClient okHttpClient = builder.build();
            return okHttpClient;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }*/


    public void setPostmanToken(String postmanToken) {
        this.postmanToken = postmanToken;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    public void setContent(Map<String, String> content) {
        this.content = content;
    }
    public void setSessionId(String sessionId){ this.sessionId = sessionId;}
}
