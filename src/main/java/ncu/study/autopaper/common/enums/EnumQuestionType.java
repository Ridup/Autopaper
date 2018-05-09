package ncu.study.autopaper.common.enums;

/**
 * @author Ridup
 * @version FleName:  EnumUserType.java   v0.1  2018/4/17 0:02  Exp $
 */
public enum EnumQuestionType implements EnumMessage {
    single("101", "单选题"),
    judgment("102","判断题"),
    fill_blank("103","填空题"),
    simple("104","简答题"),
    composition("105","作文");

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
    private EnumQuestionType(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    /**
     * 根据编码查找枚举
     *
     * @param code
     *            编码
     * @return {@link EnumQuestionType} 实例
     */
    public static EnumQuestionType find(String code) {
        for (EnumQuestionType frs : EnumQuestionType.values()) {
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

