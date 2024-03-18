package questions;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedListC ll=new LinkedListC();
		ll.create(1);
		ll.insert(2);
		ll.insert(6);
		ll.insert(3);
		ll.insert(1);
		ll.insert(4);
		ll.printLL();
		System.out.println();
		DeleteMethod ds=new DeleteMethod();
		ds.delet(ll);
		
		ll.printLL();
		System.out.println();
		ds.findNthLast(ll,4);
		Partition ps=new Partition();
		ll=ps.sortLL(ll, 4);
		System.out.println("pration");
		ll.printLL();
		System.out.println("coddd");
		
		LinkedListC l1=new LinkedListC();
		LinkedListC l2=new LinkedListC();
		l1.create(1);
		l1.insert(2);
		l1.insert(6);
		
		l2.create(1);
		l2.insert(3);
		l2.insert(4);
		/*
		 * l1.printLL(); l2.printLL();
		 */
		LinkedListC l3=ds.sumDigit(l1,l2);
		l3.printLL();

	}

}
