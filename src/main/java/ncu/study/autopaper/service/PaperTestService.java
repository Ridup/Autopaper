package ncu.study.autopaper.service;

import ncu.study.autopaper.common.pojo.PaperTestPojo;
import ncu.study.autopaper.model.PaperTest;

import java.util.List;

/**
 * @author Ridup
 * @version FleName:  PaperTestService .java  v0.1  2018/5/23 22:15 Exp $
 */
public interface PaperTestService {
    public int saveTestRecord(PaperTest paperTest);
    public List<PaperTest> getPaperTestByRecord(PaperTest record);
    public PaperTestPojo getPaperTestById(int testId);
    public int deleteRecord(int testId);
    public List<PaperTestPojo> getPaperTestByUserId(int userId);
}
