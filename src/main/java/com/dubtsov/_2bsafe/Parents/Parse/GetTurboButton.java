package com.dubtsov._2bsafe.Parents.Parse;

import com.dubtsov._2bsafe.Parents.Models.Tariff;
import com.dubtsov._2bsafe.Parents.Models.TurboButton;
import org.json.simple.parser.ParseException;

/**
 * Created by user on 12.09.17.
 */
public class GetTurboButton {

    private static TurboButton turboButton;

    public static TurboButton getTurboButton(String turboButtonString){
        try {
            turboButton = new TurboButton(turboButtonString);
        } catch (ParseException e){}
        finally {
            return turboButton;
        }
    }

}
