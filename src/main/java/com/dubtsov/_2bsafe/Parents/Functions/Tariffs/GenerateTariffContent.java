package com.dubtsov._2bsafe.Parents.Functions.Tariffs;

import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateContent.GenerateProfileIdContent;
import com.dubtsov._2bsafe.Parents.Models.TariffList;
import org.json.simple.JSONObject;

import java.util.List;

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
        jsonObj.put("profile_id", GenerateProfileIdContent.getProfileId().get("profile_id"));
        return jsonObj;
    }

}
