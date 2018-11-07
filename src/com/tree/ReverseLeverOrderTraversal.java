package com.tree;
public class ReverseLeverOrderTraversal {

	public static void main(String[] args) {
		ReverseLeverOrderTraversal obj = new ReverseLeverOrderTraversal();
		BinaryTree tree = new BinaryTree();
		TreeNode root = tree.create();
		obj.printReverseLeverOrder(root);
	}

	public void printReverseLeverOrder(TreeNode root) {
		BinaryTree tree = new BinaryTree();
		int height = tree.height(root);
		System.out.println("height: " + height);

		for (int i = height; i > 0; i--) {
			printReverseLeverOrderByLevel(tree.root, i);
		}

	}

	public void printReverseLeverOrderByLevel(TreeNode root, int height) {

		if (root == null) {
			return;
		} else if (height == 1) {
			System.out.print(root.key + " ");
		} else {
			printReverseLeverOrderByLevel(root.left, height - 1);
			printReverseLeverOrderByLevel(root.right, height - 1);
		}

	}

}
