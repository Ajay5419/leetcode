package questions;

public class LinkedListC {
	
	public Node head;
	public Node tail;
	public int size;
	
	
	public Node create(int value) {
		Node ns=new Node();
		ns.value=value;
		ns.next=null;
		head=ns;
		tail=ns;
		
		return head;
	}
	
	public void insert(int value) {
		Node ns=new Node();
		ns.value=value;
		ns.next=null;
		tail.next=ns;
		tail=ns;
		size++;
		
	}
	
	public void printLL() {
		Node ns=head;
		while(ns!=null){
			System.out.print(ns.value+" -->");
			ns=ns.next;
		}
	}
	
	void printList(Node node)
    {
        while (node != null) {
            System.out.print(node.value + " ");
            node = node.next;
        }
    }

	
	public Node reverse(Node head) {
		
		Node prev=null;
		Node ns=null;
		
		Node current =head;
		
		while (current!=null) {
			
			ns=current.next;//2
			
			current.next=prev;//null
			
			prev=current;//1
			current=ns;//2
			
			
		}
		
		return prev;
	}
	
	
	public Node oddEven(Node head) {
		
		
		
		
		
		Node odd=null;
		Node even=null;
        Node temp=head;
        Node var1=even;
		Node var2=odd;
        int count=0;
        while(temp.next !=null){
            if(count%2==0){
            	var2.next=temp.next;
            	temp=temp.next;
            	var2=var2.next;
            	var2.next=null;
               
            }else{
            	var1.next=temp.next;
            	temp=temp.next;
            	var1=var1.next;
            	var1.next=null;
            }
            
            count++;
           



        }
       
        this.printList(even);
        System.out.println();
        this.printList(odd);
        System.out.println();
       // oddTail.next=even;
        return null;
		
		
	}
	
	
}
