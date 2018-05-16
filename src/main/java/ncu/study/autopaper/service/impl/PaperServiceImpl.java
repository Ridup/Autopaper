package ncu.study.autopaper.service.impl;

import com.google.gson.Gson;
import ncu.study.autopaper.common.pojo.PaperQCMiniPojo;
import ncu.study.autopaper.common.pojo.PaperQCResponsePojo;
import ncu.study.autopaper.common.pojo.PaperResponsePojo;
import ncu.study.autopaper.common.pojo.QuestionResponsePojo;
import ncu.study.autopaper.dao.PaperMapper;
import ncu.study.autopaper.model.Paper;
import ncu.study.autopaper.model.QuestionBasket;
import ncu.study.autopaper.service.PaperService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author Ridup
 * @version FleName:  PaperServiceImpl .java  v0.1  2018/5/17 1:30 Exp $
 */
@Service("paperService")
public class PaperServiceImpl implements PaperService {

    @Resource
    private PaperMapper paperMapper;

    @Override
    public int savePaper(int userId, String paperName, String paperPath, QuestionBasket questionBasketInfo, List<PaperQCResponsePojo> paperQCInfo, PaperResponsePojo paperResponsePojo) {
        int status = 0;
        if (0 != userId) {
            List<PaperQCMiniPojo> paperQCMiniPojos = new ArrayList<PaperQCMiniPojo>();
            for(PaperQCResponsePojo paperQCResponsePojo:paperQCInfo){
                PaperQCMiniPojo paperQCMiniPojo = new PaperQCMiniPojo();
                BeanUtils.copyProperties(paperQCResponsePojo,paperQCMiniPojo);
                List<QuestionResponsePojo> questionResponsePojos = paperQCResponsePojo.getQuestionResponsePojos();
                List<Long> questionIds = new ArrayList<Long>();
                for(QuestionResponsePojo questionResponsePojo:questionResponsePojos){

                    Long a = questionResponsePojo.getQuestionId();
                    questionIds.add(a);

                }
                paperQCMiniPojo.setQuestionIds(questionIds);
                paperQCMiniPojos.add(paperQCMiniPojo);
            }


            Paper record = new Paper();
            Gson gson = new Gson();
            record.setPaperName(paperName);
            record.setPaperGradeId(questionBasketInfo.getGrade());
            record.setPaperName(questionBasketInfo.getGradeName());
            record.setPaperCourseId(questionBasketInfo.getCourse());
            record.setPaperCourseName(questionBasketInfo.getCourseName());
            record.setOwner(userId);
            record.setCreateTime(new Date());
            record.setPaperHot(0);
            record.setPaperDifficulty(paperResponsePojo.getAvgDifficulty());
            record.setTotal(questionBasketInfo.getTotal());
            record.setTime(paperResponsePojo.getTotalTime());
            record.setScore(paperResponsePojo.getTotalScore());
            record.setPaperUrl(paperPath);
            record.setTypeCountCollection(gson.toJson(paperQCMiniPojos));

            status = paperMapper.insertSelective(record);
        }
        return status;
    }
}
