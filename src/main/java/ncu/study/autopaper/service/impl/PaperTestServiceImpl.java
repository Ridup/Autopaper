package ncu.study.autopaper.service.impl;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import ncu.study.autopaper.common.pojo.ErrorQuestionPojo;
import ncu.study.autopaper.common.pojo.PaperTestPojo;
import ncu.study.autopaper.common.pojo.QuestionBasketTypeCountPojo;
import ncu.study.autopaper.dao.PaperTestMapper;
import ncu.study.autopaper.model.PaperTest;
import ncu.study.autopaper.model.PaperTestExample;
import ncu.study.autopaper.service.PaperTestService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Ridup
 * @version FleName:  PaperTestServiceImpl .java  v0.1  2018/5/23 22:16 Exp $
 */
@Service("paperTestService")
public class PaperTestServiceImpl implements PaperTestService {
    @Resource
    private PaperTestMapper paperTestMapper;


    @Override
    public int saveTestRecord(PaperTest paperTest) {
        int a = paperTestMapper.insertSelective(paperTest);
        return a;
    }

    @Override
    public List<PaperTest> getPaperTestByRecord(PaperTest record) {
        List<PaperTest> paperTests = new ArrayList<PaperTest>();
        if (record != null) {
            PaperTestExample paperTestExample = new PaperTestExample();
            PaperTestExample.Criteria criteria = paperTestExample.createCriteria();
            criteria.andAnswerTimeEqualTo(record.getAnswerTime());
            criteria.andCostTimeEqualTo(record.getCostTime());
            criteria.andPaperIdEqualTo(record.getPaperId());
            criteria.andPaperNameEqualTo(record.getPaperName());
            criteria.andStartTimeEqualTo(record.getStartTime());
            criteria.andUserIdEqualTo(record.getUserId());
            criteria.andTestScoreEqualTo(record.getTestScore());
            paperTests = paperTestMapper.selectByExample(paperTestExample);
        }
        return paperTests;
    }

    @Override
    public PaperTestPojo getPaperTestById(int testId) {
        PaperTestPojo paperTestPojo = new PaperTestPojo();
        Gson gson = new Gson();
        PaperTest paperTest = paperTestMapper.selectByPrimaryKey(testId);
        if(null!=paperTest){
            BeanUtils.copyProperties(paperTest,paperTestPojo);
            String testAnswer = paperTest.getTestAnswer();
            List<ErrorQuestionPojo> errorQuestionPojos = gson.fromJson(testAnswer, new TypeToken<List<ErrorQuestionPojo>>() {
            }.getType());
            if(null!=errorQuestionPojos){
                paperTestPojo.setErrorQuestionPojos(errorQuestionPojos);
            }
        }
        return paperTestPojo;
    }

    @Override
    public int deleteRecord(int testId) {
        int a=0;
        if(0!=testId){
            a =paperTestMapper.deleteByPrimaryKey(testId);
        }
        return a;
    }

    @Override
    public List<PaperTestPojo> getPaperTestByUserId(int userId) {
        List<PaperTestPojo> paperTestPojos = new ArrayList<PaperTestPojo>();
        if(0!=userId){
            PaperTestExample paperTestExample = new PaperTestExample();
            PaperTestExample.Criteria criteria = paperTestExample.createCriteria();
            criteria.andUserIdEqualTo(userId);
            List<PaperTest> paperTests = paperTestMapper.selectByExample(paperTestExample);
            if(null!=paperTests){
                for(PaperTest paperTest:paperTests){
                    PaperTestPojo paperTestPojo = new PaperTestPojo();
                    BeanUtils.copyProperties(paperTest,paperTestPojo);
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日HH时");
                    paperTestPojo.setStartTimeStr(sdf.format(paperTest.getStartTime()));
                    paperTestPojos.add(paperTestPojo);
                }
            }
        }
        return paperTestPojos;
    }
}
