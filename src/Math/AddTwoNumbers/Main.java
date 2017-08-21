package Math.AddTwoNumbers;
//NO2
//You are given two linked lists representing two non-negative numbers. 
//The digits are stored in reverse order and each of their nodes contain a single digit. 
//Add the two numbers and return it as a linked list.


public class Main {
	public static void main(String args[]){
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(9);
//		l1.next = new ListNode(5);
		l2.next = new ListNode(9);
//		l1.next.next = new ListNode(7);
//		l2.next.next = new ListNode(2);
		Solution s = new Solution();
		ListNode result = s.addTwoNumbers(l1, l2);
		while(result!=null){
			System.out.println(result.val);
			result = result.next;
		}
	}
}
