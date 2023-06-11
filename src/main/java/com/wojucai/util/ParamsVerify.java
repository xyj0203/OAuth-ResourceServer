package com.wojucai.util;

/**
 * @description:参数校验类
 * @author: xuyujie
 * @date: 2023/06/11
 **/
public class ParamsVerify {

    /**
     * 校验字符串
     * @param str 待校验字符串
     * @return 校验结果
     */
    public static boolean verifyString(String str) {
        return str != null && !str.trim().isEmpty();
    }
}
