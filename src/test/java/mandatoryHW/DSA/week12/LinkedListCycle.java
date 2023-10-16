package mandatoryHW.DSA.week12;

import static org.testng.Assert.assertEquals;

import java.util.HashSet;

import org.testng.annotations.Test;

import mandatoryCW.week11.ReverseList.ListNode;

public class LinkedListCycle{
	
	public class ListNode{
		int val;
		public ListNode next;
		
		public ListNode(int val) {
			this.val = val;
		}
		
		public ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}
	
	@Test
	public void tc()
	{
	 	ListNode listA = new ListNode(3);
        listA.next = new ListNode(2);
        listA.next.next = new ListNode(0);
        listA.next.next.next = new ListNode(-4);
        LinkedListCycle res = new LinkedListCycle();
        boolean actual = res.hasCycle(listA);
        assertEquals(actual, true);
        
	}
	
	public boolean hasCycle(ListNode head) {
		HashSet<ListNode> set = new HashSet<>();
		 
		while (head != null) {
			if(!set.add(head))
				return true;
			head = head.next;
		}	 
		 return false;        
	    }
	
}
