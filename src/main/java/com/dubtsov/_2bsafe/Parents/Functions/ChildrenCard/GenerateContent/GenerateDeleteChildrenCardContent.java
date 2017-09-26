package com.dubtsov._2bsafe.Parents.Functions.ChildrenCard.GenerateContent;

import com.dubtsov._2bsafe.Parents.Functions.ChildrenCard.ChildrenCardClass;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateContent.BaseContent;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateTokenClass;
import com.dubtsov._2bsafe.Parents.Pool.UserPool;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import java.io.IOException;

/**
 * Created by user on 08.09.17.
 */
public class GenerateDeleteChildrenCardContent {

    private static ChildrenCardClass childrenCardClass;
    private static JSONObject jsonObj = new JSONObject();

    public GenerateDeleteChildrenCardContent() throws ParseException {}

    public static JSONObject getDeleteChildrenCardContent() throws IOException, ParseException, java.text.ParseException {
        childrenCardClass = new ChildrenCardClass();
        jsonObj.put("profile_id", childrenCardClass.getChildrenCardList().get(0).getProfile_id());
        jsonObj.put("pwd", UserPool.getUserFromFile().get("pwd"));
        jsonObj.put("rnd", GenerateTokenClass.getGeneratedToken());
        return jsonObj;
    }

}
