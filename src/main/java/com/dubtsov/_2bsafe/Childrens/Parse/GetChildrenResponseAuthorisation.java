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

    private static JSONParser parser;
    private static Object obj;
    private static JSONObject jsonObj;
    private static JSONArray jsonArray;

    private static ChildrenResponseAuthorisationModel childrenResponseAuthorisationModel;

    public static ChildrenResponseAuthorisationModel getChildrenResponseAuthorisation(String childrenResponseString) throws ParseException, java.text.ParseException {
        try {
            childrenResponseAuthorisationModel = new ChildrenResponseAuthorisationModel(childrenResponseString);
            //System.out.println("childrenResponseAuthorisationModel " + childrenResponseAuthorisationModel);
            return childrenResponseAuthorisationModel;
        } catch (ParseException e){
            return null;
        }
    }
}
