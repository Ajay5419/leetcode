package circulardoubleLL;

public class Test {

	public static void main(String args[]) {
		CircularDLL cd=new CircularDLL();
		cd.createCDLL(1);
		System.out.println(cd.head.value);
		cd.insertCDLL(2, 0);
		cd.insertCDLL(12, 10);
		cd.insertCDLL(6, 1);
		cd.insertCDLL(7, 1);
		cd.deleteCDLL(0);
		cd.deleteCDLL(10);
		cd.deleteCDLL(1);
		
		cd.printCDLL();
		System.out.println();
		cd.printRCDLL();
		
	}
}
