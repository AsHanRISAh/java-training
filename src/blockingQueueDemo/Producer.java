/**
 * 
 */
package blockingQueueDemo;

import java.util.concurrent.BlockingQueue;

/**
 * @author asHan
 *
 */
public class Producer implements Runnable {

	BlockingQueue<Integer> producer;

	public Producer(BlockingQueue<Integer> producer) {
		this.producer = producer;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			try {
				producer.put(i);
				System.out.println("Produced By producer : " + i);
			} catch (InterruptedException e) {
				System.out.println(e);

			}

		}
	}
}
