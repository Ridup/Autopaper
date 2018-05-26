package ncu.study.autopaper.common.pojo;

import ncu.study.autopaper.model.PaperTest;

import java.util.List;

/**
 * @author Ridup
 * @version FleName:  PaperTestPojo .java  v0.1  2018/5/24 1:20 Exp $
 */
public class PaperTestPojo extends PaperTest {
    private List<ErrorQuestionPojo> errorQuestionPojos;
    private String startTimeStr;

    public List<ErrorQuestionPojo> getErrorQuestionPojos() {
        return errorQuestionPojos;
    }

    public void setErrorQuestionPojos(List<ErrorQuestionPojo> errorQuestionPojos) {
        this.errorQuestionPojos = errorQuestionPojos;
    }

    public String getStartTimeStr() {
        return startTimeStr;
    }

    public void setStartTimeStr(String startTimeStr) {
        this.startTimeStr = startTimeStr;
    }
}
