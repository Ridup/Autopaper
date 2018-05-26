package ncu.study.autopaper.service.impl;

import ncu.study.autopaper.common.pojo.QuestionErrorBookPojo;
import ncu.study.autopaper.common.pojo.QuestionResponsePojo;
import ncu.study.autopaper.dao.QuestionErrorBookMapper;
import ncu.study.autopaper.model.QuestionErrorBook;
import ncu.study.autopaper.model.QuestionErrorBookExample;
import ncu.study.autopaper.model.QuestionErrorBookKey;
import ncu.study.autopaper.service.QuestionErrorBookService;
import ncu.study.autopaper.service.QuestionService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Ridup
 * @version FleName:  QuestionErrorBookServiceImpl .java  v0.1  2018/5/24 0:15 Exp $
 */
@Service("questionErrorBookService")
public class QuestionErrorBookServiceImpl implements QuestionErrorBookService {

    @Resource
    private QuestionErrorBookMapper questionErrorBookMapper;

    @Resource
    private QuestionService questionService;

    @Override
    public int saveErrorRecord(QuestionErrorBook questionErrorBook) {
        int a= 0;
        if(questionErrorBook!=null){
            Integer userId = questionErrorBook.getUserId();
            Long questionId = questionErrorBook.getQuestionId();
            QuestionErrorBook questionErrorBook1 = questionErrorBookMapper.selectByPrimaryKey(new QuestionErrorBookKey(userId, questionId));
            if(null!=questionErrorBook1){
                a=1;
            }else {
                a=questionErrorBookMapper.insertSelective(questionErrorBook);
            }
        }

        return a;
    }

    @Override
    public List<QuestionErrorBookPojo> getUserErrorBook(int userId) {
        List<QuestionErrorBookPojo> questionErrorBookPojos = new ArrayList<QuestionErrorBookPojo>();
        if(0!=userId){
            QuestionErrorBookExample questionErrorBookExample = new QuestionErrorBookExample();
            QuestionErrorBookExample.Criteria criteria = questionErrorBookExample.createCriteria();
            criteria.andUserIdEqualTo(userId);
            List<QuestionErrorBook> questionErrorBooks = questionErrorBookMapper.selectByExample(questionErrorBookExample);
            if(questionErrorBooks!=null){
                for (QuestionErrorBook questionErrorBook:questionErrorBooks){
                    QuestionErrorBookPojo questionErrorBookPojo = new QuestionErrorBookPojo();
                    BeanUtils.copyProperties(questionErrorBook,questionErrorBookPojo);
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
                    questionErrorBookPojo.setCreateDate(sdf.format(questionErrorBook.getCreateTime()));
                    QuestionResponsePojo questionDetail = questionService.getQuestionDetail(questionErrorBook.getQuestionId());
                    if(null!=questionDetail){
                        BeanUtils.copyProperties(questionDetail,questionErrorBookPojo);
                    }
                    questionErrorBookPojos.add(questionErrorBookPojo);
                }
            }
        }
        return questionErrorBookPojos;
    }

    @Override
    public int deleteErrorRecord(int userId, Long questionId) {
        int a = 0;
        if(0!=userId&&0!=questionId){
            QuestionErrorBook questionErrorBook1 = questionErrorBookMapper.selectByPrimaryKey(new QuestionErrorBookKey(userId, questionId));
            if(null!=questionErrorBook1){
                a=questionErrorBookMapper.deleteByPrimaryKey(new QuestionErrorBookKey(userId,questionId));
            }else {
                a=1;
            }
        }
        return a;
    }
}
