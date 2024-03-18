package tree.binary;

public class BinaryTreeArray {

	String[] arr;
	int lastUsedIndex;
	BinaryTreeArray(int size){
		arr=new String[size+1];
		lastUsedIndex=0;
		System.out.println("blank tree size has been created "+size);
	}
	
	public boolean isFull() {
		if (arr.length-1==lastUsedIndex) {
			return true;
		}
		return false;
	}
	
	public void insertNode(String val) {
		if(!isFull()) {
			arr[lastUsedIndex+1]=val;
			lastUsedIndex++;
			System.out.println("inserted "+val);
		}else {
			System.out.println("it is full;");
		}
	}
	
	public void preOrder(int index) {
		if(index>lastUsedIndex) {
			return;
		}else {
			System.out.print(arr[index]+" ");
			preOrder(index*2);
			preOrder(index*2+1);
		}
		
	}
	public void inOrder(int index) {
		if(index>lastUsedIndex) {
			return;
		}else {
			inOrder(index*2);
			System.out.print(arr[index]+" ");
			
			inOrder(index*2+1);
		}
		
	}
	public void postOrder(int index) {
		if(index>lastUsedIndex) {
			return;
		}else {
			postOrder(index*2);
			
			
			postOrder(index*2+1);
			System.out.print(arr[index]+" ");
		}
		
	}
	
	public void levelOrder() {
		for(int i=1;i<=lastUsedIndex;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public int search(String val) {
		for(int i=1;i<=lastUsedIndex;i++) {
			if(arr[i].equals(val)) {
				System.out.println("element foud at  "+i);
				return i;
			}
		}
		System.out.println("not fpudn");
		return -1;
	}
	
	public void delete(String val) {
		int loc=search(val);
		
		if(loc==-1) {
			return ;
		}else {
			arr[loc]=arr[lastUsedIndex];
			lastUsedIndex--;
			System.out.println("deleted successss");
		}
	}
}
