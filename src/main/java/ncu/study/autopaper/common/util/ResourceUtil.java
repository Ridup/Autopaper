/*
package ncu.study.autopaper.common.util;

import java.util.Properties;


import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Value;

import com.hsjry.lang.log.Log;
import com.hsjry.lang.log.TenantLog;

public class ResourceUtil {

    private static Log        log = TenantLog.get(ResourceUtil.class);

    private static Properties config;

    private static String     APPDOMAIN;
    private static String     STYLEDOMAIN;
    private static String     productEnv;
    @Value("${vm.version}")
    private static String     vmVersion; //产品版本号
    private static String     STATIC_IP_ADDRESS; //ip 地址
    private static String     STATICHEAD; //
    private static String     PATH_INDEX; //首页
    private static String     PATH_WJR; //微金融
    private static String     PATH_ZFY; //支付云
    private static String     PATH_CGY; //存管云
    private static String     PATH_NEWS; //新闻中心
    private static String     PATH_ABOUT; //关于我们

    static {
        try {
            config = ApplicationContextUtil.getBean("configproperties");
            productEnv = getValue("product.env.flag");
        } catch (Exception e) {
            log.error("获取configproperties bean异常", e);
        }

    }

    public static String getValue(String key) {
        try {
            return config.getProperty(key);
        } catch (Exception e) {
            log.error("获取[{}]失败", key, e);
        }
        return null;
    }

    public static String getAppDomain() {
        if (StringUtils.isEmpty(APPDOMAIN)) {
            APPDOMAIN = getValue("app.domain");
        }
        return APPDOMAIN;
    }

    public static String getStyleDomain() {
        if (StringUtils.isEmpty(STYLEDOMAIN)) {
            STYLEDOMAIN = getValue("style.domain");
        }
        return STYLEDOMAIN;
    }
    
*获取页面模板版本*

    public static String getVmVersion() {
        if (StringUtils.isEmpty(vmVersion)) {
            vmVersion = getValue("vm.version");
        }
        return vmVersion;
    }

    public static String getStaticIpAddress() {
        if (StringUtils.isEmpty(STATIC_IP_ADDRESS)) {
            STATIC_IP_ADDRESS = getValue("static.ip.address");
        }
        return STATIC_IP_ADDRESS;
    }

    public static String getPathCgy() {
        if (StringUtils.isEmpty(PATH_CGY)) {
            PATH_CGY =  getValue("static.path.cgy");
        }
        return PATH_CGY;
    }

    public static String getPathAbout() {
        if (StringUtils.isEmpty(PATH_ABOUT)) {
            PATH_ABOUT =  getValue("static.path.about");
        }
        return PATH_ABOUT;
    }

    public static String getPathIndex() {
        if (StringUtils.isEmpty(PATH_INDEX)) {
            PATH_INDEX =  getValue("static.path.index");
        }
        return PATH_INDEX;
    }

    public static String getPathNews() {
        if (StringUtils.isEmpty(PATH_NEWS)) {
            PATH_NEWS =  getValue("static.path.news");
        }
        return PATH_NEWS;
    }

    public static String getPathWjr() {
        if (StringUtils.isEmpty(PATH_WJR)) {
            PATH_WJR = getValue("static.path.wjr");
        }
        return PATH_WJR;
    }

    public static String getPathZfy() {
        if (StringUtils.isEmpty(PATH_ZFY)) {
            PATH_ZFY =  getValue("static.path.zfy");
        }
        return PATH_ZFY;
    }

    public static String getSTATICHEAD() {
        if (StringUtils.isEmpty(STATICHEAD)) {
            STATICHEAD = getValue("static.head");
        }
        return STATICHEAD;
    }

*
     * 是否生产环境,默认生产环境
     * 
     * @return


    public static boolean isProductEnv() {
        //测试环境部验证
        if ("0".equals(productEnv)) {
            return false;
        }
        return true;
    }
    
    public static int getDictTimeOut(){
    	return 60 * 60 * 24;
    }

}
*/
