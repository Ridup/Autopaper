package ncu.study.autopaper.service.impl;

import ncu.study.autopaper.common.enums.EnumQuestionDifficulty;
import ncu.study.autopaper.common.pojo.QuestionFavPojo;
import ncu.study.autopaper.dao.QuestionFavMapper;
import ncu.study.autopaper.dao.QuestionMapper;
import ncu.study.autopaper.model.Question;
import ncu.study.autopaper.model.QuestionFav;
import ncu.study.autopaper.model.QuestionFavExample;
import ncu.study.autopaper.model.QuestionFavKey;
import ncu.study.autopaper.service.QuestionFavService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.annotation.Resources;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author Ridup
 * @version FleName:  QuestionFavServiceImpl .java  v0.1  2018/5/10 13:29 Exp $
 */
@Service("questionFavService")
public class QuestionFavServiceImpl implements QuestionFavService {
    @Resource
    private QuestionFavMapper questionFavMapper;


    @Resource
    private QuestionMapper questionMapper;
    @Override
    public int questionFav(int userId, Long questionId) {
        int status = 0;
        if (0 != userId && null != questionId) {
            QuestionFavKey questionFavKey = new QuestionFavKey();
            questionFavKey.setUserId(userId);
            questionFavKey.setQuestionId(questionId);
            QuestionFav questionFav = questionFavMapper.selectByPrimaryKey(questionFavKey);
            if (questionFav != null) {
                //有则删除收藏
                status = questionFavMapper.deleteByPrimaryKey(questionFavKey);
            } else {
                //无则添加收藏
                QuestionFav record = new QuestionFav();
                record.setQuestionId(questionId);
                record.setUserId(userId);
                record.setCollectTime(new Date());

                // TODO 添加试题信息，及是否做错
                //record.setIsWrong(0);
                //record.setQuestionDifficulty(3);


                status = questionFavMapper.insertSelective(record);
            }
        }
        return status;
    }

    @Override
    public QuestionFav getQuestionFavInfo(int userId, Long questionId) {
        QuestionFav questionFav = new QuestionFav();
        if (0 != userId && null != questionId) {
            QuestionFavKey questionFavKey = new QuestionFavKey();
            questionFavKey.setUserId(userId);
            questionFavKey.setQuestionId(questionId);
             questionFav = questionFavMapper.selectByPrimaryKey(questionFavKey);
        }
        return questionFav;
    }

    @Override
    public List<QuestionFavPojo> getQFByUserId(int userId) {
        List<QuestionFavPojo> questionFavPojos = new ArrayList<QuestionFavPojo>();
        if(0!=userId){
            QuestionFavExample questionFavExample = new QuestionFavExample();
            QuestionFavExample.Criteria criteria = questionFavExample.createCriteria();
            criteria.andUserIdEqualTo(userId);
            List<QuestionFav> questionFavs = questionFavMapper.selectByExample(questionFavExample);
            if(questionFavs!=null){
                for(QuestionFav questionFav :questionFavs){
                    QuestionFavPojo questionFavPojo = new QuestionFavPojo();
                    Question question = questionMapper.selectByPrimaryKey(questionFav.getQuestionId());
                    BeanUtils.copyProperties(questionFav,questionFavPojo);
                    BeanUtils.copyProperties(question,questionFavPojo);
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日HH时");
                    questionFavPojo.setCollectTimeStr(sdf.format(questionFav.getCollectTime()));
                    questionFavPojos.add(questionFavPojo);
                }
            }
        }
        return questionFavPojos;
    }

    @Override
    public int deleteFavRecord(int userd, long questionId) {
        int a=0;
        if(0!=userd&&0!=questionId){
            a = questionFavMapper.deleteByPrimaryKey(new QuestionFavKey(userd,questionId));
        }
        return a;
    }
}
