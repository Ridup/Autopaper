package ncu.study.autopaper.service.impl;

import ncu.study.autopaper.common.enums.EnumQuestionStatus;
import ncu.study.autopaper.common.pojo.CoursePojo;
import ncu.study.autopaper.common.pojo.GradePojo;
import ncu.study.autopaper.dao.QuestionMapper;
import ncu.study.autopaper.dao.ext.QuestionExtMapper;
import ncu.study.autopaper.model.Question;
import ncu.study.autopaper.model.QuestionExample;
import ncu.study.autopaper.service.QuestionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Ridup
 * @version FleName:  QuestionServiceImpl .java  v0.1  2018/4/26 14:41 Exp $
 */
@Service("questionService")
public class QuestionServiceImpl implements QuestionService{
    @Resource
    private QuestionMapper questionMapper;
    @Resource
    private QuestionExtMapper questionExtMapper;
    @Override
    public int insertQuestionInfo(Question question) {
        int status  = questionMapper.insertSelective(question);
        return status;
    }

    @Override
    public int getSearchCount(GradePojo currentGrade, CoursePojo currentCourse, String questionType, String content) {
        QuestionExample questionExample = new QuestionExample();
        QuestionExample.Criteria criteria = questionExample.createCriteria();
        String gradeName = currentGrade.getGradeName();
        String courseName = currentCourse.getCourseName();
        if(gradeName!=null&&gradeName!=""){
            criteria.andGradeNameLike(gradeName);
        }
        if(courseName!=null&&courseName!=""){
            criteria.andCourseNameLike(courseName);
        }
        if(questionType!=null&&questionType!=""){
            criteria.andQuestionTypeLike(questionType.trim());
        }
        if(content!=null&&content!=""){
            criteria.andQuestionContentLike("%"+content.trim()+"%");
        }
        criteria.andStatusEqualTo(EnumQuestionStatus.audit_passed.getCode());
        int count = (int)questionMapper.countByExample(questionExample);
        return count;
    }

    @Override
    public List<Question> getSearchQuestions(GradePojo currentGrade, CoursePojo currentCourse, String questionType, String content,int start) {
        List<Question> questions = new ArrayList<Question>();
        String gradeName = currentGrade.getGradeName();
        String courseName = currentCourse.getCourseName();
        questions = questionExtMapper.getSearchQuestions(gradeName,courseName,questionType,content,start);
        return questions;
    }
}
