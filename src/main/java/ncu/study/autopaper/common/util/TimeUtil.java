package ncu.study.autopaper.common.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;



import com.hsjry.lang.log.Log;
import com.hsjry.lang.log.TenantLog;
import org.apache.commons.lang3.StringUtils;

import javax.xml.crypto.Data;

public class TimeUtil {

    private static Log   log             = TenantLog.get(TimeUtil.class);

    /**
     * yyyyMMddHHmmss
     */
    public static String FORMAT_YMDHMS   = "yyyyMMddHHmmss";
    /**
     * yyyyMMdd
     */
    public static String FORMAT_YMD      = "yyyyMMdd";
    /**
     * yyyy-MM-dd HH:mm
     */
    public static String FORMAT_YMDHM    = "yyyy-MM-dd HH:mm";
    /**
     * yyyy年MM月dd日
     */
    public static String FORMAT_YMD_CHI  = "yyyy年MM月dd日";
    /**
     * yyyy-MM-dd
     */
    public static String FORMAT_YMD_LINE = "yyyy-MM-dd";
    /**
     * MM-dd
     */
    public static String FORMAT_M_D      = "MM-dd";
    /**
     * yyyy-MM-dd HH:mm:ss
     */
    public static String FORMAT_YMDHM_S  = "yyyy-MM-dd HH:mm:ss";

    public static String FORMAT_HMS      = "HH:mm:ss";

    public static Date getDate(String date, String format) {
        if (StringUtils.isEmpty(date) || StringUtils.isEmpty(format)|| "".equals(date)) {
            return null;
        }
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        try {
            return sdf.parse(date);
        } catch (ParseException e) {
            try {
                if (date.length() == FORMAT_YMD.length()) {
                    SimpleDateFormat sdf2 = new SimpleDateFormat(FORMAT_YMD);
                    return sdf2.parse(date);
                }
            } catch (Exception e2) {
            }

            log.error("{} {} parse error", date, format);
        }
        return null;
    }

    public static String getDateString(Date date, String format) {
        if (date == null || StringUtils.isEmpty(format)) {
            return null;
        }
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        return sdf.format(date);
    }

    public static String transferDatestr(String dateStr, String from, String to) {
        return getDateString(getDate(dateStr, from), to);
    }

    /**
     * yyyyMMddHHmmss >> yyyyMMdd235959
     * 
     * @param dateStr
     * @return
     */
    public static String getDateEnd(String dateStr) {
        if (StringUtils.isEmpty(dateStr)) {
            return null;
        }

        if (FORMAT_YMDHMS.length() == dateStr.length()) {
            return dateStr.substring(0, 8) + "235959";
        }

        return dateStr;
    }

    /**
     * yyyyMMddHHmmss >> yyyyMMdd00000
     * 
     * @param dateStr
     * @return
     */
    public static String getDateStart(String dateStr) {
        if (StringUtils.isEmpty(dateStr)) {
            return null;
        }

        if (FORMAT_YMDHMS.length() == dateStr.length()) {
            return dateStr.substring(0, 8) + "000000";
        }

        return dateStr;
    }

    /**
     * 转让日期为**-**-** 23:59:59
     * 
     * @param date
     * @return
     */
    public static Date getDateEnd(Date date) {
        if (date == null) {
            return null;
        }
        return getDate(getDateEnd(getDateString(date, FORMAT_YMDHMS)), FORMAT_YMDHMS);
    }

    /**
     * 日期转换为**-**-** 00:00:00
     * 
     * @param date
     * @return
     */
    public static Date getDateStart(Date date) {
        if (date == null) {
            return null;
        }
        return getDate(getDateStart(getDateString(date, FORMAT_YMDHMS)), FORMAT_YMDHMS);
    }

    /**
     * 校验date1是否在date2之后
     *
     * @param date1
     * @param date2
     * @return
     */
    public static boolean isAfter(String date1, String date2, String format) {
        Date d1 = getDate(date1, format);
        Date d2 = getDate(date2, format);
        return isAfter(d1, d2);
    }

    /**
     * 校验date1是否在date2之后
     *
     * @param d1
     * @param d2
     * @return
     */
    public static boolean isAfter(Date d1, Date d2) {
        if (d1 == null || d2 == null) {
            return false;
        }
        return d1.getTime() - d2.getTime() > 0;
    }

    /**
     * 获取时分秒
     *
     * @param date
     * @return
     */
    public static String getTimeHMS(Date date) {
        if (date == null) {
            return null;
        }
        SimpleDateFormat df = new SimpleDateFormat("HH:mm:ss");
        return df.format(date);
    }

    /**
     * 计算日期的间隔 d2 - d1
     *
     * @param d1 yyyy-MM-dd
     * @param d2 yyyy-MM-dd
     * @return
     */
    public static int calInterval(String d1, String d2) {
        Date day1 = getDate(d1, FORMAT_YMD);
        Date day2 = getDate(d2, FORMAT_YMD);
        if (day1 == null || day2 == null) {
            return 0;
        }
        long mill = day2.getTime() - day1.getTime();
        return (int) (mill / 1000 / 3600 / 24);
    }

    /**
     * 当天剩余分钟
     *
     * @return
     */
    public static String getTimeCountDown() {
        Date now = new Date();
        String time = TimeUtil.getDateString(now, TimeUtil.FORMAT_YMD) + "235959";
        long leftTime = TimeUtil.getDate(time, TimeUtil.FORMAT_YMDHMS).getTime() - now.getTime();
        return leftTime / 1000 / 60 + 1 + "";
    }

    /**
     * 获取系统时间的后一天
     *
     * @return
     */
    public static String nextDay() {
        Calendar c = Calendar.getInstance();
        c.add(Calendar.DAY_OF_MONTH, 1);
        String dd = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(c.getTime());
        return dd;
    }

    /**
     * 日期计算
     * 
     * @return
     */
    public static Date calDate(Date date, int days) {
        try {
            Calendar c = Calendar.getInstance();
            c.setTime(date);
            c.add(Calendar.DAY_OF_MONTH, days);
            return c.getTime();
        } catch (Exception e) {
            return null;
        }

    }

    public static void main(String[] args) {
        //        System.out.println(getDateStart(new Date()));
        //        System.out.println(getDateEnd(new Date()));
        System.out.println(TimeUtil.getDateString(TimeUtil.calDate(new Date(), 30),
            TimeUtil.FORMAT_YMDHM_S));

    }

}
