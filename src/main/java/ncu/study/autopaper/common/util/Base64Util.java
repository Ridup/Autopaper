package ncu.study.autopaper.common.util;

import org.apache.commons.net.util.Base64;

/**
 * Base64 编码与解码
 * 
 * @author Ridup
 * @version $Id: Base64Util.java, v 0.1 2015年11月30日 下午12:17:25 Ridup Exp $
 */
public class Base64Util {

    /**
     * 编码
     * 
     * @param str
     * @return
     */
    public static String encodeBASE64(String str) {
        if (str == null)
            return null;
        return Base64.encodeBase64String(str.getBytes());
    }

    /**
     * 解码
     * 
     * @param str
     * @return
     */
    public static String decodeBASE64(String str) {
        if (str == null)
            return null;
        try {
            byte[] dataBytes = Base64.decodeBase64(str);
            return new String(dataBytes);
        } catch (Exception e) {
            return null;
        }
    }

    public static void main(String[] args) {
        System.out.println(Base64Util.decodeBASE64(Base64Util.encodeBASE64("hundsun")));
    }

}
