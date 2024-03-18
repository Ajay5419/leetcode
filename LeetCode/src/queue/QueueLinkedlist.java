package queue;

public class QueueLinkedlist {
	LinkedList ll;
	
	QueueLinkedlist(){
		ll=new LinkedList();
		System.out.println("queue created");
	}
	
	public boolean isEmpty() {
		
		if(ll.head==null) {
			return true;
		}
		return false;
		
	}
	
	public void enque(int value) {
		ll.InsertSingleLinkedList(value, ll.size+1);
		System.out.println("inserted "+value);
	}
	
	public int dequeue() {
		int res=-1;
		if(isEmpty()) {
			System.out.println("Empty");
			return res;
		}else {
			res= ll.head.value;
			ll.deleteNode(0);
			return res;
		}
	}

}
