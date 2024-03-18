package doublesingleLL;

public class DoubleSingleLL {
	
	public Node head;
	public Node tail;
	public int size;
	
	public Node createDLL(int value) {
		Node node=new Node();
		node.value=value;
		node.next=null;
		node.prev=null;
		head=node;
		tail=node;
		size=1;
		return head;
	}
	
	public void insertDLL(int value,int location) {
		Node tempNode;
		if(head==null) {
			createDLL(value);
			return;
			
		}else if(location==0) {
			tempNode=new Node();
			tempNode.value=value;
			tempNode.prev=null;
			tempNode.next=head;
			head.prev=tempNode;
			head=tempNode;
			size++;
			
		}else if (location>size) {
			tempNode=new Node();
			tempNode.value=value;
			tempNode.next=null;
			tempNode.prev=tail;
			tail.next=tempNode;
			tail=tempNode;
			size++;
			
		}else {
			tempNode=head;
			int i=0;
			while(i<location-1) {
				tempNode=tempNode.next;
			}
			Node ns=new Node();
			ns.value=value;
			ns.prev=tempNode;
			ns.next=tempNode.next;
			tempNode.next.prev=ns;
			tempNode.next=ns;
			
			size++;
		}
	}
	
	public void printRDLL() {
		Node ns=tail;
		while(ns!=null) {
			System.out.print(ns.value+"--->");
			ns=ns.prev;
		}
		System.out.println();
	}
	public void printDLL() {
		Node ns=head;
		while(ns!=null) {
			System.out.print(ns.value+"--->");
			ns=ns.next;
		}
		System.out.println();
	}
	
	public void deleteDLL(int location) {
		Node tempNode;
		if(head==null) {
			System.out.println("it is null");
			return;
		}else if(location==0) {
			tempNode=head.next;
			head.next=null;
			tempNode.prev=null;
			head=tempNode;
			size--;
			
		}else if(location>=size) {
			tempNode=tail.prev;
			tail.prev=null;
			tempNode.next=null;
			tail=tempNode;
			size--;
			
		}else {
			
			int c=0;
			tempNode=head;
			
			while(c<location-1) {
				tempNode=tempNode.next;
			}
			if(tempNode.next==tail) {
				tempNode.next=null;
				tail.prev=null;
				tail=tempNode;
				
			}else {
			Node ns=tempNode.next.next;
			tempNode.next=ns;
			ns.prev=tempNode;
			}
			size--;
			
			
		}
	}
	
	public void deleteAll() {
		Node tempNode =head;
		
		while(tempNode!=null) {
			tempNode.prev=null;
			tempNode=tempNode.next;
		}
		head=null;
		tail=null;
		System.out.println("deleted succefu");
	}

}
