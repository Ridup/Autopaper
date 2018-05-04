package ncu.study.autopaper.common.pojo;

import java.util.List;

/**
 * @author Ridup
 * @version FleName:  PointsPojo .java  v0.1  2018/4/25 21:56 Exp $
 */
public class PointsPojo {
    private String chapter;
    private String chapterId;
    private List<PointPojo> pointPojoList;
    public String getChapter() {
        return chapter;
    }

    public void setChapter(String chapter) {
        this.chapter = chapter;
    }

    public String getChapterId() {
        return chapterId;
    }

    public void setChapterId(String chapterId) {
        this.chapterId = chapterId;
    }

    public List<PointPojo> getPointPojoList() {
        return pointPojoList;
    }

    public void setPointPojoList(List<PointPojo> pointPojoList) {
        this.pointPojoList = pointPojoList;
    }
}
