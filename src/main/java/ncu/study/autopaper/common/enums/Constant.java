package ncu.study.autopaper.common.enums;

import ncu.study.autopaper.common.util.PackageUtil;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Ridup
 * @version FleName:  Constant.java   v0.1  2018/4/17 9:47  Exp $
 */
public class Constant {
    /**
     * 枚举类包名集合
     */
    public static List<String> pathList = initPackagePathList();
    /**
     * 枚举接口类全路径
     */
    public final static String ENUM_MESSAGE_PATH = "ncu.study.autopaper.common.enums.EnumMessage";

    /**
     * 枚举类对应的全路径集合
     */
    public static final List<String> ENUM_OBJECT_PATH = PackageUtil.getPackageClasses(pathList, true);

    /**
     * 存放单个枚举对象 map常量定义
     */
    private static Map<Object, EnumMessage> SINGLE_ENUM_MAP = null;

    /**
     * 所有枚举对象的 map
     */
    public static final Map<Class, Map<Object, EnumMessage>> ENUM_MAP = initialEnumMap(true);

    private static List<String> initPackagePathList() {
        List<String> list = new ArrayList<>();
        list.add("ncu.study.autopaper.common.enums");
        return list;
    }

    static {
        System.out.println("类被加载时，先初始化各个静态变量，再执行static块。" +
                "所以不能在这里执行pathList的add操作(\"ncu.study.autopaper.common.enums\")。");
    }
    /**
     * 加载所有枚举对象数据
     *
     * @param isFouceCheck 是否强制校验枚举是否实现了EnumMessage接口,若为false则没有实现接口的枚举类也会被加载
     */
    private static Map<Class, Map<Object, EnumMessage>> initialEnumMap(boolean isFouceCheck) {
        Map<Class, Map<Object, EnumMessage>> ENUM_MAP = new HashMap<>();
        try {
            for (String classname : ENUM_OBJECT_PATH) {
                Class<?> cls = null;
                cls = Class.forName(classname);
                Class<?>[] iter = cls.getInterfaces();
                boolean flag = false;
                if (isFouceCheck) {
                    for (Class cz : iter) {
                        if (cz.getName().equals(ENUM_MESSAGE_PATH)) {
                            flag = true;
                            break;
                        }
                    }
                }
                if (flag == isFouceCheck) {
                    SINGLE_ENUM_MAP = new HashMap<>();
                    initialSingleEnumMap(cls);
                    ENUM_MAP.put(cls, SINGLE_ENUM_MAP);
                }

            }
        } catch (Exception e) {

        }
        return ENUM_MAP;
    }

    /**
     * 加载每个枚举对象数据
     */
    private static void initialSingleEnumMap(Class<?> cls) throws Exception {
        Method method = cls.getMethod("values");
        EnumMessage inter[] = (EnumMessage[]) method.invoke(null, null);
        for (EnumMessage enumMessage : inter) {
            SINGLE_ENUM_MAP.put(enumMessage.getValue(), enumMessage);
        }
    }
}
