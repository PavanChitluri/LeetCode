package com.tree;
import java.util.LinkedList;
import java.util.Queue;

public class LeverOrderTraversal {

	public static void main(String[] args) {
		LeverOrderTraversal obj = new LeverOrderTraversal();
		TreeNode root = new BinaryTree().create();
		/*
		 * root.left.left.left = new TreeNode(80); root.left.left.right = new
		 * TreeNode(100); root.left.left.left.right = new TreeNode(1);
		 * root.left.left.left.right.right = new TreeNode(2);
		 */
		obj.printLevelOrderTraversal(root);
		System.out.println();
		obj.printTree(root);

	}

	public void printLevelOrderTraversal(TreeNode root) {
		BinaryTree tree = new BinaryTree();
		int height = tree.height(root);
		System.out.println(" height of tree " + height);
		for (int i = 0; i <= height; i++) {
			printEachLevel(root, i);
		}

	}

	public static void printEachLevel(TreeNode root, int height) {
		if (root == null) {
			return;
		}
		if (height == 1) {
			System.out.print(root.key + " ");
		} else if (height > 1) {
			printEachLevel(root.left, height - 1);
			printEachLevel(root.right, height - 1);
		}

	}

	public void printTree(TreeNode root) {
		if (root == null) {
			return;
		}
		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);
		while (!queue.isEmpty()) {
			TreeNode temp = queue.peek();
			queue.remove();
			if (temp.left != null) {
				queue.add(temp.left);
			}
			if (temp.right != null) {
				queue.add(temp.right);
			}
			System.out.print(temp.key + " ");
		}

	}

}
