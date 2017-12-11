package com.dubtsov._2bsafe.Parents.Pool;

import com.sun.jna.platform.win32.Netapi32Util;
import org.apache.xpath.SourceTree;
import org.json.simple.parser.ParseException;

import java.io.IOException;

/**
 * Created by user on 05.12.17.
 */
public class LogPools {

    public static void getLog() throws IOException, ParseException, java.text.ParseException {
        System.out.println();
        System.out.println("-------------------------------------------------------");
        System.out.println("UserPool " + UserPool.getUserFromFile());
        System.out.println("ChildrenCardPool " + ChildrenCardPools.getChildrenCardFromFile());
        System.out.println("CidCkeyPool " + CidCkeyPool.getCidFromFile());
        System.out.println("CidCkeyRegisteredPool " + CidCkeyRegisteredPool.getCidFromFile());
        System.out.println("-------------------------------------------------------");
        System.out.println();
    }

}
