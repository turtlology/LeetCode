package TwoPointers.Q19RemoveNthNodeFromEndOfList;

public class TwoPointers {
	public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null){
            return null;
        }
        ListNode fast = head;
        ListNode slow = head;
        while(n>0){
            fast = fast.next;
            n--;
        }
        if(fast== null){
            return head.next;
        }
        while(fast.next!= null){
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;
    }
	public class ListNode {
	      int val;
	      ListNode next;
	      ListNode(int x) { val = x; }
	}
}

