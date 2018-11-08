package com.tree;

public class TreeHeight {
	public static void main(String[] args) {
		TreeNode root = new BinaryTree().create();
		TreeHeight obj = new TreeHeight();
		int height = obj.height(root);
		System.out.println("Height of binary tree "+height);
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
