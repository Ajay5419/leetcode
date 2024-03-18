package stack;

public class Stack {

	int [] arr;
	int top;
	
	public Stack (int size) {
		this.arr=new int [size];
		this.top=-1;
		System.out.println("stack created with size "+size);
	}
	
	public boolean isEmpty() {
		
		if(this.top==-1)
			return true;
		return false;
	}
	
	public boolean isFull() {
		if(this.top==arr.length-1)
			return true;
		return false;
	}
	
	public void push(int a) {
		
		if(this.isFull()) {
			System.out.println("stack is full");
		}else {
			arr[this.top+1]=a;
			this.top++;
			System.out.println("value inserted");
		}
		
	}
	
	public int  pop() {
		if(isEmpty()) {
			System.out.println("stack is empty");
			return -1;
		}else {
			int x=arr[top];
			top--;
			return x;
		}
		
	}
	
	public int peak() {
		if(isEmpty()) {
			System.out.println("stack is empty");
			return -1;
		}else {
			return arr[top];
			
		}
		
	}
	
	public void delete() {
		arr=null;
		System.out.println("deleted  successfully");
	}
}
