package tree.sample;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeNode drinks=new TreeNode("Drinks");
		TreeNode hot=new TreeNode("Hot");
		TreeNode tea=new TreeNode("tea");
		TreeNode cofee=new TreeNode("cofee");
		TreeNode cold=new TreeNode("Cold");
		TreeNode wine=new TreeNode("wine");
		TreeNode bear=new TreeNode("bear");
		
		drinks.addChild(cold);
		drinks.addChild(hot);
		hot.addChild(tea);
		hot.addChild(cofee);
		cold.addChild(wine);
		cold.addChild(bear);
		
		System.out.println(drinks.print(0));

	}

}
