package com.windeaker.core.simple;

public class CircleRefBeanC {
	CircleRefBeanA refBeanA;

	public CircleRefBeanA getRefBeanA() {
		return refBeanA;
	}

	public void setRefBeanA(CircleRefBeanA refBeanA) {
		this.refBeanA = refBeanA;
	}


	public void printInfo() {
		System.out.println("this is a circleRefBeanC");
	}
}
