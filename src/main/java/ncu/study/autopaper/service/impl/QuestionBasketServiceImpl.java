package ncu.study.autopaper.service.impl;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import ncu.study.autopaper.common.enums.EnumQuestionType;
import ncu.study.autopaper.common.pojo.CoursePojo;
import ncu.study.autopaper.common.pojo.GradePojo;
import ncu.study.autopaper.common.pojo.QuestionBasketPojo;
import ncu.study.autopaper.common.pojo.QuestionBasketTypeCountPojo;
import ncu.study.autopaper.dao.QuestionBasketMapper;
import ncu.study.autopaper.dao.QuestionMapper;
import ncu.study.autopaper.model.Question;
import ncu.study.autopaper.model.QuestionBasket;
import ncu.study.autopaper.model.QuestionBasketKey;
import ncu.study.autopaper.service.QuestionBasketService;
import ncu.study.autopaper.service.QuestionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.*;

/**
 * @author Ridup
 * @version FleName:  QuestionBasketServiceImpl .java  v0.1  2018/5/11 15:46 Exp $
 */
@Service("questionBasketService")
public class QuestionBasketServiceImpl implements QuestionBasketService {
    @Resource
    private QuestionBasketMapper questionBasketMapper;
    @Resource
    private QuestionMapper questionMapper;




    @Override
    public Boolean hasBasket(int userId,String course) {
        Boolean hasBasket = false;
        if (0 != userId) {
            QuestionBasketKey questionBasketKey = new QuestionBasket();
            questionBasketKey.setUserId(userId);
            questionBasketKey.setCourse(course);
            QuestionBasket questionBasket = questionBasketMapper.selectByPrimaryKey(questionBasketKey);
            if (null != questionBasket) {
                hasBasket = true;
            }
        }
        return hasBasket;
    }

    @Override
    public Boolean isInBasket(int userId,String course, Long questionId, String questionType) {
        Boolean isInBasket = false;
        Gson gson = new Gson();
        if (0 != userId && null != questionId) {
            QuestionBasketKey questionBasketKey = new QuestionBasket();
            questionBasketKey.setUserId(userId);
            questionBasketKey.setCourse(course);
            QuestionBasket questionBasket = questionBasketMapper.selectByPrimaryKey(questionBasketKey);
            if (null != questionBasket) {
                // TODO 试题篮解析  抽象
                //试题篮类型集合
                String questionTypeCollectionStr = questionBasket.getQuestionTypeCollection();
                List<String> listType = gson.fromJson(questionTypeCollectionStr, new TypeToken<List<String>>() {
                }.getType());
                //试题篮试题集合
                String questionBasketPojosStr = questionBasket.getQuestionIdCollection();
                List<QuestionBasketPojo> questionBasketPojos = gson.fromJson(questionBasketPojosStr, new TypeToken<List<QuestionBasketPojo>>() {
                }.getType());

                for (String type : listType) {
                    if (questionType.equals(type)) {
                        for (QuestionBasketPojo questionBasketPojo : questionBasketPojos) {
                            if (questionType.equals(questionBasketPojo.getQuestionType())) {
                                List<Long> questionIds = questionBasketPojo.getQuestionIds();
                                if (questionIds.contains(questionId)) {
                                    isInBasket = true;
                                    break;
                                } else {
                                    isInBasket = false;
                                }
                            }
                        }
                    }
                }
            }
        }
        return isInBasket;
    }


    @Override
    public int addQuestion(int userId, Long questionId, String questionType,GradePojo currentGrade, CoursePojo currentCourse) {
        int status = 0;
        String course = currentCourse.getCourse();
        //获取该试题的信息：年级、学科
        Question question = questionMapper.selectByPrimaryKey(questionId);
        //判断该用户是否存在试题篮，然后再判断是插入update还新增insert;使用Gson生成与解析
        if (hasBasket(userId,course)) {
            //有则update,先获得对应的试题篮内容
            Gson gson = new Gson();
            QuestionBasketKey questionBasketKey = new QuestionBasket();
            questionBasketKey.setUserId(userId);
            questionBasketKey.setCourse(course);
            QuestionBasket questionBasket = questionBasketMapper.selectByPrimaryKey(questionBasketKey);
            Boolean typeSameStatus = false;
            //1.判断是否存在该类型，无则添加新类型和试题id，除了userId和createtime其他需改变  4 个

            //试题篮类型集合
            String questionTypeCollectionStr = questionBasket.getQuestionTypeCollection();
            List<String> listType = gson.fromJson(questionTypeCollectionStr, new TypeToken<List<String>>() {
            }.getType());
            //试题篮试题集合
            String questionBasketPojosStr = questionBasket.getQuestionIdCollection();
            List<QuestionBasketPojo> questionBasketPojos = gson.fromJson(questionBasketPojosStr, new TypeToken<List<QuestionBasketPojo>>() {
            }.getType());
            //试题篮类型对应题数
            String questionBasketTypeCountPojosStr = questionBasket.getTypeCountCollection();
            List<QuestionBasketTypeCountPojo> questionBasketTypeCountPojos = gson.fromJson(questionBasketTypeCountPojosStr, new TypeToken<List<QuestionBasketTypeCountPojo>>() {
            }.getType());

            for (String type : listType) {
                if (questionType.equals(type)) {
                    typeSameStatus = true;
                    break;
                }
            }
            if (!typeSameStatus) {
                listType.add(questionType);

                QuestionBasketPojo questionBasketPojo = new QuestionBasketPojo();
                questionBasketPojo.setQuestionType(questionType);
                questionBasketPojo.setQuestionTypeName(EnumQuestionType.find(questionType).getDesc());
                List<Long> questionList = new ArrayList<Long>();
                questionList.add(questionId);
                questionBasketPojo.setQuestionIds(questionList);
                questionBasketPojos.add(questionBasketPojo);

                QuestionBasketTypeCountPojo questionBasketTypeCountPojo = new QuestionBasketTypeCountPojo();
                questionBasketTypeCountPojo.setQuestionType(questionType);
                questionBasketTypeCountPojo.setQuestionTypeName(EnumQuestionType.find(questionType).getDesc());
                questionBasketTypeCountPojo.setQuestionCount(1);
                questionBasketTypeCountPojos.add(questionBasketTypeCountPojo);

                QuestionBasket record = new QuestionBasket();
                record.setUserId(userId);
                record.setCourse(course);
                record.setQuestionIdCollection(gson.toJson(questionBasketPojos));
                record.setQuestionTypeCollection(gson.toJson(listType));
                record.setTotal(questionBasket.getTotal() + 1);
                record.setTypeCountCollection(gson.toJson(questionBasketTypeCountPojos));

                status = questionBasketMapper.updateByPrimaryKeySelective(record);

            }
            //2、有则将试题id加入集合中，并更改数目和总数  3个
            else {
                ListIterator<QuestionBasketPojo> questionBasketPojoListIterator = questionBasketPojos.listIterator();
                while (questionBasketPojoListIterator.hasNext()) {
                    QuestionBasketPojo questionBasketPojo = questionBasketPojoListIterator.next();
                    if (questionType.equals(questionBasketPojo.getQuestionType())) {
                        List<Long> questionIds = questionBasketPojo.getQuestionIds();
                        questionIds.add(questionId);
                        questionBasketPojo.setQuestionIds(questionIds);
                        questionBasketPojoListIterator.set(questionBasketPojo);
                        break;
                    }
                }

                ListIterator<QuestionBasketTypeCountPojo> questionBasketTypeCountPojoListIterator = questionBasketTypeCountPojos.listIterator();
                while (questionBasketTypeCountPojoListIterator.hasNext()) {
                    QuestionBasketTypeCountPojo questionBasketTypeCountPojo = questionBasketTypeCountPojoListIterator.next();
                    if (questionType.equals(questionBasketTypeCountPojo.getQuestionType())) {
                        questionBasketTypeCountPojo.setQuestionCount(questionBasketTypeCountPojo.getQuestionCount() + 1);
                        questionBasketTypeCountPojoListIterator.set(questionBasketTypeCountPojo);
                        break;
                    }
                }
                QuestionBasket record = new QuestionBasket();
                record.setUserId(userId);
                record.setCourse(course);
                record.setQuestionIdCollection(gson.toJson(questionBasketPojos));
                record.setTypeCountCollection(gson.toJson(questionBasketTypeCountPojos));
                record.setTotal(questionBasket.getTotal() + 1);
                status = questionBasketMapper.updateByPrimaryKeySelective(record);
            }
        } else {
            // 无则insert
            Gson gson = new Gson();
            List<String> listType = new ArrayList<String>();
            listType.add(questionType);

            List<QuestionBasketPojo> questionBasketPojos = new ArrayList<QuestionBasketPojo>();
            QuestionBasketPojo questionBasketPojo = new QuestionBasketPojo();
            questionBasketPojo.setQuestionType(questionType);
            questionBasketPojo.setQuestionTypeName(EnumQuestionType.find(questionType).getDesc());
            List<Long> questionList = new ArrayList<Long>();
            questionList.add(questionId);
            questionBasketPojo.setQuestionIds(questionList);
            questionBasketPojos.add(questionBasketPojo);

            List<QuestionBasketTypeCountPojo> questionBasketTypeCountPojos = new ArrayList<QuestionBasketTypeCountPojo>();
            QuestionBasketTypeCountPojo questionBasketTypeCountPojo = new QuestionBasketTypeCountPojo();
            questionBasketTypeCountPojo.setQuestionType(questionType);
            questionBasketTypeCountPojo.setQuestionTypeName(EnumQuestionType.find(questionType).getDesc());
            questionBasketTypeCountPojo.setQuestionCount(1);
            questionBasketTypeCountPojos.add(questionBasketTypeCountPojo);

            QuestionBasket record = new QuestionBasket();
            record.setCreateTime(new Date());
            record.setQuestionIdCollection(gson.toJson(questionBasketPojos));
            record.setQuestionTypeCollection(gson.toJson(listType));
            record.setTotal(1);
            record.setUserId(userId);
            record.setGrade(currentGrade.getGrade());
            record.setGradeName(currentGrade.getGradeName());
            record.setCourse(course);
            record.setCourseName(currentCourse.getCourseName());
            record.setTypeCountCollection(gson.toJson(questionBasketTypeCountPojos));

            status = questionBasketMapper.insertSelective(record);
        }
        return status;
    }

    @Override
    public int deleteQuestion(int userId, Long questionId, String questionType,GradePojo currentGrade, CoursePojo currentCourse) {
        int status = 0;
        String course = currentCourse.getCourse();
        Gson gson = new Gson();
        QuestionBasketKey questionBasketKey = new QuestionBasket();
        questionBasketKey.setUserId(userId);
        questionBasketKey.setCourse(course);
        QuestionBasket questionBasket = questionBasketMapper.selectByPrimaryKey(questionBasketKey);
        //总数判断
        if (1 == questionBasket.getTotal()) {
            status = questionBasketMapper.deleteByPrimaryKey(questionBasketKey);
            return status;
        }

        //试题篮类型集合
        String questionTypeCollectionStr = questionBasket.getQuestionTypeCollection();
        List<String> listType = gson.fromJson(questionTypeCollectionStr, new TypeToken<List<String>>() {
        }.getType());
        //试题篮试题集合
        String questionBasketPojosStr = questionBasket.getQuestionIdCollection();
        List<QuestionBasketPojo> questionBasketPojos = gson.fromJson(questionBasketPojosStr, new TypeToken<List<QuestionBasketPojo>>() {
        }.getType());
        //试题篮类型对应题数
        String questionBasketTypeCountPojosStr = questionBasket.getTypeCountCollection();
        List<QuestionBasketTypeCountPojo> questionBasketTypeCountPojos = gson.fromJson(questionBasketTypeCountPojosStr, new TypeToken<List<QuestionBasketTypeCountPojo>>() {
        }.getType());

        ListIterator<QuestionBasketPojo> questionBasketPojoListIterator = questionBasketPojos.listIterator();
        while (questionBasketPojoListIterator.hasNext()) {
            QuestionBasketPojo questionBasketPojo = questionBasketPojoListIterator.next();
            if (questionType.equals(questionBasketPojo.getQuestionType())) {
                List<Long> ids = questionBasketPojo.getQuestionIds();
                /*for (Long id : ids) {
                    if(id==questionId){
                        ids.remove(id);
                        questionBasketPojo.setQuestionIds(ids);
                        questionBasketPojoListIterator.set(questionBasketPojo);
                        break;
                    }
                }*/
                /*for(int i=0;i<ids.size();i++){
                    if(ids.get(i)==questionId){
                        ids.remove(i);
                        questionBasketPojo.setQuestionIds(ids);
                        questionBasketPojoListIterator.set(questionBasketPojo);
                        break;
                    }
                }*/
                ListIterator<Long> longListIterator = ids.listIterator();
                while (longListIterator.hasNext()) {
                    Long id = longListIterator.next();
                    if (id.equals(questionId)) {
                        longListIterator.remove();
                        questionBasketPojo.setQuestionIds(ids);
                        questionBasketPojoListIterator.set(questionBasketPojo);
                        break;
                    }
                }


                ListIterator<QuestionBasketTypeCountPojo> questionBasketTypeCountPojoListIterator = questionBasketTypeCountPojos.listIterator();
                while (questionBasketTypeCountPojoListIterator.hasNext()) {
                    QuestionBasketTypeCountPojo questionBasketTypeCountPojo = questionBasketTypeCountPojoListIterator.next();
                    if (questionType.equals(questionBasketTypeCountPojo.getQuestionType())) {
                        if (0==ids.size()) {
                            questionBasketPojoListIterator.remove();
                            listType.remove(questionType);
                            questionBasketTypeCountPojoListIterator.remove();
                        } else {
                            questionBasketTypeCountPojo.setQuestionCount(questionBasketTypeCountPojo.getQuestionCount() - 1);
                            questionBasketTypeCountPojoListIterator.set(questionBasketTypeCountPojo);
                        }
                        break;
                    }
                }

                QuestionBasket record = new QuestionBasket();
                record.setUserId(userId);
                record.setCourse(course);
                record.setTotal(questionBasket.getTotal() - 1);
                record.setQuestionIdCollection(gson.toJson(questionBasketPojos));
                record.setQuestionTypeCollection(gson.toJson(listType));
                record.setTypeCountCollection(gson.toJson(questionBasketTypeCountPojos));
                status = questionBasketMapper.updateByPrimaryKeySelective(record);
                break;
            }
        }
        return status;
    }


    @Override
    public QuestionBasket getQuestionBasketInfo(int userId,String course) {
        QuestionBasketKey questionBasketKey = new QuestionBasket();
        questionBasketKey.setUserId(userId);
        questionBasketKey.setCourse(course);
        QuestionBasket questionBasket = questionBasketMapper.selectByPrimaryKey(questionBasketKey);
        return questionBasket;
    }

    @Override
    public int clearQuestionBasket(int userId, String course) {
        int status = 0;
        QuestionBasketKey questionBasketKey = new QuestionBasket();
        questionBasketKey.setUserId(userId);
        questionBasketKey.setCourse(course);
        status = questionBasketMapper.deleteByPrimaryKey(questionBasketKey);
        return status;
    }
}
