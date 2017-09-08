package linkedLists;

public class four_1 {
	public static void main(String[] args) {
		Node first = new Node(1);
		first.appendToTail(2).appendToTail(3);
		Node second = new Node(3);
		second.appendToTail(4).appendToTail(9).appendToTail(1);
		Node result = addElements(first, second, 0);
		result.printElements();
	}

	private static Node addElements(Node first, Node second, int carry) {
		if (carry == 0 && first == null && second == null) {
			return null;
		}
		int sum = carry;
		if (first == null) {
			sum += 0;
		} else {
			sum += first.data;
			first = first.next;
		}
		if (second == null) {
			sum += 0;
		} else {
			sum += second.data;
			second = second.next;
		}
		Node result = new Node(sum % 10);
		carry = sum / 10;
		result.next = addElements(first, second, carry);
		return result;
	}
}
