package ParentsTests;

import com.dubtsov._2bsafe.Childrens.Authorisation.AuthorisationChildClass;
import com.dubtsov._2bsafe.Childrens.Authorisation.ChildrenAuthorisationResponseClass;
import com.dubtsov._2bsafe.Childrens.Models.ChildrenResponseAuthorisationModel;
import com.dubtsov._2bsafe.Childrens.NotifyChangeApp.GeneratedRequestJsonClass;
import com.dubtsov._2bsafe.Childrens.NotifyChangeApp.NotifyChangeAppClass;
import com.dubtsov._2bsafe.Childrens.ProfileCards.ProfileListClass;
import com.dubtsov._2bsafe.Childrens.ProfileCards.ProfileSetClass;
import com.dubtsov._2bsafe.Parents.Functions.Authorisation.AuthorisationUserClass;
import com.dubtsov._2bsafe.Parents.Functions.BaseClass.BaseClass;
import com.dubtsov._2bsafe.Parents.Functions.ChildrenCard.AddChildrenCardClass;
import com.dubtsov._2bsafe.Parents.Functions.Interval.GetIntervalUpdateClass;
import com.dubtsov._2bsafe.Parents.Functions.Interval.SetIntervalUpdateClass;
import com.dubtsov._2bsafe.Parents.Functions.TurboButton.GetTurboButtonClass;
import com.dubtsov._2bsafe.Parents.Functions.TurboButton.SetTurboButtonClass;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateTokenClass;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * Created by user on 29.08.17.
 */
public class TurboButtonTest extends BaseClass{
    HashMap content = new LinkedHashMap();

    public TurboButtonTest() throws IOException {
        generatedRequestJsonClass = new GeneratedRequestJsonClass();
        authorisationUserClass = new AuthorisationUserClass();
        addChildrenCardClass = new AddChildrenCardClass();
        authorisationChildClass = new AuthorisationChildClass();
        childrenResponseAuthorisationModel = new ChildrenResponseAuthorisationModel();
        childrenAuthorisationResponseClass = new ChildrenAuthorisationResponseClass();
        notifyChangeAppClass = new NotifyChangeAppClass();
        profileListClass = new ProfileListClass();
        profileSetClass = new ProfileSetClass();
        getTurboButtonClass = new GetTurboButtonClass();
        setTurboButtonClass = new SetTurboButtonClass();
    }

    @Test
    public void setTurbo() throws Exception {
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
        content.put("turbo", 888);
        response = setTurboButtonClass.setTurbo(content);
        String result = response.body().string();
        Assert.assertTrue(result.contains("\"scs\": true") && response.code() == 200);
    }

    @Test
    public void getInterval() throws Exception {
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
        content.put("turbo", 777);
        setTurboButtonClass.setTurbo(content);
        response = getTurboButtonClass.getTurboButtonResponse(content);
        String resultResponse = response.body().string();
        System.out.println("resultResponse " + resultResponse);
        int resultData = getTurboButtonClass.getDataTurboButton(resultResponse);
        System.out.println("result " + resultData);
        Assert.assertTrue(resultResponse.contains("\"scs\": true") && response.code() == 200 && resultData == 777);
    }
}
