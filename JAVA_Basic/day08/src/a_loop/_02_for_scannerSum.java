package a_loop;

import java.util.Scanner;

public class _02_for_scannerSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int sum = 0;
		
		for (int i = 1; i <=5 ; i++) {
			System.out.print("정수" + i + "입력 >> ");
			int input = sc.nextInt();
			sum += input;
			input = 0;
		}
		
		System.out.println("총 합은 " + sum +"입니다.");
		
	}

}
