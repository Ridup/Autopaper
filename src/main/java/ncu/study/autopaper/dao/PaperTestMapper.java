package ncu.study.autopaper.dao;

import java.util.List;
import ncu.study.autopaper.model.PaperTest;
import ncu.study.autopaper.model.PaperTestExample;
import org.apache.ibatis.annotations.Param;

public interface PaperTestMapper {
    long countByExample(PaperTestExample example);

    int deleteByExample(PaperTestExample example);

    int deleteByPrimaryKey(Integer testId);

    int insert(PaperTest record);

    int insertSelective(PaperTest record);

    List<PaperTest> selectByExample(PaperTestExample example);

    PaperTest selectByPrimaryKey(Integer testId);

    int updateByExampleSelective(@Param("record") PaperTest record, @Param("example") PaperTestExample example);

    int updateByExample(@Param("record") PaperTest record, @Param("example") PaperTestExample example);

    int updateByPrimaryKeySelective(PaperTest record);

    int updateByPrimaryKey(PaperTest record);
}