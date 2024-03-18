public class MainClass {

	public static void main(String args[]) {
		
		SingleLinkedList ls=new SingleLinkedList();
		ls.createSingleLinkedList(1);
		//System.out.println(ls.head.value);
		ls.InsertSingleLinkedList(5,0);
		ls.InsertSingleLinkedList(6,3);
		//System.out.println(ls.head.value);
		ls.printList();
		ls.searchValue(6);
		ls.deleteNode(1);
		ls.printList();
		System.out.println(ls.size);
		
		
		
		
		
		
		
	}
	
}
