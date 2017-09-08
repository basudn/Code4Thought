package arrays;

public class seven {
	public static void main(String[] args) {
		int[][] img = generateGrid(8, 9);
		printArr(img);
		printArr(zeroingGrid(img));
	}
	
	private static int[][] zeroingGrid(int[][] img) {
		int[] rows = new int[img.length];
		int[] cols = new int[img[0].length];
		for(int i=0; i<img.length; i++) {
			for(int j=0; j<img[i].length; j++) {
				if(img[i][j] == 0) {
					rows[i] = 1;
					cols[j] = 1;
				}
			}
		}
		for(int i=0; i<img.length; i++) {
			for(int j=0; j<img[i].length; j++) {
				if(rows[i] == 1 || cols[j] == 1) {
					img[i][j] = 0;
				}
			}
		}
		return img;
	}

	public static int[][] generateGrid(int m, int n) {
		int[][] img = new int[m][n];
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				img[i][j] = (int) (Math.random()*m);
			}
		}
		return img;
	}
	
	public static void printArr(int[][] img) {
		String obj = "";
		for(int i=0; i<img.length; i++) {
			for(int j=0; j<img[i].length; j++) {
				obj += img[i][j];
			}
			obj += "\n";
		}
		System.out.println(obj);
	}
}
