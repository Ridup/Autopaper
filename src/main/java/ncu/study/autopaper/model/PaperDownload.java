package ncu.study.autopaper.model;

import java.util.Date;

public class PaperDownload extends PaperDownloadKey {
    private String paperName;

    private String userName;

    private Date downloadTime;

    public PaperDownload(Integer paperId, Integer userId, String paperName, String userName, Date downloadTime) {
        super(paperId, userId);
        this.paperName = paperName;
        this.userName = userName;
        this.downloadTime = downloadTime;
    }

    public PaperDownload() {
        super();
    }

    public String getPaperName() {
        return paperName;
    }

    public void setPaperName(String paperName) {
        this.paperName = paperName == null ? null : paperName.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public Date getDownloadTime() {
        return downloadTime;
    }

    public void setDownloadTime(Date downloadTime) {
        this.downloadTime = downloadTime;
    }
}