package com.windeaker.core.aop;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author winde
 * @Description TODO
 * @Date 2021/4/12
 */
public class AopSampleBootstrap {
    public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext=new AnnotationConfigApplicationContext();
		applicationContext.scan("com.windeaker.core.aop");
		applicationContext.refresh();
        SimpleService simpleService=applicationContext.getBean(SimpleService.class);
        System.out.println(simpleService.getClass());
        System.out.println(simpleService.plus(1,1));
    }
}
