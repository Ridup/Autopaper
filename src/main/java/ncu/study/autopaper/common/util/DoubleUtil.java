package ncu.study.autopaper.common.util;

import java.math.BigDecimal;

/**
 * @author Ridup
 * @version FleName:  DoubleUtil .java  v0.1  2018/5/19 0:43 Exp $
 */
public class DoubleUtil {
    private static final int DIV_SCALE = 10;//默认除法运算精度

    private DoubleUtil() {

    }

    /**
     * 提供精确的加法运算
     *
     * @param v1 被加数
     * @param v2 加数
     * @return 两个参数的和
     */
    public static double add(double v1, double v2) {
        BigDecimal b1 = new BigDecimal(Double.toString(v1));
        BigDecimal b2 = new BigDecimal(Double.toString(v2));
        return b1.add(b2).doubleValue();
    }

    /**
     * 提供精确的减法运算
     *
     * @param v1 被减数
     * @param v2 减数
     * @return 两个参数的差
     */
    public static double sub(double v1, double v2) {
        BigDecimal b1 = new BigDecimal(Double.toString(v1));
        BigDecimal b2 = new BigDecimal(Double.toString(v2));
        return b1.subtract(b2).doubleValue();
    }

    /**
     * 提供精确的乘法运算
     *
     * @param v1 被乘数
     * @param v2 乘数
     * @return 两个参数的积
     */
    public static double mul(double v1, double v2) {
        BigDecimal b1 = new BigDecimal(Double.toString(v1));
        BigDecimal b2 = new BigDecimal(Double.toString(v2));
        return b1.multiply(b2).doubleValue();
    }

    /**
     * 提供(相对)精确的除法运算
     * 当除不尽时，使用默认精度：DIV_SCALE
     *
     * @param v1 被除数
     * @param v2 除数
     * @return 两个参数的商
     */
    public static double div(double v1, double v2) {
        return div(v1, v2, DIV_SCALE);
    }

    /**
     * 提供(相对)精确的除法运算
     * 当除不尽时，使用参数scale指定精度，进行四舍五入
     *
     * @param v1    被除数
     * @param v2    除数
     * @param scale 表示精确到小数点后几位
     * @return 两个参数的商
     */
    public static double div(double v1, double v2, int scale) {
        if (scale < 0) {
            throw new IllegalArgumentException("scale不能小于0");
        }
        BigDecimal b1 = new BigDecimal(Double.toString(v1));
        BigDecimal b2 = new BigDecimal(Double.toString(v2));
        return b1.divide(b2, scale, BigDecimal.ROUND_HALF_UP).doubleValue();
    }

    /**
     * 提供精确的小数位四舍五入处理
     *
     * @param v1    需要四舍五入的数字
     * @param scale 小数点后保留几位
     * @return 四舍五入后的结果
     */
    public static double round(double v1, int scale) {

        if (scale < 0) {
            throw new IllegalArgumentException("scale不能小于0");
        }
        BigDecimal b = new BigDecimal(Double.toString(v1));
        BigDecimal one = new BigDecimal("1");
        return b.divide(one, scale, BigDecimal.ROUND_HALF_UP).doubleValue();
    }

    public static String format(double v1, int scale) {

        String s = String.valueOf(round(v1, scale));
        s = new BigDecimal(s).toPlainString();//解决科学计算法转换问题

        int k = s.indexOf(".");
        if (k < 0 && scale > 0) {
            s = s + ".0";
            k = s.indexOf(".");
        }

        if (k > 0) {
            int d_scale = (s.length() - (k + 1));
            if (scale > d_scale) {
                for (int i = 0; i < scale - d_scale; i++) {
                    s += "0";
                }
            } else if (scale < d_scale) {//当scale=0时才会出现这种情况
                s = s.substring(0, k);
            }
        }
        return s;
    }

}
