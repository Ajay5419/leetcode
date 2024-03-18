package binaryheap.array;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryHeap bh=new BinaryHeap(5);
		bh.peek();
		
		bh.insert(1, "MIN");
		bh.insert(2, "MIN");
		bh.insert(3, "MIN");
		bh.levelOrder();
		System.out.println(bh.extractHead("MIN"));

	}

}
