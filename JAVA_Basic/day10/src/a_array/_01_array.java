package a_array;

public class _01_array {
	public static void main(String[] args) {
		
		// 1차원 배열
		int[] arr1 = new int[5];
		System.out.println(arr1); // [ 한개로 주소값 나온다 = 1차원 배열이다.
		
		// 2차원 배열
		int[][] arr2_01 = new int[3][5];
		
		System.out.println(arr2_01); // [[ 두개로 주소값 나온다 = 2차원 배열이다.
		System.out.println(arr2_01[0]); // [ 한개로 주소값 나온다 = 1차원 배열이다.
		System.out.println(arr2_01[1]);
		System.out.println(arr2_01[0][3]); // 0 (값)
		
		// 다차원 배열의 길이를 구할 경우, 바로 직전의 배열의 갯수를 출력한다. 
		System.out.println(arr2_01.length); // 3
		System.out.println(arr2_01[0].length); // 5
		System.out.println(arr2_01[2].length); // 5
		
		// 2차원 배열 생성함과 동시에 값 넣기
		int[][] arr2_02 = {
				{1, 2, 3, 0},
				{4, 5, 6, 0},
				{7, 8, 9, 0}
		};
		
		for (int i = 0; i < arr2_02.length; i++) { // 행을 기준이니까 3을 의미한다. 
			for (int j = 0; j < arr2_02[i].length; j++) {
				System.out.print(arr2_02[i][j]);
			}
		}
		
		
	}
}
