package com.example.config;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * Created by LiWeilong on 2018/4/19.
 * 数据源切换Advice
 */
@Aspect
@Order(-10)  //保证AOP在@Transactional 之前执行
@Component
@Slf4j
public class DynamicDataSourceAspect {

     /**
     * @Before("@annotation(ds)")
     * 的意思是：
     * @Before：在方法执行之前进行执行：
     * @annotation(dataSourceAnnotation)：
     * 会拦截注解dataSourceAnnotation的方法，否则不拦截;
     */

    @Before("@annotation(dataSourceAnnotation)")
    public void changeDataSource(JoinPoint point, DataSourceAnnotation dataSourceAnnotation) throws Throwable {

        //获取当前的指定的数据源;
        String dsId = dataSourceAnnotation.value();
        //如果不在我们注入的所有的数据源范围之内，那么输出警告信息，系统自动使用默认的数据源。
        if (!DynamicDataSourceContextHolder.containsDataSource(dsId)) {
            log.error("数据源[{}]不存在，使用默认数据源 -->Method{}",dataSourceAnnotation.value(),point.getSignature());
        } else {
            log.info("Use DataSource : {} --> Method {}",dataSourceAnnotation.value(),point.getSignature());
            //找到的话，那么设置到动态数据源上下文中。
            DynamicDataSourceContextHolder.setDataSourceType(dataSourceAnnotation.value());
        }
    }



    @After("@annotation(dataSourceAnnotation)")
    public void restoreDataSource(JoinPoint point, DataSourceAnnotation dataSourceAnnotation) {
        System.out.println("Revert DataSource : {} > {}"+dataSourceAnnotation.value()+point.getSignature());
        //方法执行完毕之后，销毁当前数据源信息，进行垃圾回收。
        DynamicDataSourceContextHolder.clearDataSourceType();
    }

}
