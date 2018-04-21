package ncu.study.autopaper.common.util;


import org.apache.commons.lang3.StringUtils;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Hashtable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateUtil {
    private static Pattern phone        = Pattern.compile("^0?(13|15|18|14|17)[0-9]{9}$");
    private static Pattern password     = Pattern.compile("^(?!\\D+$)(?![^a-zA-Z]+$)\\S{6,16}$");
    private static Pattern bankCardNo   = Pattern.compile("^(\\d{14,22})$");
    private static Pattern email        = Pattern
            .compile("^\\w+((-\\w+)|(\\.\\w+))*\\@[A-Za-z0-9]+((\\.|-)[A-Za-z0-9]+)*\\.[A-Za-z0-9]+$");
    private static Pattern telRex       = Pattern.compile("^([0-9]{3,4}-)?[0-9]{7,8}$");
    private static Pattern payPwd       = Pattern.compile("^(\\d{6})$");
    private static Pattern chineseChar  = Pattern.compile("^([\u4e00-\u9fa5]{1,})$");
    private static Pattern annualIncome = Pattern.compile("(^[\\d]{1,9}(\\.[\\d]{0,2})?)$");

    public static String[] illegalStrs  = { "insert ", "select ", "drop ", "update ", "delete ",
            "java", "javascript", "script", "<script", "<input", "alert", "onerror", "onclick",
            "onload", "iframe", "frame" };

    public static boolean isValidMobile(String mobile) {
        if (StringUtils.isEmpty(mobile)) {
            return false;
        }
        return phone.matcher(mobile).matches();
    }

    public static boolean isValidAnnualIncome(String str) {
        if (StringUtil.isEmpty(str)) {
            return true;
        }
        return annualIncome.matcher(str).matches();
    }

    public static boolean isChineseChar(String str) {
        if (StringUtil.isEmpty(str)) {
            return false;
        }
        return chineseChar.matcher(str).matches();
    }

    public static boolean isValidTel(String tel) {
        return telRex.matcher(tel).matches();
    }

    public static boolean isValidPwd(String pwd) {
        if (StringUtils.isEmpty(pwd) || pwd.length() < 6 || pwd.length() > 16) {
            return false;
        }
        return password.matcher(pwd).matches();
    }

    // 验证银行卡号
    public static boolean isValidBankCard(String bankCard) {
        return bankCardNo.matcher(bankCard).matches();
    }

    /**
     * 身份证号验证
     *
     * @param str
     * @return
     */
    @SuppressWarnings("rawtypes")
    public static boolean isValidCertNo(String str) {
        if (StringUtil.isEmpty(str)) {
            return false;
        }
        String[] ValCodeArr = { "1", "0", "X", "9", "8", "7", "6", "5", "4", "3", "2" };
        String[] Wi = { "7", "9", "10", "5", "8", "4", "2", "1", "6", "3", "7", "9", "10", "5",
                "8", "4", "2" };
        String Ai = "";
        if (str.length() != 15 && str.length() != 18) {
            return false;
        }
        if (str.length() == 18) {
            Ai = str.substring(0, 17);
        } else if (str.length() == 15) {
            Ai = str.substring(0, 6) + "19" + str.substring(6, 15);
        }
        try {
            isNumeric(Ai);
        } catch (Exception e) {
            return false;
        }

        String strYear = Ai.substring(6, 10);// 年份
        String strMonth = Ai.substring(10, 12);// 月份
        String strDay = Ai.substring(12, 14);// 月份
        if (isDate(strYear + "-" + strMonth + "-" + strDay) == false) {
            return false;
        }
        GregorianCalendar gc = new GregorianCalendar();
        SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
        try {
            if ((gc.get(Calendar.YEAR) - Integer.parseInt(strYear)) > 150
                    || (gc.getTime().getTime() - s.parse(strYear + "-" + strMonth + "-" + strDay)
                    .getTime()) < 0) {
                return false;
            }
        } catch (Exception e) {
            return false;
        }
        if (Integer.parseInt(strMonth) > 12 || Integer.parseInt(strMonth) == 0) {
            return false;
        }
        if (Integer.parseInt(strDay) > 31 || Integer.parseInt(strDay) == 0) {
            return false;
        }

        Hashtable h = GetAreaCode();
        if (h.get(Ai.substring(0, 2)) == null) {
            return false;
        }

        int TotalmulAiWi = 0;
        for (int i = 0; i < 17; i++) {
            TotalmulAiWi = TotalmulAiWi + Integer.parseInt(String.valueOf(Ai.charAt(i)))
                    * Integer.parseInt(Wi[i]);
        }
        int modValue = TotalmulAiWi % 11;
        String strVerifyCode = ValCodeArr[modValue];
        Ai = Ai + strVerifyCode;

        if (str.length() == 18) {
            if (!Ai.equals(str)) {
                return false;
            }
        }
        return true;
    }

    /**
     * 功能：判断字符串是否为日期格式
     *
     * @param
     * @return
     */
    public static boolean isDate(String strDate) {
        Pattern pattern = Pattern
                .compile("^((\\d{2}(([02468][048])|([13579][26]))[\\-\\/\\s]?((((0?[13578])|(1[02]))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(3[01])))|(((0?[469])|(11))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(30)))|(0?2[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])))))|(\\d{2}(([02468][1235679])|([13579][01345789]))[\\-\\/\\s]?((((0?[13578])|(1[02]))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(3[01])))|(((0?[469])|(11))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(30)))|(0?2[\\-\\/\\s]?((0?[1-9])|(1[0-9])|(2[0-8]))))))(\\s(((0?[0-9])|([1-2][0-3]))\\:([0-5]?[0-9])((\\s)|(\\:([0-5]?[0-9])))))?$");
        Matcher m = pattern.matcher(strDate);
        if (m.matches()) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * 功能：设置地区编码
     *
     * @return Hashtable 对象
     */
    @SuppressWarnings({ "unchecked", "rawtypes" })
    private static Hashtable GetAreaCode() {
        Hashtable hashtable = new Hashtable();
        hashtable.put("11", "北京");
        hashtable.put("12", "天津");
        hashtable.put("13", "河北");
        hashtable.put("14", "山西");
        hashtable.put("15", "内蒙古");
        hashtable.put("21", "辽宁");
        hashtable.put("22", "吉林");
        hashtable.put("23", "黑龙江");
        hashtable.put("31", "上海");
        hashtable.put("32", "江苏");
        hashtable.put("33", "浙江");
        hashtable.put("34", "安徽");
        hashtable.put("35", "福建");
        hashtable.put("36", "江西");
        hashtable.put("37", "山东");
        hashtable.put("41", "河南");
        hashtable.put("42", "湖北");
        hashtable.put("43", "湖南");
        hashtable.put("44", "广东");
        hashtable.put("45", "广西");
        hashtable.put("46", "海南");
        hashtable.put("50", "重庆");
        hashtable.put("51", "四川");
        hashtable.put("52", "贵州");
        hashtable.put("53", "云南");
        hashtable.put("54", "西藏");
        hashtable.put("61", "陕西");
        hashtable.put("62", "甘肃");
        hashtable.put("63", "青海");
        hashtable.put("64", "宁夏");
        hashtable.put("65", "新疆");
        hashtable.put("71", "台湾");
        hashtable.put("81", "香港");
        hashtable.put("82", "澳门");
        hashtable.put("91", "国外");
        return hashtable;
    }

    /**
     * 功能：判断字符串是否为数字
     *
     * @param str
     * @return
     */
    private static boolean isNumeric(String str) {
        Pattern pattern = Pattern.compile("[0-9]*");
        Matcher isNum = pattern.matcher(str);
        if (!isNum.matches()) {
            return false;
        }
        return true;
    }

    /**
     * 邮箱验证
     *
     * @param str
     * @return
     */
    public static boolean isValidEmail(String str) {
        return email.matcher(str).matches();
    }

    public static boolean isValidPayPwd(String str) {
        return payPwd.matcher(str).matches();
    }

    /**
     * 图形验证码校验
     *
     * @param piccode
     * @param request
     * @return
     */
    /*public static boolean validPiccode(String piccode, HttpServletRequest request) {
        if (!ResourceUtil.isProductEnv()) {
            return true;
        }
        if (StringUtils.isEmpty(piccode)) {
            return false;
        }
        String sCode = (String) request.getSession().getAttribute(GlobalConstants.PICCODE);
        if (StringUtils.isEmpty(sCode)) {
            return false;
        }
        if (!piccode.equalsIgnoreCase(sCode)) {
            removcePiccode(request);
            return false;
        }
        return true;
    }*/

    /**
     * 控制删除图形码
     *
     * @param request
     */
/*    public static void removcePiccode(HttpServletRequest request) {
        request.getSession().removeAttribute(GlobalConstants.PICCODE);
    }*/

    /**
     * 防御脚本攻击 <br>
     * 1、空允许 <br>
     * 2、最大250字符
     *
     * @param str
     * @return
     */
    public static boolean validStrDefendXSS(String str) {
        if (str == null || str.length() == 0) {
            return true;
        }

        if (str.length() > 250) {
            return false;
        }

        str = str.toLowerCase();
        for (int i = 0; i < illegalStrs.length; i++) {
            if (str.indexOf(illegalStrs[i]) >= 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * 没有长度限制的安全字符校验
     * @param str
     * @return
     */
    public static boolean validStr(String str) {
        if (str == null || str.length() == 0) {
            return true;
        }
        str = str.toLowerCase();
        for (int i = 0; i < illegalStrs.length; i++) {
            if (str.indexOf(illegalStrs[i]) >= 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(validStrDefendXSS("inse  dsfsfs"));
    }

}
