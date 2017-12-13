package com.dubtsov._2bsafe.Parents.Functions.ChildrenCard.GenerateContent;

import com.dubtsov._2bsafe.Childrens.Authorisation.AuthorisationChildClass;
import com.dubtsov._2bsafe.Childrens.Logout.ChildrenLogoutClass;
import com.dubtsov._2bsafe.Childrens.Models.ChildrenResponseAuthorisationModel;
import com.dubtsov._2bsafe.Childrens.ProfileCards.ProfileClass;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateContent.GenerateCidCkeyContent;
import org.json.simple.JSONObject;

/**
 * Created by user on 11.09.17.
 */
public class GenerateGetProfileListContent {
    private static AuthorisationChildClass authorisationChildClass;
    private static ChildrenLogoutClass childrenLogoutClass;

    public static JSONObject getProfileListContent() throws Exception {
        authorisationChildClass = new AuthorisationChildClass();
        childrenLogoutClass = new ChildrenLogoutClass();
        JSONObject jsonObj = new JSONObject();
        if(GenerateCidCkeyContent.jsonObjectCidCkey != null) {
            jsonObj.put("cid", GenerateCidCkeyContent.jsonObjectCidCkey.get("cid"));
            jsonObj.put("ckey", GenerateCidCkeyContent.jsonObjectCidCkey.get("ckey"));
            return jsonObj;
        } else{
            authorisationChildClass.authorisationChildren();
            jsonObj.put("cid", GenerateCidCkeyContent.jsonObjectCidCkey.get("cid"));
            jsonObj.put("ckey", GenerateCidCkeyContent.jsonObjectCidCkey.get("ckey"));
            return jsonObj;
        }
    }


    public static Object[] provideFailCid() throws Exception {
        authorisationChildClass = new AuthorisationChildClass();
        JSONObject jsonObj = new JSONObject();
        if(GenerateCidCkeyContent.jsonObjectCidCkey != null) {
            jsonObj.put("cid", "failCid");
            jsonObj.put("ckey", GenerateCidCkeyContent.jsonObjectCidCkey.get("ckey"));
            return new Object[]{new Object[]{jsonObj}};
        } else{
            authorisationChildClass.authorisationChildren();
            jsonObj.put("cid", "failCid");
            jsonObj.put("ckey", GenerateCidCkeyContent.jsonObjectCidCkey.get("ckey"));
            return new Object[]{new Object[]{jsonObj}};
        }
    }


    public static Object[] provideFailCkey() throws Exception {
        authorisationChildClass = new AuthorisationChildClass();
        JSONObject jsonObj = new JSONObject();
        if(GenerateCidCkeyContent.jsonObjectCidCkey != null) {
            //GenerateCidCkeyContent.getJsonObjectCidCkey();
            jsonObj.put("cid", GenerateCidCkeyContent.jsonObjectCidCkey.get("cid"));
            jsonObj.put("ckey", "failCkey");
            return new Object[]{new Object[]{jsonObj}};
        } else{
            authorisationChildClass.authorisationChildren();
            //GenerateCidCkeyContent.getJsonObjectCidCkey();
            jsonObj.put("cid", GenerateCidCkeyContent.jsonObjectCidCkey.get("cid"));
            jsonObj.put("ckey", "failCkey");
            return new Object[]{new Object[]{jsonObj}};
        }
    }

    public static Object[] provideEmptyCid() throws Exception {
        authorisationChildClass = new AuthorisationChildClass();
        JSONObject jsonObj = new JSONObject();
        if(GenerateCidCkeyContent.jsonObjectCidCkey != null) {
            //GenerateCidCkeyContent.getJsonObjectCidCkey();
            jsonObj.put("cid", null);
            jsonObj.put("ckey", GenerateCidCkeyContent.jsonObjectCidCkey.get("ckey"));
            return new Object[]{new Object[]{jsonObj}};
        } else{
            authorisationChildClass.authorisationChildren();
            //GenerateCidCkeyContent.getJsonObjectCidCkey();
            jsonObj.put("cid", null);
            jsonObj.put("ckey", GenerateCidCkeyContent.jsonObjectCidCkey.get("ckey"));
            return new Object[]{new Object[]{jsonObj}};
        }
    }

    public static Object[] provideEmptyCkey() throws Exception {
        authorisationChildClass = new AuthorisationChildClass();
        JSONObject jsonObj = new JSONObject();
        if(GenerateCidCkeyContent.jsonObjectCidCkey != null) {
            //GenerateCidCkeyContent.getJsonObjectCidCkey();
            jsonObj.put("cid", GenerateCidCkeyContent.jsonObjectCidCkey.get("cid"));
            jsonObj.put("ckey", null);
            return new Object[]{new Object[]{jsonObj}};
        } else{
            authorisationChildClass.authorisationChildren();
            //GenerateCidCkeyContent.getJsonObjectCidCkey();
            jsonObj.put("cid", GenerateCidCkeyContent.jsonObjectCidCkey.get("cid"));
            jsonObj.put("ckey", null);
            return new Object[]{new Object[]{jsonObj}};
        }
    }

    public static Object[] provideEmptyAll() throws Exception {
        authorisationChildClass = new AuthorisationChildClass();
        JSONObject jsonObj = new JSONObject();
        if(GenerateCidCkeyContent.jsonObjectCidCkey != null) {
            //GenerateCidCkeyContent.getJsonObjectCidCkey();
            jsonObj.put("cid", null);
            jsonObj.put("ckey", null);
            return new Object[]{new Object[]{jsonObj}};
        } else{
            authorisationChildClass.authorisationChildren();
            //GenerateCidCkeyContent.getJsonObjectCidCkey();
            jsonObj.put("cid", null);
            jsonObj.put("ckey", null);
            return new Object[]{new Object[]{jsonObj}};
        }
    }

    public static Object[] provideFailAll() throws Exception {
        authorisationChildClass = new AuthorisationChildClass();
        JSONObject jsonObj = new JSONObject();
        if(GenerateCidCkeyContent.jsonObjectCidCkey != null) {
            //GenerateCidCkeyContent.getJsonObjectCidCkey();
            jsonObj.put("cid", "failCid");
            jsonObj.put("ckey", "failCkey");
            return new Object[]{new Object[]{jsonObj}};
        } else{
            authorisationChildClass.authorisationChildren();
            //GenerateCidCkeyContent.getJsonObjectCidCkey();
            jsonObj.put("cid", "failCid");
            jsonObj.put("ckey", "failCkey");
            return new Object[]{new Object[]{jsonObj}};
        }
    }

}
