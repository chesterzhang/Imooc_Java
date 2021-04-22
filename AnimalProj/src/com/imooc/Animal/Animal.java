package com.imooc.Animal;

/*
 * final public class : 该类没有子类, 不允许被继承
 * final 方法 : 该方法不允许被重写, 可以被子类继承, 调用
 * final 局部变量, 赋值后不允许被修改
 * final 类成员:1. 定义直接初始化 2.构造方法 3.构造代码块
 */
public class Animal {
	/*private:只允许本类中进行访问
	 * public:允许任意位置访问
	 * protected:当前类,同包子类,跨包子类都可以访问 
	 * 
	 */
	private String name;
	protected int month;
	private String species;
	
	 
	
	static {
		System.out.println("我是父类静态代码块");
	}
	
	{
		System.out.println("我是父类构造代码块");
	}
	
	
	public Animal() {
		System.out.println("我是父类无参构造方法");
	}
	
	public Animal(String name, int month ) {
		this.name=name;
		this.month=month;
		System.out.println("我是父类带参构造方法");
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMonth() {
		return this.month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public String getSpecies() {
		return this.species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}
	
	//吃东西
	public void eat() {
		System.out.println(this.getName()+"在吃东西");
	}
	
	public void eat(String name) {
		System.out.println(name+"在吃东西");
	}
	
	//重写Object 的equals方法
	public boolean equals(Object obj) {
		if (obj==null) {
			return false;
		}
		Animal temp=(Animal) obj;//要保证obj 可以转换为Animal 类型
		if(this.getName()==(temp.getName()) && this.getMonth() ==temp.getMonth() ) {
			return true;
		}else {
			return false;
		}

	}
	
	//重载equals方法
		public boolean equals(Animal obj) {
			if (obj==null) {
				return false;
			}
		 
			if(this.getName()==(obj.getName()) && this.getMonth() ==obj.getMonth() ) {
				return true;
			}else {
				return false;
			}

		}
		
		//重写toString
		public String toString() {
			return "昵称 : "+this.getName()+" , 年龄 : "+this.getMonth();
		}
	
}
