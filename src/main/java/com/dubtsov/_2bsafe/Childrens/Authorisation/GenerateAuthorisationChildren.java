package com.dubtsov._2bsafe.Childrens.Authorisation;

import com.dubtsov._2bsafe.Childrens.Logout.ChildrenLogoutClass;
import com.dubtsov._2bsafe.Parents.Functions.Registration.GenerateRegistrationContent;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateTokenClass;
import com.dubtsov._2bsafe.Parents.Pool.CidCkeyPool;
import com.dubtsov._2bsafe.Parents.Pool.CidCkeyRegisteredPool;
import com.dubtsov._2bsafe.Parents.Pool.UserPool;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import java.io.IOException;

/**
 * Created by user on 08.09.17.
 */
public class GenerateAuthorisationChildren{

    public GenerateAuthorisationChildren() throws ParseException {}

    public static JSONObject PositiveGetAuthorisationChildrenContent() throws Exception {
        System.out.println("1");

        JSONObject jsonObj = new JSONObject();
        if(UserPool.getUserFromFile() == null) {
            jsonObj.put("em", GenerateRegistrationContent.getRegistrationStep1Content.get("em"));
            jsonObj.put("pwd", GenerateRegistrationContent.getRegistrationStep1Content.get("pwd"));
        } else{
            jsonObj = UserPool.getUserFromFile();
        }
        if(CidCkeyPool.getCidFromFile() == null) {
            jsonObj.put("cid", "");
        } else{
            if(CidCkeyRegisteredPool.getCidFromFile() == null){
                jsonObj.put("cid", CidCkeyPool.getCidFromFile().get("cid"));
            } else {
                if (CidCkeyPool.getCidFromFile().get("cid").equals(CidCkeyRegisteredPool.getCidFromFile().get("cid")) &&
                        CidCkeyPool.getCidFromFile().get("ckey").equals(CidCkeyRegisteredPool.getCidFromFile().get("ckey"))) {
                    ChildrenLogoutClass childrenLogoutClass = new ChildrenLogoutClass();
                    childrenLogoutClass.logout();
                    jsonObj.put("cid", "");
                }
            }
        }

        jsonObj.put("token", GenerateTokenClass.getGeneratedToken());
        jsonObj.put("sname","TestDevice");
        jsonObj.put("os","Android");
        jsonObj.put("osv","10");
        jsonObj.put("scr","Doxya");
        jsonObj.put("man","TestMan");
        jsonObj.put("mod","TestMod");
        jsonObj.put("type",1);
        jsonObj.put("TEST", "TEST");

        System.out.println("11" + jsonObj.toString());
        return jsonObj;
    }

    public static Object[] provideFailAll() throws IOException, ParseException {
        System.out.println("2");
        JSONObject jsonObj = new JSONObject();
        jsonObj.put("em", "1failEmail");
        jsonObj.put("pwd", "1failPassword");
        jsonObj.put("cid", "fakeCid");
        jsonObj.put("token", "fakeToken");
        jsonObj.put("sname","TestDevice");
        jsonObj.put("os","Android");
        jsonObj.put("osv","10");
        jsonObj.put("scr","Doxya");
        jsonObj.put("man","TestMan");
        jsonObj.put("mod","TestMod");
        jsonObj.put("type",1);
        System.out.println("22" + jsonObj.toString());
        return new Object[]{new Object[]{jsonObj}};
    }

    public static Object[] provideFailEmail() throws IOException, ParseException {
        System.out.println("3");

        JSONObject jsonObj = new JSONObject();
        if(UserPool.getUserFromFile() == null) {
            jsonObj.put("em", "11failEmail");
            jsonObj.put("pwd", GenerateRegistrationContent.getRegistrationStep1Content.get("pwd"));
        } else{
            jsonObj = UserPool.getUserFromFile();
            jsonObj.put("em", "11failEmail");
        }
        if(CidCkeyPool.getCidFromFile() == null) {
            jsonObj.put("cid", "");
        } else{
            jsonObj.put("cid", CidCkeyPool.getCidFromFile().get("cid"));
        }

        jsonObj.put("token", GenerateTokenClass.getGeneratedToken());
        jsonObj.put("sname","TestDevice");
        jsonObj.put("os","Android1");
        jsonObj.put("osv","10");
        jsonObj.put("scr","Doxya");
        jsonObj.put("man","TestMan");
        jsonObj.put("mod","TestMod");
        jsonObj.put("type",1);
        System.out.println("33" + jsonObj.toString());
        return new Object[]{new Object[]{jsonObj}};
    }

    public static Object[] provideFailPassword() throws IOException, ParseException {
        System.out.println("4");

        JSONObject jsonObj = new JSONObject();
        if(UserPool.getUserFromFile() == null) {
            jsonObj.put("em", GenerateRegistrationContent.getRegistrationStep1Content.get("em"));
            jsonObj.put("pwd", "111failPwd");
        } else{
            jsonObj = UserPool.getUserFromFile();
            jsonObj.put("pwd", "111failPwd");
        }
        if(CidCkeyPool.getCidFromFile() == null) {
            jsonObj.put("cid", "");
        } else{
            jsonObj.put("cid", CidCkeyPool.getCidFromFile().get("cid"));
        }

        jsonObj.put("token", GenerateTokenClass.getGeneratedToken());
        jsonObj.put("sname","TestDevice");
        jsonObj.put("os","Android");
        jsonObj.put("osv","10");
        jsonObj.put("scr","Doxya");
        jsonObj.put("man","TestMan");
        jsonObj.put("mod","TestMod");
        jsonObj.put("type",1);
        System.out.println("44" + jsonObj.toString());
        return new Object[]{new Object[]{jsonObj}};
    }

    public static Object[] provideEmptyAll() throws IOException, ParseException {
        System.out.println("5");

        JSONObject jsonObj = new JSONObject();
        if(CidCkeyPool.getCidFromFile() == null) {
            jsonObj.put("cid", "");
        } else{
            jsonObj.put("cid", CidCkeyPool.getCidFromFile().get("cid"));
        }
        jsonObj.put("token", GenerateTokenClass.getGeneratedToken());
        jsonObj.put("sname","TestDevice");
        jsonObj.put("os","Android");
        jsonObj.put("osv","10");
        jsonObj.put("scr","Doxya");
        jsonObj.put("man","TestMan");
        jsonObj.put("mod","TestMod");
        jsonObj.put("type",1);
        System.out.println("55" + jsonObj.toString());
        return new Object[]{new Object[]{jsonObj}};
    }

    public static Object[] provideEmptyEmail() throws IOException, ParseException {
        System.out.println("6");

        JSONObject jsonObj = new JSONObject();
        if(UserPool.getUserFromFile() == null) {
            jsonObj.put("em", null);
            jsonObj.put("pwd", GenerateRegistrationContent.getRegistrationStep1Content.get("pwd"));
        } else{
            jsonObj = UserPool.getUserFromFile();
            jsonObj.put("em", null);
        }
        if(CidCkeyPool.getCidFromFile() == null) {
            jsonObj.put("cid", "");
        } else{
            jsonObj.put("cid", CidCkeyPool.getCidFromFile().get("cid"));
        }

        jsonObj.put("token", GenerateTokenClass.getGeneratedToken());
        jsonObj.put("sname","TestDevice");
        jsonObj.put("os","Android");
        jsonObj.put("osv","10");
        jsonObj.put("scr","Doxya");
        jsonObj.put("man","TestMan");
        jsonObj.put("mod","TestMod");
        jsonObj.put("type",1);
        System.out.println("66" + jsonObj.toString());
        return new Object[]{new Object[]{jsonObj}};
    }

    public static Object[] provideEmptyPassword() throws IOException, ParseException {
        System.out.println("7");

        JSONObject jsonObj = new JSONObject();
        if(UserPool.getUserFromFile() == null) {
            jsonObj.put("em", GenerateRegistrationContent.getRegistrationStep1Content.get("em"));
            jsonObj.put("pwd", null);
        } else{
            jsonObj = UserPool.getUserFromFile();
            jsonObj.put("pwd", null);
        }
        if(CidCkeyPool.getCidFromFile() == null) {
            jsonObj.put("cid", "");
        } else{
            jsonObj.put("cid", CidCkeyPool.getCidFromFile().get("cid"));
        }

        jsonObj.put("token", GenerateTokenClass.getGeneratedToken());
        jsonObj.put("sname","TestDevice");
        jsonObj.put("os","Android");
        jsonObj.put("osv","10");
        jsonObj.put("scr","Doxya");
        jsonObj.put("man","TestMan");
        jsonObj.put("mod","TestMod");
        jsonObj.put("type",1);
        System.out.println("77" + jsonObj.toString());
        return new Object[]{new Object[]{jsonObj}};
    }
}
