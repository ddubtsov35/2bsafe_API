package com.dubtsov._2bsafe.Parents.Functions.BaseClass;

import com.dubtsov._2bsafe.Childrens.Authorisation.AuthorisationChildClass;
import com.dubtsov._2bsafe.Childrens.Authorisation.ChildrenAuthorisationResponseClass;
import com.dubtsov._2bsafe.Childrens.ConditionInformationFromDevice.GenerationRequestJsonClass;
import com.dubtsov._2bsafe.Childrens.ConditionInformationFromDevice.GetConditionInformation;
import com.dubtsov._2bsafe.Childrens.HelpMe.HelpMeClass;
import com.dubtsov._2bsafe.Childrens.Logout.ChildrenLogoutClass;
import com.dubtsov._2bsafe.Childrens.Models.ChildrenResponseAuthorisationModel;
import com.dubtsov._2bsafe.Childrens.NotifyChangeApp.GeneratedRequestJsonClass;
import com.dubtsov._2bsafe.Childrens.NotifyChangeApp.NotifyChangeAppClass;
import com.dubtsov._2bsafe.Childrens.PackageProcessingCommands.PackageProcessingCommandsClass;
import com.dubtsov._2bsafe.Childrens.ProfileCards.ProfileListClass;
import com.dubtsov._2bsafe.Childrens.ProfileCards.ProfileSetClass;
import com.dubtsov._2bsafe.Childrens.RulesTrigger.GeneratedJsonRulesTriggerClass;
import com.dubtsov._2bsafe.Childrens.RulesTrigger.RulesTriggerClass;
import com.dubtsov._2bsafe.Childrens.StatisticsInformation.GetStatisticsInformationClass;
import com.dubtsov._2bsafe.Parents.Functions.Authorisation.AuthorisationUserClass;
import com.dubtsov._2bsafe.Parents.Functions.ChildrenCard.*;
import com.dubtsov._2bsafe.Parents.Functions.Interval.GetIntervalUpdateClass;
import com.dubtsov._2bsafe.Parents.Functions.Interval.SetIntervalUpdateClass;
import com.dubtsov._2bsafe.Parents.Functions.Logout.LogoutClass;
import com.dubtsov._2bsafe.Parents.Functions.PasswordChange.PasswordChangeClass;
import com.dubtsov._2bsafe.Parents.Functions.RecoveryPassword.RecoveryPasswordClass;
import com.dubtsov._2bsafe.Parents.Functions.RegisteredUsers.DeleteUserClass;
import com.dubtsov._2bsafe.Parents.Functions.RegisteredUsers.ListRegisteredUsersClass;
import com.dubtsov._2bsafe.Parents.Functions.Registration.RegistrationUserStep1Class;
import com.dubtsov._2bsafe.Parents.Functions.Registration.RegistrationUserStep2Class;
import com.dubtsov._2bsafe.Parents.Functions.Rules.AddRulesClass;
import com.dubtsov._2bsafe.Parents.Functions.Rules.GetRulesListClass;
import com.dubtsov._2bsafe.Parents.Functions.TurboButton.GetTurboButtonClass;
import com.dubtsov._2bsafe.Parents.Functions.TurboButton.SetTurboButtonClass;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateEmailClass;
import com.dubtsov._2bsafe.Parents.Response.ResponseClass;
import okhttp3.Response;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * Created by user on 12.07.17.
 */
public  class BaseClass {

    protected static HashMap superContent = new LinkedHashMap();
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
    protected ChangeChildrenCardClass changeChildrenCardClass;
    protected SetIntervalUpdateClass setIntervalUpdateClass;
    protected Response response;
    protected String rnd = "rnd1";
    protected AuthorisationChildClass authorisationChildClass;
    protected GetChildrenCardInfoClass getChildrenCardInfoClass;
    protected ProfileListClass profileListClass;
    protected ProfileSetClass profileSetClass;
    protected ChildrenAuthorisationResponseClass childrenAuthorisationResponseClass;
    protected ChildrenResponseAuthorisationModel childrenResponseAuthorisationModel;
    protected GenerationRequestJsonClass generationRequestJsonClass;
    protected GetConditionInformation getConditionInformation;
    protected GetStatisticsInformationClass getStatisticsInformationClass;
    protected ChildrenLogoutClass childrenLogoutClass;
    protected GeneratedRequestJsonClass generatedRequestJsonClass;
    protected NotifyChangeAppClass notifyChangeAppClass;
    protected RulesTriggerClass rulesTriggerClass;
    protected GeneratedJsonRulesTriggerClass generatedJsonRulesTriggerClass;
    protected PackageProcessingCommandsClass packageProcessingCommandsClass;
    protected HelpMeClass helpMeClass;
    protected GetIntervalUpdateClass getIntervalUpdateClass;
    protected GetTurboButtonClass getTurboButtonClass;
    protected SetTurboButtonClass setTurboButtonClass;
    protected GetRulesListClass rulesListClass;
    protected AddRulesClass addRulesClass;

    public BaseClass() throws IOException {}
}
