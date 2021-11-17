package com.windeaker.core.simple;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SimpleBeanTest {
	@Test
	public void getBeanByName(){
		ClassPathXmlApplicationContext beanFactory = new ClassPathXmlApplicationContext("spring-bean.xml");
		SimpleBean bean = (SimpleBean) beanFactory.getBean("simpleBean");
		System.out.println(bean.getPropertyA());
		System.out.println(bean.getPropertyB());
	}

	@Test
	public void getBeanByType(){
		ClassPathXmlApplicationContext beanFactory = new ClassPathXmlApplicationContext("spring-bean.xml");
		SimpleBean bean = beanFactory.getBean(SimpleBean.class);
		System.out.println(bean.getPropertyA());
		System.out.println(bean.getPropertyB());
	}

	public void getCircleDependBean(){

	}
}
