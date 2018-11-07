package com.tree;
import java.util.Stack;

public class InorderTraversal {
	public static void main(String[] args) {
		TreeNode root = new BinaryTree().create();
		InorderTraversal obj = new InorderTraversal();
		System.out.println("with recursion ");
		obj.printByRecursion(root);
		System.out.println();
		obj.printWithStack(root);
		System.out.println();
		obj.morrisTraversal(root);

	}

	public void printByRecursion(TreeNode root) {
		if (root == null) {
			return;
		}

		printByRecursion(root.left);
		System.out.print(root.key + " ");
		printByRecursion(root.right);
	}

	public void printWithStack(TreeNode root) {
		System.out.println("iteratively with stack");
		if (root == null)
			return;
		Stack<TreeNode> s = new Stack<>();
		TreeNode curr = root;

		while (curr != null || s.size() > 0) {
			while (curr != null) {
				s.push(curr);
				curr = curr.left;
			}
			curr = s.pop();
			System.out.print(curr.key + " ");

			curr = curr.right;
		}
	}

	public void morrisTraversal(TreeNode root) {
		System.out.println("morris travel without stack");
		TreeNode current, pre;
		
		if (root == null)
			return;
		current = root;
		while (current != null) {
			if (current.left == null) {
				System.out.print(current.key + " ");
				current = current.right;
			} else {
				pre = current.left;
				while (pre.right != null && pre.right != current)
					pre = pre.right;

				if (pre.right == null) {
					pre.right = current;
					current = current.left;
				}

				else {
					pre.right = null;
					System.out.print(current.key + " ");
					current = current.right;
				}

			}

		}
	}

}
