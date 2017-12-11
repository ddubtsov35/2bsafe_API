package com.dubtsov._2bsafe.Childrens.Parse;

import com.dubtsov._2bsafe.Childrens.Models.ConditionInformationFromDevice;
import com.dubtsov._2bsafe.Parents.Models.ChildrenCard;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 23.08.17.
 */
public class GetConditionInformationFromDevice {

    private static ConditionInformationFromDevice conditionInformationFromDevice;

    public static ConditionInformationFromDevice getConditionInformationFromDevice(String conditionInformationString) throws ParseException, java.text.ParseException, IOException {
        System.out.println("conditionInformationString " + conditionInformationString);
        try {
            return conditionInformationFromDevice = new ConditionInformationFromDevice(conditionInformationString);
        } catch (ParseException e) {
            return null;
        }
    }
}
