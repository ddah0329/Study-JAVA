package a_array;

import java.util.Scanner;

public class _03_array_practice {
	public static void main(String[] args) {
		String q1 = """
				
				1. 0,1,2,3,4,0,1,2,3,4를 반복문으로 배열에 저장하고 출력""";
		System.out.println(q1);
		
		
		String q2 = """
				
				2. aBcDeFgH......yZ 값을 배열에 저장하고 출력하기""";
		System.out.println(q2);
		
//		for(int i = 0; i < );
			
			
		String q3 = """
				
				3. 5개의 정수를 입력받아 배열에 저장 후, 최대값과 최소값 출력하기""";
		System.out.println(q3);
		
		Scanner sc = new Scanner(System.in);
		
		// 오름차순 sort해서 앞과 끝을 넣거나
		// [0] 값을 최대값과 최소값 변수에 넣어서 차근차근 순회할때마다 비교해서 작으면 최소값 데이터를 업데이트하는 방법
		
		int[] arrQ3 = new int[5];
		
		for (int i = 0; i < 5; i++) {
			System.out.print((i+1) + "번째 정수 >> ");
			arrQ3[i] = sc.nextInt();
		}
		
		int arrQ3_min = 0;
		int arrQ3_max = 0;
		
		System.out.println("최대값 : " + arrQ3_max);
		System.out.println("최소값 : " + arrQ3_min);
		

		sc.close();
	}
}
