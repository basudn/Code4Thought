package arrays;

public class six {
	public static void main(String[] args) {
		int[][] img = generateGrid(9);
		System.out.println(rotateImage(img));
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

	private static String rotateImage(int[][] img) {
		int len = img.length; 
		int innerLen = len/2;
		if(len%2 != 0) {
			innerLen = innerLen+1;
		}
		for(int i=0; i<len/2; i++) {
			for(int j=0; j<innerLen; j++) {
				int temp = img[i][j];
				img[i][j] = img[len-1-j][i];
				img[len-1-j][i] = img[len-1-i][len-1-j];
				img[len-1-i][len-1-j] = img[j][len-1-i];
				img[j][len-1-i] = temp;	
			}
		}
		String obj = "";
		for(int i=0; i<len; i++) {
			for(int j=0; j<len; j++) {
				obj += img[i][j];
			}
			obj += "\n";
		}
		return obj;
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
