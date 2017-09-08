package arrays;

public class one_1 {
	public static void main(String[] args) {
		String input = "qwertyuiop";
		System.out.println(findUniqueChars(input));
	}

	private static boolean findUniqueChars(String input) {
		if(input == null || input.length() == 0) {
			return false;
		}
		boolean[] ascii = new boolean[256];
		for(int i=0; i<input.length(); i++) {
			int ch = input.charAt(i);
			if(ascii[ch]) {
				return false;
			}
			ascii[ch] = true;
		}
		return true;
	}
}
