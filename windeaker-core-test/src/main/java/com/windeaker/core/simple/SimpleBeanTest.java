package com.windeaker.core.simple;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class SimpleBeanTest {
	public static void main(String[] args) {
		BeanFactory beanFactory = new ClassPathXmlApplicationContext("spring-bean.xml");
		SimpleBean bean = beanFactory.getBean(SimpleBean.class);
		System.out.println(bean.getPropertyA());
		System.out.println(bean.getPropertyB());
	}
}
