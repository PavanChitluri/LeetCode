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

	/**
	 * Time complexity O(n)
	 * space complexity O(1)
	 */
	public void morrisTraversal(TreeNode root) {
		System.out.println("morris travel without stack");
		if (root == null) {
			return;
		}

		TreeNode curr = root;
		while (curr != null) {
			if (curr.left == null) {
				System.out.print(curr.key + " ");
				curr = curr.right;
			} else {
				TreeNode predecessor = curr.left;
				while (predecessor.right != null && predecessor.right != curr) {
					predecessor = predecessor.right;
				}
				if (predecessor.right == null) {
					predecessor.right = curr;
					curr = curr.left;
				} else {
					System.out.print(curr.key + " ");
					curr = curr.right;
					predecessor.right = null;
				}
			}
		}
	}
}
