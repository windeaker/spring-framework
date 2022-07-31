package com.windeaker.core.simple;

/**
 * TODO:
 *
 * @author windeaker
 * @date 2022/7/29
 */
public class Car {
	String price;

	String brand;

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void printCarInfo(){
		System.out.println(String.format("品牌：%s ---> 价格：%s",brand,price));
	}
}
