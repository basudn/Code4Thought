package stackQueue;

public class BasicQueue {
	Node first;
	Node last;
	
	public Node enqueue(int data) {
		Node node = new Node(data);
		if(first == null) {
			first = node;
		} else {
			last.next = node;
		}		
		last = node;
		return first;
	}
	
	public Node dequeue() {
		if(first != null) {
			first = first.next;
		}
		return first;
	}
	
	public void displayElements() {
		Node cursor = first;
		while(cursor != null) {
			System.out.println(cursor.data);
			cursor = cursor.next;
		}			
	}
	
	public static void main(String[] args) {
		BasicQueue queue = new BasicQueue();
		queue.enqueue(1);
		queue.enqueue(2);
		queue.displayElements();
		queue.dequeue();
		queue.enqueue(3);
		queue.displayElements();
	}
}
