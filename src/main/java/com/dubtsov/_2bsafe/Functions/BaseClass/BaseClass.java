package com.dubtsov._2bsafe.Functions.BaseClass;

import com.dubtsov._2bsafe.Functions.Authorisation.AuthorisationUserClass;
import com.dubtsov._2bsafe.Functions.ChildrenCard.AddChildrenCardClass;
import com.dubtsov._2bsafe.Functions.ChildrenCard.DeleteChildrenCardClass;
import com.dubtsov._2bsafe.Functions.ChildrenCard.GetChildrenCardListClass;
import com.dubtsov._2bsafe.Functions.Logout.LogoutClass;
import com.dubtsov._2bsafe.Functions.PasswordChange.PasswordChangeClass;
import com.dubtsov._2bsafe.Functions.RecoveryPassword.RecoveryPasswordClass;
import com.dubtsov._2bsafe.Functions.RegisteredUsers.DeleteUserClass;
import com.dubtsov._2bsafe.Functions.RegisteredUsers.ListRegisteredUsersClass;
import com.dubtsov._2bsafe.Functions.Registration.RegistrationUserStep1Class;
import com.dubtsov._2bsafe.Functions.Registration.RegistrationUserStep2Class;
import com.dubtsov._2bsafe.GenerateTestData.GenerateEmailClass;
import com.dubtsov._2bsafe.Response.ResponseClass;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * Created by user on 12.07.17.
 */
public  class BaseClass {

    protected static HashMap superContent = new LinkedHashMap<>();
    protected ResponseClass responseClass;
    protected String constPassword = "wwwwww";
    protected String dynamicPassword = "wwwwww" + GenerateEmailClass.getCountFromFile();
    protected DeleteUserClass deleteUserClass;
    protected AuthorisationUserClass authorisationUserClass;
    protected ListRegisteredUsersClass listRegisteredUsersClass;
    protected PasswordChangeClass passwordChangeClass;
    protected RegistrationUserStep1Class registrationUserStep1Class;
    protected RegistrationUserStep2Class registrationUserStep2Class;
    protected RecoveryPasswordClass recoveryPasswordClass;
    protected LogoutClass logoutClass;
    protected AddChildrenCardClass addChildrenCardClass;
    protected GetChildrenCardListClass getChildrenCardListClass;
    protected DeleteChildrenCardClass deleteChildrenCardClass;

    public BaseClass() throws IOException {}
}
