package ParentsTests;

import com.dubtsov._2bsafe.Parents.Functions.Authorisation.AuthorisationUserClass;
import com.dubtsov._2bsafe.Parents.Functions.BaseClass.BaseClass;
import com.dubtsov._2bsafe.Parents.Functions.ChildrenCard.AddChildrenCardClass;
import com.dubtsov._2bsafe.Parents.Functions.ChildrenCard.ChangeChildrenCardClass;
import com.dubtsov._2bsafe.Parents.Functions.ChildrenCard.DeleteChildrenCardClass;
import com.dubtsov._2bsafe.Parents.Functions.ChildrenCard.GetChildrenCardListClass;
import com.dubtsov._2bsafe.Parents.Functions.RegisteredUsers.DeleteUserClass;
import com.dubtsov._2bsafe.Parents.Functions.RegisteredUsers.ListRegisteredUsersClass;
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

    HashMap content;

    public ChildrenCardsTests() throws IOException {
        addChildrenCardClass = new AddChildrenCardClass();
        authorisationUserClass = new AuthorisationUserClass();
        getChildrenCardListClass = new GetChildrenCardListClass();
        listRegisteredUsersClass = new ListRegisteredUsersClass();
        deleteUserClass = new DeleteUserClass();
        content = new LinkedHashMap();
        deleteChildrenCardClass = new DeleteChildrenCardClass();
        changeChildrenCardClass = new ChangeChildrenCardClass();
    }

    @Test
    public void addChildrenCardsWeb() throws Exception {
        authorisationUserClass.RegistrationAndAuthorisationWeb();
        int countCardBefore = getChildrenCardListClass.getChildrenCardListCount();
        System.out.println("countCardBefore  " + countCardBefore);
        response = addChildrenCardClass.addChildrenCard();
        int countCardAfter = getChildrenCardListClass.getChildrenCardListCount();
        System.out.println("countCardAfter  " + countCardAfter);
        Assert.assertTrue(countCardAfter - countCardBefore == 1 && response.code() == 200);
    }

    @Test
    public void addChildrenCardsAndroid() throws Exception {
        authorisationUserClass.RegistrationAndAuthorisationWeb();
        int countCardBefore = getChildrenCardListClass.getChildrenCardListCount();
        System.out.println("countCardBefore  " + countCardBefore);
        response = addChildrenCardClass.addChildrenCard();
        int countCardAfter = getChildrenCardListClass.getChildrenCardListCount();
        System.out.println("countCardAfter  " + countCardAfter);
        Assert.assertTrue(countCardAfter - countCardBefore == 1 && response.code() == 200);
    }

    @Test
    public void getChildrenCardsList() throws IOException, ParseException, java.text.ParseException {
        authorisationUserClass.RegistrationAndAuthorisationWeb();
        Assert.assertTrue(getChildrenCardListClass.getChildrenCardListCount() == 0);
    }

    @Test
    public void deleteChildrenCards() throws Exception {
        authorisationUserClass.RegistrationAndAuthorisationWeb();
        response = addChildrenCardClass.addChildrenCard();
        int countCardBefore = getChildrenCardListClass.getChildrenCardListCount();
        System.out.println("countCardBefore  " + countCardBefore);
        deleteChildrenCardClass.deleteChildrenCard(getChildrenCardListClass.getChildrenCardList());
        int countCardAfter = getChildrenCardListClass.getChildrenCardListCount();
        System.out.println("countCardAfter  " + countCardAfter);
        Assert.assertTrue(countCardBefore - countCardAfter == 1 && response.code() == 200);
    }

    @Test
    public void changeChildrenCardsPhone() throws Exception {
        authorisationUserClass.RegistrationAndAuthorisationWeb();
        response = addChildrenCardClass.addChildrenCard();
        response = changeChildrenCardClass.changeChildrenCard(getChildrenCardListClass.getChildrenCardList(), "phone");
        System.out.println(getChildrenCardListClass.getChildrenCardList().get(0));
        Assert.assertTrue(response.body().string().contains("\"scs\": true") &&  response.code() == 200 && getChildrenCardListClass.getChildrenCardList().get(0).getPhone().equals("79189999999"));
    }

    @Test
    public void changeChildrenCardsAge() throws Exception {
        authorisationUserClass.RegistrationAndAuthorisationWeb();
        response = addChildrenCardClass.addChildrenCard();
        response = changeChildrenCardClass.changeChildrenCard(getChildrenCardListClass.getChildrenCardList(), "age");
        System.out.println(getChildrenCardListClass.getChildrenCardList().get(0));
        Assert.assertTrue(response.body().string().contains("\"scs\": true") &&  response.code() == 200 && getChildrenCardListClass.getChildrenCardList().get(0).getAge().equals("99"));
    }

    @Test
    public void changeChildrenCardsAll() throws Exception {
        authorisationUserClass.RegistrationAndAuthorisationWeb();
        response = addChildrenCardClass.addChildrenCard();
        response = changeChildrenCardClass.changeChildrenCard(getChildrenCardListClass.getChildrenCardList(), "all");
        //Assert.assertTrue(getChildrenCardListClass.getChildrenCardList().get(0).getPhone().equals("79189999999"));
        Assert.assertTrue(response.body().string().contains("\"scs\": true") &&  response.code() == 200 && getChildrenCardListClass.getChildrenCardList().get(0).getAge().equals("99") && getChildrenCardListClass.getChildrenCardList().get(0).getPhone().equals("79189999999"));
    }



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
