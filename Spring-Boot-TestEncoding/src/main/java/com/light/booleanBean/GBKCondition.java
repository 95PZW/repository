package com.light.booleanBean;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class GBKCondition implements Condition {/*Condition用于判断是否进行装配，需要实现matches方法。
当方法返回true时表示需要装配，否则反之*/
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        String encoding = System.getProperty("file.encoding");
        if(encoding != null){
            return "gbk".equals(encoding.toLowerCase());
        }
        return false;
    }
}
