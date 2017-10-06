package com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateContent;

import com.dubtsov._2bsafe.Parents.Functions.ChildrenCard.ChildrenCardClass;
import com.dubtsov._2bsafe.Parents.Functions.RegisteredUsers.ListRegisteredUsersClass;
import com.dubtsov._2bsafe.Parents.Models.AddChildrenCard;
import com.dubtsov._2bsafe.Parents.Models.ChildrenCard;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 08.09.17.
 */
public class GenerateProfileIdContent{

    public GenerateProfileIdContent() throws ParseException {}

    public static JSONObject getProfileId() throws Exception {
        JSONObject jsonObj = new JSONObject();
        ChildrenCardClass childrenCardClass = new ChildrenCardClass();
        List<ChildrenCard> childrenCardList = childrenCardClass.getChildrenCardList();
        if(childrenCardList.isEmpty()) {
            jsonObj.put("profile_id", childrenCardClass.addChildrenCard().getProfile_id());
        } else{
            jsonObj.put("profile_id", childrenCardList.get(childrenCardList.size()-1).getProfile_id());
        }
        return jsonObj;
    }
}
