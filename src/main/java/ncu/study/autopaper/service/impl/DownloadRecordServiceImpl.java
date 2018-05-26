package ncu.study.autopaper.service.impl;

import ncu.study.autopaper.common.pojo.PaperDownloadPojo;
import ncu.study.autopaper.dao.PaperDownloadMapper;
import ncu.study.autopaper.model.PaperDownload;
import ncu.study.autopaper.model.PaperDownloadExample;
import ncu.study.autopaper.model.PaperDownloadKey;
import ncu.study.autopaper.service.DownloadRecordService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author Ridup
 * @version FleName:  DownloadRecordServiceImpl .java  v0.1  2018/5/17 19:19 Exp $
 */
@Service("downloadRecordService")
public class DownloadRecordServiceImpl implements DownloadRecordService {

    @Resource
    private PaperDownloadMapper paperDownloadMapper;



    @Override
    public int getDownloadTimes(int paperId) {
        int a = 0;
        if(0!=paperId){
            PaperDownloadExample paperDownloadExample = new PaperDownloadExample();
            PaperDownloadExample.Criteria criteria = paperDownloadExample.createCriteria();
            criteria.andPaperIdEqualTo(paperId);
            List<PaperDownload> paperDownloads = paperDownloadMapper.selectByExample(paperDownloadExample);
            if(paperDownloads!=null){
                a = paperDownloads.size();
            }else{
                a = 0;
            }

        }
        return a;
    }

    @Override
    public List<PaperDownloadPojo> getUserDownloadRecord(int userId) {
        List<PaperDownloadPojo> paperDownloadPojos = new ArrayList<PaperDownloadPojo>();
        if(0!=userId){
            PaperDownloadExample paperDownloadExample = new PaperDownloadExample();
            PaperDownloadExample.Criteria criteria = paperDownloadExample.createCriteria();
            criteria.andUserIdEqualTo(userId);
            List<PaperDownload> paperDownloads = paperDownloadMapper.selectByExample(paperDownloadExample);
            if(paperDownloads!=null){
                for(PaperDownload paperDownload:paperDownloads){
                    PaperDownloadPojo paperDownloadPojo = new PaperDownloadPojo();
                    BeanUtils.copyProperties(paperDownload,paperDownloadPojo);
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日HH时mm分ss秒");
                    paperDownloadPojo.setDownDate(sdf.format(paperDownload.getDownloadTime()));
                    paperDownloadPojos.add(paperDownloadPojo);
                }
            }

        }
        return paperDownloadPojos;
    }

    @Override
    public int saveUserDownloadRecord(int userId, int paperId,String paperName) {
        int a = 0;
        if(0!=userId&&0!=paperId){
            PaperDownloadKey paperDownloadKey =new PaperDownloadKey(paperId,userId);
            PaperDownload paperDownload = paperDownloadMapper.selectByPrimaryKey(paperDownloadKey);
            if(paperDownload!=null){
                a=1;
            }else{
                PaperDownload record = new PaperDownload();
                record.setPaperId(paperId);
                record.setPaperName(paperName);
                record.setUserId(userId);
                record.setDownloadTime(new Date());
                paperDownloadMapper.insertSelective(record);
                a=1;
            }

        }
        return a;
    }

    @Override
    public int delete(int userId, int paperId) {
        int a = 0;
        if(0!=userId&&0!=paperId){
            PaperDownloadKey paperDownloadKey =new PaperDownloadKey(paperId,userId);
            a= paperDownloadMapper.deleteByPrimaryKey(paperDownloadKey);
        }
        return a;
    }
}
