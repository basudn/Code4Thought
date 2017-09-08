package linkedLists;

public class one {
	public static void main(String[] args) {
		Node head = new Node(1);
		head.appendToTail(2).appendToTail(3).appendToTail(1).appendToTail(4).appendToTail(5).appendToTail(1);
		head = removeDuplicates(head);
		head.printElements();
	}

	private static Node removeDuplicates(Node head) {
		int steps = 1;
		Node reference = head;
		Node cursor = moveCursor(reference, steps);
		while (cursor != null && cursor.next != null) {
			if (reference.data == cursor.next.data) {
				cursor.next = cursor.next.next;
			}
			if (cursor.next == null || cursor.next.next == null) {
				steps++;
				reference = head;
				cursor = moveCursor(reference, steps);
			} else {
				reference = reference.next;
				cursor = cursor.next;
			}
		}
		return head;
	}

	public static Node moveCursor(Node currentNode, int steps) {
		while (currentNode != null && steps > 1) {
			currentNode = currentNode.next;
			if (currentNode == null) {
				return currentNode;
			}
			steps--;
		}
		return currentNode;
	}
}
