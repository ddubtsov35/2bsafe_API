package com.dubtsov._2bsafe.Childrens.Parse;

import com.dubtsov._2bsafe.Childrens.Models.ChildrenResponseAuthorisationModel;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 * Created by user on 23.08.17.
 */
public class GetChildrenResponseAuthorisation {

    private static ChildrenResponseAuthorisationModel childrenResponseAuthorisationModel;

    public static ChildrenResponseAuthorisationModel getChildrenResponseAuthorisation(String childrenResponseString) throws ParseException, java.text.ParseException {
        try {
            System.out.println("childrenResponseString " + childrenResponseString);
            childrenResponseAuthorisationModel = new ChildrenResponseAuthorisationModel(childrenResponseString);
            return childrenResponseAuthorisationModel;
        } catch (ParseException e){
            return null;
        }
    }
}
