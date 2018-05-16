package ncu.study.autopaper.service;

import ncu.study.autopaper.common.pojo.PaperQCResponsePojo;
import ncu.study.autopaper.common.pojo.PaperResponsePojo;
import ncu.study.autopaper.model.QuestionBasket;

import java.util.List;

/**
 * @author Ridup
 * @version FleName:  PaperService .java  v0.1  2018/5/17 1:18 Exp $
 */
public interface PaperService {
    public  int savePaper(int userId,String paperName,String paperPath,QuestionBasket questionBasketInfo,List<PaperQCResponsePojo> paperQCInfo,PaperResponsePojo paperResponsePojo);
}
