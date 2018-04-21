/*
package ncu.study.autopaper.common.util;

import com.google.common.base.Objects;
import com.hsjry.lang.log.Log;
import com.hsjry.lang.log.TenantLog;
import com.hsjry.loan.common.enums.EnumErrCode;
import com.hsjry.loan.common.exceptions.ServiceException;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFClientAnchor;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFPatriarch;
import org.apache.poi.hssf.usermodel.HSSFRichTextString;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.ClientAnchor;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

*/
/**
 * excel 解析工具类
 * 
 * @author mawei
 * @version $Id: ExcelUtil.java, v 0.1 2017年5月17日 上午10:56:52 mawei Exp $
 *//*

public class ExcelUtil<T> {

    private static Log log = TenantLog.get(ExcelUtil.class);


    public static List<List<String>> readXlsx(InputStream fileStream) {
        try {
            //            InputStream is = new FileInputStream(path);
            XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileStream);
            List<List<String>> result = new ArrayList<List<String>>();
            XSSFSheet xssfSheet = xssfWorkbook.getSheetAt(0);
            if (xssfSheet == null) {
                throw new ServiceException(EnumErrCode.PARAM_ERR.getCode(), "文件内容为空");
            }

            for (int rowNum = 1; rowNum <= xssfSheet.getLastRowNum(); rowNum++) {
                XSSFRow xssfRow = xssfSheet.getRow(rowNum);

                int minColIx = xssfRow.getFirstCellNum();
                int maxColIx = xssfRow.getLastCellNum();
                List<String> rowList = new ArrayList<String>();
                for (int colIx = minColIx; colIx < maxColIx; colIx++) {
                    XSSFCell cell = xssfRow.getCell(colIx);
                    if (cell == null) {
                        continue;
                    }
                    rowList.add(getStringVal(cell));
                }

                //如果前三列都为空，则认为解析完毕
                if (rowList == null || rowList.isEmpty()) {
                    break;
                }

                result.add(rowList);
            }
            return result;
        } catch (Exception e) {
            throw new ServiceException(EnumErrCode.SYSTEM_ERR.getCode(), "文件解析失败，请查看文件内容是否符合规范", e);
        }
    }

    */
/**
     * 从rowNum开始读取数据，从1开始
     * 
     * @param rowNum
     * @return
     *//*

    public static List<List<String>> readXlsx(XSSFWorkbook xssfWorkbook, int rowNum, int size) {
        try {
            //            InputStream is = new FileInputStream(path);
            //            XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileStream);
            List<List<String>> result = new ArrayList<List<String>>();
            XSSFSheet xssfSheet = xssfWorkbook.getSheetAt(0);
            if (xssfSheet == null) {
                throw new ServiceException(EnumErrCode.PARAM_ERR.getCode(), "文件内容为空");
            }
            int count = size + rowNum -1;
            for (; rowNum <= count; rowNum++) {
                XSSFRow xssfRow = xssfSheet.getRow(rowNum);
                if (xssfRow == null) {
                    break;
                }
                int minColIx = xssfRow.getFirstCellNum();
                int maxColIx = xssfRow.getLastCellNum();
                List<String> rowList = new ArrayList<String>();
                for (int colIx = minColIx; colIx < maxColIx; colIx++) {
                    XSSFCell cell = xssfRow.getCell(colIx);
                    if (cell == null) {
                        continue;
                    }
                    rowList.add(getStringVal(cell));
                }

                //如果前三列都为空，则认为解析完毕
                if (rowList == null || rowList.isEmpty()) {
                    break;
                }
                
                result.add(rowList);
            }
            return result;
        } catch (Exception e) {
            throw new ServiceException(EnumErrCode.SYSTEM_ERR.getCode(), "文件解析失败，请查看文件内容是否符合规范", e);
        }
    }

    public static File create(List<List<String>> data, String path, String fileName) {
        try {
            XSSFWorkbook xssfWorkbook = new XSSFWorkbook();
            XSSFSheet xssfSheet = xssfWorkbook.createSheet();
            //遍历行
            for (int i = 0; i < data.size(); i++) {
                XSSFRow row = xssfSheet.createRow(i);
                //遍历列
                List<String> rowData = data.get(i);
                for (int j = 0; j < rowData.size(); j++) {
                    XSSFCell cell = row.createCell(j);
                    cell.setCellValue(rowData.get(j));
                }

            }

            File nFile = new File(path + File.separator + fileName);
            OutputStream os = new FileOutputStream(nFile);
            xssfWorkbook.write(os);
            os.flush();
            os.close();
            return nFile;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    private static String getStringVal(XSSFCell cell) {
        cell.setCellType(Cell.CELL_TYPE_STRING);
        return cell.getStringCellValue();
    }

    public static String renameFile(String fileName) {
        return RandomCodeUtil.getUUID() + fileName.substring(fileName.lastIndexOf("."));
    }

    */
/**
     * 创建sheet
     * 
     * @param data
     * @param sheetIndex
     * @param xssfWorkbook
     *//*

    public static void createSheet(List<List<String>> data, int sheetIndex,
                                   XSSFWorkbook xssfWorkbook) {
        XSSFSheet xssfSheet = xssfWorkbook.createSheet();
        xssfWorkbook.setSheetName(sheetIndex - 1, "第" + sheetIndex + "页");
        //遍历行
        for (int i = 0; i < data.size(); i++) {
            XSSFRow row = xssfSheet.createRow(i);
            //遍历列
            List<String> rowData = data.get(i);
            for (int j = 0; j < rowData.size(); j++) {
                XSSFCell cell = row.createCell(j);
                cell.setCellValue(rowData.get(j));
            }

        }
    }


    public void exportExcel(String title, String[] headers,
                            Collection<T> dataset, OutputStream out, String pattern) {
        // 声明一个工作薄
        HSSFWorkbook workbook = new HSSFWorkbook();
        // 生成一个表格
        HSSFSheet sheet = workbook.createSheet(title);
        // 设置表格默认列宽度为15个字节
        sheet.setDefaultColumnWidth((short) 20);
        // 生成一个样式
        HSSFCellStyle style = workbook.createCellStyle();
        // 设置这些样式
        style.setFillForegroundColor(HSSFColor.GREY_25_PERCENT.index);
        //style.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);
        style.setBorderBottom(HSSFCellStyle.BORDER_THIN);
        style.setBorderLeft(HSSFCellStyle.BORDER_THIN);
        style.setBorderRight(HSSFCellStyle.BORDER_THIN);
        style.setBorderTop(HSSFCellStyle.BORDER_THIN);
        style.setAlignment(HSSFCellStyle.ALIGN_CENTER);
        // 生成一个字体
        HSSFFont font = workbook.createFont();
        //font.setColor(HSSFColor.VIOLET.index);
        font.setFontHeightInPoints((short) 12);
        font.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);
        // 把字体应用到当前的样式
        style.setFont(font);
        // 生成并设置另一个样式
        HSSFCellStyle style2 = workbook.createCellStyle();
        style2.setFillForegroundColor(HSSFColor.GREY_25_PERCENT.index);
        //style2.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);
        style2.setBorderBottom(HSSFCellStyle.BORDER_THIN);
        style2.setBorderLeft(HSSFCellStyle.BORDER_THIN);
        style2.setBorderRight(HSSFCellStyle.BORDER_THIN);
        style2.setBorderTop(HSSFCellStyle.BORDER_THIN);
        style2.setAlignment(HSSFCellStyle.ALIGN_CENTER);
        style2.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);
        // 生成另一个字体
        HSSFFont font2 = workbook.createFont();
        font2.setBoldweight(HSSFFont.BOLDWEIGHT_NORMAL);
        // 把字体应用到当前的样式
        style2.setFont(font2);

        // 声明一个画图的顶级管理器
        HSSFPatriarch patriarch = sheet.createDrawingPatriarch();
        // 定义注释的大小和位置,详见文档
        // HSSFComment comment = patriarch.createComment(new HSSFClientAnchor(0,
        // 0, 0, 0, (short) 4, 2, (short) 6, 5));
        // 设置注释内容
        // comment.setString(new HSSFRichTextString("可以在POI中添加注释！"));
        // 设置注释作者，当鼠标移动到单元格上是可以在状态栏中看到该内容.
        // comment.setAuthor("leno");

        // 产生表格标题行
        HSSFRow row = sheet.createRow(0);
        for (int i = 0; i < headers.length; i++) {
            HSSFCell cell = row.createCell(i);
            cell.setCellStyle(style);
            HSSFRichTextString text = new HSSFRichTextString(headers[i]);
            cell.setCellValue(text);
        }

        // 遍历集合数据，产生数据行
        Iterator<T> it = dataset.iterator();
        int index = 0;
        HSSFFont font3 = workbook.createFont();
        while (it.hasNext()) {
            index++;
            row = sheet.createRow(index);
            T t = (T) it.next();
            // 利用反射，根据javabean属性的先后顺序，动态调用getXxx()方法得到属性值
            Field[] fields = t.getClass().getDeclaredFields();
            for (int i = 0; i < fields.length; i++) {
                HSSFCell cell = row.createCell(i);
                cell.setCellStyle(style2);//设置样式
                Field field = fields[i];
                String fieldName = field.getName();
                String getMethodName = "get"
                        + fieldName.substring(0, 1).toUpperCase()
                        + fieldName.substring(1);
                try {
                    Class tCls = t.getClass();
                    Method getMethod = tCls.getMethod(getMethodName,
                            new Class[] {});
                    Object value = getMethod.invoke(t, new Object[] {});
                    // 判断值的类型后进行强制类型转换
                    String textValue = null;
                    // if (value instanceof Integer) {
                    // int intValue = (Integer) value;
                    // cell.setCellValue(intValue);
                    // } else if (value instanceof Float) {
                    // float fValue = (Float) value;
                    // textValue = new HSSFRichTextString(
                    // String.valueOf(fValue));
                    // cell.setCellValue(textValue);
                    // } else if (value instanceof Double) {
                    // double dValue = (Double) value;
                    // textValue = new HSSFRichTextString(
                    // String.valueOf(dValue));
                    // cell.setCellValue(textValue);
                    // } else if (value instanceof Long) {
                    // long longValue = (Long) value;
                    // cell.setCellValue(longValue);
                    // }
                    if (value instanceof Boolean) {
                        boolean bValue = (Boolean) value;
                        textValue = "是";
                        if (!bValue) {
                            textValue = "否";
                        }
                    } else if (value instanceof Date) {
                        if(Objects.equal(null, value)){
                            textValue = null;
                        } else {
                            Date date = (Date) value;
                            SimpleDateFormat sdf = new SimpleDateFormat(pattern);
                            textValue = sdf.format(date);
                        }
                    } else if (value instanceof byte[]) {
                        // 有图片时，设置行高为60px;
                        row.setHeightInPoints(60);
                        // 设置图片所在列宽度为80px,注意这里单位的一个换算
                        sheet.setColumnWidth(i, (short) (35.7 * 80));
                        // sheet.autoSizeColumn(i);
                        byte[] bsValue = (byte[]) value;
                        HSSFClientAnchor anchor = new HSSFClientAnchor(0, 0,
                                1023, 255, (short) 6, index, (short) 6, index);
                        // anchor.setAnchorType(2);
                        anchor.setAnchorType(ClientAnchor.AnchorType.MOVE_DONT_RESIZE);
                        patriarch.createPicture(anchor, workbook.addPicture(
                                bsValue, HSSFWorkbook.PICTURE_TYPE_JPEG));
                    } else if (value instanceof Enum) {
                        //枚举取描述
                        Class enumCls = field.getType();
                        Method enumMethod = enumCls.getMethod("getDescription",
                                new Class[] {});
                        Object enumVal = enumMethod.invoke(value, new Object[] {});
                        textValue = Objects.equal(null, enumVal) ? null : enumVal.toString();
                    } else {
                        // 其它数据类型都当作字符串简单处理
                        textValue = Objects.equal(null, value) ? null : value.toString();
                    }
                    // 如果不是图片数据，就利用正则表达式判断textValue是否全部由数字组成
                    if (textValue != null) {
                        Pattern p = Pattern.compile("^//d+(//.//d+)?$");
                        Matcher matcher = p.matcher(textValue);
                        if (matcher.matches()) {
                            // 是数字当作double处理
                            cell.setCellValue(Double.parseDouble(textValue));
                        } else {
                            HSSFRichTextString richString = new HSSFRichTextString(
                                    textValue);
//							font3.setColor(HSSFColor.BLUE.index);
                            richString.applyFont(font3);
                            cell.setCellValue(richString);
                        }
                    }
                } catch (SecurityException e) {
                    log.error(e.getMessage());
                } catch (NoSuchMethodException e) {
                    log.error(e.getMessage());
                } catch (IllegalArgumentException e) {
                    log.error(e.getMessage());
                } catch (IllegalAccessException e) {
                    log.error(e.getMessage());
                } catch (InvocationTargetException e) {
                    log.error(e.getMessage());
                } finally {
                    // 清理资源

                }
            }
        }
        try {
            workbook.write(out);
        } catch (IOException e) {
            log.error(e.getMessage());
        } finally {
            try {
                out.flush();
                out.close();
                workbook.close();
            } catch (IOException e) {
                log.error(e.getMessage());
            }
        }
    }
    */
/**
     * 从rowNum开始读取数据，从1开始
     * 如果列数据为空,返回空字符串
     * @param rowNum
     * @return
     *//*

    public static List<List<String>> readXlsxRe(XSSFWorkbook xssfWorkbook, int rowNum, int size) {
        try {
            //            InputStream is = new FileInputStream(path);
            //            XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileStream);
            List<List<String>> result = new ArrayList<List<String>>();
            XSSFSheet xssfSheet = xssfWorkbook.getSheetAt(0);
            if (xssfSheet == null) {
                throw new ServiceException(EnumErrCode.PARAM_ERR.getCode(), "文件内容为空");
            }

            for (; rowNum <= size; rowNum++) {
                XSSFRow xssfRow = xssfSheet.getRow(rowNum);
                if (xssfRow == null) {
                    break;
                }
                int minColIx = xssfRow.getFirstCellNum();
                int maxColIx = 6;
                List<String> rowList = new ArrayList<String>();
                for (int colIx = minColIx; colIx < maxColIx; colIx++) {
                    XSSFCell cell = xssfRow.getCell(colIx);
                    if (cell == null) {
                    	rowList.add("");
                    	continue;
                    }
                    rowList.add(getStringVal(cell));
                }

                //如果前三列都为空，则认为解析完毕
                if (rowList == null || rowList.isEmpty()) {
                    break;
                }
                
                result.add(rowList);
            }
            return result;
        } catch (Exception e) {
            throw new ServiceException(EnumErrCode.SYSTEM_ERR.getCode(), "文件解析失败，请查看文件内容是否符合规范", e);
        }
    }
}
*/
