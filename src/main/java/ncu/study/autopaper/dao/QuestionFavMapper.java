package ncu.study.autopaper.dao;

import java.util.List;
import ncu.study.autopaper.model.QuestionFav;
import ncu.study.autopaper.model.QuestionFavExample;
import ncu.study.autopaper.model.QuestionFavKey;
import org.apache.ibatis.annotations.Param;

public interface QuestionFavMapper {
    long countByExample(QuestionFavExample example);

    int deleteByExample(QuestionFavExample example);

    int deleteByPrimaryKey(QuestionFavKey key);

    int insert(QuestionFav record);

    int insertSelective(QuestionFav record);

    List<QuestionFav> selectByExample(QuestionFavExample example);

    QuestionFav selectByPrimaryKey(QuestionFavKey key);

    int updateByExampleSelective(@Param("record") QuestionFav record, @Param("example") QuestionFavExample example);

    int updateByExample(@Param("record") QuestionFav record, @Param("example") QuestionFavExample example);

    int updateByPrimaryKeySelective(QuestionFav record);

    int updateByPrimaryKey(QuestionFav record);
}