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
				System.out.print(treeNode.key+" ");
			}
		}
		
	}

	public boolean getPath(TreeNode root, int sum, List<TreeNode> list) {

		if (root == null) {
			return false;
		}
		if (root.key == sum) {
			list.add(root);
			return true;
		}
		/*if (root.left == null && root.right == null) {
			if (root.key == sum) {
				list.add(root);
				return true;
			} else {
				return false;
			}

		}*/ else {

			if (getPath(root.left, sum - root.key, list)) {
				list.add(root);
				return true;
			}

			if (getPath(root.right, sum - root.key, list)) {
				list.add(root);
				return true;
			}

		}

		return false;

	}
}
