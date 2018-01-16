package com.dubtsov._2bsafe.Parents.Functions.Tariffs;

import com.dubtsov._2bsafe.Parents.Functions.BaseClass.BaseClass;
import com.dubtsov._2bsafe.Parents.Models.Tariff;
import com.dubtsov._2bsafe.Parents.Models.TariffList;
import com.dubtsov._2bsafe.Parents.Parse.GetTariff;
import com.dubtsov._2bsafe.Parents.Response.ResponseClass;
import okhttp3.Response;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

/**
 * Created by user on 06.09.17.
 */
public class TariffsClass extends BaseClass{

    JSONObject jsonObject;

    public TariffsClass() throws IOException {}

    public List<TariffList> getTariffsList() throws IOException, ParseException, java.text.ParseException {
        responseClass = new ResponseClass(lkApi + "/tariffs/v1.0/list");
        return GetTariff.getTariffList(responseClass.getJsonResponse().body().string());
    }

    public Tariff getCurrentTariff() throws IOException, ParseException, java.text.ParseException {
        responseClass = new ResponseClass(lkApi + "/tariffs/v1.0/get");
        return GetTariff.getCurrentTariff(responseClass.getJsonResponse().body().string());
    }

    public Response setTariff() throws Exception {
        jsonObject = GenerateTariffContent.setTariffContent();
        responseClass = new ResponseClass(lkApi + "/tariffs/v1.0/set", jsonObject);
        return responseClass.getJsonResponse();
    }
    public Response NegativeSetTariff(JSONObject jsonObject) throws Exception {
        responseClass = new ResponseClass(lkApi + "/tariffs/v1.0/set", jsonObject);
        return responseClass.getJsonResponse();
    }
}
