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
		Node cursor = head;
		while(cursor.next != null) {
			Node pivot = cursor, innerCursor = cursor, prevNode = cursor;
			while(innerCursor.next != null) {
				System.out.println(pivot.data+"+"+innerCursor.next.data);
				if(pivot.data >= innerCursor.next.data) {
					pivot = innerCursor.next;
					prevNode = innerCursor;
				}
				innerCursor = innerCursor.next;
			}
			if(prevNode != cursor) {
				System.out.println("in");
				Node temp = prevNode.next;
				prevNode.next = prevNode.next.next;
				if(head.data == cursor.data) {
					temp.next = head;
					head = temp;
				} else {
					temp.next = cursor;
					cursor = temp;
				}
			}
			cursor = cursor.next;
		}
		head.printElements();
	}
}
