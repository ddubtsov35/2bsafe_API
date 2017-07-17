package com.dubtsov._2bsafe.Functions;

/**
 * Created by user on 17.07.17.
 */
public class ContentClearFlag {

    private static boolean contentClearFlag = true;

    public static boolean isContentClearFlag() {
        return contentClearFlag;
    }

    public static void setContentClearFlag(boolean contentClearFlag) {
        ContentClearFlag.contentClearFlag = contentClearFlag;
    }
}
