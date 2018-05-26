package ncu.study.autopaper.service.impl;

import ncu.study.autopaper.common.enums.EnumQuestionDifficulty;
import ncu.study.autopaper.common.pojo.PaperFavPojo;
import ncu.study.autopaper.common.pojo.PaperPojo;
import ncu.study.autopaper.dao.PaperFavMapper;
import ncu.study.autopaper.dao.PaperMapper;
import ncu.study.autopaper.model.Paper;
import ncu.study.autopaper.model.PaperFav;
import ncu.study.autopaper.model.PaperFavExample;
import ncu.study.autopaper.model.PaperFavKey;
import ncu.study.autopaper.service.PaperFavService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author Ridup
 * @version FleName:  PaperFavServiceImpl .java  v0.1  2018/5/17 18:58 Exp $
 */
@Service("paperFavService")
public class PaperFavServiceImpl implements PaperFavService {
    @Resource
    private PaperFavMapper paperFavMapper;
    @Resource
    private PaperMapper paperMapper;

    @Override
    public Boolean isFav(int userId, int paperId) {
        Boolean a = false;
        if (0 != userId && 0 != paperId) {
            PaperFavKey paperFavKey = new PaperFavKey(userId, paperId);
            PaperFav paperFav = paperFavMapper.selectByPrimaryKey(paperFavKey);
            if (paperFav != null) {
                a = true;
            }
        }
        return a;
    }

    @Override
    public int favPaper(int userId, int paperId) {
        int a = 0;
        if (0 != userId && 0 != paperId) {
            PaperFav paperFav = new PaperFav();
            paperFav.setUserId(userId);
            paperFav.setPaperId(paperId);
            paperFav.setCollectTime(new Date());
            a = paperFavMapper.insertSelective(paperFav);
        }

        return a;
    }

    @Override
    public int cancleFav(int userId, int paperId) {
        int a = 0;
        if (0 != userId && 0 != paperId) {
            PaperFavKey paperFavKey = new PaperFavKey(userId, paperId);
            a = paperFavMapper.deleteByPrimaryKey(paperFavKey);
        }

        return a;
    }

    @Override
    public List<PaperFavPojo> getPaperPojoByUserId(int userId) {
        ArrayList<PaperFavPojo> paperFavPojos = new ArrayList<PaperFavPojo>();
        if(0!=userId){
            PaperFavExample paperFavExample = new PaperFavExample();
            PaperFavExample.Criteria criteria = paperFavExample.createCriteria();
            criteria.andUserIdEqualTo(userId);
            List<PaperFav> paperFavs = paperFavMapper.selectByExample(paperFavExample);
            if(null!=paperFavs){
                for(PaperFav paperFav:paperFavs){
                    PaperFavPojo paperFavPojo = new PaperFavPojo();
                    BeanUtils.copyProperties(paperFav,paperFavPojo);
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日HH时");
                    paperFavPojo.setCollectTimeStr(sdf.format(paperFav.getCollectTime()));
                    Paper paper = paperMapper.selectByPrimaryKey(paperFav.getPaperId());
                    BeanUtils.copyProperties(paper,paperFavPojo);
                    paperFavPojo.setPaperDifficultyDesc(EnumQuestionDifficulty.find(paper.getPaperDifficulty().toString()).getDesc());
                    paperFavPojos.add(paperFavPojo);
                }
            }
        }
        return paperFavPojos;
    }
}
