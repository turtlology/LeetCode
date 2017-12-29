package TwoPointers.Q86PartitionList;

import TwoPointers.Q61RotateList.TwoPointers.ListNode;

public class TwoPointers {
	public ListNode partition(ListNode head, int x) {
        ListNode head1 = new ListNode(0);
        ListNode head2 = new ListNode(0);
        ListNode curr1 = head1;
        ListNode curr2 = head2;
        while(head!=null){
            if(head.val<x){
                curr1.next = head;
                curr1 = curr1.next;
            }else{
                curr2.next = head;
                curr2 = curr2.next;
            }
            head = head.next;
        }
        curr2.next = null;
        curr1.next = head2.next;
        return head1.next;
    }
	public class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}
}
