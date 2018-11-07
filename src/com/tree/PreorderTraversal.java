package com.tree;

public class PreorderTraversal {
	public static void main(String[] args) {
		PreorderTraversal obj = new PreorderTraversal();
		TreeNode root = new BinaryTree().create();
		obj.printByRecursion(root);
		
	}

	public void printByRecursion(TreeNode root) {
		if(root==null) {
			return;
		}
		
		System.out.print(root.key+" ");
		printByRecursion(root.left);
		printByRecursion(root.right);
		
	}
	
}
