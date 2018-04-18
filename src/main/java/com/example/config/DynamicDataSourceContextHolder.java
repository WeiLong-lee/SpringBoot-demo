package com.example.config;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by LiWeilong on 2018/4/18.
 * 数据源操作
 */
@Slf4j
public class DynamicDataSourceContextHolder {

    /***
     * 线程本地环境
     */
    private static final ThreadLocal<String> dataSource = new ThreadLocal<>();
    /***
     * 所有的数据源id
     */
    public static List<String> dataSourceIds = new ArrayList<String>();


    public static void setDataSource(String sourceType) {
        if(StringUtils.isBlank(sourceType)){
               log.error("参数sourceType为null或空");
        }
        dataSource.set(sourceType);
    }

    /***
     * 获取数据源
     * @return
     */
    public static String getDataSource(){return dataSource.get();}

    public static void clearDataSource(){ dataSource.remove();}

    /***
     * 判断指定DataSource 是否存在
     * @param dataSourceId
     * @return
     */
    public static boolean containsDataSource(String dataSourceId){
        return dataSourceIds.contains(dataSourceId);
    }
}
