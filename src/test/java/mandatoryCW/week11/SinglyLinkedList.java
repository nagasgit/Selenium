package mandatoryCW.week11;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

import mandatoryCW.week11.ReverseList.ListNode;

public class SinglyLinkedList 
{
	
	/*
	 * class Node{ int value; Node next;
	 * 
	 * public Node(int value) { this.value = value; next = null; } }
	 */
		
		ListNode head, tail;
		private int size = 0;
		
		public void add(int value) 
		{
			if (head == null)
				head = tail = new ListNode(value);
			else {
				tail.next = new ListNode(value);
				tail = tail.next;
			}
			size++;
		}
		
		public int size() {
			return size;
		}
		
		 public ListNode add(int[] value){
		        for(int each : value) add(each);
		        return head;
		    }
		
		/* 11,43,28,11,90
		 * head -> 11
		 * tail -> 90
		 * size -> 5
		 * 1) index = 0     => head = head.next; => 43
		 * 2) index > size  => no change
		 * 3) index < size  => 
		 * 		a) currently 28 is pointing to 11 and 11 is pointing to 90
		 * 		b) if 11 to be removed, then should change
		 * 			28 pointing to 90
		 * 
		 * 
		 */
		
		public void remove(int index) 
		{
			if (size <= index) return;
			else if (index == 0)
				head = head.next;
			else {
				int tempindex = 0;
				ListNode currNode = head, prevNode = head;
				while (currNode != null) {
					if (tempindex++ == index) {
						prevNode.next = currNode.next;
						break;
					}
					prevNode = currNode;
					currNode = currNode.next;		
				}
			}
			size--;
		}
		
		@Test
		public void test() {
			SinglyLinkedList obj = new SinglyLinkedList();
			for (int each : new int[] {11,22,33,44,55}) 
			{
				obj.add(each);
			}
			int size2 = obj.size();
			System.out.println(size2);
			obj.remove(3);
			System.out.println(obj.size());
			//List<Integer> list = new ArrayList<Integer>();
		}
	}
