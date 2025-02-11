package b_fastFor;

public class _01_fastFor {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		
		// normal for문
		for (int i=0; i<arr.length; i++) {
			System.out.print(arr[i]); //12345
		}
		
		System.out.println("\n");
		
		// fast for문
		for (int num : arr) {
			System.out.print(num); // 12345
		}
		
		System.out.println("\n");
		
		String[] arr_s = {"a", "b", "c"};
		
		for (String alpha : arr_s) {
			System.err.print(alpha);
		}
		
	}
}
