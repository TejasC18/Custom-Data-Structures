package Queue;

public class Main {

	public static void main(String[] args) {
		QueueArray newQueue = new QueueArray(5);
		
//		boolean res = newQueue.isEmpty();
//		System.out.println(res);
//		
//		boolean res2 = newQueue.isFull();
//		System.out.println(res2);
		
		newQueue.enQueue(10);
		newQueue.enQueue(20);
		newQueue.enQueue(30);
		newQueue.enQueue(40);
		newQueue.enQueue(50);
	
//		int result = newQueue.deQueue();
//		System.out.println(result);
//		
//		int result2 = newQueue.deQueue();
//		System.out.println(result2);
//		
//		newQueue.deleteQueue();
		newQueue.printQueue();

	}

}

