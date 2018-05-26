package ncu.study.autopaper.dao.ext;

import ncu.study.autopaper.model.Paper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Ridup
 * @version FleName:  PaperExtMapper .java  v0.1  2018/5/18 14:23 Exp $
 */
public interface PaperExtMapper {
    public List<Paper> getSearchPapers(@Param("gradeName")String gradeName, @Param("courseName")String courseName, @Param("content") String content, @Param("start")int start);
}
