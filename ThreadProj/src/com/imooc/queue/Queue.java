package com.imooc.queue;

public class Queue {

	// 一次生产，一次消费
	private int n;
	
	boolean flag= false;//用于判断是否有商品可以被消费
	
	
	//生产商品
	public synchronized void produce(int n) {
		if(flag) {//当已经有商品的时候,不用再生产了，等着消费
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("生产 : " + n+"件商品");
		this.n = n;
		this.flag=true;//生产完毕,有商品
		notifyAll();//生产完毕，唤醒消费线程
	}

	//消费商品
	public synchronized void consume() {
		if(!flag) {//当没有商品的时候，线程等待
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("消费 : " + n+"件商品");
		this.flag=false;//消费完毕,没有商品
	}
}
