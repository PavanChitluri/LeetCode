package com.tree;

public class BSTValidate {
	public static void main(String[] args) {
		BST bst = new BST();
		TreeNode root = bst.create();
		BSTValidate obj = new BSTValidate();
		System.out.println(obj.isBST(root));

	}

	public boolean isBST(TreeNode root) {

		return validate(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
		
	}

	public boolean validate(TreeNode root, int minValue, int maxValue) {

		if (root == null) {
			return true;
		}

		if (minValue >= root.key && root.key < maxValue) {
			return false;
		}
		return validate(root.left, minValue, root.key) && validate(root.right, root.key, maxValue);
	}
}
