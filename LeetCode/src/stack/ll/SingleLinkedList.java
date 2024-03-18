package stack.ll;

public class SingleLinkedList {

	public Node head;
	public Node tail;
	public int size;
	
	public Node createSingleLinkedList(int value) {
		head=new Node();
		Node ns=new Node();
		ns.value=value;
		ns.next=null;
		head=ns;
		tail=ns;
		size++;
		
		return head;
	}
	
	public void InsertSingleLinkedList(int nodeValue ,int location) {
		
		
		Node ns=new Node();
		ns.value=nodeValue;
		if(head==null) {
			createSingleLinkedList(nodeValue);
			return;
		}else if(location ==0) {
			ns.next=head;
			head=ns;
		}else if(location >size) {
			ns.next=null;
			tail.next=ns;
			tail=ns;
		}else {
			Node tempNode=head;
			int i=0;
			while (i<location-1) {
				tempNode=tempNode.next;
				i++;
			}
			Node nextNode=tempNode.next;
			tempNode.next=ns;
			ns.next=nextNode;		
		}
		
		
		size++;
	//	return head;
	}
	
	public void printList() {
		Node s=head;
	while(s!=null) {
		System.out.println(s.value);
		s=s.next;
	}
	}
	
	public void searchValue(int i) {
		
		Node s=head;
		int c=0;
		while(s!=null) {
			if(s.value==i) {
				System.out.println("found--"+c);
				return;
			}
			s=s.next;
			c++;
		}
		
		System.out.println("Not found");
	}
	
	public void deleteNode(int location) {
		Node tempNode=head;
		if(head==null) {
			return;
		}else if(location==0) {
			head=tempNode.next;
			size--;
			
		}else if(location>size) {
			
			while(tempNode.next!=tail) {
				tempNode=tempNode.next;
				
			}
			tempNode.next=null;
			tail=tempNode;
			size--;
			
		}else if(location<size) {
			
			for(int i=0;i<location-1;i++) {
				tempNode=tempNode.next;
			}
			Node s=tempNode.next.next;
			tempNode.next=s;
			size--;
			
		}
		
	}
}
