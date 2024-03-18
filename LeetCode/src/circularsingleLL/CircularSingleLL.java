package circularsingleLL;

public class CircularSingleLL {
	
	public Node head;
	public Node tail;
	public int size;
	
	public Node createCSLL(int value) {
		head=new Node();
		Node node=new Node();
		node.value=value;
		node.next=node;
		head=node;
		tail=node;
		size=1;
		
		return head;
		
	}
	
	public void insertCSLL(int value,int location) {
		Node tempNode;
		if(size==0) {
			createCSLL(value);
		}else if(location==0) {
			tempNode=new Node();
			tempNode.value=value;
			tempNode.next=head;
			head =tempNode;
			tail.next=tempNode;
			size++;
		}else if(location>size) {
			tempNode=new Node();
			tempNode.value=value;
			tempNode.next=head;
			tail.next=tempNode;
			tail=tempNode;
			size++;
			
		}else {
			tempNode=head;
			int i=0;
			while(i<location-1) {
				tempNode=tempNode.next;
			}
			Node nextNode=new Node();
			nextNode.value=value;
			nextNode.next=tempNode.next;
			tempNode.next=nextNode;
			size++;
			
		}
		
	}
	
	public void printList() {
		Node s=head;
		if(head==null) {
			System.out.println("not item avaai");
		}
	while(s!=null ) {
		System.out.print(s.value+"-->");
		if(s.next==head) {
			return;
		}
		s=s.next;
	}
	System.out.println();
	}
	
	public void searchCSLL(int value) {
		int c=0;
		Node s=head;
		while(s!=null ) {
			if(s.next==head) {
				System.out.println("not Found");
				return;
			}
			
			if(value==s.value) {
				System.out.println(" Found  at location "+c);
				return;
			}
			
			c++;
			
			s=s.next;
		}
		
	}
	
	
	public void deleteCSLL(int location) {
		Node tempNode;
		if(head==null) {
			System.out.println("list is blank");
			return;
		}else if(location ==0) {
			tempNode=head;
			head=tempNode.next;
			tail.next=head;
			size --;
		}else if(location>size) {
			tempNode=head;
			while (tempNode.next!=tail) {
				tempNode=tempNode.next;
			}
			tempNode.next=head;
			tail=tempNode;
			size --;
		}else {
			tempNode=head;

			int i=0;
			
			while(i<location-1) {
				tempNode=tempNode.next;
			}
			
			Node nextNode=tempNode.next.next;
			tempNode.next=nextNode;
			size--;
		}
		
	}
	
	public void deleteAll() {
		if(head==null) {
			System.out.println("not avaiala");
		}else {
			head=null;
			tail.next=null;
			tail=null;
		}
	}

}
