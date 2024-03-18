package circularsingleLL;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircularSingleLL cs=new CircularSingleLL();
		cs.createCSLL(2);
		
		cs.insertCSLL(5, 0);
		cs.insertCSLL(3, 0);
		cs.insertCSLL(4, 10);
		cs.insertCSLL(6, 1);
		cs.printList();
		System.out.println("-----------------");
		System.out.println(cs.head.value);
		System.out.println(cs.tail.value);
		System.out.println(cs.size);
		cs.searchCSLL(2);
		cs.searchCSLL(1);
		
		cs.deleteCSLL(0);
		cs.deleteCSLL(10);
		cs.deleteCSLL(1);
		cs.printList();
		System.out.println();
		cs.deleteAll();
		cs.printList();
		
	}

}
