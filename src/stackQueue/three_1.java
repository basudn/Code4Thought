package stackQueue;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class three_1 {
	static List<Stack<Integer>> stacks = new ArrayList<>();

	public static void push(int data) {
		if (stacks.size() == 0) {
			Stack<Integer> stack = new Stack<>();
			stack.push(data);
			stacks.add(stack);
		} else {
			Stack<Integer> stack = stacks.get(stacks.size() - 1);
			if (stack.size() < 5) {
				stack.push(data);
			} else {
				stack = new Stack<>();
				stack.push(data);
				stacks.add(stack);
			}
		}
	}

	public static void pop() {
		if (stacks.size() > 0) {
			Stack<Integer> stack = stacks.get(stacks.size() - 1);
			if (stack.size() > 0) {
				stack.pop();
			} else {
				stacks.remove(stacks.size() - 1);
				stack = stacks.get(stacks.size() - 1);
				while (stacks.size() > 1 && stack.size() == 0) {
					stacks.remove(stacks.size() - 1);
					stack = stacks.get(stacks.size() - 1);
				}
				if (stack.size() > 0) {
					stack.pop();
				}
			}
		}
	}

	public static void popAt(int index) {
		Stack<Integer> stack = stacks.get(index);
		if (stack != null && stack.size() > 0) {
			stack.pop();
		}
	}

	public static void display() {
		for (Stack<Integer> stack : stacks) {
			for (Integer item : stack) {
				System.out.println(item);
			}
		}
	}

	public static void main(String[] args) {
		push(1);
		push(2);
		push(3);
		push(4);
		push(5);
		push(6);
		display();
		popAt(0);
		popAt(0);
		popAt(0);
		popAt(0);
		popAt(0);
		pop();
		pop();
		display();
	}
}
