package com.dubtsov._2bsafe.Parents.Functions.ChildrenCard;

import com.dubtsov._2bsafe.Childrens.Authorisation.AuthorisationChildClass;
import com.dubtsov._2bsafe.Childrens.ProfileCards.ProfileClass;
import com.dubtsov._2bsafe.Parents.Functions.BaseClass.BaseClass;

import java.io.IOException;

/**
 * Created by user on 31.08.17.
 */
public class AddAndSelectChildrenCardClass extends BaseClass{

    public AddAndSelectChildrenCardClass() throws IOException {
        childrenCardClass = new ChildrenCardClass();
        authorisationChildClass = new AuthorisationChildClass();
        profileClass = new ProfileClass();
    }

    public void AddAndSelectChildrenCard() throws Exception {
        childrenCardClass.addChildrenCard();
        childrenResponseAuthorisationModel = authorisationChildClass.authorisationChildren();
        response = profileClass.selectProfileCardResponse();
        System.out.println("selectProfileCard " + response.body().string());
    }

}
