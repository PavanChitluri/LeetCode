package com.tree;

import java.util.Stack;

public class PreorderTraversal {
	public static void main(String[] args) {
		PreorderTraversal obj = new PreorderTraversal();
		TreeNode root = new BinaryTree().create();
		obj.printByRecursion(root);
		System.out.println();
		obj.printByIterationUsingStack(root);
		
	}

	public void printByRecursion(TreeNode root) {
		if(root==null) {
			return;
		}
		
		System.out.print(root.val+" ");
		printByRecursion(root.left);
		printByRecursion(root.right);
		
	}
	
	
	
	public void printByIterationUsingStack(TreeNode root) {
		if (root == null) {
			return;
		}

		Stack<TreeNode> s = new Stack<>();
		s.add(root);

		while (!s.isEmpty()) {
			TreeNode node = s.pop();
			System.out.print(node.val + " ");
			if (node.right != null) {
				s.add(node.right);
			}

			if (node.left != null) {
				s.add(node.left);
			}

		}

	}
	
}
