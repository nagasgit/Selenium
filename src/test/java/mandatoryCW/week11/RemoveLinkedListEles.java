package mandatoryCW.week11;

import org.testng.annotations.Test;

import mandatoryCW.week11.ReverseList.ListNode;

public class RemoveLinkedListEles 
{

	class ListNode{
		int val;
		ListNode next;
		
		public ListNode(int val) {
			this.val = val;
			next = null;
		}
		
		public ListNode(int val, ListNode next) {
			this.val=val;
			this.next=next;
		}
	}
	
	@Test
	public void tc()
	{
		ListNode node = removelinkedList(new ListNode(1,new ListNode(2,new ListNode(3, new ListNode(4,null)))),4);
		System.out.println(node);
	}
	
	public ListNode removelinkedList(ListNode head, int val){
		ListNode node = new ListNode(1, new ListNode(2,new ListNode(3,new ListNode(4,new ListNode(5,null)))));
		//ListNode node = new ListNode();
		ListNode movenode = node;
		
		 while (head != null)
	        {
	            if (head.val != val){
	                movenode.next = head;
	                movenode = movenode.next;
	                head = head.next;
	              //  movenode.next = null;
	            }else{
	                head = head.next;
	            }
	        }
	    return node.next;
	}

}
