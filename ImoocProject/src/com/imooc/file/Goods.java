package com.imooc.file;

import java.io.Serializable;

//实现Serializable 接口,可以序列化，也就是可以被写入文件中
public class Goods implements Serializable  {
	
	private String id;//商品编号
	private String name;//商品名称
	private double price;//商品价格
	
	public Goods(String id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() { 
		return "Goods [id=" + id + ", name=" + name + ", price=" + price + "]";
	}

}
