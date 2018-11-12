package com.tree;

public class BSTSearch {
	public static void main(String[] args) {
		BST bst = new BST();
		TreeNode root = bst.create();
		BSTSearch obj = new BSTSearch();
		TreeNode node = obj.searchRecursion(root, 15);
		if (node != null) {
			System.out.println("Element found recusrion method " + node.val);
		} else {
			System.out.println("Element not found recusrion method ");
		}
		node = obj.searchIterative(root, 70);
		if (node != null) {
			System.out.println("Element found iterative method " + node.val);
		} else {
			System.out.println("Element not found recusrion method ");
		}
	}
	
	/**
	 * Time complexity is O(n) for non balanced BST
	 * Time complexity is O(logn) for balanced BST
	 * @param root
	 * @param data
	 * @return
	 */
	public TreeNode searchRecursion(TreeNode root, int data) {

		if (root == null) {
			return null;
		}

		if (root.val == data) {
			return root;
		} else if (data < root.val) {
			return searchRecursion(root.left, data);
		} else {
			return searchRecursion(root.right, data);
		}

	}
	
	public TreeNode searchIterative(TreeNode root, int data) {

		if (root == null) {
			return null;
		}

		while (root != null) {

			if (root.val == data) {
				return root;
			} else if (data < root.val) {
				root = root.left;
			} else {
				root = root.right;
			}

		}
		return null;

	}
	

}
