package ncu.study.autopaper.common.util;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

public class JsonDataUtil {

	/**
	 * 对节点进行解析
	 * 
	 * @param obj
	 * @param node
	 * @return
	 */
	private static JSONObject getObj(JSONObject obj, String node) {
		try {
			if (node.contains("[")) {
				JSONArray arr = obj.getJSONArray(node.substring(0, node.indexOf("[")));
				for (int i = 0; i < arr.size(); i++) {
					if ((i + "").equals(node.substring(node.indexOf("["), node.indexOf("]")).replace("[", ""))) {
						return arr.getJSONObject(i);
					}
				}
			} else {
				return obj.getJSONObject(node);
			}
		} catch (Exception e) {
			return obj;
		}
		return null;
	}

	/**
	 * 获取节点值
	 * 	String jsonContent = "{\"projectName\":\"JSON\",\"projectInfo\":{\"author\":\"test\",\"version\":\"1.0\"}}";
	 *	String val = JsonDataUtil.getNodeValue(jsonContent, "JSON.projectInfo.author");
	 *  System.out.println(val);// 执行结果：test
	 * @param jsonContent
	 * @param jsonPath
	 * @return
	 * @throws Exception
	 */
	public static synchronized String getNodeValue(String jsonContent, String jsonPath) throws Exception {
		String[] nodes = jsonPath.split("\\.");
		JSONObject obj = JSONObject.parseObject(jsonContent);
		for (int i = 0; i < nodes.length; i++) {
			if (obj != null) {
				obj = getObj(obj, nodes[i]);
			}
			if ((i+1) == nodes.length) {
				try {
					return obj.getString(nodes[i]);
				} catch (Exception e) {
					return null;
					//return "JSONException:" + e.getMessage() + ",NodeString:" + obj.toString();
				}
			}
		}
		return null;
	}
	
	
    /**
     * <pre>
     * 调用示例：
     *      String json = "{\"status\": {\"code\": 1001,\"msg\": \"正常\"},\"result\": {\"data\": {\"is_end\": false,\"userId\": \"helo_kitty\"}}}";
     *      JSONObject jsonObject = JSONObject.parseObject(json);
     *      Object lastTweetId = JSONUtils.select(jsonObject, "result.data.userId");
     *      System.out.println(lastTweetId);
     * ---- print：
     * helo_kitty
     * </pre>
     *
     * @return
     */
    public static Object select(JSONObject jsonObj, String keyPath) {
        if (null == jsonObj || null == keyPath) {
            return null;
        }
        String[] patharr = keyPath.split("\\.");
        JSONObject current = jsonObj;
        Object retvalue = null;
        for (int i = 0; i < patharr.length; i++) {
            String key = patharr[i];
            retvalue = current.get(key);
            if (i < (patharr.length - 1)) {
                current = (JSONObject) retvalue;
            }
        }
        return retvalue;
    }

	public static JSONArray splitJson(String jsonContent,String node){
		JSONObject jsonObject = JSONObject.parseObject(jsonContent);
		return (JSONArray) select(jsonObject,node);
	}

	public static void main(String[] args) throws Exception {
		// 构造json字符串
		String jsonContent = "{\"projectName\":\"JSON\",\"projectInfo\":{\"author\":\"test\",\"version\":\"1.0\"}}";
		String val = JsonDataUtil.getNodeValue(jsonContent, "projectInfo.author");
		System.out.println(val);// 执行结果：test
		
		
        JSONObject jsonObject = JSONObject.parseObject(jsonContent);
        Object lastTweetId = JsonDataUtil.select(jsonObject, "projectInfo.author");
        System.out.println(lastTweetId);

	}
}
