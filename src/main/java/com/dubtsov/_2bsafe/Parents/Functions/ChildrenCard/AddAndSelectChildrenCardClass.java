package com.dubtsov._2bsafe.Parents.Functions.ChildrenCard;

import com.dubtsov._2bsafe.Childrens.Authorisation.AuthorisationChildClass;
import com.dubtsov._2bsafe.Childrens.Authorisation.ChildrenAuthorisationResponseClass;
import com.dubtsov._2bsafe.Childrens.ProfileCards.ProfileListClass;
import com.dubtsov._2bsafe.Childrens.ProfileCards.ProfileSetClass;
import com.dubtsov._2bsafe.Parents.Functions.BaseClass.BaseClass;

import java.io.IOException;

/**
 * Created by user on 31.08.17.
 */
public class AddAndSelectChildrenCardClass extends BaseClass{

    public AddAndSelectChildrenCardClass() throws IOException {
        addChildrenCardClass = new ChildrenCardClass();
        authorisationChildClass = new AuthorisationChildClass();
        childrenAuthorisationResponseClass = new ChildrenAuthorisationResponseClass();
        profileListClass = new ProfileListClass();
        profileSetClass = new ProfileSetClass();
    }

    public void AddAndSelectChildrenCard() throws Exception {
        addChildrenCardClass.addChildrenCard();
        childrenResponseAuthorisationModel = authorisationChildClass.authorisationChildren();
        response = profileSetClass.selectProfileCardResponse();
        System.out.println("selectProfileCard " + response.body().string());
    }

}
