package linkedLists;

public class three {
	public static void main(String[] args) {
		Node head = new Node(1);
		head.appendToTail(2).appendToTail(3).appendToTail(1).appendToTail(4).appendToTail(5).appendToTail(1);
		Node chosen = findElementNode(head, 3);
		removeElementFromMiddle(chosen);
		head.printElements();
	}

	private static void removeElementFromMiddle(Node chosen) {
		if(chosen.next != null) {
			chosen.data = chosen.next.data;
			chosen.next = chosen.next.next;
		}
	}

	private static Node findElementNode(Node head, int i) {
		Node cursor = head;
		while(cursor.next != null) {
			if (cursor.data == i) {
				break;
			}
			cursor = cursor.next;
		}
		return cursor;
	}	
}
