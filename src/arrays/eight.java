package arrays;

public class eight {
	public static void main(String[] args) {
		String inputOne = "waterbottle";
		String inputTwo = "ttlewaterbo";
		String rep = inputOne+inputOne;
		if(rep.indexOf(inputTwo) == -1) {
			System.out.println(false);
		} else {
			System.out.println(true);
		}
	}
}
