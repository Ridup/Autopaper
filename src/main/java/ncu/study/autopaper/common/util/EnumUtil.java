package ncu.study.autopaper.common.util;


import ncu.study.autopaper.common.enums.Constant;
import ncu.study.autopaper.common.enums.EnumMessage;

/**
 * @author Ridup
 * @version FleName:  EnumUtil.java   v0.1  2018/4/17 0:26  Exp $
 */
public class EnumUtil {
    /**
     * 获取value返回枚举对象
     *
     * @param value
     * @param clazz
     */
    public static <T extends EnumMessage> T getEnumObject(Object value, Class<T> clazz) {
        return (T) Constant.ENUM_MAP.get(clazz).get(value);
    }
}
