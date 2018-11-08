package com.tree;
/**
 * 
 * @author Pavan_Chitluri
 * A tree will same tree if tree has same structure and same data
 */

public class SameTree {
	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		TreeNode root1 = tree.create();
		TreeNode root2 = tree.create();
		SameTree obj = new SameTree();
		System.out.println("is Same tree: "+obj.isSameTree(root1, root2));
	}
	
	/**
	 *  Time complexity is O(n)  non balanced BST
	 * @param root1
	 * @param root2
	 * @return
	 */
	
	public boolean isSameTree(TreeNode root1, TreeNode root2) {
		if (root1 == null && root2 == null) {
			return true;
		}
		if (root1 == null || root2 == null) {
			return false;
		}

		return root1.key == root2.key && isSameTree(root1.left, root2.left) && isSameTree(root1.right, root2.right);

	}
}
