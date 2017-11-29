package com.dubtsov._2bsafe.Parents.Functions.Tariffs;

import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateContent.GenerateProfileIdContent;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateTokenClass;
import com.dubtsov._2bsafe.Parents.Models.TariffList;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.util.List;
import java.util.Random;

/**
 * Created by user on 12.09.17.
 */
public class GenerateTariffContent{

    private static JSONObject jsonObj = new JSONObject();

    public static JSONObject setTariffContent() throws Exception {
        TariffsClass tariffsClass = new TariffsClass();
        List<TariffList> tariffList = tariffsClass.getTariffsList();
        int tariffId = 0;
        int currentTariffId = tariffsClass.getCurrentTariff().getTariff();
        for(int i=0; i<tariffList.size(); i++){
            if (tariffList.get(i).getId() != currentTariffId){
                tariffId = tariffList.get(i).getId();
                break;
            }
        }
        jsonObj.put("tariff_id", tariffId);
        if(GenerateProfileIdContent.profileId == null){
            jsonObj  = GenerateProfileIdContent.getProfileId();
            jsonObj.put("profile_id", jsonObj.get("profile_id"));
        } else{
            jsonObj.put("profile_id", GenerateProfileIdContent.profileId);
        }
        return jsonObj;
    }

    public static Object[] provideNegativeSetTariffContent() throws Exception {
        Random random = new Random();
        TariffsClass tariffsClass = new TariffsClass();
        List<TariffList> tariffList = tariffsClass.getTariffsList();
        int tariffId = 0;
        int currentTariffId = tariffsClass.getCurrentTariff().getTariff();
        for(int i=0; i<tariffList.size(); i++){
            if (tariffList.get(i).getId() != currentTariffId){
                tariffId = tariffList.get(i).getId();
                break;
            }
        }

        JSONObject jsonObj = new JSONObject();
        if(GenerateProfileIdContent.profileId == null){
            jsonObj  = GenerateProfileIdContent.getProfileId();
            jsonObj.put("profile_id", jsonObj.get("profile_id"));
        } else{
            jsonObj.put("profile_id", GenerateProfileIdContent.profileId);
        }
        jsonObj.put("tariff_id",null);

        JSONObject jsonObj2 = new JSONObject();
        jsonObj2.put("profile_id", null);
        jsonObj2.put("tariff_id", random.nextInt((90 - 0) + 1) + 0);

        JSONObject jsonObj3 = new JSONObject();

        JSONObject jsonObj4 = new JSONObject();
        jsonObj4.put("profile_id", random.nextInt(1000000 - 1 + 1)+1);
        jsonObj4.put("tariff_id", tariffId);

        JSONObject jsonObj5 = new JSONObject();
        jsonObj5.put("profile_id", null);
        jsonObj5.put("tariff_id",null);


        return new Object[]{
                new JSONObject[] {jsonObj},
                new JSONObject[]{jsonObj2},
                new JSONObject[]{jsonObj3},
                new JSONObject[]{jsonObj4},
                new JSONObject[]{jsonObj5}
        };
    }

}
