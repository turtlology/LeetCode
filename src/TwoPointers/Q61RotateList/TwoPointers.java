package TwoPointers.Q61RotateList;

//num means how many times need to rotate the head to the tail
//since k would exceed the length of the list, so get the remain first
//use the total to minus remain can get how many should put from the head to tail.
public class TwoPointers {
	public ListNode rotateRight(ListNode head, int k) {
        if(head==null||head.next==null||k==0){
            return head;
        }
        ListNode start = head;
        ListNode end = head;
        int total = 1;
        while(end.next!=null){
            end = end.next;
            total++;
        }
        int num = total-k%total;
        while(num>0){
            end.next = start;
            end = end.next;
            ListNode next = start.next;
            start.next = null;
            start = next;
            num--;
        }
        return start;
    }
	public class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}
}
