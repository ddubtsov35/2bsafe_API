package com.dubtsov._2bsafe.Parents.Functions.Apps;

import com.dubtsov._2bsafe.Childrens.NotifyChangeApp.NotifyChangeAppClass;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateContent.GenerateProfileIdContent;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateTokenClass;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.util.Random;

/**
 * Created by user on 08.09.17.
 */
public class GenerateAppsContent{
    public GenerateAppsContent() throws ParseException {}

    private static String alias;

    private static String getAlias() throws Exception {
        NotifyChangeAppClass notifyChangeAppClass = new NotifyChangeAppClass();
        notifyChangeAppClass.notifyChangeApp();
        alias = "com.google.android.youtube";
        return alias;
    }

    public static JSONObject getAppsInfoContent() throws Exception {
        JSONObject jsonObj = GenerateProfileIdContent.getProfileId();
        jsonObj.put("profile_id", jsonObj.get("profile_id"));
        return jsonObj;
    }

    public static Object[] provideNegativeGetAppsInfoContent1() throws IOException, ParseException {
        JSONObject jsonObj = new JSONObject();
        jsonObj.put("profile_id", jsonObj.get("profile_id"));
        JSONObject jsonObj2 = new JSONObject();
        jsonObj2.put("profile_id", null);

        JSONObject jsonObj3 = new JSONObject();

        JSONObject jsonObj4 = new JSONObject();
        Random random = new Random();
        jsonObj4.put("profile_id", random.nextInt(1000000 - 1 + 1)+1);

        JSONObject jsonObj5 = new JSONObject();
        jsonObj5.put("profile_id", null);


        return new Object[]{
                new JSONObject[] {jsonObj},
                new JSONObject[]{jsonObj2},
                new JSONObject[]{jsonObj3},
                new JSONObject[]{jsonObj4},
                new JSONObject[]{jsonObj5}
        };
    }




    public static JSONObject getAppsInGroupContent() throws Exception {
        JSONObject jsonObj = GenerateProfileIdContent.getProfileId();
        jsonObj.put("profile_id", jsonObj.get("profile_id"));
        jsonObj.put("group_id", 0);
        return jsonObj;
    }

    public static Object[] provideNegativeGetAppsInGroupContent() throws IOException, ParseException {
        JSONObject jsonObj = new JSONObject();
        jsonObj.put("profile_id", null);
        jsonObj.put("group_id", null);

        JSONObject jsonObj2 = new JSONObject();
        Random random = new Random();
        jsonObj2.put("profile_id", jsonObj.get("profile_id"));
        jsonObj2.put("group_id", random.nextInt(1000000 - 1 + 1)+1);

        JSONObject jsonObj3 = new JSONObject();
        jsonObj3.put("profile_id", jsonObj.get("profile_id"));
        jsonObj3.put("group_id", 0);

        JSONObject jsonObj4 = new JSONObject();
        jsonObj4.put("profile_id", random.nextInt(1000000 - 1 + 1)+1);
        jsonObj4.put("group_id", random.nextInt(1000000 - 1 + 1)+1);

        JSONObject jsonObj5 = new JSONObject();
        jsonObj5.put("profile_id", random.nextInt(1000000 - 1 + 1)+1);
        jsonObj5.put("group_id", random.nextInt(1000000 - 1 + 1)+1);

        JSONObject jsonObj6 = new JSONObject();
        jsonObj6.put("profile_id", random.nextInt(1000000 - 1 + 1)+1);
        jsonObj6.put("group_id", random.nextInt(1000000 - 1 + 1)+1);

        JSONObject jsonObj7 = new JSONObject();
        jsonObj7.put("profile_id", null);
        jsonObj7.put("group_id", 0);

        JSONObject jsonObj8 = new JSONObject();
        jsonObj8.put("profile_id", null);
        jsonObj8.put("group_id", random.nextInt(1000000 - 1 + 1)+1);

        JSONObject jsonObj9 = new JSONObject();
        jsonObj9.put("profile_id", null);
        jsonObj9.put("group_id", 0);

        JSONObject jsonObj10 = new JSONObject();
        jsonObj10.put("group_id", random.nextInt(1000000 - 1 + 1)+1);

        JSONObject jsonObj11 = new JSONObject();
        jsonObj11.put("group_id", 0);


        return new Object[]{
                new JSONObject[] {jsonObj},
                new JSONObject[]{jsonObj2},
                new JSONObject[]{jsonObj3},
                new JSONObject[]{jsonObj4},
                new JSONObject[]{jsonObj5},
                new JSONObject[]{jsonObj6},
                new JSONObject[]{jsonObj7},
                new JSONObject[]{jsonObj8},
                new JSONObject[]{jsonObj9},
                new JSONObject[]{jsonObj10},
                new JSONObject[]{jsonObj11}
        };
    }






    public static JSONObject getDetailInfoContent() throws Exception {
        JSONObject jsonObj = new JSONObject();
        if(GenerateProfileIdContent.profileId == null){
            jsonObj  = GenerateProfileIdContent.getProfileId();
            jsonObj.put("profile_id", jsonObj.get("profile_id"));
        } else{
            jsonObj.put("profile_id", GenerateProfileIdContent.profileId);
        }
        jsonObj.put("alias",getAlias());
        return jsonObj;
    }

    public static Object[] provideNegativeGetDetailInfoContent() throws Exception {
        JSONObject jsonObj = new JSONObject();
        jsonObj.put("profile_id", jsonObj.get("profile_id"));
        jsonObj.put("alias",null);

        JSONObject jsonObj2 = new JSONObject();
        jsonObj2.put("profile_id", null);
        jsonObj2.put("alias",getAlias());

        JSONObject jsonObj3 = new JSONObject();

        JSONObject jsonObj4 = new JSONObject();
        Random random = new Random();
        jsonObj4.put("profile_id", random.nextInt(1000000 - 1 + 1)+1);
        jsonObj4.put("alias", getAlias());

        JSONObject jsonObj5 = new JSONObject();
        jsonObj5.put("profile_id", null);
        jsonObj5.put("alias",null);

        JSONObject jsonObj6 = new JSONObject();
        jsonObj6.put("profile_id", jsonObj.get("profile_id"));
        jsonObj6.put("alias", random.nextInt(1000000 - 1 + 1)+1);


        return new Object[]{
                new JSONObject[] {jsonObj},
                new JSONObject[]{jsonObj2},
                new JSONObject[]{jsonObj3},
                new JSONObject[]{jsonObj4},
                new JSONObject[]{jsonObj5},
                new JSONObject[]{jsonObj6}
        };
    }






    public static JSONObject getAppsBlockContent() throws Exception {
        JSONObject jsonObj = new JSONObject();
        if(GenerateProfileIdContent.profileId == null){
            jsonObj  = GenerateProfileIdContent.getProfileId();
            jsonObj.put("profile_id", jsonObj.get("profile_id"));
        } else{
            jsonObj.put("profile_id", GenerateProfileIdContent.profileId);
        }
        jsonObj.put("alias",getAlias());
        jsonObj.put("block",0);
        return jsonObj;
    }

    public static Object[] provideNegativeGetAppsBlockContent() throws Exception {
        JSONObject jsonObj = new JSONObject();
        jsonObj.put("profile_id", null);
        jsonObj.put("alias",null);
        jsonObj.put("block", null);

        JSONObject jsonObj2 = new JSONObject();
        Random random = new Random();
        jsonObj2.put("profile_id", jsonObj.get("profile_id"));
        jsonObj2.put("alias",null);
        jsonObj2.put("block", random.nextInt(1000000 - 1 + 1)+1);

        JSONObject jsonObj3 = new JSONObject();
        jsonObj3.put("profile_id", jsonObj.get("profile_id"));
        jsonObj3.put("block", 0);

        JSONObject jsonObj4 = new JSONObject();
        jsonObj4.put("profile_id", random.nextInt(1000000 - 1 + 1)+1);
        jsonObj4.put("alias",getAlias());
        jsonObj4.put("block", random.nextInt(1000000 - 1 + 1)+1);

        JSONObject jsonObj5 = new JSONObject();
        jsonObj5.put("profile_id", random.nextInt(1000000 - 1 + 1)+1);
        jsonObj5.put("alias",null);
        jsonObj5.put("block", random.nextInt(1000000 - 1 + 1)+1);

        JSONObject jsonObj6 = new JSONObject();
        jsonObj6.put("profile_id", random.nextInt(1000000 - 1 + 1)+1);
        jsonObj6.put("block", random.nextInt(1000000 - 1 + 1)+1);

        JSONObject jsonObj7 = new JSONObject();
        jsonObj7.put("profile_id", null);
        jsonObj7.put("alias",getAlias());
        jsonObj7.put("block", 1);

        JSONObject jsonObj8 = new JSONObject();
        jsonObj8.put("profile_id", null);
        jsonObj8.put("alias",null);
        jsonObj8.put("block", random.nextInt(1000000 - 1 + 1)+1);

        JSONObject jsonObj9 = new JSONObject();
        jsonObj9.put("profile_id", null);
        jsonObj9.put("block", 1);

        JSONObject jsonObj10 = new JSONObject();
        jsonObj10.put("alias",getAlias());
        jsonObj10.put("block", random.nextInt(1000000 - 1 + 1)+1);

        JSONObject jsonObj11 = new JSONObject();
        jsonObj11.put("alias",null);
        jsonObj11.put("block", 0);

        JSONObject jsonObj12 = new JSONObject();
        jsonObj12.put("block", random.nextInt(1000000 - 1 + 1)+1);


        return new Object[]{
                new JSONObject[] {jsonObj},
                new JSONObject[]{jsonObj2},
                new JSONObject[]{jsonObj3},
                new JSONObject[]{jsonObj4},
                new JSONObject[]{jsonObj5},
                new JSONObject[]{jsonObj6},
                new JSONObject[]{jsonObj7},
                new JSONObject[]{jsonObj8},
                new JSONObject[]{jsonObj9},
                new JSONObject[]{jsonObj10},
                new JSONObject[]{jsonObj11},
                new JSONObject[]{jsonObj12}
        };
    }







    public static JSONObject getAppsBlockUpdateContent() throws Exception {
        JSONObject jsonObj = new JSONObject();
        if(GenerateProfileIdContent.profileId == null){
            jsonObj  = GenerateProfileIdContent.getProfileId();
            jsonObj.put("profile_id", jsonObj.get("profile_id"));
        } else{
            jsonObj.put("profile_id", GenerateProfileIdContent.profileId);
        }
        jsonObj.put("alias",getAlias());
        jsonObj.put("block",0);
        return jsonObj;
    }





    public static JSONObject getAppsUpdateContent() throws Exception {
        JSONArray jsonArray = new JSONArray();
        JSONObject jsonObj = new JSONObject();
        if(GenerateProfileIdContent.profileId == null){
            jsonObj  = GenerateProfileIdContent.getProfileId();
            jsonObj.put("profile_id", jsonObj.get("profile_id"));
        } else{
            jsonObj.put("profile_id", GenerateProfileIdContent.profileId);
        }
        jsonArray.add(getAlias());
        jsonObj.put("aliases",jsonArray);
        return jsonObj;
    }
    public static Object[] provideNegativeGetAppsUpdateContent() throws Exception {
        JSONObject jsonObj = new JSONObject();
        JSONArray jsonArray = new JSONArray();
        jsonObj.put("profile_id", jsonObj.get("profile_id"));
        jsonArray.add(null);
        jsonObj.put("aliases",jsonArray);

        JSONObject jsonObj2 = new JSONObject();
        JSONArray jsonArray2 = new JSONArray();
        jsonObj2.put("profile_id", null);
        jsonArray.add(null);
        jsonObj2.put("aliases",jsonArray2);

        JSONObject jsonObj3 = new JSONObject();

        JSONObject jsonObj4 = new JSONObject();
        JSONArray jsonArray4 = new JSONArray();
        Random random = new Random();
        jsonObj4.put("profile_id", random.nextInt(1000000 - 1 + 1)+1);
        jsonArray4.add(getAlias());
        jsonObj4.put("aliases",jsonArray4);

        JSONObject jsonObj5 = new JSONObject();
        JSONArray jsonArray5 = new JSONArray();
        jsonObj5.put("profile_id", null);
        jsonArray5.add(null);
        jsonObj5.put("aliases",jsonArray5);


        return new Object[]{
                new JSONObject[] {jsonObj},
                new JSONObject[]{jsonObj2},
                new JSONObject[]{jsonObj3},
                new JSONObject[]{jsonObj4},
                new JSONObject[]{jsonObj5}
        };
    }


    public static JSONObject getAppsDeleteContent() throws Exception {
        JSONArray jsonArray = new JSONArray();
        JSONObject jsonObj = new JSONObject();
        if(GenerateProfileIdContent.profileId == null){
            jsonObj  = GenerateProfileIdContent.getProfileId();
            jsonObj.put("profile_id", jsonObj.get("profile_id"));
        } else{
            jsonObj.put("profile_id", GenerateProfileIdContent.profileId);
        }
        jsonArray.add(getAlias());
        jsonObj.put("aliases",jsonArray);
        return jsonObj;
    }

}
