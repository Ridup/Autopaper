package ncu.study.autopaper.dao;

import java.util.List;
import ncu.study.autopaper.model.PaperComment;
import ncu.study.autopaper.model.PaperCommentExample;
import org.apache.ibatis.annotations.Param;

public interface PaperCommentMapper {
    long countByExample(PaperCommentExample example);

    int deleteByExample(PaperCommentExample example);

    int deleteByPrimaryKey(Long paperCommentId);

    int insert(PaperComment record);

    int insertSelective(PaperComment record);

    List<PaperComment> selectByExample(PaperCommentExample example);

    PaperComment selectByPrimaryKey(Long paperCommentId);

    int updateByExampleSelective(@Param("record") PaperComment record, @Param("example") PaperCommentExample example);

    int updateByExample(@Param("record") PaperComment record, @Param("example") PaperCommentExample example);

    int updateByPrimaryKeySelective(PaperComment record);

    int updateByPrimaryKey(PaperComment record);
}