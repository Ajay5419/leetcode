package queue;

public class CircularQueueArray {
	
	int a[];
	int top,begin;
	int size;
	
	CircularQueueArray(int size){
		this.a=new int [size];
		this.top=-1;
		this.begin=-1;
		this.size=size;
		System.out.println("ques created size"+size);
	}
	
	public boolean isEmpty() {
		if(begin==-1)
			return true;
		return false;
	}
	
	public boolean isFull() {
		if(top+1==begin) {
			return true;
		}else if(begin==0 &&top+1==size) {
			return true;
		}else {
			return false;
		}
	}
	
	
	public void enQueue(int val) {
		
		if(isFull()) {
			System.out.println("queue is full");
			return;
		}
		else if(isEmpty()) {
			begin=0;
			a[++top]=val;
			System.out.println("Value inserted "+val);
			
		}else {
			if(top+1==size) {
				top=0;
			}else {
				top++;
			}
			a[top]=val;
			System.out.println("Value inserted "+val);
			
		}
	}
	
	
	public int deQueue() {
		
		if(isEmpty()) {
			System.out.println("full");
			return -1;
		}else {
			int res=a[begin];
			a[begin]=0;
			if(top==begin) {
				top=begin=-1;
			}else if(begin+1==size) {
				begin=0;
			}else {
				begin++;
			}
			return res;
		}
		
	}

}
