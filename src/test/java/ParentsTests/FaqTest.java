package ParentsTests;

import com.dubtsov._2bsafe.Parents.Functions.BaseClass.BaseClass;
import com.dubtsov._2bsafe.Parents.Functions.FAQ.GetFaqByIdClass;
import com.dubtsov._2bsafe.Parents.Functions.FAQ.GetFaqListClass;
import com.dubtsov._2bsafe.Parents.Models.Faq;
import org.json.simple.parser.ParseException;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

/**
 * Created by user on 30.08.17.
 */
public class FaqTest  extends BaseClass{

    List<Faq> list= new ArrayList<>();
    HashMap content = new LinkedHashMap();

    public FaqTest() throws IOException {
        getFaqListClass = new GetFaqListClass();
        getFaqByIdClass = new GetFaqByIdClass();
    }

    @Test
    public void getFaqLk() throws ParseException, java.text.ParseException, IOException {
        list = getFaqListClass.getFaqListLk();
        Assert.assertTrue(list.size() != 0);
    }

    @Test
    public void getFaqVis() throws ParseException, java.text.ParseException, IOException {
        list = getFaqListClass.getFaqListVis();
        Assert.assertTrue(list.size() != 0);
    }

    @Test
    public void getFaqByIdLk() throws ParseException, java.text.ParseException, IOException {
        list = getFaqListClass.getFaqListLk();
        content.put("fid", list.get(0).getFid());
        response = getFaqByIdClass.getFaqListLk();
        String result = response.body().string();
        Assert.assertTrue(result.contains("\"scs\": true") &&  response.code() == 200);
    }

    @Test
    public void getFaqByIdVis() throws ParseException, java.text.ParseException, IOException {
        list = getFaqListClass.getFaqListVis();
        content.put("fid", list.get(0).getFid());
        response = getFaqByIdClass.getFaqListVis();
        String result = response.body().string();
        Assert.assertTrue(result.contains("\"scs\": true") &&  response.code() == 200);
    }


}
