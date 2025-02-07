package a_array;

public class _01_array {
	public static void main(String[] args) {
		int[] ar = {10, 20, 30, 40, 50};

		System.out.println(ar[0]); // 10 
		
		ar[0] = 100;
		System.out.println(ar[0]); // 100
		
		System.out.println("ar[]의 길이 : " + ar.length);
		
		// for 문을 활용하여 배열의 처음 요소부터 마지막 요소까지 전부 출력 가능하다.
		// 배열에 저장된 값을 '요소(element)"라고도 부른다.
		
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ");
		}
		
		System.out.println("");
		
		for (int i = 0; i < ar.length; i++) {
			ar[i] = 100;
//			System.out.println(Arrays.toString(ar));
		}
		
		// 배열 생성
		
		int[] arr_int = new int[5];
		System.out.println(arr_int[0]); // 0
		
		double[] arr_double = new double[5];
		System.out.println(arr_double[0]); // 0.0
		
		char[] arr_char = new char[5];
		System.out.println(arr_char[0]); // ㅁ
		
		String[] arr_String = new String[5];
		System.out.println(arr_String[0]); // null
		
		// 배열 내부에 저장할 값을 초기화하지 않았을 때 자동으로 들어가는 값들을 기본값(default value)라고 한다.
		
	}
}
