package ncu.study.autopaper.dao;

import java.util.List;
import ncu.study.autopaper.model.CoursesInfo;
import ncu.study.autopaper.model.CoursesInfoExample;
import org.apache.ibatis.annotations.Param;

public interface CoursesInfoMapper {
    long countByExample(CoursesInfoExample example);

    int deleteByExample(CoursesInfoExample example);

    int deleteByPrimaryKey(Integer courseId);

    int insert(CoursesInfo record);

    int insertSelective(CoursesInfo record);

    List<CoursesInfo> selectByExample(CoursesInfoExample example);

    CoursesInfo selectByPrimaryKey(Integer courseId);

    int updateByExampleSelective(@Param("record") CoursesInfo record, @Param("example") CoursesInfoExample example);

    int updateByExample(@Param("record") CoursesInfo record, @Param("example") CoursesInfoExample example);

    int updateByPrimaryKeySelective(CoursesInfo record);

    int updateByPrimaryKey(CoursesInfo record);
}