package com.imooc.queue;

public class Producer implements Runnable {
	
	Queue queue;
	
	public Producer(Queue queue) {
		this.queue = queue;
	}

	@Override
	public void run() {
		int i=1;
		while(true) {
			this.queue.produce(i++);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
