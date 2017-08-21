package Math.AddTwoNumbers;
//This solution is much more simple because it considers the sum in one place
//It's quite different because we don't have to think about add or the signal bit.
//also we use mod and integer dividing in this solution.

public class Solution2 {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		int sum = 0;
		ListNode start = new ListNode(0);
		ListNode result = start;
		while(l1!=null||l2!=null){
			sum/=10;
			if(l1!=null){
				sum+=l1.val;
				l1 = l1.next;
			}
			if(l2!=null){
				sum+=l2.val;
				l2 = l2.next;
			}
			result.next = new ListNode(sum%10);
			result = result.next;
		}
		if(sum/10==1){
			result.next = new ListNode(1);
		}
		return start.next;
	}
}
