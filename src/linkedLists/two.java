package linkedLists;

public class two {
	public static void main(String[] args) {
		Node head = new Node(1);
		head.appendToTail(2).appendToTail(3).appendToTail(1).appendToTail(4).appendToTail(5).appendToTail(1);
		head = removeElement(head, 3);
		head.printElements();
	}
	
	private static Node removeElement(Node head, int i) {
		Node reference = head;
		Node cursor = nodeShifter(reference, i);
		while(cursor.next != null) {
			if(cursor.next.next == null) {
				reference.next = reference.next.next;
			}
			reference = reference.next;
			cursor = cursor.next;
		}
		return head;
	}

	public static Node nodeShifter(Node currentNode, int step) {
		while(currentNode != null && step>1) {
			if(currentNode.next == null) {
				return null;
			}
			currentNode = currentNode.next;
			step--;
		}
		return currentNode;
	}
}
