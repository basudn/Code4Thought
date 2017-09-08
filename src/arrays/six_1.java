package arrays;

public class six_1 {
	public static void main(String[] args) {
		int[][] img = generateGrid(3);
		printArr(rotateImage(img));
	}
	
	private static int[][] rotateImage(int[][] img) {
		int len = img.length;
		if(len == 1) {
			return img;
		}
		for(int i=0; i<len/2; i++) {
			for(int j=i; j<len-1-i; j++) {
				int temp = img[i][j];
				img[i][j] = img[len-1-j][i];
				img[len-1-j][i] = img[len-1-i][len-1-j];
				img[len-1-i][len-1-j] = img[j][len-1-i];
				img[j][len-1-i] = temp;
			}
		}
		return img;
	}

	public static int[][] generateGrid(int n) {
		int[][] img = new int[n][n];
		for(int i=0; i<img.length; i++) {
			for(int j=0; j<img.length; j++) {
				img[i][j] = i;
			}
		}
		return img;
	}
	
	public static void printArr(int[][] img) {
		int len = img.length;
		String obj = "";
		for(int i=0; i<len; i++) {
			for(int j=0; j<len; j++) {
				obj += img[i][j];
			}
			obj += "\n";
		}
		System.out.println(obj);
	}
}
