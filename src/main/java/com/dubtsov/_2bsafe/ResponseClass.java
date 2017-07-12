package com.dubtsov._2bsafe;

import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Response;

import java.io.IOException;

/**
 * Created by user on 12.07.17.
 */
public class ResponseClass {

    OkHttpClient client;

    public Response getResponse(RequestTemplateClass request) throws IOException {
        client = new OkHttpClient();
        Response response = client.newCall(request.getRequest()).execute();
        return response;
    }

}
