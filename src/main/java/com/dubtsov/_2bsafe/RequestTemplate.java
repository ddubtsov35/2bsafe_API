package com.dubtsov._2bsafe;

import com.squareup.okhttp.*;

import java.util.HashMap;

/**
 * Created by user on 10.07.17.
 */
public class RequestTemplate {

    private String postmanToken;
    private String url;
    private HashMap<String, String> content;

    public RequestTemplate(String postmanToken, String url, HashMap<String, String> content){
        this.postmanToken = postmanToken;
        this.url = url;
        this.content = content;
    }

    public void convertHashContentToBodyString(){

    }

    /*OkHttpClient client = new OkHttpClient();

    MediaType mediaType = MediaType.parse("application/json");
    //RequestBody body = RequestBody.create(mediaType, "{\"em\": \"1111n@gmail.com\", \"pwd\": \"111\"}");
    RequestBody body = RequestBody.create(mediaType, "{\"em\": \"1111n@gmail.com\", \"pwd\": \"111\"}");
    Request request = new Request.Builder()
            .url("https://lkn.safec.ru/os_api/accounts/v1.0/reg/step1")
            .post(body)
            .addHeader("content-type", "application/json")
            .addHeader("cache-control", "no-cache")
            .addHeader("postman-token", "6dcae102-e715-be1d-ab81-b6274c5bc0b3")
            .build();

    Response response = client.newCall(request).execute();*/

}
