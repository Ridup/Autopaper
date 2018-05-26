package ncu.study.autopaper.common.util.htmltowp.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

public final class ReadText
{
    
    /**util.ReadText#readFileToString()
     * 描述：读取以文本（txt）或html文件的内容<br>
     * @param filePath
     * @return
     * @see
     * @author litao
     */
    public static String readFileToString(String filePath)
    {
        String encoding = "UTF-8";
        File file = new File(filePath);
        Long filelength = file.length();
        byte[] filecontent = new byte[filelength.intValue()];
        try
        {
            FileInputStream in = new FileInputStream(file);
            in.read(filecontent);
            in.close();
        }
        catch (FileNotFoundException e)
        {
            System.out.println("----------------------文件不存在!----------------------");
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        try
        {
            return new String(filecontent, encoding);
        }
        catch (UnsupportedEncodingException e)
        {
            System.err.println("----------------------对文本进行 " + encoding+"编码错误!----------------------");
            e.printStackTrace();
            return null;
        }
    }
}
