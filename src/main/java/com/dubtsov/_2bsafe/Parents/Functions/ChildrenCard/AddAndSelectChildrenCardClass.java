package com.dubtsov._2bsafe.Parents.Functions.ChildrenCard;

import com.dubtsov._2bsafe.Childrens.Authorisation.AuthorisationChildClass;
import com.dubtsov._2bsafe.Childrens.Models.ConditionInformationFromDevice;
import com.dubtsov._2bsafe.Childrens.ProfileCards.ProfileClass;
import com.dubtsov._2bsafe.Parents.Functions.BaseClass.BaseClass;
import com.dubtsov._2bsafe.Parents.Models.ChildrenCard;
import com.dubtsov._2bsafe.Parents.Pool.ChildrenCardPools;
import com.dubtsov._2bsafe.Parents.Pool.CidCkeyRegisteredPool;
import okhttp3.Response;

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
        authorisationChildClass.authorisationChildren();
        if(CidCkeyRegisteredPool.getCidFromFile() == null) {
            ConditionInformationFromDevice conditionInformationFromDevice = profileClass.setProfileCard();
            System.out.println("selectProfileCard " + conditionInformationFromDevice.toString());
        }
    }

}
