package com.windeaker.core.simple;

import org.junit.Test;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class BeanFactoryRunner {
	@Test
	public void simpleTest(){
		XmlBeanFactory beanFactory=new XmlBeanFactory(new ClassPathResource("spring-bean.xml"));
		SimpleBean bean = (SimpleBean) beanFactory.getBean("simpleBean");
		System.out.println(bean.getPropertyA());
		System.out.println(bean.getPropertyB());
	}

	@Test
	public void factoryBeanTest(){
		XmlBeanFactory beanFactory=new XmlBeanFactory(new ClassPathResource("spring-bean.xml"));
		Car bean = (Car) beanFactory.getBean("car");
		// 第二次就走缓存的
		Car bean2 = (Car) beanFactory.getBean("car");
		bean.printCarInfo();
		bean2.printCarInfo();
	}



	@Test
	public void circleTest(){
		XmlBeanFactory beanFactory=new XmlBeanFactory(new ClassPathResource("spring-bean.xml"));
		CircleRefBeanA beanA = (CircleRefBeanA) beanFactory.getBean("circleRefBeanA");
		beanA.printInfo();
		beanA.getRefBeanB().printInfo();
		beanA.getRefBeanB().getRefBeanC().printInfo();
	}
}
