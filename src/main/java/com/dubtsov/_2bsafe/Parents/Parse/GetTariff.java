package com.dubtsov._2bsafe.Parents.Parse;

import com.dubtsov._2bsafe.Parents.Models.AddSession;
import com.dubtsov._2bsafe.Parents.Models.IntervalBlock;
import com.dubtsov._2bsafe.Parents.Models.Tariff;
import com.dubtsov._2bsafe.Parents.Models.TariffList;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 06.09.17.
 */
public class GetTariff {

    private static JSONParser parser;
    private static Object obj;
    private static JSONArray jsonArray;
    private static Tariff tariff;
    private static List<TariffList> tariffList;

    public static Tariff getCurrentTariff(String tariffString){
        try {
            System.out.println("tariffString " + tariffString);
            tariff = new Tariff(tariffString);
        } catch (ParseException e){}
        finally {
            return tariff;
        }
    }

    public static List<TariffList> getTariffList(String tariffListString){
        parser = new JSONParser();
        tariffList = new ArrayList();
        try {
            obj = parser.parse(tariffListString);
            jsonArray = (JSONArray) obj;
            for (int i = 0; i < jsonArray.size(); i++) {
                tariffList.add(new TariffList(jsonArray.get(i).toString()));
            }
        } catch (ParseException e){}
        finally {
            return tariffList;
        }
    }

}
