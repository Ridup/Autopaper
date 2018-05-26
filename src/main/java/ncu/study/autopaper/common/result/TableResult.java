package ncu.study.autopaper.common.result;



import java.util.List;

/**
 * @author Ridup
 * @version FleName:  TableResult .java  v0.1  2018/5/24 12:48 Exp $
 */
public class TableResult<T> {
    private int code;
    private String msg;
    private int count;
    private List<T> data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }
}
