package queue;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CircularQueueArray cq=new CircularQueueArray(3);
		cq.enQueue(1);
		cq.enQueue(2);
		cq.enQueue(3);
		
		System.out.println(cq.deQueue());
		cq.enQueue(4);
	}

}
