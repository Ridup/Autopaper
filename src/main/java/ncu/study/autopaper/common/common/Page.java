package ncu.study.autopaper.common.common;

import java.util.ArrayList;
import java.util.List;

public class Page {

    public static final int  DEFAULTPAGESIZE = 15;                              //默认分页显示5条
    private final static int SHOWMAX         = 10;

    private int              currentPage     = 1;                              // 当前页码
    private int              totalNum        = 0;                              // 总记录数
    private int              pageCount       = 0;                              // 总页数
    private int              before          = 0;
    private int              next            = 1;
    private int              pageSize        = 5;                              //默认5条
    private List<Integer>    show            = new ArrayList<Integer>(SHOWMAX);

    public Page(int totalNum, int currentPage, int pageSize) {
        this.totalNum = totalNum;
        this.currentPage = currentPage;
        this.pageSize = pageSize;
        this.pageCount = this.totalNum % pageSize == 0 ? this.totalNum / pageSize : this.totalNum
                                                                                    / pageSize + 1;

        this.before = this.before();
        this.next = this.next();
        setShowPageNums();
    }

    public int getTotalNum() {
        return totalNum;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public int getPageCount() {
        return pageCount;
    }

    public int getLastPageNum() {
        return this.pageCount == 0 ? 1 : this.pageCount;
    }

    public int next() {
        return currentPage + 1;
    }

    public int before() {
        return currentPage - 1 < 0 ? 0 : currentPage - 1;
    }

    public int getBefore() {
        return before;
    }

    public int getNext() {
        return next;
    }

    public void setShowPageNums() {
        if (this.totalNum <= this.pageSize) {
            show.add(1);
            return;
        }

        if (this.pageCount <= SHOWMAX) {
            for (int i = 1; i <= this.pageCount; i++) {
                show.add(i);
            }
            return;
        }
        // 当前页面的前2页和后2页
        if (currentPage < 5) {
            for (int i = 1; i <= 5; i++) {
                show.add(i);
            }
            show.add(-1);
            for (int j = this.pageCount - 2; j <= this.pageCount; j++) {
                show.add(j);
            }
            return;
        }

        if (currentPage <= pageCount - 3) {
            show.add(-1);
            for (int i = currentPage - 2; i <= currentPage + 2; i++) {
                show.add(i);
            }
            show.add(-1);
            return;
        }

        int half = SHOWMAX / 2;
        for (int i = 1; i <= half; i++) {
            show.add(i);
        }

        show.add(-1);
        for (int j = this.pageCount - 2; j <= this.pageCount; j++) {
            show.add(j);
        }

    }

    public List<Integer> getShow() {
        return show;
    }

    public int getPageSize() {
        return pageSize;
    }

    public Page getPage() {
        return this;
    }

    public static void main(String[] args) {
        Page page = new Page(10000, 2, 10);
        System.out.println(page.getShow());
    }

}
