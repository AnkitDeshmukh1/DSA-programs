package com.binarytree.tree;
import com.binarytree.tree.Node;

public class BinaryTree {
	
private Node root;
	
	public void addNode() {
		
		if(root == null) {
			
			Node n = new Node(108);
			root = n;
		}
		
		Node n1 = new Node(110);
		Node n2 = new Node(112);
		
		root.left = n1;
		root.right = n2;
	}
	
	public void showNodes() {
		System.out.println(root.key);
		System.out.println(root.left.key);
		System.out.println(root.right.key);
	}

}
