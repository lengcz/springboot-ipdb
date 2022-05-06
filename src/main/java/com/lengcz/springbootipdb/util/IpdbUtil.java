package com.lengcz.springbootipdb.util;


import net.ipip.ipdb.City;

import java.io.IOException;

/**
 * 从城市查询
 *
 * @author lengcz
 */
public class IpdbUtil {

    private static City city_DB;

    static {
        try {
            city_DB = new City(new IpdbUtil().getClass().getResource("/").getPath() + "ipipfree.ipdb");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 通过IP查询城市
     *
     * @param ip            (IPv4或者 IPv6)
     * @param language,例如CN
     * @return 例如[中国, 广东, 广州]
     */
    public static String[] find(String ip, String language) {
        try {
            return city_DB.find(ip, language);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}