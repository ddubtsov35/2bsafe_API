package com.dubtsov._2bsafe.Parents.Functions.Poll;

import com.dubtsov._2bsafe.Parents.GenerateTestData.GenerateTokenClass;
import org.json.simple.JSONObject;

/**
 * Created by user on 12.09.17.
 */
public class GeneratePollContent{

    private static JSONObject jsonObj;

    public static JSONObject getPollContent() throws Exception {
        jsonObj = new JSONObject();
        PollClass pollClass = new PollClass();
        jsonObj.put("pid", pollClass.getPoll().getPid());
        return jsonObj;
    }

    public static JSONObject setPollContent() throws Exception {
        jsonObj = new JSONObject();
        PollClass pollClass = new PollClass();
        jsonObj.put("pid", pollClass.getPoll().getPid());
        jsonObj.put("vid", pollClass.getPollById().getVid());
        jsonObj.put("option", pollClass.getPollById().getOptions());
        return jsonObj;
    }

}
