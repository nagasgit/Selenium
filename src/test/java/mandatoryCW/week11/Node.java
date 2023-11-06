package mandatoryCW.week11;

import java.util.LinkedList;

import net.bytebuddy.implementation.bytecode.ByteCodeAppender.Size;

public class Node 
{
	int data;
	Node next;
	int index;
	
		public Node(int key) 
		{
			this.data = key;
			next = null;		
		}
		
		public Node(int key, Node next) 
		{
			this.data = key;
			this.next = next;		
		}
	
		public static int size(Node head) 
		{
			int size = 0;
			while (head != null)
			{
				size++;
			}
			return size;
		}
		
		public void remove(int index) 
		{
			
		}
	
	public static void main(String[] args) 
		{
			Node head = new Node(11, new Node(22, new Node(33, new Node(90, null))));
			while (head != null) {
				System.out.println(head.data);
				head = head.next;
			}
			size(head);
		}
	
	
	
	/*
	 * public Node addNode(int data) { return new Node(data); }
	 */
}