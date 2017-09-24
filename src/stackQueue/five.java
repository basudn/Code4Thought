package stackQueue;

import java.util.Stack;

public class five {

	static Stack<Integer> front = new Stack<>();
	static Stack<Integer> back = new Stack<>();

	static void enqueue(int d) {
		back.push(d);
	}

	static void dequeue() {
		if (front.isEmpty()) {
			while (!back.isEmpty()) {
				front.push(back.pop());
			}
		}
		front.pop();
	}

	static void displayElements() {
		System.out.println(front);
		System.out.println(back);
	}

	public static void main(String[] args) {
		enqueue(1);
		enqueue(2);
		displayElements();
		dequeue();
		displayElements();
	}
}
