package com.dubtsov._2bsafe.Parents.Parse;

import com.dubtsov._2bsafe.Parents.Models.AccountSettings;
import com.dubtsov._2bsafe.Parents.Models.DeviceShortInfo;
import org.json.simple.parser.ParseException;

/**
 * Created by user on 30.08.17.
 */
public class GetAccountSetting {

    private static AccountSettings accountSettings;

    public static AccountSettings getAccountSettings(String accountSettingsString) throws ParseException, java.text.ParseException {
        try {
            accountSettings = new AccountSettings(accountSettingsString);
            System.out.println(accountSettings.toString());
        } catch (ParseException e){}
        finally {
            return accountSettings;
        }
    }

}
