/**
 * @System: p2p平台
 * Copyright (c) 2015杭州恒生云融网络有限公司-版权所有
 */
package ncu.study.autopaper.common.util;

import org.springframework.ui.ModelMap;

/**
 * @author: Ridup Date: 2016/3/14 Time: 11:09
 * @mail: Ridup
 * @version: 2.0
 */

public class ErrorUtil {

	public static String error(String errorCode,String msg,ModelMap model) {
	    model.put("errorcode", errorCode);
	    model.put("msg", msg);
		return "console/common/error";
	}

	public static void main(String[] args) {

	}

}
