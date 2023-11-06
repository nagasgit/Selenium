package mandatoryCW.week11;

import java.util.Arrays;
import java.util.LinkedList;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ReverseList extends SinglyLinkedList
{
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
	
	ListNode head;
	
	public ListNode reverseList(ListNode head){
		
		//ListNode currNode = head;
		if (head.next == null) return head;
		
		ListNode currentHead = null;
		while (head != null) {
			currentHead = new ListNode(head.val, currentHead);
			head = head.next;
		}
		
		return currentHead;
	}
	
	   @Test
	    public void test(){
			/*
			 * ListNode head = reverseList(new SinglyLinkedList().add(new int[]{1,2,3,4}));
			 * String a = new SinglyLinkedList().print(head); System.out.println(a);
			 * Assert.assertEquals("[4,3,2,1,]", a);
			 */
			/*
			 * ReverseList res = new ReverseList(); ListNode head = new ListNode(11, new
			 * ListNode(22, new ListNode(33, new ListNode(90, null))));
			 * //res.reverseList(head); System.out.println(res.reverseList(head).val);
			 */
			/*
			 * ListNode result = reverseList(head); System.out.println(result.val);
			 */
		   ListNode head = reverseList(new SinglyLinkedList().add(new int[]{1,2,3,4}));
		   String a = new SinglyLinkedList().head.toString();
		   System.out.println(a);
		   Assert.assertEquals("[4,3,2,1,]", a);
	    }
}
