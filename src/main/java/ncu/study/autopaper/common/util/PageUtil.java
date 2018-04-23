package ncu.study.autopaper.common.util;

import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
/*import com.hsjry.lang.log.TenantLog;*/
import ncu.study.autopaper.common.common.Page;

public class PageUtil {
	
/*	private static TenantLog log = TenantLog.get(PageUtil.class);*/
	
    /**
     * 计算开始条目
     * 
     * @param pageNo 页码,第一页开始
     * @param pageSize 每页大小
     * @return
     */
    public static int calStartIndex(int pageNo, int pageSize) {
        int start = (pageNo - 1) * pageSize;
        return start >= 0 ? start : 0;
    }

    /**
     * 计算最后一条下标
     * 
     * @param pageNo
     * @param pageSize
     * @param totalCount
     * @return
     */
    public static int calEndIndex(int pageNo, int pageSize, int totalCount) {
        int end = calStartIndex(pageNo, pageSize) + pageSize - 1;
        return end >= totalCount ? totalCount - 1 : end;
    }

    /**
     * 根据首页计算
     * 
     * @param start
     * @param pageSize
     * @param totalCount
     * @return
     */
    public static int calEndIndexBystart(int start, int pageSize, int totalCount) {
        int end = start + pageSize - 1;
        return end >= totalCount ? totalCount - 1 : end;
    }

    /**
     * String to int 
     * 
     * @param pageNo
     * @return
     */
    public static int parsePageNo(String pageNo) {
        try {
            return Integer.parseInt(pageNo);
        } catch (Exception e) {
            return 1;
        }
    }

    public static int parsePageSize(String pageSize) {
        try {
            return Integer.parseInt(pageSize);
        } catch (Exception e) {
            return Page.DEFAULTPAGESIZE;
        }
    }

    public static void main(String[] args) {
        System.out.println(PageUtil.calEndIndex(7, 5, 31));
    }
    
    /**
     * 对列表中的数据按指定字段进行排序,要求类必须有相关的方法返回字符串、整形、日期等值以进行比较
     * @param list 需要排序的列表
     * @param property 排序属性名称
     * @param reverseFlag true倒序,false正序
     */
    public static <T> void sortByProperty(List<T> list, final String property,
                                          final boolean reverseFlag) {
        Collections.sort(list, new Comparator<T>() {
            @Override
            public int compare(T arg1, T arg2) {
                int result = 0;
                try {
                    PropertyDescriptor pd1 = new PropertyDescriptor(property, arg1.getClass());
                    PropertyDescriptor pd2 = new PropertyDescriptor(property, arg2.getClass());
                    Method m1 = pd1.getReadMethod();//获得get方法
                    Method m2 = pd2.getReadMethod();//获得get方法
                    Object obj1 = m1.invoke(arg1);
                    Object obj2 = m2.invoke(arg2);
                    if (obj1 instanceof String) {
                        //字符串
                        result = obj1.toString().compareTo(obj2.toString());
                    } else if (obj1 instanceof Date) {
                        //日期
                        long l = (((Date) obj1).getTime() - ((Date) obj2).getTime());
                        if (l > 0) {
                            result = 1;
                        } else if (l < 0) {
                            result = -1;
                        } else {
                            result = 0;
                        }
                    } else if (obj1 instanceof Integer) {
                        result = (Integer) obj1 - (Integer) obj2;
                    } else {
                        result = obj1.toString().compareTo(obj2.toString());
                    }
                    if (reverseFlag) {
                        //倒序
                        result = -result;
                    }
                } catch (IllegalAccessException iae) {
                    /*log.error("排序失败", iae);*/
                } catch (InvocationTargetException ite) {
                    /*log.error("排序失败", ite);*/
                } catch (IntrospectionException e) {
                   /* log.error("排序失败", e);*/
                }
                return result;
            }
        });

    }
}
