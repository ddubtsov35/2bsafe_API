package ChildrenTests;

import com.dubtsov._2bsafe.Childrens.Authorisation.AuthorisationChildClass;
import com.dubtsov._2bsafe.Childrens.Authorisation.ChildrenAuthorisationResponseClass;
import com.dubtsov._2bsafe.Childrens.Models.ChildrenResponseAuthorisationModel;
import com.dubtsov._2bsafe.Childrens.ProfileCards.ProfileListClass;
import com.dubtsov._2bsafe.Childrens.ProfileCards.ProfileSetClass;
import com.dubtsov._2bsafe.Childrens.StatisticsInformation.GetStatisticsInformationClass;
import com.dubtsov._2bsafe.Parents.Functions.Authorisation.AuthorisationUserClass;
import com.dubtsov._2bsafe.Parents.Functions.BaseClass.BaseClass;
import com.dubtsov._2bsafe.Parents.Functions.ChildrenCard.AddChildrenCardClass;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateTokenClass;
import org.json.simple.parser.ParseException;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * Created by user on 24.08.17.
 */
public class GetStatisticsInformationTest extends BaseClass{

    HashMap content = new LinkedHashMap();

    public GetStatisticsInformationTest() throws IOException {
        getStatisticsInformationClass = new GetStatisticsInformationClass();
        authorisationUserClass = new AuthorisationUserClass();
        addChildrenCardClass = new AddChildrenCardClass();
        authorisationChildClass = new AuthorisationChildClass();
        childrenAuthorisationResponseClass = new ChildrenAuthorisationResponseClass();
        childrenResponseAuthorisationModel = new ChildrenResponseAuthorisationModel();
        profileListClass = new ProfileListClass();
        profileSetClass = new ProfileSetClass();
    }

    @Test
    public void getStatisticsInformation() throws Exception {
        authorisationUserClass.RegistrationAndAuthorisationWeb();
        addChildrenCardClass.addChildrenCard();
        content.put("cid","");
        content.put("em",superContent.get("login"));
        content.put("pwd",superContent.get("pwd"));
        content.put("token", GenerateTokenClass.getGeneratedToken());
        content.put("sname","TestDevice");
        content.put("os","Android");
        content.put("osv","10");
        content.put("scr","Doxya");
        content.put("man","TestMan");
        content.put("mod","TestMod");
        content.put("type",1);
        response = authorisationChildClass.authorisationChildren(content);
        childrenResponseAuthorisationModel = childrenAuthorisationResponseClass.childrenResponseAuthorisation(response);
        content.put("cid",childrenResponseAuthorisationModel.getCid());
        content.put("ckey",childrenResponseAuthorisationModel.getCkey());
        content.put("profile_id", profileListClass.getProfileList(content).get(0).getProfile_id());
        profileSetClass.selectProfileCardResponse(content);
        response = getStatisticsInformationClass.getStatisticsInformation(content);
        String result = response.body().string();
        System.out.println("Result string " + result);
        Assert.assertTrue(result.contains("\"scs\": true") && response.code() == 200);
    }
}
