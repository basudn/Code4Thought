package linkedLists;

public class six {
	public static void main(String[] args) {
		Node head = new Node(1);
		head.appendToTail(2).appendToTail(3).appendToTail(6).appendToTail(4).appendToTail(5).appendToTail(1);
		head.printElements();
		System.out.println();
		sortList(head);
	}

	private static void sortList(Node head) {
		Node cursor = null, pivot = null, prevNode = null, prevCursor = null, newHead = null;
		while(head.next != null) {
			cursor = head;
			pivot = head;
			prevCursor = null;
			while(cursor.next != null) {
				if(cursor.next.data <= pivot.data) {
					pivot = cursor.next;
					prevCursor = cursor;
				}
				cursor = cursor.next;
			}
			if(pivot != head) {
				if(prevCursor.next != null) {
					prevCursor.next = prevCursor.next.next;
				}
				if(prevNode != null) {
					prevNode.next = pivot;
				}
				pivot.next = head;
				head = pivot;
			}
			if(newHead == null) {
				newHead = head;
			}
			prevNode = head;
			head = head.next;			
		}
		newHead.printElements();
	}
}
