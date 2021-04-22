package com.imooc.set;

public class Goods {
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
