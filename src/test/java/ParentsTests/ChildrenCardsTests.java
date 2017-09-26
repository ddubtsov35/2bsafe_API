package ParentsTests;

import com.dubtsov._2bsafe.Parents.Functions.Authorisation.AuthorisationUserClass;
import com.dubtsov._2bsafe.Parents.Functions.BaseClass.BaseClass;
import com.dubtsov._2bsafe.Parents.Functions.ChildrenCard.ChildrenCardClass;
import com.dubtsov._2bsafe.Parents.Functions.RegisteredUsers.DeleteUserClass;
import com.dubtsov._2bsafe.Parents.Functions.RegisteredUsers.ListRegisteredUsersClass;
import com.dubtsov._2bsafe.Parents.Models.ChildrenCard;
import org.json.simple.parser.ParseException;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * Created by user on 18.07.17.
 */
public class ChildrenCardsTests extends BaseClass {

    public ChildrenCardsTests() throws IOException, ParseException, java.text.ParseException {
        childrenCardClass = new ChildrenCardClass();
        authorisationUserClass = new AuthorisationUserClass();
        listRegisteredUsersClass = new ListRegisteredUsersClass();
        deleteUserClass = new DeleteUserClass();
    }

    @Test
    public void addChildrenCardsWeb() throws Exception {
        authorisationUserClass.RegistrationAndAuthorisationWeb();
        int countCardBefore = childrenCardClass.getChildrenCardList().size();
        System.out.println("countCardBefore  " + countCardBefore);
        childrenCardClass.addChildrenCard();
        int countCardAfter = childrenCardClass.getChildrenCardList().size();
        System.out.println("countCardAfter  " + countCardAfter);
        Assert.assertTrue(countCardAfter - countCardBefore == 1 && response.code() == 200);
    }

    @Test
    public void addChildrenCardsAndroid() throws Exception {
        authorisationUserClass.RegistrationAndAuthorisationWeb();
        int countCardBefore = childrenCardClass.getChildrenCardList().size();
        System.out.println("countCardBefore  " + countCardBefore);
        childrenCardClass.addChildrenCard();
        int countCardAfter = childrenCardClass.getChildrenCardList().size();
        System.out.println("countCardAfter  " + countCardAfter);
        Assert.assertTrue(countCardAfter - countCardBefore == 1);
    }

    @Test
    public void getChildrenCardsList() throws IOException, ParseException, java.text.ParseException {
        authorisationUserClass.RegistrationAndAuthorisationWeb();
        Assert.assertTrue(childrenCardClass.getChildrenCardList().size() == 0);
    }

    @Test
    public void deleteChildrenCards() throws Exception {
        authorisationUserClass.RegistrationAndAuthorisationWeb();
        childrenCardClass.addChildrenCard();
        int countCardBefore = childrenCardClass.getChildrenCardList().size();
        System.out.println("countCardBefore  " + countCardBefore);
        childrenCardClass.deleteChildrenCard();
        int countCardAfter = childrenCardClass.getChildrenCardList().size();
        System.out.println("countCardAfter  " + countCardAfter);
        Assert.assertTrue(countCardBefore - countCardAfter == 1);
    }

    @Test
    public void changeChildrenCardsPhone() throws Exception {
        authorisationUserClass.RegistrationAndAuthorisationWeb();
        childrenCardClass.addChildrenCard();
        response = childrenCardClass.changeChildrenCard("phone");
        ChildrenCard childrenCard = childrenCardClass.getChildrenCardByProfileId();
        System.out.println(childrenCard.toString());
        String result = response.body().string();
        Assert.assertTrue(result.contains("\"scs\": true") &&  response.code() == 200 && childrenCard.getPhone().equals("79189999999"));
    }

    @Test
    public void changeChildrenCardsAge() throws Exception {
        authorisationUserClass.RegistrationAndAuthorisationWeb();
        childrenCardClass.addChildrenCard();
        response = childrenCardClass.changeChildrenCard("age");
        ChildrenCard childrenCard = childrenCardClass.getChildrenCardByProfileId();
        System.out.println(childrenCard.toString());
        String result = response.body().string();
        Assert.assertTrue(result.contains("\"scs\": true") &&  response.code() == 200 && childrenCard.getAge().equals("99"));}

    @Test
    public void changeChildrenCardsAll() throws Exception {
        authorisationUserClass.RegistrationAndAuthorisationWeb();
        childrenCardClass.addChildrenCard();
        response = childrenCardClass.changeChildrenCard("all");
        ChildrenCard childrenCard = childrenCardClass.getChildrenCardByProfileId();
        System.out.println(childrenCard.toString());
        String result = response.body().string();
        Assert.assertTrue(result.contains("\"scs\": true") &&  response.code() == 200 && childrenCard.getPhone().equals("79189999999") && childrenCard.getAge().equals("99"));}



    //Delete users
    /*List<RegisteredUser> registeredList = listRegisteredUsersClass.getListRegisteredUsers();
        System.out.println(registeredList);
    HashMap contentAuthorise = new LinkedHashMap();
    for(int i=0;i < registeredList.size();i++){
            if(registeredList.get(i).getEm().contains("www") && registeredList.get(i).getEm().contains("@binka.me")){
                contentAuthorise.put("login", "www" + registeredList.get(i).getEm().substring(3,registeredList.get(i).getEm().indexOf("@")) + "@binka.me");
                contentAuthorise.put("pwd", "qqqqqq" + registeredList.get(i).getEm().substring(3,registeredList.get(i).getEm().indexOf("@")));
                authorisationUserClass.authorisationUser(contentAuthorise);
                contentAuthorise.clear();

                content.put("pwd", "qqqqqq" + registeredList.get(i).getEm().substring(3,registeredList.get(i).getEm().indexOf("@")));
                deleteUserClass.deleteUser(content);
                System.out.println(content);
                content.clear();
            }
        }
        registeredList = listRegisteredUsersClass.getListRegisteredUsers();
        System.out.println(registeredList);*/
}
