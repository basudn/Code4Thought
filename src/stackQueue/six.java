package stackQueue;

import java.util.Stack;

public class six {
	public static void main(String[] args) {
		Stack<Integer> numbers = new Stack<>();
		numbers.push(5);
		numbers.push(3);
		numbers.push(7);
		sortStack(numbers);
	}

	private static void sortStack(Stack<Integer> numbers) {
		Stack<Integer> sorted = new Stack<>();
		while (!numbers.isEmpty()) {
			int tmp = numbers.pop();
			while (!sorted.isEmpty() && sorted.peek() > tmp) {
				numbers.push(sorted.pop());
			}
			sorted.push(tmp);
		}
		System.out.println(sorted);
	}
}
