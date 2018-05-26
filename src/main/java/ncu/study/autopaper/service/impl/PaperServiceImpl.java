package ncu.study.autopaper.service.impl;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import ncu.study.autopaper.common.enums.EnumQuestionClass;
import ncu.study.autopaper.common.enums.EnumQuestionDifficulty;
import ncu.study.autopaper.common.enums.EnumQuestionStatus;
import ncu.study.autopaper.common.enums.EnumQuestionType;
import ncu.study.autopaper.common.pojo.*;
import ncu.study.autopaper.dao.PaperMapper;
import ncu.study.autopaper.dao.QuestionMapper;
import ncu.study.autopaper.dao.ext.PaperExtMapper;
import ncu.study.autopaper.dao.ext.QuestionExtMapper;
import ncu.study.autopaper.model.*;
import ncu.study.autopaper.service.PaperService;
import ncu.study.autopaper.service.QuestionFavService;
import ncu.study.autopaper.service.QuestionService;
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

    @Resource
    private QuestionMapper questionMapper;

    @Resource
    private QuestionFavService questionFavService;

    @Resource
    private PaperExtMapper paperExtMapper;

    @Override
    public int savePaper(int userId, Date createTime,String paperName, String paperPath, QuestionBasket questionBasketInfo, List<PaperQCResponsePojo> paperQCInfo, PaperResponsePojo paperResponsePojo) {
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
            record.setPaperGradeName(questionBasketInfo.getGradeName());
            record.setPaperCourseId(questionBasketInfo.getCourse());
            record.setPaperCourseName(questionBasketInfo.getCourseName());
            record.setOwner(userId);
            record.setCreateTime(createTime);
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

    @Override
    public List<Paper> getPaperInfoByExample(PaperExample paperExample) {
        List<Paper> papers = paperMapper.selectByExample(paperExample);
        return papers;
    }

    @Override
    public String getPaperDocPath(int paperId) {
        String paperDocPath = new String();
        if(0!=paperId){
            Paper paper = paperMapper.selectByPrimaryKey(paperId);
            paperDocPath = paper.getPaperUrl();
        }

        return paperDocPath;
    }

    @Override
    public PaperPojo getPaperById(int userId,int paperId) {
        PaperPojo paperPojo = new PaperPojo();
        Gson gson = new Gson();
        Paper paper = paperMapper.selectByPrimaryKey(paperId);
        if(paper!=null){
            BeanUtils.copyProperties(paper,paperPojo);
            double paperDifficulty = paper.getPaperDifficulty();
            String typeCountCollectionStr = paper.getTypeCountCollection();
            List<PaperQCMiniPojo> paperQCMiniPojos = gson.fromJson(typeCountCollectionStr, new TypeToken<List<PaperQCMiniPojo>>() {}.getType());

            List<PaperQCResponsePojo> paperQCResponsePojos = new ArrayList<PaperQCResponsePojo>();
            for(PaperQCMiniPojo paperQCMiniPojo:paperQCMiniPojos){
                PaperQCResponsePojo paperQCResponsePojo = new PaperQCResponsePojo();
                BeanUtils.copyProperties(paperQCMiniPojo,paperQCResponsePojo);
                List<Long> questionIds = paperQCMiniPojo.getQuestionIds();
                List<QuestionResponsePojo> questionResponsePojos = new ArrayList<QuestionResponsePojo>();
                for(Long questionId:questionIds){
                    QuestionResponsePojo questionResponsePojo = new QuestionResponsePojo();
                    Question questionContents = questionMapper.selectByPrimaryKey(questionId);
                    BeanUtils.copyProperties(questionContents, questionResponsePojo);
                    questionResponsePojo.setEnumQuestionClass(EnumQuestionClass.find(questionContents.getQuestionClass()));
                    questionResponsePojo.setEnumQuestionDifficulty(EnumQuestionDifficulty.find(questionContents.getQuestionDifficulty().toString()));
                    questionResponsePojo.setEnumQuestionStatus(EnumQuestionStatus.find(questionContents.getStatus()));
                    questionResponsePojo.setEnumQuestionType(EnumQuestionType.find(questionContents.getQuestionType()));
                    if(0!=userId){
                        QuestionFav questionFav = questionFavService.getQuestionFavInfo(userId, questionId);
                        questionResponsePojo.setQuestionFav(questionFav);
                    }
                    questionResponsePojos.add(questionResponsePojo);
                }
                paperQCResponsePojo.setQuestionResponsePojos(questionResponsePojos);
                paperQCResponsePojos.add(paperQCResponsePojo);
            }
            paperPojo.setPaperQCResponsePojos(paperQCResponsePojos);
        }
        return paperPojo;
    }


    @Override
    public int getSearchCount(GradePojo currentGrade, CoursePojo currentCourse, String content) {
        PaperExample paperExample = new PaperExample();
        PaperExample.Criteria criteria = paperExample.createCriteria();
        String gradeName = currentGrade.getGradeName();
        String courseName = currentCourse.getCourseName();
        if (gradeName != null && gradeName != "" && !gradeName.trim().equals("")) {
            criteria.andPaperGradeNameLike(gradeName);
        }
        if (courseName != null && courseName != "" && !courseName.trim().equals("")) {
            criteria.andPaperCourseNameLike(courseName);
        }
        if (content != null && content != "" && !content.trim().equals("")) {
            criteria.andPaperNameLike("%" + content.trim() + "%");
        }
        int count = (int) paperMapper.countByExample(paperExample);
        return count;
    }

    @Override
    public List<Paper> getSearchPapers(GradePojo currentGrade, CoursePojo currentCourse, String content, int start) {
        List<Paper> papers = new ArrayList<Paper>();
        String gradeName = currentGrade.getGradeName();
        String courseName = currentCourse.getCourseName();
        papers = paperExtMapper.getSearchPapers(gradeName,courseName,content,start);
        return papers;
    }

    @Override
    public List<PaperPojo> getPaperByUserId(int userId) {
        List<PaperPojo>  paperPojos= new ArrayList<PaperPojo>();
        if(0!=userId){
            PaperExample paperExample = new PaperExample();
            PaperExample.Criteria criteria = paperExample.createCriteria();
            criteria.andOwnerEqualTo(userId);
            List<Paper> papers = paperMapper.selectByExample(paperExample);
            if(null!=papers){
                for(Paper paper:papers){
                    PaperPojo paperPojo = new PaperPojo();
                    BeanUtils.copyProperties(paper,paperPojo);
                    paperPojo.setPaperDifficultyDesc(EnumQuestionDifficulty.find(paper.getPaperDifficulty().toString()).getDesc());
                    paperPojos.add(paperPojo);
                }
            }
        }
        return paperPojos;
    }

    @Override
    public int delete(int paperId) {
        int sa = 0;
        if(0!=paperId){
            sa = paperMapper.deleteByPrimaryKey(paperId);
        }
        return sa;
    }
}
