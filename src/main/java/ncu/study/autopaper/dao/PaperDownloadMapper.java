package ncu.study.autopaper.dao;

import java.util.List;
import ncu.study.autopaper.model.PaperDownload;
import ncu.study.autopaper.model.PaperDownloadExample;
import ncu.study.autopaper.model.PaperDownloadKey;
import org.apache.ibatis.annotations.Param;

public interface PaperDownloadMapper {
    long countByExample(PaperDownloadExample example);

    int deleteByExample(PaperDownloadExample example);

    int deleteByPrimaryKey(PaperDownloadKey key);

    int insert(PaperDownload record);

    int insertSelective(PaperDownload record);

    List<PaperDownload> selectByExample(PaperDownloadExample example);

    PaperDownload selectByPrimaryKey(PaperDownloadKey key);

    int updateByExampleSelective(@Param("record") PaperDownload record, @Param("example") PaperDownloadExample example);

    int updateByExample(@Param("record") PaperDownload record, @Param("example") PaperDownloadExample example);

    int updateByPrimaryKeySelective(PaperDownload record);

    int updateByPrimaryKey(PaperDownload record);
}