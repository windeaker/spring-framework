package com.windeaker.mvc;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * TODO:
 *
 * @author windeaker
 * @date 2022/7/2
 */
public class MyServletContextListener implements ServletContextListener {


	@Override
	public void contextInitialized(ServletContextEvent sce) {
		ServletContextListener.super.contextInitialized(sce);
		System.out.println("MyServletContextListener已初始化");
		System.out.println(sce.getServletContext().getInitParameter("myDataKey"));
		sce.getServletContext().setAttribute("END","this is data setted from my servlet listener");
	}


	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		ServletContextListener.super.contextDestroyed(sce);
		System.out.println("MyServletContextListener已销毁");
	}
}
