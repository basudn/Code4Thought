package arrays;

public class four {
	public static void main(String[] args) {
		String inputOne = "sdsdnskd";
		String inputTwo = "sddsnskd";
		System.out.println(findAnagrams(inputOne, inputTwo));
	}

	private static boolean findAnagrams(String inputOne, String inputTwo) {
		if(inputOne == null || inputOne.length() == 0 || inputTwo == null || inputTwo.length() == 0) {
			return false;
		} else if(inputOne.length() != inputTwo.length()) {
			return false;
		} else {
			int[] charCount = new int[256];
			for(int i=0; i<inputOne.length(); i++) {
				int ch = inputOne.charAt(i);
				charCount[ch]++;
			}
			for(int i=0; i<inputTwo.length(); i++) {
				int ch = inputTwo.charAt(i);
				charCount[ch]--;
			}
			for(int i : charCount) {
				if(i!=0) {
					return false;
				}
			}
			return true;
		}
	}
}
