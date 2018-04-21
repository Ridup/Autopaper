/**
 * hsjry.com Inc.
 * Copyright (c) 2014-2015 All Rights Reserved.
 */
package ncu.study.autopaper.common.util;

import java.sql.Timestamp;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtil {
    public static final String[] months   = { "一月", "二月", "三月", "四月", "五月", "六月", "七月", "八月", "九月",
            "十月", "十一月", "十二月",          };

    public static final String[] quarters = { "一季度", "二季度", "三季度", "四季度" };

    /**
     * 获取当前日期和时间
     * 格式 yyyyMMdd HH:mm:ss
     * @return String
     */
    public static String getCurrentDateStr() {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        return formatter.format(new Date());
    }

    /**
     * 获取日期字符串。
     * 
     * <pre>
     *  日期字符串格式： yyyyMMdd
     *  其中：
     *      yyyy   表示4位年。
     *      MM     表示2位月。
     *      dd     表示2位日。
     * </pre>
     * 
     * @return String "yyyyMMdd"格式的日期字符串。
     */
    public static String getDate() {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");

        return formatter.format(new Date());
    }

    /**
     * 获取当前年度字符串。
     * 
     * <pre>
     *  日期字符串格式： yyyy
     *  其中：
     *      yyyy   表示4位年。
     * </pre>
     * 
     * @return String "yyyy"格式的当前年度字符串。
     */
    public static String getNowYear() {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy");

        return formatter.format(new Date());
    }


    /**
     * 取得当前日期
     *
     * @param
     * @return 当前日期
     * @throws
     * @Title: getCurrentDate
     * @Description: 取得当前日期的String
     */
    public static String getTimeStr6() {
        String str = "";
        SimpleDateFormat df = new SimpleDateFormat("HHmmss");
        str = df.format(new Date());
        return str;
    }


    /**
     * 获取当前月度字符串。
     * 
     * <pre>
     *  日期字符串格式： MM
     *  其中：
     *      MM   表示4位年。
     * </pre>
     * 
     * @return String "yyyy"格式的当前月度字符串。
     */
    public static String getNowMonth() {
        SimpleDateFormat formatter = new SimpleDateFormat("MM");

        return formatter.format(new Date());
    }

    /**
     * 获取当前月度字符串。
     * 
     * <pre>
     *  日期字符串格式： dd
     *  其中：
     *      dd   表示4位年。
     * </pre>
     * 
     * @return String "yyyy"格式的当前月度字符串。
     */
    public static String getNowDay() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd");

        return formatter.format(new Date());
    }



    /**
     * 根据日期时间获得字符串时间
     *
     * @param date
     * @return
     * @throws Exception
     */
    public static String getTimeStr6(Date date) throws Exception {
        SimpleDateFormat df = new SimpleDateFormat("HHmmss");
        String str = df.format(date);
        return str;
    }


    /**
     * 获取日期字符串。
     * 
     * <pre>
     *  日期字符串格式： yyyyMMdd
     *  其中：
     *      yyyy   表示4位年。
     *      MM     表示2位月。
     *      dd     表示2位日。
     * </pre>
     * 
     * @param date
     *                需要转化的日期。
     * @return String "yyyyMMdd"格式的日期字符串。
     */
    public static String getDate(Date date) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

        return formatter.format(date);
    }

    /**
     * 获取日期字符串。 
     * 
     * <pre>
     *  日期字符串格式： yyyyMMdd
     *  其中：
     *      yyyy   表示4位年。
     *      MM     表示2位月。
     *      dd     表示2位日。
     * </pre>
     * 
     * @param date
     *                需要转化的日期。
     * @return String "yyyyMMdd"格式的日期字符串。
     */
    /**
     * 将指定的日期字符串转化为日期对象
     * 
     * @param dateStr
     *                日期字符串
     * @return java.util.Date
     * @roseuid 3F39FE450385
     */
    public static Date getDate(String dateStr) throws Exception {
        if (DateUtil.isDate(dateStr)) { // 日期型
            SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd");
            try {
                Date date = df.parse(dateStr);
                return date;
            } catch (Exception ex) {
                throw new Exception("日期格式不符合或者日期为空！请检查！");
            } // end try - catch
        } else if (DateUtil.isDateTime(dateStr)) { // 日期时间型
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
            try {
                Date date = df.parse(dateStr);
                return date;
            } catch (Exception ex) {
                return null;
            } // end try - catch
        } // end if
        return null;
    }

    /**
     * 获取日期字符串。
     * 
     * <pre>
     *  日期字符串格式： yyyy-MM-dd
     *  其中：
     *      yyyy   表示4位年。
     *      MM     表示2位月。
     *      dd     表示2位日。
     * </pre>
     * 
     * @return String "yyyy-MM-dd"格式的日期字符串。
     */
    public static String getHyphenDate() {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

        return formatter.format(new Date());
    }

    /**
     * 获取日期字符串。
     * 
     * <pre>
     *  日期字符串格式： yyyy-MM-dd
     *  其中：
     *      yyyy   表示4位年。
     *      MM     表示2位月。
     *      dd     表示2位日。
     * </pre>
     * 
     * @param date
     *                需要转化的日期。
     * @return String "yyyy-MM-dd"格式的日期字符串。
     */
    public static String getHyphenDate(Date date) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

        return formatter.format(date);
    }

    /**
     * 将"yyyyMMdd"格式的日期字符串转换为日期对象。
     * 
     * @param source
     *                日期字符串。
     * @return Date 日期对象。
     */
    public static Date parsePlainDate(String source) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");

        return sdf.parse(source, new ParsePosition(0));
    }

    /**
     * 将“yyyy-MM-dd  HH:mm:ss”格式的日期字符串转换为日期对象。
     * 
     * @param source
     *                日期字符串。
     * @return Date 日期对象。
     */
    public static Date parseHyphenDateTime(String source) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        if (source!=null) {
        	return sdf.parse(source, new ParsePosition(0));
		}
        return null;
    }
    /**
     * 将“yyyy-MM-dd ”格式的日期字符串转换为日期对象。
     * 
     * @param source
     *                日期字符串。
     * @return Date 日期对象。
     */
    public static Date parseHyphenDate(String source) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        if (source!=null) {
        	return sdf.parse(source, new ParsePosition(0));
		}
        return null;
    }
    /**
     * 将指定格式的日期字符串转换为日期对象。
     * 
     * @param source
     *                日期字符串。
     * @param pattern
     *                模式。
     * @return Date 日期对象。
     */
    public static Date parseDate(String source, String pattern) {
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);

        return sdf.parse(source, new ParsePosition(0));
    }

    /**
     * 将“yyyy-MM-dd”格式的日期字符串转换为“yyyyMMdd”格式的日期字符串。
     * 
     * @param source
     *                日期字符串。
     * @return String "yyyymmdd"格式的日期字符串。
     */
    public static String toPlainDate(String source) {
        Date date = parseHyphenDate(source);
        SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");

        return formatter.format(date);
    }

    /**
     * 将“yyyyMMdd”格式的日期字符串转换为“yyyy-MM-dd”格式的日期字符串。
     * 
     * @param source
     *                日期字符串。
     * @return String "yyyy-MM-dd"格式的日期字符串。
     */
    public static String toHyphenDate(String source) {
        Date date = parsePlainDate(source);
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

        return formatter.format(date);
    }

    /**
     * 获取时间戳，将日期对象转换为时间戳类型。
     * 
     * @param date
     *                日期对象
     * @return Timestamp 时间戳
     */
    public static Timestamp getTimestamp(Date date) {
        return new Timestamp(date.getTime());
    }

    /**
     * 获取时间戳，将当前日期转换为时间戳类型。
     * 
     * @return Timestamp 时间戳
     */
    public static Timestamp getTimestamp() {
        return new Timestamp(new Date().getTime());
    }

    /**
     * 将“yyyyMMdd”格式的日期字符串转换为Timestamp类型的对象。
     * 
     * @param source
     *                日期字符串
     * @return Timestamp 时间戳
     */
    public static Timestamp parseTimestamp(String source) {
        Date date = parsePlainDate(source);

        return getTimestamp(date);
    }

    /**
     * 获得年度周期 <br>
     * Example:<br>
     * XJPDateUtil.getPeriodYear("20040229" , -1);<br>
     * XJPDateUtil.getPeriodYear("20040228" , -1);<br>
     * XJPDateUtil.getPeriodYear("20020230" , 2);<br>
     * 
     * @param source
     *                时间串
     * @param yearPeriod
     *                年度周期 -1代表本时间的上一年度,以次类推。
     * @return String 时间。
     */
    public static String getPeriodYear(String source, int yearPeriod) {
        int p = Integer.parseInt(source.substring(0, 4)) + yearPeriod;
        String newYear = String.valueOf(p) + source.substring(4, source.length());
        Date date = parsePlainDate(newYear);
        String s = getDate(date);
        int ny = Integer.parseInt(s);
        int sy = Integer.parseInt(newYear);

        while (ny > sy) {
            sy--;
            ny = Integer.parseInt(getDate(parsePlainDate(String.valueOf(sy))));
        }

        return String.valueOf(sy);
    }

    /**
     * 日期相加
     *
     * @param day
     *             天数
     * @return 返回相加后的日期
     */
    public static String addDate(int day) {
        Calendar c = Calendar.getInstance();

        c.setTimeInMillis(System.currentTimeMillis() + ((long) day) * 24 * 3600 * 1000);
        SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd HH:mm:ss");
        return df.format(c.getTime());
    }

    /**
     * 返回毫秒
     * 
     * @param date
     *             日期
     * @return 返回毫秒
     */
    public static long getMillis(Date date) {
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        return c.getTimeInMillis();
    }

    /**
     * 获取当前日期和时间
     * @param format 日期格式 例：yyyy-MM-dd hh:mm
     * @return String
     */
    public static String getNowDate(String format) {
        Date date = new Date();
        String str = null;
        SimpleDateFormat df = new SimpleDateFormat(format);
        str = df.format(date);
        return str;
    }

    /**
     * 将strmon的日期减小一个月
     * @param strmon
     * @return
     */
    public static String getReduceMonDate(String strmon) {
        if (strmon != null && !strmon.equals("")) {
            Date mon = parseHyphenDate(strmon);
            mon.setMonth(mon.getMonth() - 1);
            return getHyphenDate(mon);
        } else {
            return "";
        }
    }

    /**
     * 根据日期时间获得字符串时间 HH:mm:ss
     * 
     * @param dateStr
     * @return
     * @throws Exception
     */
    public static String getTimeStr(String dateStr) throws Exception {
        Date date = getDate(dateStr);
        String str = null;
        SimpleDateFormat df = new SimpleDateFormat("HH:mm:ss");
        str = df.format(date);
        return str;
    }

    /**
     * 获得字符串时间
     * 
     * @return
     */
    public static String getTimeStr() {
        String str = "";
        SimpleDateFormat df = new SimpleDateFormat("HH:mm:ss");
        str = df.format(new Date());
        return str;
    }

    /**
     * 判断字符串是否日期时间格式
     * 
     * @param str
     * @return
     */
    public static boolean isDateTime(String str) {
        boolean convertSuccess = true;
        // 指定日期格式为四位年/两位月份/两位日期，注意yyyy/MM/dd区分大小写；
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        try {
            // 设置lenient为false. 否则SimpleDateFormat会比较宽松地验证日期，比如2007/02/29会被接受，并转换成2007/03/01
            format.setLenient(false);
            format.parse(str);
        } catch (Exception e) {
            // e.printStackTrace();
            // 如果throw java.text.ParseException或者NullPointerException，就说明格式不对
            convertSuccess = false;
        }
        return convertSuccess;
    }

    /**
     * 判断字符串是否日期格式
     * 
     * @param str
     * @return
     */
    public static boolean isDate(String str) {
        boolean convertSuccess = true;
        // 指定日期格式为四位年/两位月份/两位日期，注意yyyy/MM/dd区分大小写；
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
        try {
            // 设置lenient为false. 否则SimpleDateFormat会比较宽松地验证日期，比如2007/02/29会被接受，并转换成2007/03/01
            format.setLenient(false);
            format.parse(str);
        } catch (Exception e) {
            // e.printStackTrace();
            // 如果throw java.text.ParseException或者NullPointerException，就说明格式不对
            convertSuccess = false;
        }
        return convertSuccess;
    }

    /**
     * 获得 这周的第一天
     * 
     * @return
     */
    public static Date getThisWeekFirstDay() {
        try {
            SimpleDateFormat datef = new SimpleDateFormat("yyyy-MM-dd");
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
            Calendar calendar = Calendar.getInstance();
            // 得到当天是这周的第几天
            int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
            // 减去dayOfWeek,得到第一天的日期，因为Calendar用０－６代表一周七天，所以要减一
            calendar.add(Calendar.DAY_OF_WEEK, -(dayOfWeek - 1));
            String beginTime1 = datef.format(calendar.getTime()) + " 00:00:00";
            Date firstDateOfWeek = dateFormat.parse(beginTime1);

            return firstDateOfWeek;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 获得这周的最后一天
     * 
     * @return
     */
    public static Date getThisWeekLastDay() {
        try {
            SimpleDateFormat datef = new SimpleDateFormat("yyyy-MM-dd");
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
            Calendar calendar = Calendar.getInstance();
            // 得到当天是这周的第几天
            int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
            // 每周7天，加６，得到最后一天的日子
            calendar.add(Calendar.DAY_OF_WEEK, 7 - dayOfWeek);
            String endTime1 = datef.format(calendar.getTime()) + " 23:59:59";
            Date lastDateOfWeek = dateFormat.parse(endTime1);

            return lastDateOfWeek;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 获得这个月的第一天
     * 
     * @return
     */
    public static Date getThisMonthFirstDay() {
        try {
            SimpleDateFormat datef = new SimpleDateFormat("yyyy-MM-dd");
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
            Calendar c = Calendar.getInstance();
            c.add(Calendar.MONTH, 0);
            c.set(Calendar.DAY_OF_MONTH, 1);//设置为1号,当前日期既为本月第一天 
            String beginTime1 = datef.format(c.getTime()) + " 00:00:00";
            Date firstDateOfWeek = dateFormat.parse(beginTime1);
            return firstDateOfWeek;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 获得这个月的最后一天
     * 
     * @return
     */
    public static Date getThisMonthLastDay() {
        try {
            SimpleDateFormat datef = new SimpleDateFormat("yyyy-MM-dd");
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
            Calendar ca = Calendar.getInstance();
            ca.set(Calendar.DAY_OF_MONTH, ca.getActualMaximum(Calendar.DAY_OF_MONTH));
            String endTime1 = datef.format(ca.getTime()) + " 23:59:59";
            Date lastDateOfWeek = dateFormat.parse(endTime1);

            return lastDateOfWeek;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
