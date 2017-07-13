package com.dubtsov._2bsafe;

import com.squareup.okhttp.*;

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
    OkHttpClient client;
    Response response;

    public ResponseClass(String postmanToken, String url, HashMap<String, String> content){
        client = new OkHttpClient();
        this.content = new LinkedHashMap<String, String>();
        this.postmanToken = postmanToken;
        this.url = prefixUrl + url;
        this.content = content;
    }

    public ResponseClass(String url, HashMap<String, String> content){
        client = new OkHttpClient();
        this.content = new LinkedHashMap<String, String>();
        this.url = prefixUrl + url;
        this.content = content;
    }

    public ResponseClass(){}

    private String convertHashContentToBodyString(){
        String result = "";
        if(!this.content.isEmpty()) {
            for (Map.Entry entry : content.entrySet()) {
                result = result + ", " + "\"" + entry.getKey() + "\"" + ":" + "\"" + entry.getValue() + "\"";
            }
            result = result.substring(2, result.length());
            return result;
        } else{
            return result;
        }
    }

    private Request getRequest(){
        MediaType mediaType = MediaType.parse("application/json");
        System.out.println("RequestBody: {" + convertHashContentToBodyString() + "}");
        RequestBody body = RequestBody.create(mediaType, "{" + convertHashContentToBodyString() + "}");
        Request request = new Request.Builder()
                .url(url)
                .post(body)
                .addHeader("content-type", "application/json")
                .addHeader("cache-control", "no-cache")
                .addHeader("postman-token", postmanToken)
                .build();
        return request;
    }

    public Response getResponse() throws IOException {
        response = client.newCall(getRequest()).execute();
        System.out.println("Response: " + response.body().string());
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
}
