package com.dubtsov._2bsafe.Parents.Functions.Tariffs;

import com.dubtsov._2bsafe.Parents.Functions.BaseClass.BaseClass;
import com.dubtsov._2bsafe.Parents.Models.Tariff;
import com.dubtsov._2bsafe.Parents.Models.TariffList;
import com.dubtsov._2bsafe.Parents.Parse.GetTariff;
import com.dubtsov._2bsafe.Parents.Response.ResponseClass;
import okhttp3.Response;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

/**
 * Created by user on 06.09.17.
 */
public class TariffsClass extends BaseClass{
    public TariffsClass() throws IOException {}

    public List<TariffList> getTariffsList() throws IOException, ParseException, java.text.ParseException {
        responseClass = new ResponseClass("http://lkn.safec.ru/os_api/tariffs/v1.0/list");
        return GetTariff.getTariffList(responseClass.getResponse().body().string());
    }

    public Tariff getCurrentTariff() throws IOException, ParseException, java.text.ParseException {
        responseClass = new ResponseClass("http://lkn.safec.ru/os_api/tariffs/v1.0/get");
        return GetTariff.getCurrentTariff(responseClass.getResponse().body().string());
    }

    public Response setTariff(HashMap content) throws IOException, ParseException, java.text.ParseException {
        responseClass = new ResponseClass("http://lkn.safec.ru/os_api/tariffs/v1.0/set", content);
        return responseClass.getResponse();
    }
}
