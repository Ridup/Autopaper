/*
package ncu.study.autopaper.common.util;

import java.util.Random;
import java.util.UUID;
import org.tinygroup.xstream.util.Base64Util;

public class RandomCodeUtil {

	public static final String ALLCHAR = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

	public static String getUUID() {
		return UUID.randomUUID ().toString ().replaceAll ("-", "");
	}

	*/
/**
	 * 生成指定长度的随机串(0 a-z A-Z)
	 * 
	 * @param length
	 * @return
	 *//*

	public static String randomCodeBase64(int length) {
		if (length <= 0) {
			return "";
		}
		int rLength = ALLCHAR.length ();
		Random random = new Random ();
		StringBuffer sb = new StringBuffer ();
		for (int i = 0; i < length; i++) {
			sb.append (ALLCHAR.charAt (random.nextInt (rLength)));
		}

		return Base64Util.byteArrayToBase64 (sb.toString ().getBytes ());
	}
	
	public static String randomStr(int length) {
		if (length <= 0) {
			return "";
		}
		int rLength = ALLCHAR.length ();
		Random random = new Random ();
		StringBuffer sb = new StringBuffer ();
		for (int i = 0; i < length; i++) {
			sb.append (ALLCHAR.charAt (random.nextInt (rLength)));
		}

		return sb.toString();
	}

	public static String getSessionID() {
		return Base64Util.byteArrayToBase64 (getUUID ().getBytes ()) + System.currentTimeMillis ();
	}
	
	public static void main(String[] args) {
		System.out.println(randomStr(6));
	}

}
*/
