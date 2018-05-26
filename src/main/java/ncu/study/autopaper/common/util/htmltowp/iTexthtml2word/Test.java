/*
package ncu.study.autopaper.common.util.htmltowp.iTexthtml2word;


import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;


import com.lowagie.text.DocumentException;
import ncu.study.autopaper.common.util.htmltowp.util.ReadText;

public class Test
{

    */
/**
     * 描述：<br>hncr.bzPlatform.prjMgr.word.Test#main()
     * @param args
     * @see
     * @author litao
     *//*

    public static void main(String[] args)
    {
        System.out.println("-----开始读取文本中的html------");
        String htmlContent = ReadText.readFileToString("F:/Test/a.html") ;
        System.out.println("-----读取结束------");
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy年MM月dd日HH时mm分ss秒");
        String currentTime = formatter.format(new Date());
        String filePath ="F:/"+currentTime+".doc";
        ItextConverWordUtils wordUtils = new ItextConverWordUtils();
        try {
            System.out.println("-----开始生成word文档------");
            wordUtils.openDocument(filePath);
            wordUtils.insertHtmlContext(htmlContent);
            wordUtils.closeDocument();
            System.out.println("-----成功生成word文档------");
        } catch (DocumentException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
*/
