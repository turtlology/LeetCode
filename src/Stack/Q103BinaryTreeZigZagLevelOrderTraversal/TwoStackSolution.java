package Stack.Q103BinaryTreeZigZagLevelOrderTraversal;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import Util.TreeNode;

public class TwoStackSolution {
	public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        TreeNode cur = root;
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if (cur == null){
            return result;
        }
        
        Stack<TreeNode> s1 = new Stack<TreeNode>();
        Stack<TreeNode> s2 = new Stack<TreeNode>();
        s1.push(cur);
        while (!s1.isEmpty() || !s2.isEmpty()){
            List<Integer> temp = new ArrayList<Integer>();
            while (!s1.isEmpty()){
                cur = s1.pop();
                temp.add(cur.val);
                if (cur.left != null){
                    s2.push(cur.left);
                }
                if (cur.right != null){
                    s2.push(cur.right);
                }
            }
            result.add(temp);
            
            temp = new ArrayList<Integer>();
            while (!s2.isEmpty()){
                cur = s2.pop();
                temp.add(cur.val);
                if (cur.right != null){
                    s1.push(cur.right);
                }
                if (cur.left != null){
                    s1.push(cur.left);
                }
            }
            
            if (temp.size() > 0){
                result.add(temp);
            }
        }
        
        return result;
    }
}
