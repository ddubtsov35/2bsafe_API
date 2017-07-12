package ParentsTests;

import com.dubtsov._2bsafe.RequestTemplateClass;
import com.dubtsov._2bsafe.ResponseClass;

import java.util.HashMap;
import java.util.LinkedHashMap;


/**
 * Created by user on 12.07.17.
 */
public class BaseTestClass {

    HashMap<String, String> content;
    RequestTemplateClass request;
    ResponseClass response;

    public BaseTestClass(){
       content = new LinkedHashMap<String, String>();
       //request = new RequestTemplateClass("https://lkn.safec.ru/os_api/accounts/v1.0/reg/step1", content);
       response = new ResponseClass();
    }

}
