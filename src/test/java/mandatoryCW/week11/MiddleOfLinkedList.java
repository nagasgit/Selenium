package mandatoryCW.week11;

public class MiddleOfLinkedList extends ReverseList
{
	public ListNode middleNode(ListNode head) {
        /* 
        1) Create an object for listnode
        2) create two objects fast and slow and assign the head to those objects
        3) while loop to check if (fast != 0 && fast.next != null)
        4) assign fast is equals to head.next and slow = head.next.next
        5) return slow
        */

        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
}
}