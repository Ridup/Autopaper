package ncu.study.autopaper.common.result;



import ncu.study.autopaper.common.common.Page;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ServiceResult<T> {

    private boolean             success;
    private String              errorCode;
    private String              errorMsg;
    private T                   data;      //单实体
    private List<T>             listData;  //列表
    private Page page;     //分页信息
    private Map<String, Object> map;      //当返回多对象结果时使用

    public ServiceResult(boolean success) {
        this.success = success;
    }

    public ServiceResult(boolean success, String erroCode, String errorMsg) {
        this.success = success;
        this.errorCode = erroCode;
        this.errorMsg = errorMsg;
    }

    public ServiceResult(T data) {
        this.success = true;
        this.data = data;
    }

    public ServiceResult(List<T> list) {
        this.success = true;
        this.listData = list;
    }

    public ServiceResult(List<T> listData, int totalNum, int currentPage, int pageSize) {
        this.success = true;
        this.listData = listData;
        this.page = new Page(totalNum, currentPage, pageSize);
    }


    public ServiceResult(T data, int totalNum, int currentPage, int pageSize) {
        this.success = true;
        this.data = data;
        this.page = new Page(totalNum, currentPage, pageSize);
    }

    public boolean isSuccess() {
        return success;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public T getData() {
        return data;
    }

    public List<T> getListData() {
        return listData;
    }

    public Page getPage() {
        return page;
    }

    public void put(String key, Object val) {
        if (map == null) {
            map = new HashMap<String, Object>();
        }
        map.put(key, val);
    }

    public <V> V getVal(String key, Class<V> clazz) {

        if(map == null){
            return null;
        }
        return (V) this.map.get(key);
    }

}
