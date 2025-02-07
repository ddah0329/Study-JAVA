package a_array;

import java.util.Scanner;

public class _02_array_practice {
	public static void main(String[] args) {
		// 10칸 배열 선언 후, 1~10까지의 값을 저장한다.
		int[] arrData = new int[10];
		
		for (int i = 0; i < arrData.length; i++) {
			arrData[i] = i + 1;
		}
		
		for (int i = 0; i < arrData.length; i++) {
			System.out.print(arrData[i]);
		}
		
		System.out.println();
		
		String q1 = """
				
				1. 100 ~ 1까지의 값 배열에 저장 후 모두 출력
				----------------- """;
		
		System.out.println(q1);
		
		int[] arrQ1 = new int[100];
		
		for (int i = 0; i < 100; i++) {
			arrQ1[i] = 100 - i;
			System.out.print(arrQ1[i] + " ");
			
			if (i % 10 == 0) {
				System.out.println("");
			}
		}
		
		
		String q2 = """
				
				2. 1~10까지의 값을 배열에 저장 후 총 합을 출력
				-----------------
				""";
		
		System.out.println("");
		System.out.print(q2);
		
		int[] arrQ2 = new int[10];
		
		for (int i = 0; i < 10; i++) {
			arrQ2[i] = i + 1;
		}
		
		int arrQ2_sum = 0;
		
		for (int i = 0; i < 10; i ++ ) {
			arrQ2_sum += arrQ2[i];
		}
		
		System.out.println(arrQ2_sum);
		
		
		String q3 = """
				
				3. 3명의 수학 점수를 사용자에게 입력받아 배열에 저장 후 평균 점수 출력
				-----------------
				""";
		
		System.out.print(q3);
		
		Scanner sc = new Scanner (System.in);
		
		int[] arrQ3 = new int[3];
		
		for (int i = 0; i < arrQ3.length; i++) {
			System.out.print((i+1) + "번째 학생의 수학 점수 >> ");
			arrQ3[i] = sc.nextInt();
		}
		
		int arrQ3_sum = 0;
		
		for (int i = 0; i < arrQ3.length; i++) {
			arrQ3_sum += arrQ3[i];
		}
		
		double arrQ3_avg = arrQ3_sum / arrQ3.length;
		
		System.out.println("**" + arrQ3.length + "명의 평균 수학 점수는 " + arrQ3_avg + "점이다.");
		
		sc.close();
	}
}
