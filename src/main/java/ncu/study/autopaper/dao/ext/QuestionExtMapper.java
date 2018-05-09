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
}
