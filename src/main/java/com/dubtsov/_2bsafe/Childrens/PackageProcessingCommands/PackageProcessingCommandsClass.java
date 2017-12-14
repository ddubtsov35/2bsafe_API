package com.dubtsov._2bsafe.Childrens.PackageProcessingCommands;

import com.dubtsov._2bsafe.Parents.Functions.BaseClass.BaseClass;
import com.dubtsov._2bsafe.Parents.Response.ResponseClass;
import okhttp3.Response;
import org.json.simple.JSONObject;

import java.io.IOException;

/**
 * Created by user on 24.08.17.
 */
public class PackageProcessingCommandsClass extends BaseClass{

    JSONObject jsonObject;
    GenerateProcessingCommandContent generateProcessingCommandContent = new GenerateProcessingCommandContent();

    public PackageProcessingCommandsClass() throws IOException {}

    public Response packageProcessingCommands() throws Exception {
        jsonObject = generateProcessingCommandContent.getProcessingCommandsContent();
        responseClass = new ResponseClass("http://api.safec.ru/os_api/clients/v1.0/batch_process", jsonObject);
        return responseClass.getJsonResponse();
    }
}