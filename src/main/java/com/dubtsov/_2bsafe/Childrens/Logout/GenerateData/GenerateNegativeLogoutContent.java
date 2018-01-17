package com.dubtsov._2bsafe.Childrens.Logout.GenerateData;

import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateContent.ForProvideData;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateContent.GenerateCidCkeyContent;
import org.json.simple.JSONObject;

/**
 * Created by user on 17.01.18.
 */
public class GenerateNegativeLogoutContent {

    public static Object[] provideGetLogoutWithoutPasswordContent1() throws Exception {
        JSONObject jsonObj = new JSONObject();
        jsonObj.put("cid", null);
        jsonObj.put("ckey", null);
        jsonObj.put("reason", "Mne pysos!");

        //System.out.println("jsonObject " + jsonObj);
        return new Object[]{jsonObj};
    }

    public static Object[] provideGetLogoutWithoutPasswordContent2() throws Exception {
        ForProvideData.getTestData();

        JSONObject jsonObj = GenerateCidCkeyContent.getJsonObjectCidCkey();
        jsonObj.remove("cid");
        jsonObj.put("cid", "failCid");
        jsonObj.put("reason", "Mne pysos!");

        //System.out.println("jsonObject " + jsonObj);
        return new Object[]{jsonObj};
    }

    public static Object[] provideGetLogoutWithoutPasswordContent3() throws Exception {
        ForProvideData.getTestData();

        JSONObject jsonObj = GenerateCidCkeyContent.getJsonObjectCidCkey();
        jsonObj.remove("cid");
        jsonObj.put("cid", null);
        jsonObj.put("reason", "Mne pysos!");

        //System.out.println("jsonObject " + jsonObj);
        return new Object[]{jsonObj};
    }

    public static Object[] provideGetLogoutWithoutPasswordContent4() throws Exception {
        ForProvideData.getTestData();

        JSONObject jsonObj = GenerateCidCkeyContent.getJsonObjectCidCkey();
        jsonObj.remove("ckey");
        jsonObj.put("ckey", "failCkey");
        jsonObj.put("reason", "Mne pysos!");

        //System.out.println("jsonObject " + jsonObj);
        return new Object[]{jsonObj};
    }

    public static Object[] provideGetLogoutWithoutPasswordContent5() throws Exception {
        ForProvideData.getTestData();

        JSONObject jsonObj = GenerateCidCkeyContent.getJsonObjectCidCkey();
        jsonObj.remove("ckey");
        jsonObj.put("ckey", null);
        jsonObj.put("reason", "Mne pysos!");

        //System.out.println("jsonObject " + jsonObj);
        return new Object[]{jsonObj};
    }

    public static Object[] provideGetLogoutWithoutPasswordContent6() throws Exception {
        ForProvideData.getTestData();

        JSONObject jsonObj = GenerateCidCkeyContent.getJsonObjectCidCkey();
        jsonObj.put("reason", null);

        //System.out.println("jsonObject " + jsonObj);
        return new Object[]{jsonObj};
    }

    public static Object[] provideGetLogoutWithoutPasswordContent7() throws Exception {
        ForProvideData.getTestData();

        JSONObject jsonObj = GenerateCidCkeyContent.getJsonObjectCidCkey();

        //System.out.println("jsonObject " + jsonObj);
        return new Object[]{jsonObj};
    }

}
