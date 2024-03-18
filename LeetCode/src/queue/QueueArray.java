package queue;

public class QueueArray {

	int a[];
	int begin,top;
	
	QueueArray(int size){
		a=new int [size];
		begin=-1;
		top=-1;
		System.out.println("created  "+size);
	}
	
	public boolean isEmpty() {
		
		if(top==-1 && begin==-1)
			return true;
		else 
			return false;
	}
	
	public void enQueue(int i) {
		if(isFull()) {
			System.out.println("it is full cannot insert");
			
		}else if(isEmpty()) {
			++begin;
			a[++top]=i;
			System.out.println("added "+i);
			
		}else {
			a[++top]=i;
			System.out.println("added "+i);
			
		}
		
	}
	
	public boolean isFull() { 
		
		if (top==a.length-1) {
			return true;
		}else {
			return false;
		}
	}
	
	
	public int deQueue() {
		if(isEmpty()) {
			System.out.println("it is empty");
			return -1;
		}else {
			int k=a[begin];
			begin++;
			if(begin>top) {
				begin=-1;
				top=-1;
			}
			return a[k];
		}
		
	}
	
	
}
