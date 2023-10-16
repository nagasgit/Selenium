package mandatoryHW.DSA.week12;
import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

import mandatoryCW.week11.ReverseList;
import mandatoryCW.week11.ReverseList.ListNode;

public class IntersectionOfLinkedList
{
	/*
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

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
	public void tc1() {
		 	ListNode listA = new ListNode(4);
	        listA.next = new ListNode(1);
	        listA.next.next = new ListNode(8);
	        listA.next.next.next = new ListNode(4);
	        listA.next.next.next.next = new ListNode(5);
	        
	        ListNode listB = new ListNode(5);
	        listB.next = new ListNode(6);
	        listB.next.next = new ListNode(1);
	        listB.next.next.next = new ListNode(8);
	        listB.next.next.next.next = new ListNode(4);
	        listB.next.next.next.next.next = new ListNode(5);
	        
	        IntersectionOfLinkedList res = new IntersectionOfLinkedList();
	        ListNode intsecNode = res.getIntersectionNode(listA, listB);
	        ListNode expected = listB.next.next.next;
	        assertEquals(intsecNode, expected);       
	}	
	
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		 ListNode node1 = headA;
	        ListNode node2 = headB;

	        while(node1 != node2){
	            if (node1 == null)
	                {
	                    node1 = headB;
	                }else{
	                    node1 = node1.next;
	                }
	            if (node2 == null){
	                node2 = headA;
	            }else{
	                node2 = node2.next;
	            }
	        }
	        return node2;
    }
}
