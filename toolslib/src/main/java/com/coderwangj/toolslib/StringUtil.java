package com.coderwangj.toolslib;

/**
 * Created by WangJ on 2017/8/9.
 */

public class StringUtil {

    /**
     *
     * @param str
     * @return
     */
    public static boolean isEmpty(String str) {
        return "".equals(str) || str == null;
    }

    public static boolean isNotEmpty(String str) {
        return !"".equals(str) && str != null;
    }

//    public static boolean isAll
}
