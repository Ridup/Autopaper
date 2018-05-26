/*
package ncu.study.autopaper.common.util.htmltowp.html2pdf;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.io.UnsupportedEncodingException;
import java.net.URL;

import javax.imageio.ImageIO;

import org.zefer.pd4ml.PD4Constants;
import org.zefer.pd4ml.PD4ML;
import org.zefer.pd4ml.PD4PageMark;


public class Converter {
    private int width = 800;
    
    private int height = 900;
    
    */
/**
     * 获取PDF的宽度
     * 
     * @return
     *//*

    public int getWidth()
    {
        return width;
    }
    
    */
/**
     * 设置PDF的宽度
     * 
     * @return
     *//*

    public void setWidth(int width)
    {
        this.width = width;
    }
    
    */
/**
     * 获取PDF的高度
     * 
     * @return
     *//*

    public int getHeight()
    {
        return height;
    }
    
    */
/**
     * 设置PDF的高度
     * 
     * @return
     *//*

    public void setHeight(int height)
    {
        this.height = height;
    }
    
    */
/**
     * 创建PDF文件
     * watermarkPath 水印的URL路径
     * @param sourcePath 源文件的路径
     * @param desPath 输出的PDF文件路径
     * @param
     * @throws Exception
     *//*

    public void createPdfFile(String sourcePath, String desPath, String mark)
        throws Exception
    {
        File sourceFile = new File(sourcePath);
        File desFile = new File(desPath);
        
        PD4ML pdf = new PD4ML();
        FileOutputStream outFile = new FileOutputStream(desFile);
        pdf.setHtmlWidth(this.width);
        pdf.setPageInsetsMM(new Insets(20, 20, 20, 20));
        pdf.setPageSizeMM(PD4Constants.A4);
        
        pdf.useTTF("java:fonts", true);
        pdf.setDefaultTTFs("fzst", "fzst", "fzst");
        
        PD4PageMark header = new PD4PageMark();
        header.setAreaHeight(-1); // autocompute
        header.setHtmlTemplate(null); // autocompute
        pdf.setPageHeader(header);
        
        PD4PageMark footer = new PD4PageMark();
//        footer.setWatermark("file:/" + drawWatermark(mark), new Rectangle(10, 10, width, height), 30);
        footer.setPagesToSkip(1);
        footer.setPageNumberAlignment(PD4PageMark.CENTER_ALIGN);
        pdf.setPageFooter(footer);
        pdf.enableDebugInfo();
        String readerStr = readFile(sourceFile, "utf-8");
        // pdf.render(new URL("file:///d:/add2.html"), outFile);
        pdf.render(new StringReader(readerStr), outFile);
    }
    
    */
/**
     * 创建PDF文件
     * watermarkPath 水印的URL路径
     * @param sourcePath 网址
     * @param desPath 输出的PDF文件路径
     * @param
     * @throws Exception
     *//*

    public void createPdfFile(URL sourcePath, String desPath, String mark)
        throws Exception
    {
        File desFile = new File(desPath);
        FileOutputStream outFile = new FileOutputStream(desFile);
        PD4ML pdf = new PD4ML();
        System.out.println("-------------------------------"+PD4ML.getVersion()+"---------------------------------------"); 
        pdf.setHtmlWidth(this.width);
        pdf.setPageInsetsMM(new Insets(20, 15, 20, 15));
        pdf.setPageSizeMM(PD4Constants.A4);
        // pdf.enableTableBreaks(false);
//        pdf.useTTF("java:fonts", true);
//       pdf.setDefaultTTFs("Times New Roman", "Arial", "Courier New");  
//        pdf.setDefaultTTFs("KaiTi_GB2312", "KaiTi_GB2312", "KaiTi_GB2312");
        pdf.useTTF("F:/Test/fonts", true);
        pdf.setDefaultTTFs("SimSun", "SimSun", "SimSun");
        PD4PageMark header = new PD4PageMark();
        header.setAreaHeight(-1); // autocompute
        header.setTitleAlignment(PD4PageMark.RIGHT_ALIGN);
        // header.setHtmlTemplate("<div style='width:100%;text-align:right;'><font color='red'>验收�?/font></div>");
        
        PD4PageMark footer = new PD4PageMark();
        String waterPath = ""; // 水印路径
        String systemName = getSystemType(); // 获取当前操作系统类型，根据类型�?择协�?
//        if (systemName.indexOf("windows") != -1)
//        {
//            waterPath = "file:/" + drawWatermark(mark);
//        }
//        else if (systemName.indexOf("linux") != -1)
//        {
//            waterPath = "file://" + drawWatermark(mark);
//        }
        footer.setWatermark(waterPath, new Rectangle(0, 0, width, height), 30);
        footer.setPageNumberTemplate("${page}/${total}");
        footer.setPageNumberAlignment(PD4PageMark.CENTER_ALIGN);
        // footer.setHtmlTemplate("<pd4ml:page.break/>");
        footer.setPagesToSkip(1);
        
        pdf.setPageHeader(header);
        pdf.setPageFooter(footer);
        // pdf.adjustHtmlWidth(); //内容向右�?
        // pdf.generateOutlines(true);
        // pdf.protectPhysicalUnitDimensions();
        pdf.enableDebugInfo();
        String readerStr = readFile(sourcePath, "utf-8");
        pdf.render(new StringReader(readerStr), outFile);
    }
    
    */
/**
     * 读取文件
     * @param path 路径
     * @param encoding 编码
     * @return 字符串
     * @throws IOException 如果遇到io异常
     *//*

    private String readFile(File path, String encoding)
        throws IOException
    {
        // File f = new File( path );
        FileInputStream is = new FileInputStream(path);
        BufferedInputStream bis = new BufferedInputStream(is);
        ByteArrayOutputStream fos = new ByteArrayOutputStream();
        byte buffer[] = new byte[2048];
        int read;
        do
        {
            read = is.read(buffer, 0, buffer.length);
            if (read > 0)
            {
                fos.write(buffer, 0, read);
            }
        } while (read > -1);
        
        fos.close();
        bis.close();
        is.close();
        
        return fos.toString(encoding);
    }
    
    */
/**
     * 读取文件 for url
     * @param path 路径
     * @param encoding 编码
     * @return 文件的字符串
     * @throws IOException 如果遇到io异常
     *//*

    private String readFile(URL path, String encoding)
        throws IOException
    {
        // DataInputStream dis=new DataInputStream();
        InputStream is = path.openStream();
        BufferedInputStream bis = new BufferedInputStream(is);
        ByteArrayOutputStream fos = new ByteArrayOutputStream();
        byte buffer[] = new byte[2048];
        int read;
        do
        {
            read = bis.read(buffer, 0, buffer.length);
            if (read > 0)
            {
                fos.write(buffer, 0, read);
            }
        } while (read > -1);
        fos.close();
        bis.close();
        return fos.toString(encoding);
    }
    
    */
/**
     * 此方法暂时没用到
     * @param mark 备注
     * @return 字符串
     * @throws FileNotFoundException 文件没有找到的情况下
     *//*

    private String drawWatermarka(String mark)
        throws FileNotFoundException
    {
        String systemName = getSystemType();
        File file = null;
        if (systemName.indexOf("windows") != -1)
        {
            file = new File("f:/Test/pg/watermark.png");
        }
        else if (systemName.indexOf("linux") != -1)
        {
            file = new File("//opt//Test//pg//watermark.png");
        }
        if (file.exists())
        {
            file.delete();
        }
        try
        {
            file.createNewFile();
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(file));
            BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
            Graphics2D g = (Graphics2D)image.getGraphics();
            // 消除线条锯齿
            g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            // 画出矩形
            g.setColor(Color.white);
            g.fillRect(0, 0, width, height);
            // 配置字体
            Font font = new Font("宋体", Font.BOLD, 48);
            g.setFont(font);
            // 画字
            g.rotate(Math.cos(22)); // 画布旋转22�?
            g.setColor(Color.gray);
            g.drawString(mark, -width / 2, height / 2);
            // 设置透明
            // g.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER));
            // g.drawImage(image,watermarkX,watermarkY, waterImg.getWidth(null),
            // waterImg.getHeight(null), null);
            // 设置透明
            g.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_ATOP, 0.1f));
            ImageIO.write(image, "png", bos);
        }
        catch (IOException e)
        {
            e.printStackTrace();
            throw new RuntimeException("水印文件创建失败");
        }
        return file.getPath();
    }
    
    */
/**
     * 获取系统类型
     * @return 系统类型
     *//*

    private String getSystemType()
    {
        return System.getProperty("os.name").toLowerCase();
    }
    
    public static void main(String[] args)
    {
        Converter util = new Converter();
        try
        {
            util.createPdfFile(new URL("file:///F:/Test/a.html"), "F:/Test/a.pdf", "11110000");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
*/
