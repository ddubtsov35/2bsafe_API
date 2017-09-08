package com.dubtsov._2bsafe.Parents.Functions.ChildrenCard;

import com.dubtsov._2bsafe.Childrens.Authorisation.AuthorisationChildClass;
import com.dubtsov._2bsafe.Childrens.Authorisation.ChildrenAuthorisationResponseClass;
import com.dubtsov._2bsafe.Childrens.ProfileCards.ProfileListClass;
import com.dubtsov._2bsafe.Childrens.ProfileCards.ProfileSetClass;
import com.dubtsov._2bsafe.Parents.Functions.BaseClass.BaseClass;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateTokenClass;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * Created by user on 31.08.17.
 */
public class AddAndSelectChildrenCardClass extends BaseClass{

    HashMap content = new LinkedHashMap();

    public AddAndSelectChildrenCardClass() throws IOException {
        addChildrenCardClass = new AddChildrenCardClass();
        authorisationChildClass = new AuthorisationChildClass();
        childrenAuthorisationResponseClass = new ChildrenAuthorisationResponseClass();
        profileListClass = new ProfileListClass();
        profileSetClass = new ProfileSetClass();
    }

    public HashMap AddAndSelectChildrenCard() throws Exception {
        addChildrenCardClass.addChildrenCard();
        response = authorisationChildClass.authorisationChildren();
        System.out.println("response211111 " + response.body().string());
        childrenResponseAuthorisationModel = childrenAuthorisationResponseClass.childrenResponseAuthorisation(response);
        content.put("cid",childrenResponseAuthorisationModel.getCid());
        content.put("ckey",childrenResponseAuthorisationModel.getCkey());
        content.put("profile_id", profileListClass.getProfileList(content).get(0).getProfile_id());
        response = profileSetClass.selectProfileCardResponse(content);
        return content;
    }

}
