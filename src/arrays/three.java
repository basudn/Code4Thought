package arrays;

public class three {
	public static void main(String[] args) {
		String input = "asabdfdfh";
		System.out.println(removeDuplicates(input.toCharArray()));
	}

	private static String removeDuplicates(char[] input) {
		String out = "";
		if (input == null || input.length == 0) {
			return "Invalid string";
		} else if (input.length == 1) {
			return out += input[0];
		} else {
			for (int i = 1; i < input.length; i++) {
				for (int j = 0; j < input.length - i; j++) {
					if (input[j] == input[i + j]) {
						input[i + j] = '\0';
					}
				}
			}
			for (char c : input) {
				if (c != '\0') {
					out += c;
				}
			}
			return out;
		}
	}
}
