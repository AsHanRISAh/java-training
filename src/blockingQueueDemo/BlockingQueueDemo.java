/**
 * 
 */
package blockingQueueDemo;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author asHan
 *
 */
public class BlockingQueueDemo {
	

    public static void main(String[] args) {
        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);
 
        Producer producer = new Producer(queue);
        Consumer consumer = new Consumer(queue);
 
        new Thread(producer).start();
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.submit(consumer);
        executorService.submit(consumer);
 
        executorService.shutdown();
    }
}
