package questions;

public class reversell {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedListC ll=new LinkedListC();
		ll.create(1);
		ll.insert(2);
		ll.insert(3);
		ll.insert(4);
		ll.insert(5);
		ll.insert(6);
		//ll.insert(7);
		
		ll.printLL();

		System.out.println();
		
	//	ll.head=ll.reverse(ll.head);
		
		ll.oddEven(ll.head);
		ll.printLL();
		
		

	}

}
