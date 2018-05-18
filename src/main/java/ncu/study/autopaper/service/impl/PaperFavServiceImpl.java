package ncu.study.autopaper.service.impl;

import ncu.study.autopaper.dao.PaperFavMapper;
import ncu.study.autopaper.model.PaperFav;
import ncu.study.autopaper.model.PaperFavKey;
import ncu.study.autopaper.service.PaperFavService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;

/**
 * @author Ridup
 * @version FleName:  PaperFavServiceImpl .java  v0.1  2018/5/17 18:58 Exp $
 */
@Service("paperFavService")
public class PaperFavServiceImpl implements PaperFavService {
    @Resource
    private PaperFavMapper paperFavMapper;

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
}
