package arrays;

public class one {
	public static void main(String[] args) {
		String input = "asdfghjkl";
		System.out.println(findUniqueChars(input));
	}
	
	public static boolean findUniqueChars(String input) {
		if(input == null || input.length() == 0) {
			return false;
		}
		int len = input.length();
		for(int i=1; i<len; i++) {
			for(int j=0; j<len-i; j++) {
				System.out.println(input.charAt(j)+" "+input.charAt(i+j));
				if(input.charAt(j) == input.charAt(i+j)) {
					return false;
				}
			}
		}
		return true;
	}
}
