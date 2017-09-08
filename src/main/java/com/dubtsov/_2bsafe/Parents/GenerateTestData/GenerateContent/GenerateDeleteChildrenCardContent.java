package com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateContent;

import com.dubtsov._2bsafe.Parents.Functions.ChildrenCard.GetChildrenCardListClass;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateEmailClass;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateTokenClass;
import com.dubtsov._2bsafe.Parents.Models.ChildrenCard;
import com.dubtsov._2bsafe.Parents.Parse.GetChildrenCardList;
import com.dubtsov._2bsafe.Parents.UserPool.UserPool;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 08.09.17.
 */
public class GenerateDeleteChildrenCardContent extends BaseContent{

    private static GetChildrenCardListClass getChildrenCardListClass;

    public GenerateDeleteChildrenCardContent() throws ParseException {}

    public static JSONObject getDeleteChildrenCardContent() throws IOException, ParseException, java.text.ParseException {
        getChildrenCardListClass = new GetChildrenCardListClass();
        jsonObj.put("profile_id", getChildrenCardListClass.getChildrenCardList().get(0).getProfile_id());
        jsonObj.put("pwd", UserPool.getUserFromFile().get("pwd"));
        jsonObj.put("rnd", GenerateTokenClass.getGeneratedToken());
        return jsonObj;
    }

}
