package mandatoryCW.week11;

public class RemoveDuplicatesSortedList extends ReverseList
{
	 public ListNode deleteDuplicates(ListNode head) {

	        /*
	            1) Create a Listnode object and assign the head to it
	            2) while loop to check if (movenode != null && movenode.next != null)
	            3) if (movenode.val == movenode.next.val)
	            4) movenode.next = movenode.next.next;
	            5) else movenode = movenode.next
	            6) return the node
	        */

	        ListNode movenode = head;
	        while(movenode != null && movenode.next != null){
	            if (movenode.val == movenode.next.val){
	                movenode.next = movenode.next.next;
	            }else{
	                movenode = movenode.next;
	            }
	        }
	        return head;
	    }
	
}
