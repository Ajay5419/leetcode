package doublesingleLL;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoubleSingleLL dl=new DoubleSingleLL();
		dl.createDLL(1);
		System.out.println(dl.head.value);
		dl.insertDLL(2, 0);
		dl.insertDLL(12, 10);
		dl.insertDLL(6, 1);
		dl.printDLL();
		//dl.printRDLL();
		dl.deleteDLL(0);
		//dl.deleteDLL(10);
		dl.deleteDLL(1);
		dl.printDLL();
		dl.deleteAll();
	}

}
