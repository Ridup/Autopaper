package ncu.study.autopaper.common.enums;

/**
 * @author Ridup
 * @version FleName:  EnumQuestionDifficulty .java  v0.1  2018/5/8 1:27 Exp $
 */
public enum EnumQuestionDifficulty implements EnumMessage {
    difficulty_1("0.1", "难度一"),
    difficulty_2("0.2", "难度二"),
    difficulty_3("0.3", "难度三"),
    difficulty_4("0.4", "难度四"),
    difficulty_5("0.5", "难度五"),
    difficulty_6("0.6", "难度六"),
    difficulty_7("0.7", "难度七"),
    difficulty_8("0.8", "难度八"),
    difficulty_9("0.9", "难度九"),
    difficulty_10("1.0", "难度十");


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
    private EnumQuestionDifficulty(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    /**
     * 根据编码查找枚举
     *
     * @param code
     *            编码
     * @return {@link EnumQuestionDifficulty} 实例
     */
    public static EnumQuestionDifficulty find(String code) {
        for (EnumQuestionDifficulty frs : EnumQuestionDifficulty.values()) {
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
