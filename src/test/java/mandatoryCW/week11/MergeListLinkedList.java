package mandatoryCW.week11;

import mandatoryCW.week11.RemoveLinkedListEles.ListNode;

public class MergeListLinkedList 
{
	/* Pseudo Code:
	 * 1) Create an object for the node
	 * 2) assign the object to another new node called movenode
	 * 3) Check while list one != null and list 2 not equals to null
	 * 4) if list1 is less than list 2
	 * 5) movenode.next is equals to list1 and movenode is equals to movenode.next
	 * 6) and list1 is equals to list1.next
	 * 7) else line no 6 and 7 above to be performed for list2
	 * 8) another while loop when list1 not equals to null
	 * 9) movenode.next is equals to list1 and movenode is equals to movenode.next
	 * 10) and list1 is equals to list1.next
	 * 11) 9 and 10 to be performed when list2 not equals to null
	 * 12) return node.next
	 */
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

		public ListNode() {
			// TODO Auto-generated constructor stub
		}
	}
		
	public ListNode mergeList(ListNode list1, ListNode list2)
	{
		    ListNode node = new ListNode();
	        ListNode movenode = node;

	        while (list1 != null && list2 != null)
	         {
	             if (list1.val < list2.val){
	                 movenode.next = list1;
	                 movenode = movenode.next;
	                 list1 = list1.next;
	             }else{
	                 movenode.next = list2;
	                 movenode = movenode.next;
	                 list2 = list2.next;
	             }
	         }

	         while (list1 != null){
	                 movenode.next = list1;
	                 movenode = movenode.next;
	                 list1 = list1.next;
	         }

	         while (list2 != null){
	                 movenode.next = list2;
	                 movenode = movenode.next;
	                 list2 = list2.next;
	         }

	         return node.next;
	}
	
}
