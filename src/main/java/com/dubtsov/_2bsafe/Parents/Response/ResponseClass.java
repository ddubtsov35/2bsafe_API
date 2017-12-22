package com.dubtsov._2bsafe.Parents.Response;

import com.dubtsov._2bsafe.Parents.Functions.RegisteredUsers.ListRegisteredUsersClass;
import okhttp3.*;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by user on 10.07.17.
 */
public class ResponseClass {

    private JSONObject jsonRequest;
    private String postmanToken = "6890b6c8-e300-4787-0233-b79a28139bf3";
    private String url;
    private OkHttpClient client = new OkHttpClient();
    private Response response;
    private static String sessionId = "";
    private ListRegisteredUsersClass listRegisteredUsersClass;


    public ResponseClass(String postmanToken, String url){
        this.postmanToken = postmanToken;
        this.url = url;
    }

    public ResponseClass(String url) throws ParseException {
        JSONParser parse = new JSONParser();
        this.jsonRequest = (JSONObject) parse.parse("{}");
        this.url = url;
    }

    public ResponseClass(String url, JSONObject jsonRequest){
        this.jsonRequest = jsonRequest;
        this.url = url;
    }

    public ResponseClass(){}


    private Request getJsonRequest(){
        MediaType mediaType = MediaType.parse("application/json");
        RequestBody body = RequestBody.create(mediaType, String.valueOf(jsonRequest));
        Request request = new Request.Builder()
                .url(url)
                .post(body)
                .addHeader("content-type", "application/json")
                .addHeader("cache-control", "no-cache")
                .addHeader("postman-token", postmanToken)
                .addHeader("cookie", sessionId)
                .build();
        System.out.println(request.toString());
        System.out.println("RequestJson " + String.valueOf(jsonRequest));
        return request;
    }


    public Response getJsonResponse() throws IOException {
        response = client.newCall(getJsonRequest()).execute();
        try {
            listRegisteredUsersClass = new ListRegisteredUsersClass();
            String sessionId = listRegisteredUsersClass.getSessionId(response.headers().toString());
            setSessionId(sessionId);
        } catch (StringIndexOutOfBoundsException e){
            return response;
        } finally {
            System.out.println(response);
            System.out.println();
        }

        return response;
    }

    public Response getRequestAddChildrenCardList() throws Exception {
        MediaType mediaType = MediaType.parse("multipart/form-data; boundary=----WebKitFormBoundary7MA4YWxkTrZu0gW");
        //String qqq = "------WebKitFormBoundary7MA4YWxkTrZu0gW\r\nContent-Disposition: form-data; name=\"name\"\r\n\r\n" + content.get("name").toString() + "\r\n------WebKitFormBoundary7MA4YWxkTrZu0gW\r\nContent-Disposition: form-data; name=\"phone\"\r\n\r\n" + "+" + content.get("phone").toString() + "\r\n------WebKitFormBoundary7MA4YWxkTrZu0gW\r\nContent-Disposition: form-data; name=\"age\"\r\n\r\n" + content.get("age").toString() + "\r\n------WebKitFormBoundary7MA4YWxkTrZu0gW\r\nContent-Disposition: form-data; name=\"send_sms\"\r\n\r\n" + content.get("send_sms").toString() + "\r\n------WebKitFormBoundary7MA4YWxkTrZu0gW\r\nContent-Disposition: form-data; name=\"file\"; filename=\"" + content.get("file") + "\"\r\nContent-Type: image/png\r\n\r\n\r\n------WebKitFormBoundary7MA4YWxkTrZu0gW--";
        //String qqq = "------WebKitFormBoundary7MA4YWxkTrZu0gW\r\nContent-Disposition: form-data; name=\"rnd\"\r\n\r\nrnd1\r\n------WebKitFormBoundary7MA4YWxkTrZu0gW\r\nContent-Disposition: form-data; name=\"name\"\r\n\r\n" + jsonRequest.get("name") + "\r\n------WebKitFormBoundary7MA4YWxkTrZu0gW\r\nContent-Disposition: form-data; name=\"phone\"\r\n\r\n" + jsonRequest.get("phone") + "\r\n------WebKitFormBoundary7MA4YWxkTrZu0gW\r\nContent-Disposition: form-data; name=\"age\"\r\n\r\n" + jsonRequest.get("age").toString() + "\r\n------WebKitFormBoundary7MA4YWxkTrZu0gW\r\nContent-Disposition: form-data; name=\"send_sms\"\r\n\r\n0\r\n------WebKitFormBoundary7MA4YWxkTrZu0gW--";
        System.out.println();
        RequestBody body = RequestBody.create(mediaType,getRequestBody(jsonRequest));
        Request request = new Request.Builder()
                .url(url)
                .post(body)
                .addHeader("content-type", "multipart/form-data; boundary=----WebKitFormBoundary7MA4YWxkTrZu0gW")
                .addHeader("cache-control", "no-cache")
                .addHeader("postman-token", postmanToken)
                .addHeader("cookie", sessionId)
                .build();
        System.out.println("Request: " + request.toString());
        System.out.println("RequestJson " + String.valueOf(jsonRequest));
        response = client.newCall(request).execute();
        System.out.println("Response: " + response);
        System.out.println();
        return response;
    }

    private String getRequestBody(JSONObject jsonRequest){
        String body = "";
        try{
           body = body + ("\r\n------WebKitFormBoundary7MA4YWxkTrZu0gW\r\nContent-Disposition: form-data; name=\"name\"\r\n\r\n" + jsonRequest.get("name"));
        } catch (Exception e){}
        try{
            body = body + ("\r\n------WebKitFormBoundary7MA4YWxkTrZu0gW\r\nContent-Disposition: form-data; name=\"phone\"\r\n\r\n" + jsonRequest.get("phone"));
        } catch (Exception e){}
        try{
            body = body + ("\r\n------WebKitFormBoundary7MA4YWxkTrZu0gW\r\nContent-Disposition: form-data; name=\"age\"\r\n\r\n" + jsonRequest.get("age"));
        } catch (Exception e){}
        try{
            body = body + ("\r\n------WebKitFormBoundary7MA4YWxkTrZu0gW\r\nContent-Disposition: form-data; name=\"send_sms\"\r\n\r\n" + 0);
        } catch (Exception e){}
        body = body + "\r\n------WebKitFormBoundary7MA4YWxkTrZu0gW--";
        return body;
    }

    public void setPostmanToken(String postmanToken) {
        this.postmanToken = postmanToken;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    public void setSessionId(String sessionId){ this.sessionId = sessionId;}
}
