package tree.binarysearchtree;

import java.util.LinkedList;
import java.util.Queue;

import questions.DeleteMethod;

public class BinarySearchTree {
	BinaryNode root;
	
	BinarySearchTree(){
		root=null;
	}

	public BinaryNode insertNode(BinaryNode curr,int value) {
		if(curr==null) {
			BinaryNode b=new BinaryNode();
			b.value=value;
			System.out.println("node inserted  ");
			//root=b;
			return b;
		}else if(value<=curr.value){
			
			curr.left=insertNode(curr.left, value);
			return curr;
			
		}else {
			curr.right=insertNode(curr.right, value);
			return curr;

		}
	}
	
	public void insert(int value) {
		root=insertNode(root, value);
	}
	
	public void preOrder(BinaryNode node) {
		if(node==null) {
			return;
		}
		System.out.print(node.value+" ");
		preOrder(node.left);
		preOrder(node.right);
	}
	
	
	public void inOrder(BinaryNode node) {
		if(node==null) {
			return;
		}
		
		inOrder(node.left);
		System.out.print(node.value+" ");
		inOrder(node.right);
	}
	public void postOrder(BinaryNode node) {
		if(node==null) {
			return;
		}
		
		postOrder(node.left);
		
		postOrder(node.right);
		System.out.print(node.value+" ");
	}
	
	public void levelOrder() {
		Queue<BinaryNode> q =new LinkedList<>();
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
	
	public BinaryNode search(BinaryNode node, int value) {
		if(node==null) {
			System.out.println("not found");
			return null;
			
		}else if(node.value==value) {
			System.out.println("found");
			return node;
		}else if(value<node.value) {
			return search(node.left,value);
		
		}else if(value>node.value) {
			return search(node.right,value);
		}
		return null;
	}
	
	
	public BinaryNode minNodeForRight(BinaryNode node) {
		
		if(node.left==null) {
			return node;
		}
		else {
			return minNodeForRight(node.left);
		}
	}
	
	
	public BinaryNode deleteNode(BinaryNode root,int value) {
		if(root==null) {
			System.out.println("not found");
			return root;
		}else if(value<root.value) {
			root.left=deleteNode(root.left,value);
		}else if(value>root.value) {
			root.right=deleteNode(root.right,value);
		}else {
			
			if(root.left!=null && root.right!=null) {
				BinaryNode temp=root;
				BinaryNode minNode=minNodeForRight(temp.right);
				root.value=minNode.value;
				root.right= deleteNode(root.right,minNode.value);
			}else if(root.left!=null) {
				root=root.left;
			}else if(root.right!=null) {
				root=root.right;
			}else {
				root=null;
			}
			
		}
		return root;
		
	}
	
	
}
