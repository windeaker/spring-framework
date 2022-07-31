package com.windeaker.core.simple;

public class CircleRefBeanA {
	CircleRefBeanB refBeanB;

	public CircleRefBeanB getRefBeanB() {
		return refBeanB;
	}

	public void setRefBeanB(CircleRefBeanB refBeanB) {
		this.refBeanB = refBeanB;
	}

	public void printInfo() {
		System.out.println("this is a circleRefBeanA");
	}

}
