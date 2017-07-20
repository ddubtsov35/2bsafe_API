package com.dubtsov._2bsafe.Response;

import com.dubtsov._2bsafe.Functions.RegisteredUsers.ListRegisteredUsersClass;
import okhttp3.*;

import java.io.IOException;
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

    public ResponseClass(String postmanToken, String url, HashMap content){
        this.content = new LinkedHashMap<>();
        this.postmanToken = postmanToken;
        this.url = url;
        this.content = content;
    }

    public ResponseClass(String url, HashMap content){
        this.content = new LinkedHashMap<>();
        this.url = url;
        this.content = content;
    }

    public ResponseClass(String url){
        this.content = new LinkedHashMap<>();
        this.url = url;
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

    public Response getRequestAddChildrenCardList() throws Exception {
        MediaType mediaType = MediaType.parse("multipart/form-data; boundary=----WebKitFormBoundary7MA4YWxkTrZu0gW");
        String qqq = "------WebKitFormBoundary7MA4YWxkTrZu0gW\r\nContent-Disposition: form-data; name=\"name\"\r\n\r\n" + content.get("name").toString() + "\r\n------WebKitFormBoundary7MA4YWxkTrZu0gW\r\nContent-Disposition: form-data; name=\"phone\"\r\n\r\n" + content.get("phone").toString() + "\r\n------WebKitFormBoundary7MA4YWxkTrZu0gW\r\nContent-Disposition: form-data; name=\"age\"\r\n\r\n" + content.get("age").toString() + "\r\n------WebKitFormBoundary7MA4YWxkTrZu0gW\r\nContent-Disposition: form-data; name=\"send_sms\"\r\n\r\n" + content.get("send_sms").toString() + "\r\n------WebKitFormBoundary7MA4YWxkTrZu0gW\r\nContent-Disposition: form-data; name=\"file\"; filename=\"" + content.get("file") + "\"\r\nContent-Type: image/jpeg\r\n\r\n\r\n------WebKitFormBoundary7MA4YWxkTrZu0gW--";
        //String qqq = "------WebKitFormBoundary7MA4YWxkTrZu0gW\r\nContent-Disposition: form-data; name=\"name\"\r\n\r\n" + content.get("name") + "\r\n------WebKitFormBoundary7MA4YWxkTrZu0gW\r\nContent-Disposition: form-data; name=\"phone\"\r\n\r\n" + content.get("phone") + "\r\n------WebKitFormBoundary7MA4YWxkTrZu0gW\r\nContent-Disposition: form-data; name=\"age\"\r\n\r\n" + content.get("age").toString() + "\r\n------WebKitFormBoundary7MA4YWxkTrZu0gW\r\nContent-Disposition: form-data; name=\"send_sms\"\r\n\r\n1\r\n------WebKitFormBoundary7MA4YWxkTrZu0gW--";
        System.out.println(qqq);
        RequestBody body = RequestBody.create(mediaType,qqq);
                Request request = new Request.Builder()
                .url(url)
                .post(body)
                .addHeader("content-type", "multipart/form-data; boundary=----WebKitFormBoundary7MA4YWxkTrZu0gW")
                .addHeader("cache-control", "no-cache")
                        .addHeader("postman-token", "d3938f7b-a5b6-e681-d5a5-a580b3391f40")
                        .addHeader("cookie", sessionId)
                .build();
        response = client.newCall(request).execute();
        return response;
    }


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
