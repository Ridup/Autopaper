package ncu.study.autopaper.dao;

import java.util.List;
import ncu.study.autopaper.model.QuestionBugget;
import ncu.study.autopaper.model.QuestionBuggetExample;
import org.apache.ibatis.annotations.Param;

public interface QuestionBuggetMapper {
    int countByExample(QuestionBuggetExample example);

    int deleteByExample(QuestionBuggetExample example);

    int deleteByPrimaryKey(Long questionId);

    int insert(QuestionBugget record);

    int insertSelective(QuestionBugget record);

    List<QuestionBugget> selectByExample(QuestionBuggetExample example);

    QuestionBugget selectByPrimaryKey(Long questionId);

    int updateByExampleSelective(@Param("record") QuestionBugget record, @Param("example") QuestionBuggetExample example);

    int updateByExample(@Param("record") QuestionBugget record, @Param("example") QuestionBuggetExample example);

    int updateByPrimaryKeySelective(QuestionBugget record);

    int updateByPrimaryKey(QuestionBugget record);
}