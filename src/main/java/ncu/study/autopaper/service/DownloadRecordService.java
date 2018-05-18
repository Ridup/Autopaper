package ncu.study.autopaper.service;

import ncu.study.autopaper.model.PaperDownload;

import java.util.List;

/**
 * @author Ridup
 * @version FleName:  DownloadRecordService .java  v0.1  2018/5/17 19:16 Exp $
 */
public interface DownloadRecordService {
    public int getDownloadTimes(int paperId);
    public List<PaperDownload> getUserDownloadRecord(int userId);
    public  int saveUserDownloadRecord(int userId,int paperId);
}
