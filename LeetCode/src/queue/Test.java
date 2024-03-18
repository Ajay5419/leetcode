package queue;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueArray q=new QueueArray(4);
		q.enQueue(3);
		q.enQueue(4);
		q.enQueue(5);
		q.enQueue(6);
		System.out.println(q.deQueue());
		System.out.println(q.deQueue());
		System.out.println(q.deQueue());

	}

}
