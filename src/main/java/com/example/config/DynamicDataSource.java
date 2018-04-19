package com.example.config;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;


/**
 * Created by LiWeilong on 2018/4/18.
 * 动态数据源
 */
public class DynamicDataSource extends AbstractRoutingDataSource {

    @Override
    protected Object determineCurrentLookupKey() {
        return DynamicDataSourceContextHolder.getDataSourceType();
    }
}
