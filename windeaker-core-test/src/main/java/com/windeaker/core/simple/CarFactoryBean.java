package com.windeaker.core.simple;

import org.springframework.beans.factory.FactoryBean;

/**
 * TODO:
 *
 * @author windeaker
 * @date 2022/7/29
 */
public class CarFactoryBean implements FactoryBean<Car> {

	String carInfo;

	@Override
	public Car getObject() throws Exception {
		String[] strs = carInfo.split(",");
		Car result = new Car();
		result.setBrand(strs[0]);
		result.setPrice(strs[1]);
		return result;
	}

	@Override
	public Class<?> getObjectType() {
		return Car.class;
	}

	@Override
	public boolean isSingleton() {
		return FactoryBean.super.isSingleton();
	}

	public String getCarInfo() {
		return carInfo;
	}

	public void setCarInfo(String carInfo) {
		this.carInfo = carInfo;
	}
}
