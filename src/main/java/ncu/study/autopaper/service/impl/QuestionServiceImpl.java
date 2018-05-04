package ncu.study.autopaper.service.impl;

import ncu.study.autopaper.dao.QuestionMapper;
import ncu.study.autopaper.model.Question;
import ncu.study.autopaper.service.QuestionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Ridup
 * @version FleName:  QuestionServiceImpl .java  v0.1  2018/4/26 14:41 Exp $
 */
@Service("questionService")
public class QuestionServiceImpl implements QuestionService{
    @Resource
    private QuestionMapper questionMapper;
    @Override
    public int insertQuestionInfo(Question question) {
        int status  = questionMapper.insertSelective(question);
        return status;
    }
}
