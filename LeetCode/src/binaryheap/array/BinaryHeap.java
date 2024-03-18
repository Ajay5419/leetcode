package binaryheap.array;

public class BinaryHeap {

	int arr[];
	int sizeOfTree;
	
	BinaryHeap(int size){
		arr=new int[size+1];
		sizeOfTree=0;
		System.out.println("binary heap is been created");
		
	}
	
	public boolean isEmpty() {
		if(sizeOfTree==0){
			return true;
		}else {
			return false;
		}
	}
	
	public int peek() {
		
		if(isEmpty()) {
			System.out.println("it is empty");
			return -1;
		}
		else {
		return arr[1];
		}
	}
	
	public void levelOrder() {
		for(int i=1;i<=sizeOfTree;i++) {
			System.out.println(arr[i]+ "->");
		}
		System.out.println("\n");
	}
	
	public void heapBottomToTop(int index,String type) {
		
		int parent =index/2;
		
		if(index<=1) {
			return;		
		}
		
		if(type.equals("MIN")) {
			
			if(arr[index]<arr[parent]) {
				int temp=arr[index];
				arr[index]=arr[parent];
				arr[parent]=temp;
			}
			
			
		}else if(type.equals("MAX")) {
			
			if(arr[index]>arr[parent]) {
				int temp=arr[index];
				arr[index]=arr[parent];
				arr[parent]=temp;
			}
			
			
		}
		
		heapBottomToTop(parent,type);
		
	}
	
	public void heapTopToBottom(int index,String type) {
		
		int left=2*index;
		int right=2*index+1;
		int swap = 0;
		
		if(sizeOfTree<left) {
			return;
		}
		if(type.equals("MAX")) {
			
			if(sizeOfTree==left) {
				if(arr[index]<arr[left]) {
					int temp=arr[index];
					arr[index]=arr[left];
					arr[left]=temp;
				}
				
			}else {
				if(arr[left]<arr[right]) {
					swap=right;
				}else {
					swap=left;
				}
				
				if(arr[index]<arr[swap]) {
					int temp=arr[index];
					arr[index]=arr[swap];
					arr[swap]=temp;
				}
				
			}
			
			
		}else if(type.equals("MIN")) {
			
			
			if(sizeOfTree==left) {
				if(arr[index]>arr[left]) {
					int temp=arr[index];
					arr[index]=arr[left];
					arr[left]=temp;
				}
				
			}else {
				if(arr[left]>arr[right]) {
					swap=right;
				}else {
					swap=left;
				}
				
				if(arr[index]>arr[swap]) {
					int temp=arr[index];
					arr[index]=arr[swap];
					arr[swap]=temp;
				}
				
			}
			
		}
	
		heapTopToBottom(swap, type);
	}
	
	
	public void insert(int value,String type) {
		arr[sizeOfTree+1]=value;
		sizeOfTree++;
		heapBottomToTop(sizeOfTree, type);
		System.out.println("Value added ");
	}
	
	public int extractHead(String type) {
		if(isEmpty()) {
			return -1;
		}
		else {
			int ext=arr[1];
			arr[1]=arr[sizeOfTree];
			sizeOfTree--;
			
			heapTopToBottom(arr[1], type);
			return ext;
		}
		
	}
	
}
