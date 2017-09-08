package arrays;

public class five {
	public static void main(String[] args) {
		String input = "bbda  shd";
		System.out.println(stringEncoder(input.toCharArray()));
	}

	private static String stringEncoder(char[] input) {
		if(input==null || input.length == 0) {
			return "Invalid string";
		}
		int spaceCount = 0;
		for(int i=0; i<input.length; i++) {
			if(input[i] == ' ') {
				spaceCount++;
			}
		}
		int len = input.length;
		int newLen = input.length+2*spaceCount-1;
		char[] output = new char[newLen+1];
		for(int i=len-1; i>=0; i--) {
			if(input[i] == ' ') {
				output[newLen--] = '0';
				output[newLen--] = '2';
				output[newLen--] = '%';
			} else {
				output[newLen--] = input[i];
			}
		}
		return new String(output);
	}
}
