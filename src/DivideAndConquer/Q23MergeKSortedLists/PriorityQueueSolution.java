package DivideAndConquer.Q23MergeKSortedLists;

import java.util.Comparator;
import java.util.*;

public class PriorityQueueSolution {
	public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0 || lists == null) {
            return null;
        }
        
        PriorityQueue<ListNode> min = new PriorityQueue<ListNode>(lists.length, new Comparator<ListNode>(){
            @Override
            public int compare(ListNode n1, ListNode n2){
                if (n1.val < n2.val) {
                    return -1;
                } else if (n1.val == n2.val) {
                    return 0;
                } else {
                    return 1;
                }
            }
        });
        
        for (ListNode node : lists) {
            if (node != null) {
                min.add(node);
            }
        }
        
        ListNode result = new ListNode(0);
        ListNode tail = result;
        
        while (!min.isEmpty()) {
            tail.next = min.poll();
            tail = tail.next;
            if (tail.next != null) {
                min.add(tail.next);
            }
        }
        
        return result.next;
    }
	 public class ListNode {
	     int val;
	     ListNode next;
	     ListNode(int x) { val = x; }
	 }
}
