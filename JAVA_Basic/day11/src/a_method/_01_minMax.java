package a_method;

public class _01_minMax {
	public static void main(String[] args) {
		printMinMax(new int[] {10,3,1,7,22,14});
	}
	
	static void printMinMax(int[] ar) {
		int min = ar[0], max = ar[0];
		
		for (int i=1; i<ar.length; i++) {
			min = min > ar[i] ? ar[i] : min;
			max = max < ar[i] ? ar[i] : max;
		}
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);		
	}

}
