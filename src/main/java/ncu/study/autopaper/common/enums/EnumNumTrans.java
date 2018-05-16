package ncu.study.autopaper.common.enums;

/**
 * @author Ridup
 * @version FleName:  EnumNumTrans .java  v0.1  2018/5/15 17:25 Exp $
 */
public enum EnumNumTrans implements EnumMessage {
    num_0("0", "零"),
    num_1("1", "一"),
    num_2("2", "二"),
    num_3("3", "三"),
    num_4("4", "四"),
    num_5("5", "五"),
    num_6("6", "六"),
    num_7("7", "七"),
    num_8("8", "八"),
    num_9("9", "九"),
    num_10("10", "十"),
    num_11("11", "十一"),
    num_12("12", "十二");

    /** 状态码 */
    private String code;
    /** 状态描述 */
    private String desc;

    /**
     * 私有构造方法
     *
     * @param code
     *            编码
     * @param desc
     *            描述
     */
    private EnumNumTrans(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    /**
     * 根据编码查找枚举
     *
     * @param code
     *            编码
     * @return {@link EnumNumTrans} 实例
     */
    public static EnumNumTrans find(String code) {
        for (EnumNumTrans frs : EnumNumTrans.values()) {
            if (frs.getCode().equals(code)) {
                return frs;
            }
        }
        return null;
        // throw new Exception("错误码", "根据code=" + code+ "获取渠道标示失败");
    }

    /**
     * Getter method for property <tt>code</tt>.
     *
     * @return property value of code
     */
    public String getCode() {
        return code;
    }

    /**
     * Getter method for property <tt>desc</tt>.
     *
     * @return property value of desc
     */
    public String getDesc() {
        return desc;
    }

    @Override
    public Object getValue() {
        //此处需要根据枚举对象的哪个属性返回枚举对象，就return该属性
        return code;
    }
}
