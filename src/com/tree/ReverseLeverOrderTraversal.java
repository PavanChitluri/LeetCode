package com.tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseLeverOrderTraversal {

	public static void main(String[] args) {
		ReverseLeverOrderTraversal obj = new ReverseLeverOrderTraversal();
		BinaryTree tree = new BinaryTree();
		TreeNode root = tree.create();
		obj.printReverseLeverOrder(root);
		System.out.println();
		obj.reverseLevelOrderTraversalUsingStackAndQueue(root);
	}

	public void printReverseLeverOrder(TreeNode root) {
		BinaryTree tree = new BinaryTree();
		int height = tree.height(root);
		System.out.println("height: " + height);

		for (int i = height; i > 0; i--) {
			printReverseLeverOrderByLevel(root, i);
			System.out.println();
		}

	}

	public void printReverseLeverOrderByLevel(TreeNode root, int height) {

		if (root == null) {
			return;
		} else if (height == 1) {
			System.out.print(root.val + " ");
		} else {
			printReverseLeverOrderByLevel(root.left, height - 1);
			printReverseLeverOrderByLevel(root.right, height - 1);
		}

	}
	
	
	public void reverseLevelOrderTraversalUsingStackAndQueue(TreeNode root){
        if(root == null){
            return;
        }
        Queue<TreeNode> q = new LinkedList<>();
        Stack<TreeNode> s = new Stack<>();
        q.add(root);
        while(!q.isEmpty()){
            root = q.poll();
            if(root.right != null){
                q.add(root.right);
            }
            if(root.left != null){
                q.add(root.left);
            }
            s.push(root);
        }
        while(!s.isEmpty()){
            System.out.print(s.pop().val + " ");
        }
    }

}
