package com.dubtsov._2bsafe.Childrens.Authorisation;

import com.dubtsov._2bsafe.Childrens.Models.ChildrenResponseAuthorisationModel;
import com.dubtsov._2bsafe.Childrens.Parse.GetChildrenResponseAuthorisation;
import okhttp3.Response;
import org.json.simple.parser.ParseException;

import java.io.IOException;

/**
 * Created by user on 23.08.17.
 */
public class ChildrenAuthorisationResponseClass {

    public ChildrenResponseAuthorisationModel childrenResponseAuthorisation(Response response) throws IOException, ParseException, java.text.ParseException {
        String responseString = response.body().string();
        return GetChildrenResponseAuthorisation.getChildrenResponseAuthorisation(responseString);
    }

}
