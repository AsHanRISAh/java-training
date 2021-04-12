/**
 * 
 */
package blockingQueueDemo;

import java.util.concurrent.BlockingQueue;

/**
 * @author User1
 *
 */
public class Consumer implements Runnable{
	
	 BlockingQueue<Integer> consumer;
	    int get = -1;
	 
	    public Consumer(BlockingQueue<Integer> consumer) {
	        this.consumer = consumer;
	    }
	 
	    @Override
	    public void run() {
	        while (get != 10) {
	            try {
	                get = consumer.take();
	                System.out.println("Consumed By consumer : " + get);
	            } catch (InterruptedException e) {
	            	System.out.println(e);
	            }
	            }
	        }

}
