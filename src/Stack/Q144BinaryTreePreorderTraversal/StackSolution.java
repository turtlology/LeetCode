package Stack.Q144BinaryTreePreorderTraversal;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import Util.TreeNode;

public class StackSolution {
	public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        TreeNode cur = root;
        Stack<TreeNode> s = new Stack<TreeNode>();
        while (cur != null || !s.isEmpty()){
            while (cur != null){
                result.add(cur.val);
                s.push(cur);
                cur = cur.left;
            }
            cur = s.pop();
            cur = cur.right;
        }
        return result;
    }
}
