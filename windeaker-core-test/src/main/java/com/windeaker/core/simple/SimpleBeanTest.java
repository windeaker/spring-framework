package com.windeaker.core.simple;

import org.junit.Test;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class SimpleBeanTest {
	@Test
	public void beanFactory(){
		XmlBeanFactory beanFactory=new XmlBeanFactory(new ClassPathResource("spring-bean.xml"));
		SimpleBean bean = (SimpleBean) beanFactory.getBean("simpleBean");
		System.out.println(bean.getPropertyA());
		System.out.println(bean.getPropertyB());
	}
}
