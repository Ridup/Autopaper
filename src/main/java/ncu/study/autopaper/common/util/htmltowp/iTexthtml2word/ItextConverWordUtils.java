package ncu.study.autopaper.common.util.htmltowp.iTexthtml2word;

import java.awt.Color;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.StringReader;
import java.net.MalformedURLException;
import java.util.List;

import com.lowagie.text.BadElementException;
import com.lowagie.text.Cell;
import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Element;
import com.lowagie.text.Font;
import com.lowagie.text.FontFactory;
import com.lowagie.text.Image;
import com.lowagie.text.PageSize;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Table;
import com.lowagie.text.html.simpleparser.HTMLWorker;
import com.lowagie.text.html.simpleparser.StyleSheet;
import com.lowagie.text.pdf.BaseFont;
import com.lowagie.text.rtf.RtfWriter2;
import com.lowagie.text.rtf.style.RtfParagraphStyle;

/**
 * 描述： itext 生成word工具类<br>
 * @author litao at Jan 26, 2018
 */
public class ItextConverWordUtils
{
    private Document document;
    private BaseFont bfChinese;

    public BaseFont getBfChinese()
    {
        return bfChinese;
    }

    public void setBfChinese(BaseFont bfChinese)
    {
        this.bfChinese = bfChinese;
    }

    public Document getDocument()
    {
        return document;
    }

    public void setDocument(Document document)
    {
        this.document = document;
    }

    public ItextConverWordUtils()
    {
        this.document = new Document(PageSize.A4);// 设置纸张大小

    }

    /**iTexthtml2word.ItextConverWordUtils#openDocument()
     * 描述：建立一个书写器(Writer)与document对象关联，通过书写器(Writer)可以将文档写入到磁盘中<br>
     * @param filePath 要操作的文档路径，若文档不存在会自动创建
     * @throws DocumentException
     * @throws IOException
     * @see
     */
    public void openDocument(String filePath) throws DocumentException, IOException
    {
        // 建立一个书写器(Writer)与document对象关联，通过书写器(Writer)可以将文档写入到磁盘中
        RtfWriter2.getInstance(this.document, new FileOutputStream(filePath));
        this.document.open();
        // 设置中文字体
        this.bfChinese = BaseFont.createFont("STSongStd-Light", "UniGB-UCS2-H", BaseFont.NOT_EMBEDDED);
    }
    
    /**
     * 描述：<br>iTexthtml2word.ItextConverWordUtils#insertTitle()
     * @param titleStr 标题
     * @param fontsize 字体大小
     * @param fontStyle 字体样式
     * @param elementAlign 对齐方式
     * @throws DocumentException
     * @see
     */
    public void insertTitle(String titleStr, int fontsize, int fontStyle, int elementAlign) throws DocumentException
    {
        Font titleFont = new Font(this.bfChinese, fontsize, fontStyle);
        Paragraph title = new Paragraph(titleStr);
        // 设置标题格式对齐方式
        title.setAlignment(elementAlign);
        title.setFont(titleFont);
        this.document.add(title);
    }

    
    /**iTexthtml2word.ItextConverWordUtils#insertTitlePattern()
     * 描述：设置带有目录格式的标题(标题1格式)<br>
     * @param rtfParagraphStyle 标题1样式
     * @param titleStr 标题
     * @throws DocumentException
     * @see
     */
    public void insertTitlePattern(String titleStr, RtfParagraphStyle rtfParagraphStyle) throws DocumentException
    {
        Paragraph title = new Paragraph(titleStr);
        title.setFont(rtfParagraphStyle);
        this.document.add(title);
    }

    /**
     * 描述：  设置带有目录格式的标题(标题2格式)
     * @param titleStr 标题
     * @param rtfParagraphStyle 标题2样式
     * @throws DocumentException
     */
    public void insertTitlePatternSecond(String titleStr, RtfParagraphStyle rtfParagraphStyle) throws DocumentException
    {
        Paragraph title = new Paragraph(titleStr);
        // 设置标题格式对齐方式
        title.setFont(rtfParagraphStyle);
        this.document.add(title);
    }

    /**
     * @param tableName 标题
     * @param fontsize 字体大小
     * @param fontStyle 字体样式
     * @param elementAlign 对齐方式
     * @throws DocumentException
     */
    public void insertTableName(String tableName, int fontsize, int fontStyle, int elementAlign) throws DocumentException
    {
        Font titleFont = new Font(this.bfChinese, fontsize, fontStyle);
        titleFont.setColor(102, 102, 153);
        Paragraph title = new Paragraph(tableName);
        // 设置标题格式对齐方式
        title.setAlignment(elementAlign);
        title.setFont(titleFont);

        this.document.add(title);
    }

    /**fontsize 字体大小 fontStyle 字体样式
     * @param contextStr 内容
     * @param
     * @param
     * @param elementAlign 对齐方式
     * @throws DocumentException
     */
    public void insertContext(String contextStr, int elementAlign) throws DocumentException
    {
        // 正文字体风格
        Font contextFont = new Font(bfChinese);
        contextFont.setStyle(FontFactory.HELVETICA);
        contextFont.setStyle(Font.BOLD);// 加粗
        Paragraph context = new Paragraph(contextStr);
        // 设置行距
        context.setLeading(3f);
        // 正文格式左对齐
        // context.setAlignment(elementAlign);
        context.setFont(contextFont);
        // 离上一段落（标题）空的行数
        context.setSpacingBefore(1);
        // 设置第一行空的列数
        context.setFirstLineIndent(20);
        document.add(context);
    }

    /**
     * @param imgUrl 图片路径
     * @param imageAlign 显示位置
     * @param height 显示高度
     * @param weight 显示宽度
     * @param percent 显示比例
     * @param heightPercent 显示高度比例
     * @param weightPercent 显示宽度比例
     * @param rotation 显示图片旋转角度
     * @throws MalformedURLException
     * @throws IOException
     * @throws DocumentException
     */
    public void insertImg(String imgUrl, int imageAlign, int height, int weight, int percent, int heightPercent, int weightPercent, int rotation) throws MalformedURLException, IOException,
            DocumentException
    {
        // 添加图片
        Image img = Image.getInstance(imgUrl);
        if (img == null)
            return;
        img.setAbsolutePosition(0, 0);
        img.setAlignment(imageAlign);
        img.scaleAbsolute(height, weight);
        img.scaleAbsolute(1000, 1000);
        img.scalePercent(percent);
        img.scalePercent(heightPercent, weightPercent);
        img.setRotation(rotation);
        document.add(img);
    }

    /** iTexthtml2word.ItextConverWordUtils#insertHtmlContext()
     * 描述：html生成word<br>
     * @param context
     * @see
     */
    @SuppressWarnings("rawtypes")
    public void insertHtmlContext(String context)
    {
        StyleSheet ss = new StyleSheet();
        try
        {
            List htmlList = HTMLWorker.parseToList(new StringReader(context), ss);
            for (int i = 0; i < htmlList.size(); i++)
            {
                Element e = (Element) htmlList.get(i);
                document.add(e);
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        catch (DocumentException e)
        {
            e.printStackTrace();
        }
    }

   
    /**iTexthtml2word.ItextConverWordUtils#insertImg()
     * 描述：批量插入图片<br>
     * @param imgList
     * @see
     * @author litao
     */
    public void insertImg(String[] imgList)
    {
        try
        {
            Image img = null;
            for (int j = 0; j < imgList.length; j++)
            {
                // 图片
                img = Image.getInstance((String) imgList[j]);
                float heigth = img.getHeight();
                float width = img.getWidth();
                int percent = getPercent2(heigth, width);
                img.setAlignment(Image.MIDDLE);
                img.scalePercent(percent + 3);// 表示是原来图像的比例;
                document.add(img);
                System.out.println("==========图片插入word成功！=================");
            }
        }
        catch (BadElementException e)
        {
            e.printStackTrace();
        }
        catch (MalformedURLException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        catch (DocumentException e)
        {
            e.printStackTrace();
        }
    }

    /** iTexthtml2word.ItextConverWordUtils#insertImg()
     * 描述：单个插入图片<br>
     * @param imgList
     * @see
     */
    public void insertImg(String imgList)
    {
        try
        {
            Image img = null;
            // 图片
            img = Image.getInstance(imgList);
            float heigth = img.getHeight();
            float width = img.getWidth();
            int percent = getPercent2(heigth, width);
            img.setAlignment(Image.MIDDLE);
            img.scalePercent(percent + 3);// 表示是原来图像的比例;
            document.add(img);
            System.out.println("==========图片插入word成功！=================");
        }
        catch (BadElementException e)
        {
            e.printStackTrace();
        }
        catch (MalformedURLException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        catch (DocumentException e)
        {
            e.printStackTrace();
        }
    }

    /**
     * 第一种解决方案 在不改变图片形状的同时，判断，如果h>w，则按h压缩，否则在w>h或w=h的情况下，按宽度压缩
     * @param h
     * @param w
     * @return
     */
    public static int getPercent(float h, float w)
    {
        int p = 0;
        float p2 = 0.0f;
        if (h > w)
        {
            p2 = 297 / h * 100;
        }
        else
        {
            p2 = 210 / w * 100;
        }
        p = Math.round(p2);
        return p;
    }

    /**args
     * 第二种解决方案，统一按照宽度压缩 这样来的效果是，所有图片的宽度是相等的，自我认为给客户的效果是最好的
     * @param
     */
    public static int getPercent2(float h, float w)
    {
        int p = 0;
        float p2 = 0.0f;
        p2 = 530 / w * 100;
        p = Math.round(p2);
        return p;
    }

    /**
     * 添加简单表格
     * @param column 表格列数(必须)
     * @param row 表格行数
     * @throws DocumentException
     */
    public void insertSimpleTable(int column, int row) throws DocumentException
    {
        Table table = new Table(column);// 列数必须设置，而行数则可以按照个人要求来决定是否需要设置
        table.setAlignment(Element.ALIGN_CENTER);// 居中显示
        table.setAlignment(Element.ALIGN_MIDDLE);// 纵向居中显示
        table.setAutoFillEmptyCells(true);// 自动填满
        table.setBorderColor(new Color(0, 125, 255));// 边框颜色
        table.setBorderWidth(1);// 边框宽度
        table.setSpacing(2);// 衬距，
        table.setPadding(2);// 即单元格之间的间距
        table.setBorder(20);// 边框
        for (int i = 0; i < column * 3; i++)
        {
            table.addCell(new Cell("" + i));
        }
        document.add(table);
    }

    /**
     * 插入汇总表table到word
     * @param map
     */

    // public void insertHzTable(HashMap map) throws IOException{
    // List thread_list = (List) map.get("thread_list"); //汇总表头部集合
    // List body_list = (List) map.get("body_list"); //汇总表数据集合
    // int maxCell = Integer.parseInt((String) map.get("maxCell")); //列数
    // int maxLevel = Integer.parseInt((String) map.get("maxLevel")); //行数
    // String s_tab_name = (String)map.get("SPECIAL_NAME"); //表名称
    // //开始动态创建Excel文件
    // Properties wordFile = new Properties();
    // try {
    // // 创建Word报表数据部份
    // //=================================================================================
    // //=================================================================================
    // //设置报表表头
    // BaseFont bfHei =
    // bfChinese;//BaseFont.createFont("c://Windows//Fonts//SIMHEI.TTF",BaseFont.IDENTITY_H,BaseFont.NOT_EMBEDDED);
    // Font font = new Font(bfHei, 32);
    // Font titleFont = new Font(bfHei,14,Font.BOLD);//标题字体风格 黑体
    // Font contextFont = new Font(Font.BOLD,11,Font.BOLD);//正文字体风格
    // Font cellFont = new Font(Font.STRIKETHRU,10,Font.NORMAL);//正文字体风格
    //
    // Paragraph title = new Paragraph(s_tab_name); //设置表名称
    // //设置标题格式对齐方式
    // title.setAlignment(Element.ALIGN_CENTER); // 设置段落居中，其中1为居中对齐，2为右对齐，3为左对齐
    // title.setFont(titleFont);
    // document.add(title);
    //
    // //计量单位
    // Paragraph p_unit = new Paragraph("单位： ");
    // p_unit.setAlignment(Element.ALIGN_RIGHT);
    // p_unit.setFont(contextFont);
    // //p_unit.setSpacingBefore(10);//段间距 (与上一段落（标题）的行距)
    // //p_organ.setFirstLineIndent(20);//设置第一行空的列数 (设置第一行空的列数（缩进）)
    // //设置段落缩进
    // //p_unit.setIndentationLeft(10);
    // //设置首行缩进
    // //p_unit.setFirstLineIndent(20f);
    // //设置段后距和段前距
    // //p_unit.setSpacingAfter(10f);
    // //p_unit.setSpacingBefore(100f);
    // document.add(p_unit);
    //
    // //=================================================================================
    // //设置表格：多层表头部份
    // Table table = new Table(maxCell,maxLevel);//创建多少列、多少行
    // int width[] = new int[maxCell];//设置每列宽度比例
    // for(int l=0;l<maxCell;l++){
    // if(l==0){
    // if(maxCell>7){
    // width[l] = 3;
    // }else{
    // width[l] = 4;
    // }
    // }else{
    // width[l] = 1;
    // }
    // }
    // table.setWidths(width);
    // table.setWidth(100);//占页面宽度比例
    // table.setAlignment(Element.ALIGN_CENTER);//横向居中
    // table.setAlignment(Element.ALIGN_MIDDLE);//垂直居中
    // table.setAutoFillEmptyCells(true);//自动填满
    // table.setBorderWidth(1);//边框宽度
    //
    // //=================================================================================
    // //循环所有层:进行绘制宾栏
    // for(int j=0;j<thread_list.size();j++){
    // List titleObjList = (List) thread_list.get(j);
    // for(int k=0;k<titleObjList.size();k++){
    // JspTable cellMap = (JspTable) titleObjList.get(k);
    // String context = cellMap.getContext();
    // String rowStr = cellMap.getRow(); //合并行数
    // String colsStr = cellMap.getCol(); //合并列数
    // int order =cellMap.getOrder(); //每个宾栏对应的顺序好
    // int dc_no = 0;
    // int rowSpan =0;
    // int colspan=0;
    // if(rowStr!=null&&!"".equals(rowStr)){
    // rowSpan = Integer.parseInt(rowStr);
    // }
    // if(colsStr!=null&&!"".equals(colsStr)){
    // colspan = Integer.parseInt(colsStr);
    // }
    //
    // //判断当前层并且宾栏必汇总状态必需为显示,如果等于1,则不进行显示
    //
    // try {
    // Paragraph p_headerText = new Paragraph(context);
    // p_headerText.setFont(contextFont);
    // p_headerText.setSpacingAfter(5);//设置一个段落前后的间距。
    // p_headerText.setSpacingBefore(5);
    // //p_headerText.setIndentationLeft(50); //设置缩进
    // //p_headerText.setIndentationRight(50);
    //
    // Cell blCell = new Cell(p_headerText);
    // blCell.setHeader(true);
    // blCell.setColspan(colspan);//合并列
    // blCell.setRowspan(rowSpan);//合并行
    // blCell.setHorizontalAlignment(Element.ALIGN_CENTER);//横向居中
    // blCell.setVerticalAlignment(Element.ALIGN_MIDDLE);//垂直居中
    // //如果是第一列
    // if(k==0){
    // blCell.setBorderWidthRight(1);//第一列的右边框
    // }else{
    // blCell.setBorderWidthLeft(1);//每列的左边框
    // }
    // blCell.setBorderWidthTop(1);//上边框
    // blCell.setBorderWidthBottom(1);//下边框
    // table.addCell(blCell);
    // // table.addCell(blCell,j,order);//将当前单元，添加到第几行，第几列
    // } catch (Exception e) {
    // // TODO: handle exception
    // System.out.println(e.getMessage());
    // }
    // }
    // }
    // //=================================================================================
    // //设置字体，字号，加粗，颜色
    // Font zlfont = new Font(Font.NORMAL, 10, Font.BOLD, new Color(0, 0, 0));
    //
    // //设置表格数据
    // for(int j=0;j<body_list.size();j++){
    // List rowList = (ArrayList)body_list.get(j);
    // for(int k=0;k<rowList.size();k++){
    // JspTable column = (JspTable)rowList.get(k);
    //
    // Paragraph p_cellText = new Paragraph(column.getContext());
    // p_cellText.setFont(cellFont);
    // p_cellText.setSpacingAfter(5f);//设置一个段落前后的间距。
    // p_cellText.setSpacingBefore(5f);
    // //p_cellText.setIndentationLeft(50f); //设置缩进
    // //p_cellText.setIndentationRight(50f);
    //
    // Cell rowCell = new Cell(p_cellText);
    // rowCell.setHeader(true);
    // //如果是第一列
    // if(k==0){
    // //是否字体加粗
    // if(column.getBold()!= null){
    // p_cellText.setFont(zlfont);
    // }else{
    // p_cellText.setFont(cellFont);
    // }
    // rowCell.setBorderWidthRight(1);//第一列的右边框
    // rowCell.setHorizontalAlignment(Element.ALIGN_LEFT);//横向居中
    // }else{
    // rowCell.setBorderWidthLeft(1);//每列的左边框
    // rowCell.setHorizontalAlignment(Element.ALIGN_RIGHT);//横向居中
    // }
    // rowCell.setBorderWidthBottom(1);//每行数据的下边框
    // rowCell.setVerticalAlignment(Element.ALIGN_MIDDLE);//垂直居中
    // table.addCell(rowCell);
    // }
    // }
    // //=================================================================================
    // //将表格数据添加到文件中
    // document.add(table);
    // System.out.println("====================汇总表生成word成功！===========================");
    // //最后关闭文件
    // } catch (DocumentException e) {
    // System.out.println("====================汇总表生成word失败！===========================");
    // e.printStackTrace();
    // }
    //
    // }

    /**
     * 在操作完成后必须关闭document,否则即使生成了word文档，打开也会发生错误
     * @throws DocumentException
     */
    public void closeDocument()
    {
        try
        {
            this.document.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
