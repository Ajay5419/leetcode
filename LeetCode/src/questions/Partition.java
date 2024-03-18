package questions;

public class Partition {
	
	public LinkedListC sortLL(LinkedListC ll, int x){
		Node ns=ll.head;
		ll.tail=ll.head;
		
		while(ns!=null) {
			
			Node next=ns.next;
			
			if(ns.value<x) {
				ns.next=ll.head;
				ll.head=ns;
				
				
			}else {
				ll.tail.next=ns;
				ll.tail=ns;
				
			}
			ns=next;
		}
		ll.tail.next=null;
		
		return ll;
		
	}

}
