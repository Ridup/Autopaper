package ncu.study.autopaper.service.impl;

import ncu.study.autopaper.common.enums.EnumQuestionStatus;
import ncu.study.autopaper.common.enums.EnumUserType;
import ncu.study.autopaper.common.pojo.PaperCommentPojo;
import ncu.study.autopaper.common.pojo.QuestionCommentPojo;
import ncu.study.autopaper.dao.PaperCommentMapper;
import ncu.study.autopaper.dao.UserMapper;
import ncu.study.autopaper.model.*;
import ncu.study.autopaper.service.PaperCommentService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author Ridup
 * @version FleName:  PaperCommentServiceImpl .java  v0.1  2018/5/25 13:48 Exp $
 */
@Service("paperCommentService")
public class PaperCommentServiceImpl implements PaperCommentService {

    @Resource
    private PaperCommentMapper paperCommentMapper;

    @Resource
    private UserMapper userMapper;


    @Override
    public int saveComment(int userId, int paperId, String comment) {
        int a = 0;
        if (0 != userId && 0 != paperId) {
            PaperComment paperComment = new PaperComment();
            paperComment.setUserId(userId);
            paperComment.setPaperId(paperId);
            paperComment.setPaperComment(comment);
            paperComment.setPaperCommentTime(new Date());
            paperComment.setStatus(EnumQuestionStatus.audit_passed.getCode());
            a = paperCommentMapper.insertSelective(paperComment);
        }
        return a;
    }

    @Override
    public List<PaperCommentPojo> getCommentByPaperId(int paperId) {
        List<PaperCommentPojo> paperCommentPojos = new ArrayList<PaperCommentPojo>();
        if (0 != paperId) {
            PaperCommentExample paperCommentExample = new PaperCommentExample();
            PaperCommentExample.Criteria criteria = paperCommentExample.createCriteria();
            criteria.andPaperIdEqualTo(paperId);
            List<PaperComment> paperComments = paperCommentMapper.selectByExample(paperCommentExample);
            if (null != paperComments) {
                for (PaperComment paperComment : paperComments) {
                    PaperCommentPojo paperCommentPojo = new PaperCommentPojo();
                    int userId = paperComment.getUserId();
                    BeanUtils.copyProperties(paperComment,paperCommentPojo);
                    UserExample userExample = new UserExample();
                    UserExample.Criteria criteria1 = userExample.createCriteria();
                    criteria1.andUserIdEqualTo(userId);
                    List<User> users = userMapper.selectByExample(userExample);
                    BeanUtils.copyProperties(users.get(0), paperCommentPojo);
                    paperCommentPojo.setGetUserTypeStr(EnumUserType.find(users.get(0).getUserType()).getDesc());
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
                    paperCommentPojo.setPaperCommentTimeStr(sdf.format(paperComment.getPaperCommentTime()));
                    paperCommentPojo.setStatus(EnumQuestionStatus.find(paperComment.getStatus()).getDesc());
                    paperCommentPojos.add(paperCommentPojo);
                }
            }
        }
        return paperCommentPojos;
    }

    @Override
    public int deleteComment(long paperCommentId) {
        int a = 0;
        if (0 != paperCommentId) {
            a = paperCommentMapper.deleteByPrimaryKey(paperCommentId);
        }
        return a;
    }

    @Override
    public int passComment(long paperCommentId) {
        int a = 0;
        if (0 != paperCommentId) {
            PaperComment record = new PaperComment();
            record.setPaperCommentId(paperCommentId);
            record.setStatus(EnumQuestionStatus.audit_passed.getCode());
            a = paperCommentMapper.updateByPrimaryKey(record);
        }
        return a;
    }

    @Override
    public int noPassComment(long paperCommentId) {
        int a = 0;
        if (0 != paperCommentId) {
            PaperComment record = new PaperComment();
            record.setPaperCommentId(paperCommentId);
            record.setStatus(EnumQuestionStatus.audit_failed.getCode());
            a = paperCommentMapper.updateByPrimaryKey(record);
        }
        return a;
    }

    @Override
    public List<PaperCommentPojo> getAll() {
        List<PaperCommentPojo> paperCommentPojos = new ArrayList<PaperCommentPojo>();
            PaperCommentExample paperCommentExample = new PaperCommentExample();
            PaperCommentExample.Criteria criteria = paperCommentExample.createCriteria();
        criteria.andPaperCommentIdIsNotNull();
            List<PaperComment> paperComments = paperCommentMapper.selectByExample(paperCommentExample);
            if (null != paperComments) {
                for (PaperComment paperComment : paperComments) {
                    PaperCommentPojo paperCommentPojo = new PaperCommentPojo();
                    int userId = paperComment.getUserId();
                    BeanUtils.copyProperties(paperComment,paperCommentPojo);
                    UserExample userExample = new UserExample();
                    UserExample.Criteria criteria1 = userExample.createCriteria();
                    criteria1.andUserIdEqualTo(userId);
                    List<User> users = userMapper.selectByExample(userExample);
                    BeanUtils.copyProperties(users.get(0), paperCommentPojo);
                    paperCommentPojo.setGetUserTypeStr(EnumUserType.find(users.get(0).getUserType()).getDesc());
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
                    paperCommentPojo.setPaperCommentTimeStr(sdf.format(paperComment.getPaperCommentTime()));
                    paperCommentPojo.setStatus(EnumQuestionStatus.find(paperComment.getStatus()).getDesc());
                    paperCommentPojos.add(paperCommentPojo);
                }
            }
        return paperCommentPojos;
    }
}
