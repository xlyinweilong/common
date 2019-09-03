package com.yin.common.store;

/**
 * 租户存贮
 *
 * @author yin.weilong
 * @date 2019.09.02
 */
public class TnStore {

    public static ThreadLocal<String> tnStore = new ThreadLocal<>();

}
