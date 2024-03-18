package tree.binary;

public class TestArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeArray bt=new BinaryTreeArray(16);
		bt.insertNode("N1");
		bt.insertNode("N2");
		bt.insertNode("N3");
		bt.insertNode("N4");
		bt.insertNode("N5");
		bt.insertNode("N6");
		bt.insertNode("N7");
		bt.insertNode("N8");
		bt.insertNode("N9");
		bt.preOrder(1);
		System.out.println();
		bt.inOrder(1);
		System.out.println();
		bt.postOrder(1);
		System.out.println();
		bt.levelOrder();
		bt.search("N6");
		bt.delete("N9");
		System.out.println();
		bt.levelOrder();

	}
	
	

}
