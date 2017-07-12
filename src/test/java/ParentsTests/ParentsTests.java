package ParentsTests;

import com.dubtsov._2bsafe.GenerateEmailClass;
import com.dubtsov._2bsafe.GeneratePhoneClass;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by user on 12.07.17.
 */
public class ParentsTests extends BaseTestClass{

    @Test
    public void checkEmailPhone() throws IOException {
        System.out.println(GenerateEmailClass.getGeneratedEmail());
    }

}
