package DFS.Q98ValidateBinarySearchTree;

import java.util.Stack;
import Util.TreeNode;

//Use in-order traversal to traverse the tree.

public class InOrderTraversal {
	public boolean isValidBST(TreeNode root) {
        if(root == null){
            return true;
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode pre = null;
        while(root != null || !stack.isEmpty()){
            while(root != null){
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            if(pre != null && root.val <= pre.val) return false;
            pre = root;
            root = root.right;
        }
        return true;
    }
	
}
