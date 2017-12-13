package com.dubtsov._2bsafe.Childrens.Authorisation;

import com.dubtsov._2bsafe.Childrens.Logout.ChildrenLogoutClass;
import com.dubtsov._2bsafe.Parents.Functions.Registration.GenerateRegistrationContent;
import com.dubtsov._2bsafe.Parents.Functions.Registration.RegistrationUserStep1Class;
import com.dubtsov._2bsafe.Parents.Functions.Registration.RegistrationUserStep2Class;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateTokenClass;
import com.dubtsov._2bsafe.Parents.Pool.CidCkeyPool;
import com.dubtsov._2bsafe.Parents.Pool.CidCkeyRegisteredPool;
import com.dubtsov._2bsafe.Parents.Pool.LogPools;
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
        JSONObject jsonObj = new JSONObject();
        if(UserPool.getUserFromFile() == null) {
            jsonObj.put("em", GenerateRegistrationContent.getRegStep1Content().get("em"));
            jsonObj.put("pwd", GenerateRegistrationContent.getRegStep1Content().get("pwd"));
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

        LogPools.getLog();

        return jsonObj;
    }

    public static Object[] provideFailAll() throws IOException, ParseException {
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
        return new Object[]{new Object[]{jsonObj}};
    }

    public static Object[] provideFailEmail() throws Exception {
        RegistrationUserStep1Class registrationUserStep1Class = new RegistrationUserStep1Class();
        registrationUserStep1Class.registrationUserStep1();
        RegistrationUserStep2Class registrationUserStep2Class = new RegistrationUserStep2Class();
        registrationUserStep2Class.registrationUserStep2Web();
        JSONObject jsonObj = new JSONObject();
        if(UserPool.getUserFromFile() == null) {
            jsonObj.put("em", "11failEmail");
            jsonObj.put("pwd", GenerateRegistrationContent.getRegStep1Content().get("pwd"));
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
        return new Object[]{new Object[]{jsonObj}};
    }

    public static Object[] provideFailPassword() throws Exception {
        RegistrationUserStep1Class registrationUserStep1Class = new RegistrationUserStep1Class();
        registrationUserStep1Class.registrationUserStep1();
        RegistrationUserStep2Class registrationUserStep2Class = new RegistrationUserStep2Class();
        registrationUserStep2Class.registrationUserStep2Web();
        JSONObject jsonObj = new JSONObject();
        if(UserPool.getUserFromFile() == null) {
            jsonObj.put("em", GenerateRegistrationContent.getRegStep1Content().get("em"));
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
        return new Object[]{new Object[]{jsonObj}};
    }

    public static Object[] provideEmptyAll() throws Exception {
        RegistrationUserStep1Class registrationUserStep1Class = new RegistrationUserStep1Class();
        registrationUserStep1Class.registrationUserStep1();
        RegistrationUserStep2Class registrationUserStep2Class = new RegistrationUserStep2Class();
        registrationUserStep2Class.registrationUserStep2Web();
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
        return new Object[]{new Object[]{jsonObj}};
    }

    public static Object[] provideEmptyEmail() throws Exception {
        RegistrationUserStep1Class registrationUserStep1Class = new RegistrationUserStep1Class();
        registrationUserStep1Class.registrationUserStep1();
        RegistrationUserStep2Class registrationUserStep2Class = new RegistrationUserStep2Class();
        registrationUserStep2Class.registrationUserStep2Web();
        JSONObject jsonObj = new JSONObject();
        if(UserPool.getUserFromFile() == null) {
            jsonObj.put("em", null);
            jsonObj.put("pwd", GenerateRegistrationContent.getRegStep1Content().get("pwd"));
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
        return new Object[]{new Object[]{jsonObj}};
    }

    public static Object[] provideEmptyPassword() throws Exception {
        RegistrationUserStep1Class registrationUserStep1Class = new RegistrationUserStep1Class();
        registrationUserStep1Class.registrationUserStep1();
        RegistrationUserStep2Class registrationUserStep2Class = new RegistrationUserStep2Class();
        registrationUserStep2Class.registrationUserStep2Web();
        JSONObject jsonObj = new JSONObject();
        if(UserPool.getUserFromFile() == null) {
            jsonObj.put("em", GenerateRegistrationContent.getRegStep1Content().get("em"));
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
        return new Object[]{new Object[]{jsonObj}};
    }
}
