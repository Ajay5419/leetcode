package circulardoubleLL;

public class CircularDLL {

	public DoublyNode head;
	public DoublyNode tail;
	public int size;
	
	public DoublyNode createCDLL(int value) {
		DoublyNode ns=new DoublyNode();
		ns.value=value;
		ns.next=ns;
		ns.prev=ns;
		head=ns;
		tail=ns;
		size=1;
		return head;
	}
	
	public void insertCDLL(int value,int location) {
		if(head==null) {
			createCDLL(value);
			return;
		}else if(location==0) {
			DoublyNode ns=new DoublyNode();
			ns.value=value;
			ns.next=head;
			ns.prev=tail;
			head.prev=ns;
			tail.next=ns;
			head=ns;
			size++;
			
		}else if(location>size) {
			DoublyNode ns=new DoublyNode();
			ns.value=value;
			ns.next=head;
			ns.prev=tail;
			tail.next=ns;
			tail=ns;
			head.prev=ns;
			size++;
		}else {
			DoublyNode ns=head;
			int c=0;
			while(c<location-1) {
				ns=ns.next;
			}
			
			DoublyNode tmp=new DoublyNode();
			tmp.value=value;
			tmp.prev=ns;
			tmp.next=ns.next;
			
			ns.next.prev=tmp;
			ns.next=tmp;
			size++;
			
		}
	}
	
	public void printCDLL() {
		DoublyNode ns=head;
		
		while(ns.next!=head) {
			System.out.print(ns.value+" -->");
			ns=ns.next;
			if(ns.next==head) {
				System.out.print(ns.value+" -->");
			}
		}
		
	}
	public void printRCDLL() {
		DoublyNode ns=tail;
		
		while(ns.prev!=tail) {
			System.out.print(ns.value+" -->");
			ns=ns.prev;
			if(ns.prev==tail) {
				System.out.print(ns.value+" -->");
			}
		}
		
	}
	
	public void deleteCDLL(int location) {
		
		if(head==null) {
			System.out.println("not availa");
			return;
		}else if(location==0) {
			DoublyNode ds=head.next;
			ds.prev=tail;
			tail.next=ds;
			head.next=null;
			head.prev=null;
			head=ds;
			size--;
			
		}else if(location>size) {
			DoublyNode ds=tail.prev;
			ds.next=head;
			head.prev=ds;
			tail.prev=null;
			tail.next=null;
			tail=ds;
			size--;
			
			
		}else {
			DoublyNode ds=head;
			
			int c=0;
			while(c<location-1) {
				ds=ds.next;
			}
			
			DoublyNode tmp=ds.next;
			
			ds.next=tmp.next;
			tmp.next.prev=ds;
			tmp.next=null;
			tmp.prev=null;
			size--;
			
			
		}
		
	}
}
