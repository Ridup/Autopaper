package ncu.study.autopaper.service.impl;

import com.fasterxml.jackson.databind.util.BeanUtil;
import ncu.study.autopaper.common.enums.EnumQuestionStatus;
import ncu.study.autopaper.common.enums.EnumUserType;
import ncu.study.autopaper.common.pojo.QuestionCommentPojo;
import ncu.study.autopaper.dao.QuestionCommentMapper;
import ncu.study.autopaper.dao.QuestionMapper;
import ncu.study.autopaper.dao.UserMapper;
import ncu.study.autopaper.model.*;
import ncu.study.autopaper.service.QuestionCommentService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author Ridup
 * @version FleName:  QuestionCommentServiceImpl .java  v0.1  2018/5/25 13:47 Exp $
 */
@Service("questionCommentService")
public class QuestionCommentServiceImpl implements QuestionCommentService {

    @Resource
    private QuestionCommentMapper questionCommentMapper;

    @Resource
    private UserMapper userMapper;



    @Override
    public int saveComment(int userId, long questionId, String comment) {
        int a = 0;
        if(0!=userId&&0!=questionId){
            QuestionComment questionComment = new QuestionComment();
            questionComment.setUserId(userId);
            questionComment.setQuestionId(questionId);
            questionComment.setQuestionComment(comment);
            questionComment.setQuestionCommentTime(new Date());
            questionComment.setStatus(EnumQuestionStatus.audit_passed.getCode());
            a = questionCommentMapper.insertSelective(questionComment);
        }
        return a;
    }

    @Override
    public List<QuestionCommentPojo> getCommentByQuestionId(long questionId) {
        List<QuestionCommentPojo> questionCommentPojos = new ArrayList<QuestionCommentPojo>();
        if(0!=questionId){
            QuestionCommentExample questionCommentExample =new QuestionCommentExample();
            QuestionCommentExample.Criteria criteria = questionCommentExample.createCriteria();
            criteria.andQuestionIdEqualTo(questionId);
            List<QuestionComment> questionComments = questionCommentMapper.selectByExample(questionCommentExample);
            if(null!=questionComments){
                for(QuestionComment questionComment:questionComments){
                    QuestionCommentPojo questionCommentPojo = new QuestionCommentPojo();
                    int userId = questionComment.getUserId();
                    BeanUtils.copyProperties(questionComment,questionCommentPojo);
                    UserExample userExample = new UserExample();
                    UserExample.Criteria criteria1 = userExample.createCriteria();
                    criteria1.andUserIdEqualTo(userId);
                    List<User> users = userMapper.selectByExample(userExample);
                    BeanUtils.copyProperties(users.get(0),questionCommentPojo);
                    questionCommentPojo.setGetUserTypeStr(EnumUserType.find(users.get(0).getUserType()).getDesc());
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
                    questionCommentPojo.setQuestionCommentTimeStr(sdf.format(questionComment.getQuestionCommentTime()));
                    questionCommentPojo.setStatusStr(EnumQuestionStatus.find(questionComment.getStatus()).getDesc());
                    questionCommentPojos.add(questionCommentPojo);
                }
            }
        }
        return questionCommentPojos;
    }

    @Override
    public int deleteComment(long questionCommentId) {
        int a = 0;
        if(0!=questionCommentId){
            a= questionCommentMapper.deleteByPrimaryKey(questionCommentId);

        }
        return a;
    }

    @Override
    public int passComment(long questionCommentId) {
        int a = 0;
        if(0!=questionCommentId){
            QuestionComment record = new QuestionComment();
            record.setQuestionCommentId(questionCommentId);
            record.setStatus(EnumQuestionStatus.audit_passed.getCode());
            a= questionCommentMapper.updateByPrimaryKey(record);
        }
        return a;
    }

    @Override
    public int noPassComment(long questionCommentId) {
        int a = 0;
        if(0!=questionCommentId){
            QuestionComment record = new QuestionComment();
            record.setQuestionCommentId(questionCommentId);
            record.setStatus(EnumQuestionStatus.audit_failed.getCode());
            a= questionCommentMapper.updateByPrimaryKey(record);
        }
        return a;
    }

    @Override
    public List<QuestionCommentPojo> getAll() {
        List<QuestionCommentPojo> questionCommentPojos = new ArrayList<QuestionCommentPojo>();
            QuestionCommentExample questionCommentExample =new QuestionCommentExample();
            QuestionCommentExample.Criteria criteria = questionCommentExample.createCriteria();
        criteria.andQuestionCommentIdIsNull();
            List<QuestionComment> questionComments = questionCommentMapper.selectByExample(questionCommentExample);
            if(null!=questionComments){
                for(QuestionComment questionComment:questionComments){
                    QuestionCommentPojo questionCommentPojo = new QuestionCommentPojo();
                    int userId = questionComment.getUserId();
                    BeanUtils.copyProperties(questionComment,questionCommentPojo);
                    UserExample userExample = new UserExample();
                    UserExample.Criteria criteria1 = userExample.createCriteria();
                    criteria1.andUserIdEqualTo(userId);
                    List<User> users = userMapper.selectByExample(userExample);
                    BeanUtils.copyProperties(users.get(0),questionCommentPojo);
                    questionCommentPojo.setGetUserTypeStr(EnumUserType.find(users.get(0).getUserType()).getDesc());
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
                    questionCommentPojo.setQuestionCommentTimeStr(sdf.format(questionComment.getQuestionCommentTime()));
                    questionCommentPojo.setStatusStr(EnumQuestionStatus.find(questionComment.getStatus()).getDesc());
                    questionCommentPojos.add(questionCommentPojo);
                }

        }
        return questionCommentPojos;
    }
}
