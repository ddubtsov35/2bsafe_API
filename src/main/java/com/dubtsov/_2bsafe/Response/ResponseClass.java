package com.dubtsov._2bsafe.Response;

import com.dubtsov._2bsafe.Functions.ContentClearFlag;
import com.dubtsov._2bsafe.Functions.ListRegisteredUsersClass;
import com.squareup.okhttp.*;
import com.sun.javafx.scene.layout.region.Margins;
import com.sun.xml.internal.ws.commons.xmlutil.Converter;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by user on 10.07.17.
 */
public class ResponseClass {

    private String prefixUrl = "https://lkn.safec.ru";
    private String postmanToken = "6890b6c8-e300-4787-0233-b79a28139bf3";
    private String url;
    private Map<String, String> content;
    private OkHttpClient client = new OkHttpClient();
    private Response response;
    private String sessionId = "";

    public ResponseClass(String postmanToken, String url, HashMap<String, String> content){
        this.content = new LinkedHashMap<String, String>();
        this.postmanToken = postmanToken;
        this.url = url;
        this.content = content;
    }

    public ResponseClass(String url, HashMap<String, String> content){
        this.content = new LinkedHashMap<String, String>();
        this.url = url;
        this.content = content;
    }

    public ResponseClass(){}

    private String convertHashContentToBodyString(){
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
        System.out.println(request.body().toString());
        System.out.println(request.headers());
       /* if(ContentClearFlag.isContentClearFlag()) {
            content.clear();
        }*/
        return request;
    }

    public Response getResponse() throws IOException {
        response = client.newCall(getRequest()).execute();
        System.out.println("Response: " + response.code());
        System.out.println("Response: " + response.headers());
        System.out.println("Response: " + response.cacheResponse());
        System.out.println();

        ListRegisteredUsersClass listRegisteredUsersClass = new ListRegisteredUsersClass();
        String ses = listRegisteredUsersClass.getSessionId(response.headers().toString());
        System.out.println("44444 " + response.headers().toString());
        System.out.println("33333 " + ses);
        setSessionId(ses);
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
