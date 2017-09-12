package stackQueue;

public class two {
	class NodeMin {
		NodeMin next;
		int data;
		int minVal;

		public NodeMin(int data, int min) {
			this.data = data;
			this.minVal = min;
		}
	}

	static NodeMin node;

	public static void push(int data) {
		if (node == null) {
			node = new two().new NodeMin(data, data);
		} else {
			NodeMin newNode = new two().new NodeMin(data, Math.min(node.minVal, data));
			newNode.next = node;
			node = newNode;
		}
	}

	public static void pop() {
		if (node != null) {
			node = node.next;
		}
	}

	public static void display() {
		NodeMin cursor = node;
		while (cursor != null) {
			System.out.println(cursor.data);
			cursor = cursor.next;
		}
	}

	public static void getMin() {
		System.out.println(node.minVal);
	}

	public static void main(String[] args) {
		push(4);
		push(2);
		display();
		getMin();
		pop();
		display();
		getMin();
	}
}
