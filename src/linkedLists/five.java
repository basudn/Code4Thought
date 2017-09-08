package linkedLists;

public class five {
	public static void main(String[] args) {
		Node head = new Node(1);
		head.appendToTail(2).appendToTail(3).appendToTail(1).appendToTail(4).appendToTail(5).appendToTail(1);
		head.next.next.next.next.next = head.next;
		findLoopStart(head);
	}

	private static void findLoopStart(Node head) {
		Node cursorOne = head, cursorTwo = head;
		while(cursorTwo.next != null) {
			cursorOne = cursorOne.next;
			cursorTwo = cursorTwo.next.next;
			if(cursorOne == cursorTwo) {
				break;
			}
		}
		if(cursorTwo.next == null) {
			System.out.println("no loop");
			return;
		}
		cursorOne = head;
		while(cursorOne!=cursorTwo) {
			cursorOne = cursorOne.next;
			cursorTwo = cursorTwo.next;
		}
		System.out.println(cursorTwo.data);
	}
}
