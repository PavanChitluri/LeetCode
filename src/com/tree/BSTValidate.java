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

		if (root.val <=minValue || root.val > maxValue) {
			return false;
		}
		return validate(root.left, minValue, root.val) && validate(root.right, root.val, maxValue);
	}
	
	
	
	public boolean isBSTIterative(TreeNode root) {
		
		
		
		
		
		return false;
	}
}
