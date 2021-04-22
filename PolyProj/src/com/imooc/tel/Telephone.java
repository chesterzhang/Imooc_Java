package com.imooc.tel;
/**
 * 原始手机
 * @author Chester_Zhang
 *
 */
public class Telephone {
	private String brand;
	private int price;
	
	public Telephone() {
		
	}
	
	public void call() {
		System.out.println("手机可以打电话");
	}

	

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public String getBrand() {
		return brand;
	}


	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getPrice() {
		return price;
	}
	

}
