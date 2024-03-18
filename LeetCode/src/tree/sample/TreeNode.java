package tree.sample;

import java.util.ArrayList;

public class TreeNode {
	
	String data;
	ArrayList<TreeNode> child;
	
	TreeNode(String data){
		this.data=data;
		child=new ArrayList<>();
	}
	
	public void addChild(TreeNode node) {
		this.child.add(node);
	}

	
	public String print(int level) {
		String ret;
		ret=" ".repeat(level)+data+"\n";
		for(TreeNode s:child) {
			ret+=s.print(level+1);
		}
		return ret;
	}
}
