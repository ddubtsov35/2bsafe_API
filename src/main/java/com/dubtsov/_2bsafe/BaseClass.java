package com.dubtsov._2bsafe;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * Created by user on 12.07.17.
 */
public class BaseClass {
    HashMap<String, String> content;
    ResponseClass response;
    String constPassword;
    String dynamicPassword;

    public BaseClass() throws IOException {
        content = new LinkedHashMap<String, String>();
        response = new ResponseClass();
        this.constPassword = "qqqqqq";
        this.dynamicPassword = "qqqqqq" + GenerateEmailClass.getCountFromFile();
    }
}
