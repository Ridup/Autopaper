package ncu.study.autopaper.common.pojo;

import ncu.study.autopaper.model.Paper;

import java.util.List;

/**
 * @author Ridup
 * @version FleName:  PaperPojo .java  v0.1  2018/5/17 16:42 Exp $
 */
public class PaperPojo extends Paper {
    private List<PaperQCResponsePojo> paperQCResponsePojos;
    private String paperDifficultyDesc;
    private int downloadTimes;

    public List<PaperQCResponsePojo> getPaperQCResponsePojos() {
        return paperQCResponsePojos;
    }

    public void setPaperQCResponsePojos(List<PaperQCResponsePojo> paperQCResponsePojos) {
        this.paperQCResponsePojos = paperQCResponsePojos;
    }

    public String getPaperDifficultyDesc() {
        return paperDifficultyDesc;
    }

    public void setPaperDifficultyDesc(String paperDifficultyDesc) {
        this.paperDifficultyDesc = paperDifficultyDesc;
    }

    public int getDownloadTimes() {
        return downloadTimes;
    }

    public void setDownloadTimes(int downloadTimes) {
        this.downloadTimes = downloadTimes;
    }
}
