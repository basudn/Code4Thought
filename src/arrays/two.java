package arrays;

public class two {
	public static void main(String[] args) {
		String input = "djadasbdasdg ";
		System.out.println(reverseString(input.toCharArray()));
	}

	private static String reverseString(char[] input) {
		if(input == null || input.length == 0) {
			return "Invalid string";
		}
		if(input.length > 1) {
			for(int i=0; i<(input.length-1)/2; i++) {
				char temp = input[i];
				input[i] = input[input.length-2-i];
				input[input.length-2-i] = temp;
			}
		}
		return new String(input);
	}
}
