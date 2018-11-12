package com.tree;

public class MaximumDepthBinaryTree {
	public static void main(String[] args) {
		MaximumDepthBinaryTree obj = new MaximumDepthBinaryTree();
		TreeNode root = new BinaryTree().create();
		int maxDepth = obj.maxDepth(root);
		System.out.println(" depth of tree "+maxDepth);
		
		

	}

	public int maxDepth(TreeNode root) {
		if (root == null) {
			return 0;
		}

		int leftDepth = maxDepth(root.left) + 1;
		int rightDepth = maxDepth(root.right) + 1;

		return (leftDepth > rightDepth) ? leftDepth : rightDepth;
	}

}
