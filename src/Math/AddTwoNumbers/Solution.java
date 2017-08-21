package Math.AddTwoNumbers;
//simply add the node one by one
//This solution has an obvious shortcoming is that I should discuss special conditions at the beginning of the solution

public class Solution {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		int temp = 0;
		ListNode result;
		if(l1.val+l2.val>=10){
			result = new ListNode(l1.val+l2.val-10);
			temp = 1;
		}else{
			result = new ListNode(l1.val+l2.val);
		}
		l1 = l1.next;
		l2 = l2.next;
		ListNode next = result;
		while(l1!=null&&l2!=null){
			if(l1.val+l2.val+temp<10){
				next.next = new ListNode(l1.val+l2.val+temp);
				temp = 0;
			}
			else{
				next.next = new ListNode(l1.val+l2.val-10+temp);
				temp = 1;
			}
			next = next.next;
			l1 = l1.next;
			l2 = l2.next;
		}
		if(l1!=null){
			while(l1!=null){
				if(l1.val+temp>=10){
					next.next = new ListNode(l1.val+temp-10);
					temp = 1;
				}else{
					next.next = new ListNode(l1.val+temp);
					temp = 0;
				}
				l1 = l1.next;
				next = next.next;
				
			}
		}
		if(l2!=null){
			while(l2!=null){
				if(l2.val+temp>=10){
					next.next = new ListNode(l2.val+temp-10);
					temp = 1;
				}else{
					next.next = new ListNode(l2.val+temp);
					temp=0;
				}
				l2 = l2.next;
				next = next.next;
			}
		}
		if(temp==1){
			next.next = new ListNode(1);
		}
		return result;
	}
}
