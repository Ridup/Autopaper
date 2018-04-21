package ncu.study.autopaper.common.common;

import java.util.List;

public class PageData<T> extends Page {

    private List<T> dataList;

    public PageData(int totalNum, int currentPage, int pageSize, List<T> dataList) {
        super(totalNum, currentPage, pageSize);
        this.dataList = dataList;
    }

    public List<T> getPageData() {
        return this.dataList;
    }

}
