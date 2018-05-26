package ncu.study.autopaper.service;

import ncu.study.autopaper.common.pojo.*;
import ncu.study.autopaper.model.CoursesInfo;
import ncu.study.autopaper.model.Paper;
import ncu.study.autopaper.model.PaperExample;
import ncu.study.autopaper.model.QuestionBasket;

import java.util.Date;
import java.util.List;

/**
 * @author Ridup
 * @version FleName:  PaperService .java  v0.1  2018/5/17 1:18 Exp $
 */
public interface PaperService {
    public int savePaper(int userId, Date createTime, String paperName, String paperPath, QuestionBasket questionBasketInfo, List<PaperQCResponsePojo> paperQCInfo, PaperResponsePojo paperResponsePojo);

    public List<Paper> getPaperInfoByExample(PaperExample paperExample);

    public String getPaperDocPath(int paperId);

    public PaperPojo getPaperById(int userId, int paperId);

    public int getSearchCount(GradePojo currentGrade, CoursePojo currentCourse, String content);

    public List<Paper> getSearchPapers(GradePojo currentGrade, CoursePojo currentCourse, String content, int start);

    public List<PaperPojo> getPaperByUserId(int userId);

    public int delete(int paperId);
}
