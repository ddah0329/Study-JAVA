package a_loop;

import java.util.Scanner;

public class _01_for_scannerEvenOdd {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		for (int i = 0; i < 3; i++) {
			System.out.print("정수 입력 >> "); 
			
			int input = sc.nextInt();
	
			if (input % 2 == 0) {
				System.out.println(input + "은 짝수 입니다. ");
			} else if (input % 2 ==1 ) {
				System.out.println(input + "은 홀수 입니다. ");
			}
		}
	}
}
