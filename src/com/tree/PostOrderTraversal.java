package com.tree;

public class PostOrderTraversal {
	public static void main(String[] args) {
		PostOrderTraversal obj = new PostOrderTraversal();
		TreeNode root = new BinaryTree().create();
		obj.printByRecursion(root);

	}

	private void printByRecursion(TreeNode root) {
		if (root == null) {
			return;
		}

		printByRecursion(root.left);
		printByRecursion(root.right);
		System.out.print(root.key + " ");
	}

}
