package tree.binary;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeLinkedList {
	
	BinaryNode root;
	BinaryTreeLinkedList(){
		this.root=null;
		
	}
	
	//preorder travesal 
	
	
	void preOrder(BinaryNode node) {
		if(node==null) {
			return;
		}
		
		System.out.print(node.value+" ");
		preOrder(node.left);
		preOrder(node.right);
	}
	
	
	void inOrder(BinaryNode node) {
		if(node==null) {
			return;
		}
		
		inOrder(node.left);
		System.out.print(node.value+" ");
		inOrder(node.right);
		
	}
	void postOrder(BinaryNode node) {
		if(node==null) {
			return;
		}
		
		postOrder(node.left);
		
		postOrder(node.right);
		System.out.print(node.value+" ");
		
	}
	
	void levelOrder() {
		Queue<BinaryNode> q=new LinkedList<>();
		
		q.add(root);
		while(!q.isEmpty()) {
			BinaryNode present=q.remove();
			System.out.print(present.value+" ");
			if(present.left!=null) {
				q.add(present.left);
			}
			if(present.right!=null) {
				q.add(present.right);
			}
		}
	}
	
	void search(String value) {
		Queue<BinaryNode> q=new LinkedList<>();
		
		q.add(root);
		while(!q.isEmpty()) {
			BinaryNode present=q.remove();
			if(present.value.equals(value)) {
			System.out.print(present.value+" ");
			return;
			}
			if(present.left!=null) {
				q.add(present.left);
			}
			if(present.right!=null) {
				q.add(present.right);
			}
		}
		System.out.println("not found");
	}
	
	
	void insert(String val) {
		BinaryNode node=new BinaryNode();
		node.value=val;
		if(root==null) {
			root=node;
			System.out.println("inserted");
			return;
		}
		Queue<BinaryNode> q=new LinkedList<>();
		
		q.add(root);
		while(!q.isEmpty()) {
			BinaryNode present=q.remove();
			
			
			if(present.left==null) {
				
			
				
				present.left=node;
				System.out.println("added to left " +present.value);
				break;
			}
			else if(present.right==null) {
				
				
				present.right=node;
				System.out.println("added to Right " +present.value);
				break;
			}else {
				q.add(present.left);
				q.add(present.right);
			}
		}
		
	}
	
	public BinaryNode getDeepestNode() {
		Queue<BinaryNode>q=new LinkedList<>();
		q.add(root);
		BinaryNode deepestNode=null;
		while(!q.isEmpty()) {
			deepestNode=q.remove();
			if(deepestNode.left!=null) {
				q.add(deepestNode.left);
			}
			
			if(deepestNode.right!=null) {
				q.add(deepestNode.right);
			}
		}
		
		return deepestNode;
	}
	
	public void deleteDeepestNode() {
		Queue<BinaryNode>q=new LinkedList<>();
		q.add(root);
		BinaryNode prev,curr=null;
		while(!q.isEmpty()) {
			prev=curr;
			curr=q.remove();
			if(curr.left==null) {
				System.out.println(prev.right.value);
				prev.right=null;
				return;
			}
			if(curr.right==null) {
				curr.left=null;
				System.out.println(curr.left.value);
				return;
			}
			
			q.add(curr.left);
			q.add(curr.right);
		}
	}
	
	public void deleteNode(String val) {
		Queue<BinaryNode> q=new LinkedList<>();
		q.add(root);
		while(!q.isEmpty()) {
			BinaryNode curr=q.remove();
			
			if(curr.value.equals(val)) {
				curr.value=getDeepestNode().value;
				deleteDeepestNode();
				return;
			}
			
			if(curr.left!=null) {
				q.add(curr.left);
			}
			
			if(curr.right!=null) {
				q.add(curr.right);
			}
		}
		
		System.out.println("not found");
	}

}
