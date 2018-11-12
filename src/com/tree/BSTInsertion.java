package com.tree;

public class BSTInsertion {
	public static void main(String[] args) {
		BST bst = new BST();
		TreeNode root = bst.create();
		BSTInsertion obj = new BSTInsertion();
		obj.insert(root, 68);
		obj.insert(root, 28);
		
	}
	
	/**
	 * Time complexity is O(n) for non balanced BST
	 * Time complexity is O(logn) for balanced BST
	 * @param root
	 * @param data
	 * @return
	 */
	public TreeNode insert(TreeNode root, int data) {
		
		TreeNode newNode = new TreeNode(data);
		if (root == null) {
			return newNode;
		}

		TreeNode parent = null;
		TreeNode current = root;

		while (current != null) {
			parent = current;
			if (current.val <= data) {
				current = current.right;
			} else {
				current = current.left;
			}
		}

		if (parent.val <= data) {
			parent.right = newNode;
			System.out.println(" inserted right to the " + parent.val);
		} else {
			parent.left = newNode;
			System.out.println(" inserted left to the " + parent.val);
		}

		return root;
	}
	
	
}
