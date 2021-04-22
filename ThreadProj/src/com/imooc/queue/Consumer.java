package com.imooc.queue;

public class Consumer implements Runnable {
	
	Queue queue;
	
	public Consumer(Queue queue) {
		this.queue = queue;
	}
	
	@Override
	public void run() {
		while(true) {
			queue.consume();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
