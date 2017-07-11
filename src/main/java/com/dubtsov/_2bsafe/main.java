package com.dubtsov._2bsafe;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by user on 11.07.17.
 */
public class main {
    public static void main(String[] args) throws IOException {

        HashMap<String, String> content = new LinkedHashMap<String, String>();
        content.put("em", "ewq@qwerwr.ru");
        content.put("pwd", "2222222");

        RequestTemplate requestTemplate = new RequestTemplate("https://lkn.safec.ru/os_api/accounts/v1.0/reg/step1", content);
        System.out.println(requestTemplate.getResponse());
    }

}
