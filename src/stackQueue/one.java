package stackQueue;

public class one {
	static int stackSize = 5;
	static int[] data = new int[3 * stackSize];
	static int[] stackPointers = { 0, 0, 0 };

	public static void push(int stackNum, int num) throws IllegalAccessException {
		if(stackNum < 1 || stackNum > 3) {
			throw new IllegalAccessException("Stack Not Found!");
		}
		if (stackPointers[stackNum - 1] < stackSize) {
			data[(stackNum - 1) * stackSize + stackPointers[stackNum - 1]] = num;
			stackPointers[stackNum - 1]++;
		} else {
			throw new IllegalAccessException("Stack Full!");
		}
	}

	public static int pop(int stackNum) throws IllegalAccessException {
		if(stackNum < 1 || stackNum > 3) {
			throw new IllegalAccessException("Stack Not Found!");
		}
		if (stackPointers[stackNum - 1] > 0) {
			stackPointers[stackNum - 1]--;
			return data[(stackNum - 1) * stackSize + stackPointers[stackNum - 1]];
		} else {
			throw new IllegalAccessException("Stack Empty!");
		}
	}

	public static void printStack(int stackNum) throws IllegalAccessException {
		if(stackNum < 1 || stackNum > 3) {
			throw new IllegalAccessException("Stack Not Found!");
		}
		for (int i = 0; i < stackPointers[stackNum - 1]; i++) {
			System.out.println(data[(stackNum - 1) * stackSize + i]);
		}
	}

	public static void main(String[] args) throws IllegalAccessException {
		push(1, 1);
		push(1, 2);
		push(1, 3);
		push(1, 4);
		push(1, 5);
		printStack(1);
		printStack(2);
		printStack(3);
	}
}
