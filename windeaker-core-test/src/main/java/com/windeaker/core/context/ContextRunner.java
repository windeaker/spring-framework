package com.windeaker.core.context;

import com.windeaker.core.simple.SimpleBean;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * TODO:
 *
 * @author windeaker
 * @date 2022/7/16
 */
public class ContextRunner {

	@Test
	public void runAnnotation(){
		AnnotationConfigApplicationContext applicationContext=new AnnotationConfigApplicationContext();
		applicationContext.scan(ContextRunner.class.getPackage().getName());
		applicationContext.refresh();
		AnnotationBean bean = applicationContext.getBean(AnnotationBean.class);
		bean.print();
	}

	@Test
	public void runXmlContext(){
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-xml-config.xml");
		XmlConfigBean bean = (XmlConfigBean) context.getBean("xmlConfigBean");
		bean.print();
	}
}
