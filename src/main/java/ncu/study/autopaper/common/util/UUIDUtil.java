/**
 * hsjry.com Inc.
 * Copyright (c) 2014-2015 All Rights Reserved.
 */
package ncu.study.autopaper.common.util;

import java.util.Random;
import java.util.UUID;

/**
 * UUID工具类
 * @author Ridup
 * @version $Id: UUIDUtil.java, v 0.1 Oct 14, 2015 1:18:12 PM Ridup Exp $
 */
public class UUIDUtil {

    public static String getUUID() {
        String uuid = UUID.randomUUID().toString().replaceAll("-", "");
        return uuid;
    }
    /**
     * 自定义规则生成32位编码
     * 
     * @return string
     */
    public static String getUUIDByRules(String rules) {
        String radStr = rules;
        int rpoint = 0;
        StringBuffer generateRandStr = new StringBuffer();
        Random rand = new Random();
        int length = 32;
        for (int i = 0; i < length; i++) {
            if (rules != null) {
                rpoint = rules.length();
                int randNum = rand.nextInt(rpoint);
                generateRandStr.append(radStr.substring(randNum, randNum + 1));
            }
        }
        return generateRandStr + "";
    }
}
