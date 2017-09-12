package arrays;

public class test {
	public static void main(String[] args) {
		int[] arr = { 0, 0, 0, 1 };
		int count0 = 0, count1 = 0;
		int[] avg = new int[arr.length];
		for(int i=0; i<arr.length; i++) {
			avg[i] = arr[i];
		}
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == 1) {
				count1 += bringFront(arr, i, 1);
			}
		}
		for(int i=0; i<avg.length; i++) {
			if(avg[i] == 0) {
				count0 += bringFront(avg, i, 0);
			}
		}
		System.out.println((count1<count0) ? count1 : count0);
	}
	
	public static int bringFront(int[] arr, int i, int digit) {
		int count = 0;
		if(i==0)
			return 0;
		for(int n=i; n>0; n--) {
			if(arr[n-1] != digit) {
				arr[n-1] = digit;
				arr[n] = 1-digit;
				count++;
			} else {
				break;
			}
		}
		return count;
	}
}