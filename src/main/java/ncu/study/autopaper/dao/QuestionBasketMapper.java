package ncu.study.autopaper.dao;

import java.util.List;
import ncu.study.autopaper.model.QuestionBasket;
import ncu.study.autopaper.model.QuestionBasketExample;
import ncu.study.autopaper.model.QuestionBasketKey;
import org.apache.ibatis.annotations.Param;

public interface QuestionBasketMapper {
    long countByExample(QuestionBasketExample example);

    int deleteByExample(QuestionBasketExample example);

    int deleteByPrimaryKey(QuestionBasketKey key);

    int insert(QuestionBasket record);

    int insertSelective(QuestionBasket record);

    List<QuestionBasket> selectByExample(QuestionBasketExample example);

    QuestionBasket selectByPrimaryKey(QuestionBasketKey key);

    int updateByExampleSelective(@Param("record") QuestionBasket record, @Param("example") QuestionBasketExample example);

    int updateByExample(@Param("record") QuestionBasket record, @Param("example") QuestionBasketExample example);

    int updateByPrimaryKeySelective(QuestionBasket record);

    int updateByPrimaryKey(QuestionBasket record);
}