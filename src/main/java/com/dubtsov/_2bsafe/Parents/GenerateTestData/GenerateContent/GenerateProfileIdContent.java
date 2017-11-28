package com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateContent;

import com.dubtsov._2bsafe.Childrens.Authorisation.AuthorisationChildClass;
import com.dubtsov._2bsafe.Childrens.Logout.ChildrenLogoutClass;
import com.dubtsov._2bsafe.Childrens.Models.ProfileCard;
import com.dubtsov._2bsafe.Childrens.ProfileCards.ProfileClass;
import com.dubtsov._2bsafe.Parents.Functions.ChildrenCard.ChildrenCardClass;
import com.dubtsov._2bsafe.Parents.Functions.RegisteredUsers.ListRegisteredUsersClass;
import com.dubtsov._2bsafe.Parents.Models.AddChildrenCard;
import com.dubtsov._2bsafe.Parents.Models.ChildrenCard;
import com.dubtsov._2bsafe.Parents.Pool.CidCkeyPool;
import com.dubtsov._2bsafe.Parents.Pool.CidCkeyRegisteredPool;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 08.09.17.
 */
public class GenerateProfileIdContent {

    public static Integer profileId = null;

    public GenerateProfileIdContent() throws ParseException {}

    public static JSONObject getProfileId() throws Exception {
        JSONObject jsonObj = new JSONObject();
        ProfileClass profileClass = new ProfileClass();
        AuthorisationChildClass authorisationChildClass = new AuthorisationChildClass();
        ChildrenCardClass childrenCardClass = new ChildrenCardClass();
        ChildrenLogoutClass childrenLogoutClass = new ChildrenLogoutClass();
        List<ProfileCard> profileCardList = profileClass.getProfileList();
        if (profileCardList.isEmpty()) {
            if (CidCkeyRegisteredPool.getCidFromFile() == null) {
                jsonObj.put("profile_id", childrenCardClass.addChildrenCard().getProfile_id());
            } else {
                childrenLogoutClass.logout();
                authorisationChildClass.authorisationChildren();
                profileCardList = profileClass.getProfileList();
                jsonObj = GenerateCidCkeyContent.getJsonObjectCidCkey();
                jsonObj.put("profile_id", profileCardList.get(profileCardList.size()-1).getProfile_id());
            }
        } else{
            jsonObj.put("profile_id", profileCardList.get(profileCardList.size()-1).getProfile_id());
        }
        profileId = (Integer) jsonObj.get("profile_id");
        return jsonObj;
    }
}
