package ncu.study.autopaper.common.pojo;

import java.util.List;

/**
 * @author Ridup
 * @version FleName:  VCPPojo .java  v0.1  2018/5/21 16:41 Exp $
 */
public class VCPPojo {
    private String title;
    private String value;
    private List<VCPPojo> data;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public List<VCPPojo> getData() {
        return data;
    }

    public void setData(List<VCPPojo> data) {
        this.data = data;
    }
}
