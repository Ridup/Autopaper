package ncu.study.autopaper.common.result;

import java.util.List;

public class JinjianJsonObj<T> {

    private List<T> rows;
    private int     total;

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

}
