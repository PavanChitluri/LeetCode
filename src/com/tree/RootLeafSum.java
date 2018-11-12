package com.tree;

import java.util.ArrayList;
import java.util.List;

public class RootLeafSum {
	public static void main(String[] args) {
		TreeNode root = new BinaryTree().create();
		RootLeafSum obj = new RootLeafSum();
		obj.getPath(root, 110);
		
	}

	public void getPath(TreeNode root, int sum) {
		List<TreeNode> list = new ArrayList<>();
		boolean path = getPath(root, sum, list);
		if(path) {
			for (TreeNode treeNode : list) {
				System.out.print(treeNode.val+" ");
			}
		}
		
	}

	public boolean getPath(TreeNode root, int sum, List<TreeNode> list) {

		if (root == null) {
			return false;
		}
		/*
		 *  this if condition gives the path from root to the one of the node in tree, 
		 *  which gives the sum
		 */
		if (root.val == sum) {
			list.add(root);
			return true;
		}
		
		/*
		 *  this if condition gives the path only from root to the leaf node  
		 *  which gives the sum path 
		 */
		
		/*if (root.left == null && root.right == null) {
			if (root.val == sum) {
				list.add(root);
				return true;
			} else {
				return false;
			}

		}*/

		if (getPath(root.left, sum - root.val, list)) {
			list.add(root);
			return true;
		}

		if (getPath(root.right, sum - root.val, list)) {
			list.add(root);
			return true;
		}

		return false;

	}
}
