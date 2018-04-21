/**
 * @System: p2p平台
 * Copyright (c) 2015杭州恒生云融网络有限公司-版权所有
 */
package ncu.study.autopaper.common.util;

import java.math.BigDecimal;
import java.util.regex.Pattern;

/**
 * @author: Ridup
 * Date: 2015/11/24
 * Time: 17:12
 * @mail: Ridup
 * @version: 2.0
 */

public class MathUtil {

    //校验输入金额必须为正整数
    public static boolean isPositiveInteger(String s) {
        Pattern v = Pattern.compile("^[1-9]\\d*$");

        boolean positiveInteger = false;

        if (v.matcher(s).matches()) {

            positiveInteger = true;
        } else {

            positiveInteger = false;
        }
        return positiveInteger;
    }

    //校验输入的天数为1-30天的某一天
    public static boolean isOneOfMonth(String s) {
        Pattern v = Pattern.compile("^([12][0-9]|30|[1-9])$");

        boolean falg = false;

        if (v.matcher(s).matches()) {

            falg = true;
        } else {

            falg = false;
        }
        return falg;
    }

    //校验金额，16位，小数点保留2位
    public static boolean isValidMoney(String money) {
        //小数点后两位
        Pattern pattern = Pattern.compile("^(([1-9]{1}\\d*)|([0]{1}))(\\.(\\d){0,2})?$");
        boolean moneyFlag = false;

        if (!pattern.matcher(money).matches()) {
            moneyFlag = false;
        } else {
            int pointIndex = money.indexOf('.');
            int endIndex = money.length();

            if (pointIndex > -1) {
                endIndex = pointIndex;
            }

            String zNum = money.substring(0, endIndex);

            if (zNum.length() > 14) {
                moneyFlag = false;
            } else {
                moneyFlag = true;
            }
        }

        return moneyFlag;
    }

    // d1 / d2 * 100
    public static String getPercent(BigDecimal d1, BigDecimal d2) {
        if (d1 == null || d1 == null || d2.compareTo(BigDecimal.ZERO) == 0) {
            return "0.00";
        }

        BigDecimal one00 = new BigDecimal(100);
        BigDecimal res = d1.multiply(new BigDecimal(100)).divide(d2, 2,
                BigDecimal.ROUND_HALF_DOWN);
        if (one00.compareTo(res) == 0) {
            return "100";
        }
        return res.toString();
    }
}

