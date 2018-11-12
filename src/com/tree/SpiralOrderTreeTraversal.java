package com.tree;

import java.util.Stack;

public class SpiralOrderTreeTraversal {
	public static void main(String[] args) {
		TreeNode root = new BinaryTree().create();
		SpiralOrderTreeTraversal obj = new SpiralOrderTreeTraversal();
		obj.spiralWithTwoStack(root);
	}

	public void spiralWithTwoStack(TreeNode root) {

		if (root == null) {
			return;
		}
		Stack<TreeNode> s1 = new Stack<>();
		Stack<TreeNode> s2 = new Stack<>();
		s1.add(root);

		while (!s1.isEmpty() || !s2.isEmpty()) {
			while (!s1.isEmpty()) {
				TreeNode node = s1.pop();
				System.out.print(node.val + " ");
				if (node.left != null) {
					s2.add(node.left);
				}

				if (node.right != null) {
					s2.add(node.right);
				}

			}

			while (!s2.isEmpty()) {
				TreeNode node = s2.pop();
				System.out.print(node.val + " ");

				if (node.right != null) {
					s1.add(node.right);
				}

				if (node.left != null) {
					s1.add(node.left);
				}
			}

		}

	}

}
