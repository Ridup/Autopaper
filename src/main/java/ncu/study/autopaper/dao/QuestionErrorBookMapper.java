package ncu.study.autopaper.dao;

import java.util.List;
import ncu.study.autopaper.model.QuestionErrorBook;
import ncu.study.autopaper.model.QuestionErrorBookExample;
import ncu.study.autopaper.model.QuestionErrorBookKey;
import org.apache.ibatis.annotations.Param;

public interface QuestionErrorBookMapper {
    long countByExample(QuestionErrorBookExample example);

    int deleteByExample(QuestionErrorBookExample example);

    int deleteByPrimaryKey(QuestionErrorBookKey key);

    int insert(QuestionErrorBook record);

    int insertSelective(QuestionErrorBook record);

    List<QuestionErrorBook> selectByExample(QuestionErrorBookExample example);

    QuestionErrorBook selectByPrimaryKey(QuestionErrorBookKey key);

    int updateByExampleSelective(@Param("record") QuestionErrorBook record, @Param("example") QuestionErrorBookExample example);

    int updateByExample(@Param("record") QuestionErrorBook record, @Param("example") QuestionErrorBookExample example);

    int updateByPrimaryKeySelective(QuestionErrorBook record);

    int updateByPrimaryKey(QuestionErrorBook record);
}