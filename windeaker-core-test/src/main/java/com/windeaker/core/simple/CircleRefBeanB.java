package com.windeaker.core.simple;

public class CircleRefBeanB {
	CircleRefBeanC refBeanC;

	public CircleRefBeanC getRefBeanC() {
		return refBeanC;
	}

	public void setRefBeanC(CircleRefBeanC refBeanC) {
		this.refBeanC = refBeanC;
	}


	public void printInfo() {
		System.out.println("this is a circleRefBeanB");
	}
}
