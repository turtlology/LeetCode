package Stack.Q94BinaryTreeInordorTraversal;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import Util.TreeNode;


public class StackSolution {
	public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        TreeNode cur = root;
        Stack<TreeNode> s = new Stack<TreeNode>();
        while (cur != null || !s.isEmpty()){
            while (cur != null){
                s.push(cur);
                cur = cur.left;
            }
            cur = s.pop();
            result.add(cur.val);
            cur = cur.right;
        }
        return result;
    }
}
