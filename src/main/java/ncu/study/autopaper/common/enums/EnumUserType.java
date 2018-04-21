package ncu.study.autopaper.common.enums;

/**
 * @author Ridup
 * @version FleName:  EnumUserType.java   v0.1  2018/4/17 0:02  Exp $
 */
public enum EnumUserType implements EnumMessage {
    admin("0", "管理员"),
    teacher("1","教师"),
    student("2","学生");

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
    private EnumUserType(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    /**
     * 根据编码查找枚举
     *
     * @param code
     *            编码
     * @return {@link EnumUserType} 实例
     */
    public static EnumUserType find(String code) {
        for (EnumUserType frs : EnumUserType.values()) {
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
