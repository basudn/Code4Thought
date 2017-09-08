package linkedLists;

import java.util.HashMap;
import java.util.Map;

public class one_1 {
	public static void main(String[] args) {
		Node head = new Node(1);
		head.appendToTail(2).appendToTail(3).appendToTail(1).appendToTail(4).appendToTail(5).appendToTail(1);
		head = removeDuplicates(head);
		head.printElements();
	}

	private static Node removeDuplicates(Node head) {
		Map<Integer, Boolean> elementMap = new HashMap<>();
		Node cursor = head;
		elementMap.put(cursor.data, true);
		while(cursor != null && cursor.next != null) {
			if(elementMap.containsKey(cursor.next.data)) {
				cursor.next = cursor.next.next;
			} else {
				elementMap.put(cursor.next.data, true);
			}
			cursor = cursor.next;
		}
		return head;
	}
}
