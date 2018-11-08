package com.tree;

public class BST {
	public static void main(String[] args) {
		
	}
	
	public TreeNode create() {
		BinaryTree tree = new BinaryTree(50);
		tree.root.left = new TreeNode(40);
		tree.root.right = new TreeNode(60);
		tree.root.left.left = new TreeNode(20);
		tree.root.left.right = new TreeNode(45);
		tree.root.right.left = new TreeNode(55);
		tree.root.right.right = new TreeNode(70);

		return tree.root;
	}
}
