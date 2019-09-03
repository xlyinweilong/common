package com.yin.common.utils;

import org.springframework.util.DigestUtils;

/**
 * md5加密
 *
 * @author yin.weilong
 * @date 2019.09.02
 */
public class MD5Util {

    //盐，用于混交md5
    private static final String slat = "#zhisheng#";

    /**
     * 生成md5
     *
     * @return
     */
    public static String md5(String str) {
        String base = str + slat;
        return DigestUtils.md5DigestAsHex(base.getBytes());
    }
}
