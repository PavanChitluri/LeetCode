package com.tree;

public class BinaryTree {

	TreeNode root;

	public void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		TreeNode root = tree.create();
		tree.height(root);

	}

	public BinaryTree(int root) {
		this.root = new TreeNode(root);
	}

	public BinaryTree() {
		root = null;
	}

	public TreeNode create() {
		BinaryTree tree = new BinaryTree(10);
		tree.root.left = new TreeNode(20);
		tree.root.right = new TreeNode(30);
		tree.root.left.left = new TreeNode(40);
		tree.root.left.right = new TreeNode(50);
		tree.root.right.left = new TreeNode(60);
		tree.root.right.right = new TreeNode(70);

		return tree.root;
	}

	public BinaryTree emptyTree() {
		return new BinaryTree();
	}

	public int height(TreeNode node) {
		if (node == null) {
			return 0;
		} else {
			int leftHeight = height(node.left);
			int rightHeight = height(node.right);

			if (leftHeight > rightHeight) {
				return leftHeight + 1;
			} else {
				return rightHeight + 1;
			}
			
//			 return Math.max(leftHeight, rightHeight)+1
		}
	}

}
