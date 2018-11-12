package com.tree;

public class TraversalWithRecursion {

	public static void main(String[] args) {
		BinaryTree bt = new BinaryTree();
		TreeNode root = bt.create();

		TraversalWithRecursion obj = new TraversalWithRecursion();

		System.out.println("Preorder traversal of binary tree is ");
		obj.printPreOrderTraversal(root);

		System.out.println("\nInorder traversal of binary tree is ");
		obj.printInOrderTraversal(root);

		System.out.println("\nPostorder traversal of binary tree is ");
		obj.printPostOrderTraversal(root);

	}

	private void printPreOrderTraversal(TreeNode node) {

		if (node == null) {
			return;
		} else {
			System.out.print(node.val + " ");
			printPreOrderTraversal(node.left);
			printPreOrderTraversal(node.right);
		}

	}

	private void printInOrderTraversal(TreeNode node) {
		if (node == null) {
			return;
		} else {
			printInOrderTraversal(node.left);
			System.out.print(node.val + " ");
			printInOrderTraversal(node.right);
		}

	}

	private void printPostOrderTraversal(TreeNode node) {
		if (node == null) {
			return;
		} else {
			printPostOrderTraversal(node.left);
			printPostOrderTraversal(node.right);
			System.out.print(node.val + " ");
		}

	}

	/*
	 * public static void main(String[] args) { BinaryTree tree = new BinaryTree();
	 * tree.root = new Node(1); tree.root.left = new Node(2); tree.root.right = new
	 * Node(3); tree.root.left.left = new Node(4); tree.root.left.right = new
	 * Node(5);
	 * 
	 * System.out.println("Preorder traversal of binary tree is ");
	 * printPreOrderTraversal(tree.root);
	 * 
	 * System.out.println("\nInorder traversal of binary tree is ");
	 * printInOrderTraversal(tree.root);
	 * 
	 * System.out.println("\nPostorder traversal of binary tree is ");
	 * printPostOrderTraversal(tree.root); }
	 */

}
