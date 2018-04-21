package ncu.study.autopaper.dao;

import java.util.List;
import ncu.study.autopaper.model.QuestionComment;
import ncu.study.autopaper.model.QuestionCommentExample;
import org.apache.ibatis.annotations.Param;

public interface QuestionCommentMapper {
    int countByExample(QuestionCommentExample example);

    int deleteByExample(QuestionCommentExample example);

    int deleteByPrimaryKey(Long questionCommentId);

    int insert(QuestionComment record);

    int insertSelective(QuestionComment record);

    List<QuestionComment> selectByExample(QuestionCommentExample example);

    QuestionComment selectByPrimaryKey(Long questionCommentId);

    int updateByExampleSelective(@Param("record") QuestionComment record, @Param("example") QuestionCommentExample example);

    int updateByExample(@Param("record") QuestionComment record, @Param("example") QuestionCommentExample example);

    int updateByPrimaryKeySelective(QuestionComment record);

    int updateByPrimaryKey(QuestionComment record);
}