package ncu.study.autopaper.dao.ext;

import ncu.study.autopaper.model.Question;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Ridup
 * @version FleName:  QuestionExtMapper .java  v0.1  2018/5/7 16:03 Exp $
 */
public interface QuestionExtMapper {
    public List<Question> getSearchQuestions(@Param("gradeName")String gradeName, @Param("courseName")String courseName,
                                             @Param("questionType")String questionType,@Param("content") String content, @Param("start")int start);

    public  List<Question> getQuestionListByRuleOR(@Param("questionType")String questionType,@Param("points")List<String> points,@Param("pointsSum")int pointsSum);

    public  List<Question> getQuestionListByTempQuestion(@Param("questionType")String questionType,
                                                         @Param("questionId")long questionId,@Param("questionScore")int questionScore,
                                                         @Param("points")List<String> points,@Param("pointsSum")int pointsSum);


}
