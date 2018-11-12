package com.tree;

import java.util.Stack;

/**
 * @author Pavan_Chitluri
 *  
 *  Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).

	For example, this binary tree [1,2,2,3,4,4,3] is symmetric:

    1
   / \
  2   2
 / \ / \
3  4 4  3

	But the following [1,2,2,null,3,null,3] is not:
    1
   / \
  2   2
   \   \
   3    3
   
   
 */

public class SymmetricTree {
	public static void main(String[] args) {
		SymmetricTree obj = new SymmetricTree();
		BinaryTree tree = new BinaryTree();
		System.out.println(obj.isSymmetric(tree.root));

	}

	public boolean isSymmetric(TreeNode root) {

		if (root == null) {
			return true;
		}

		return isSymmetric(root.left, root.right);

	}

	private boolean isSymmetric(TreeNode leftNode, TreeNode rightNode) {
		if (leftNode == null && rightNode == null) {
			return true;
		}

		if (leftNode.val == rightNode.val) {
			return isSymmetric(leftNode.left, rightNode.right) && isSymmetric(leftNode.right, rightNode.left);
		}

		return false;
	}

	public boolean isSymmetricByStack(TreeNode root) {
		if (root == null)
			return true;
		Stack<TreeNode> stack = new Stack<>();
		stack.push(root.left);
		stack.push(root.right);
		while (!stack.isEmpty()) {
			TreeNode node1 = stack.pop();
			TreeNode node2 = stack.pop();
			if (node1 == null && node2 == null)
				continue;
			if (node1 == null || node2 == null)
				return false;
			if (node1.val != node2.val)
				return false;
			stack.push(node1.left);
			stack.push(node2.right);
			stack.push(node1.right);
			stack.push(node2.left);
		}
		return true;
	}
}
