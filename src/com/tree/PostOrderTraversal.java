package com.tree;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class PostOrderTraversal {
	public static void main(String[] args) {
		PostOrderTraversal obj = new PostOrderTraversal();
		TreeNode root = new BinaryTree().create();
		obj.printByRecursion(root);
		System.out.println();
		obj.printByIterationWithTwoStack(root);
		System.out.println();
		obj.postOrderItrOneStack(root);
	}

	public void printByRecursion(TreeNode root) {
		if (root == null) {
			return;
		}
		printByRecursion(root.left);
		printByRecursion(root.right);
		System.out.print(root.val + " ");
	}
	
	/**
	 * Time complexity O(n)
	 * space complexity O(n)
	 */
	public void printByIterationWithTwoStack(TreeNode root) {

		if (root == null) {
			return;
		}

		Stack<TreeNode> s1 = new Stack<>();
		Stack<TreeNode> s2 = new Stack<>();

		s1.add(root);
		while (!s1.isEmpty()) {
			TreeNode node = s1.pop();
			s2.add(node);
			if (node.left != null) {
				s1.add(node.left);
			}
			if (node.right != null) {
				s1.add(node.right);
			}

		}

		while (!s2.isEmpty()) {
			System.out.print(s2.pop().val + " ");
		}

	}
	
	
	public void postOrderItrOneStack(TreeNode root){
        TreeNode current = root;
        Deque<TreeNode> queue = new LinkedList<>();
        while(current != null || !queue.isEmpty()){
            if(current != null){
            	queue.addFirst(current);
                current = current.left;
            }else{
            	TreeNode temp = queue.peek().right;
                if (temp == null) {
                    temp = queue.poll();
                    System.out.print(temp.val + " ");
                    while (!queue.isEmpty() && temp == queue.peek().right) {
                        temp = queue.poll();
                        System.out.print(temp.val + " ");
                    }
                } else {
                    current = temp;
                }
            }
        }
    }
	

}
