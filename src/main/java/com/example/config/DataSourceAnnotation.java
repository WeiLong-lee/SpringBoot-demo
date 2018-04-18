package com.example.config;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by LiWeilong on 2018/4/18.
 * 数据库注解驱动
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface DataSourceAnnotation {

    String name() default DataSourceAnnotation.dataSourceTale;

    public static String dataSourceTale = "dataSourceTale";

    public static String dataSourceXtp = "dataSourceXtp";
}
