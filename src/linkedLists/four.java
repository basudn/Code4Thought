package linkedLists;

public class four {
	public static void main(String[] args) {
		Node first = new Node(1);
		first.appendToTail(2).appendToTail(3);
		Node second = new Node(3);
		second.appendToTail(4).appendToTail(9).appendToTail(1);
		Node result = addElements(first, second);
		result.printElements();
	}

	private static Node addElements(Node first, Node second) {
		Node result = new Node(0);
		int carry = 0;
		while (carry > 0 || first != null || second != null) {
			int firstNum = 0, secondNum = 0;
			if (first == null) {
				firstNum = 0;
			} else {
				firstNum = first.data;
				first = first.next;
			}
			if (second == null) {
				secondNum = 0;
			} else {
				secondNum = second.data;
				second = second.next;
			}
			result = result.appendToTail((firstNum + secondNum + carry) % 10);
			carry = (firstNum + secondNum + carry) / 10;			
		}
		result = result.deleteHead();
		return result;
	}
}
