package com.dubtsov._2bsafe.Parents.Functions.Tariffs;

import com.dubtsov._2bsafe.Parents.Functions.Rules.RulesClass;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateContent.BaseContent;
import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateContent.GenerateProfileIdContent;
import com.dubtsov._2bsafe.Parents.Models.Tariff;
import org.json.simple.JSONObject;

/**
 * Created by user on 12.09.17.
 */
public class GenerateTariffContent extends BaseContent{

    public static JSONObject setTariffContent() throws Exception {
        TariffsClass tariffsClass = new TariffsClass();
        int tariffId = 0;
        int currentTariffId = tariffsClass.getCurrentTariff().getTariff();
        for(int i=0; i<tariffsClass.getTariffsList().size(); i++){
            if (tariffsClass.getTariffsList().get(i).getId() != currentTariffId){
                tariffId = tariffsClass.getTariffsList().get(i).getId();
                break;
            }
        }
        jsonObj.put("tariff_id", tariffId);
        jsonObj.put("profile_id", GenerateProfileIdContent.getProfileId());
        return jsonObj;
    }

}
