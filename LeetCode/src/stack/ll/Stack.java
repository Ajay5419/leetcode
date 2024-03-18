package stack.ll;

public class Stack {
 
	SingleLinkedList sl;
	
	Stack(){
		sl=new SingleLinkedList();
	}
	
	public void push(int a) {
		sl.InsertSingleLinkedList(a, 0);
		System.out.println("inserted succc");
	}
	
	public boolean isEmpty() {
		if(sl.head==null)
			return true;
		return false;
	}
	
	public int pop() {
		if(isEmpty()) {
			System.out.println("empty");
			return -1;
		}else {
			int x=sl.head.value;
			sl.deleteNode(0);
			return x;
		}
	}
	
	
	public int peek() {
		if(isEmpty()) {
			System.out.println("empty");
			return -1;
		}else {
			return sl.head.value;
	}
	}
}
