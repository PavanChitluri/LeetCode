package com.tree;

/**
 * 
 * @author Pavan_Chitluri
 *	Time complexity - O(n)
 */

public class TreeSize {
	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		TreeNode root = tree.create();
		TreeSize obj = new TreeSize();
		System.out.println("Tree size "+obj.getSize(root));
		
		
	}
	
	
	public int getSize(TreeNode root) {
		if(root == null ) {
			return 0;
		}
		int leftSize = getSize(root.left);
		int rightSize = getSize(root.right);
		return leftSize+rightSize+1;
	}
	
	
}
