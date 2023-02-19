package com.zy.oms.common.aspect;

import com.zy.oms.datasource.DataSourceContextHolder;
import com.zy.oms.common.annotation.UsingDataSource;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Aspect
@Component
@Order(-10) // 保证该AOP在@Transactional之前执行
public class DataSourceAspect implements Ordered {
    // 前置
    @Before("within(com.zy.oms.service.impl.*) && @annotation(com.zy.oms.common.annotation.UsingDataSource)")
    public void before(JoinPoint point){
//        String name = wr.value();
//        DynamicDataSource.name.set(name);

        try {
            Class<?> clazz = point.getTarget().getClass();
            String methodName = point.getSignature().getName();
            Class<?>[] parameterTypes = ((MethodSignature) point.getSignature()).getMethod().getParameterTypes();
            Method method = clazz.getMethod(methodName, parameterTypes);
            UsingDataSource usingDataSource = method.getAnnotation(UsingDataSource.class);
            String dataSourceKey = usingDataSource.value();
            DataSourceContextHolder.setKey(dataSourceKey);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    @Override
    public int getOrder() {
        return 0;
    }

    @After("within(com.zy.oms.service.impl.*) && @annotation(com.zy.oms.common.annotation.UsingDataSource)")
    public void checkAfter(){
        DataSourceContextHolder.clearKey();
    }
}
