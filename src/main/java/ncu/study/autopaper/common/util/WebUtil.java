package ncu.study.autopaper.common.util;

import java.net.InetAddress;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WebUtil {

	private static Logger log = LoggerFactory.getLogger(WebUtil.class);

	/**
	 * 获得远程 ip
	 * 
	 * @param request
	 * @return String
	 */
	public static String getRemoteIP(HttpServletRequest request) {
		if (request.getHeader("x-forwarded-for") == null) {
			return transIP(request.getRemoteAddr());
		}
		// 多级反向代理,取X-Forwarded-For中第一个非unknown的有效IP字符串
		if (request.getHeader("x-forwarded-for").contains(",")) {
			String[] ips = request.getHeader("x-forwarded-for").split(",");
			for (String string : ips) {
				if (!"unknown".equalsIgnoreCase(string)) {
					return transIP(string);
				}
			}
			return "unknown";
		}
		return transIP(request.getHeader("x-forwarded-for"));
	}

	private static String transIP(String ipAddress) {
		if ("127.0.0.1".equals(ipAddress)) {
			// 根据网卡取本机配置的IP
			InetAddress inet = null;
			try {
				inet = InetAddress.getLocalHost();
				ipAddress = inet.getHostAddress();
			} catch (Exception e) {
				log.error("get ip address error", e);
			}
		}
		return ipAddress;
	}

}
