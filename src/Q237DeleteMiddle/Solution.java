package Q237DeleteMiddle;

import LinkedList.Node;

public class Solution {
	public void delete(Node n) {
		n.val = n.next.val;
		n.next = n.next.next;
	}
}
