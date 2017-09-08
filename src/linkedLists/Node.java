package linkedLists;

public class Node {
	Node next = null;
	int data;
	public Node(int d) {
		this.data = d;
	}
	
	public Node appendToTail(int d) {
		Node head = this;
		Node end = new Node(d);
		Node cursor = head;
		while(cursor.next != null) {
			cursor = cursor.next;
		}
		cursor.next = end;
		return head;
	}
	
	public Node deleteFromTail() {
		Node head = this;
		if(head.next == null) {
			return null;
		}
		Node cursor = head;
		while(cursor.next != null) {
			if(cursor.next.next == null) {
				cursor.next = null;
				return head;
			}
			cursor = cursor.next;
		}
		return null;
	}
	
	public Node deleteHead() {
		Node head = this;
		return head.next;
	}
	
	public Node appendAtHead(int d) {
		Node head = this;
		Node newHead = new Node(d);
		newHead.next = head;
		return newHead;
	}
	
	public void printElements() {
		Node cursor = this;
		while(cursor != null) {
			System.out.println(cursor.data);
			cursor = cursor.next;
		}
	}
}
