package ncu.study.autopaper.dao;

import java.util.List;
import ncu.study.autopaper.model.PaperFav;
import ncu.study.autopaper.model.PaperFavExample;
import ncu.study.autopaper.model.PaperFavKey;
import org.apache.ibatis.annotations.Param;

public interface PaperFavMapper {
    long countByExample(PaperFavExample example);

    int deleteByExample(PaperFavExample example);

    int deleteByPrimaryKey(PaperFavKey key);

    int insert(PaperFav record);

    int insertSelective(PaperFav record);

    List<PaperFav> selectByExample(PaperFavExample example);

    PaperFav selectByPrimaryKey(PaperFavKey key);

    int updateByExampleSelective(@Param("record") PaperFav record, @Param("example") PaperFavExample example);

    int updateByExample(@Param("record") PaperFav record, @Param("example") PaperFavExample example);

    int updateByPrimaryKeySelective(PaperFav record);

    int updateByPrimaryKey(PaperFav record);
}