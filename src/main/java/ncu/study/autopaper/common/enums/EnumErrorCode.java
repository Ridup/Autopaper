package ncu.study.autopaper.common.enums;

/**
 * @author Ridup
 * @version FleName:  EnumErrorCode.java   v0.1  2018/4/16 15:01  Exp $
 */
public enum EnumErrorCode {
    //枚举对象关键字（“值”，“描述”），   -->枚举对象EnumErrorCode
    TENANT_NULL("000000", "租户为空"),
    PARAM_ERR("000001","参数有误"),
    SERVER_ERR("999998","服务器错误"),
    SYSTEM_ERR("999999", "系统错误"),
    DEPLOY_NOT_EXISTS("921231","配置不存在");

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
    private EnumErrorCode(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    /**
     * 根据编码查找枚举
     *
     * @param code
     *            编码
     * @return {@link EnumErrorCode} 实例
     */
    public static EnumErrorCode find(String code) {
        for (EnumErrorCode frs : EnumErrorCode.values()) {
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
}
