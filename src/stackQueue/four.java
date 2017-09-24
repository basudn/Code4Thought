package stackQueue;

import java.util.Stack;

public class four {
	public static void main(String[] args) {
		Stack<Integer>[] stacks = new Stack[3];
		stacks[0] = new Stack<>();
		stacks[1] = new Stack<>();
		stacks[2] = new Stack<>();
		for (int i = 5; i >= 1; i--) {
			stacks[0].push(i);
		}
		moveTower(4, stacks[0], stacks[2], stacks[1]);
		System.out.println(stacks[2]);
	}

	private static void moveTower(int num, Stack<Integer> source, Stack<Integer> destination, Stack<Integer> buffer) {
		if (num == 0) {
			int data = source.pop();
			destination.push(data);
		} else {
			moveTower(num - 1, source, buffer, destination);
			int data = source.pop();
			destination.push(data);
			moveTower(num - 1, buffer, destination, source);
		}
	}
}
