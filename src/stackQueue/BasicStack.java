package stackQueue;

public class BasicStack {
	Node top;

	public Node push(int data) {
		Node node = new Node(data);
		if (top == null) {
			top = node;
		} else {
			node.next = top;
			top = node;
		}
		return top;
	}

	public Node pop() {
		if (top != null) {
			top = top.next;
		}
		return top;
	}

	public void displayElements() {
		Node cursor = top;
		while (cursor != null) {
			System.out.println(cursor.data);
			cursor = cursor.next;
		}
	}

	public static void main(String[] args) {
		BasicStack stack = new BasicStack();
		stack.push(1);
		stack.displayElements();
		stack.push(2);
		stack.displayElements();
		stack.pop();
		stack.push(3);
		stack.displayElements();
	}
}
