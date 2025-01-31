package b_operator;

import java.util.Scanner;

public class _02_practice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("두 자릿수 정수 >> ");
		int num = sc.nextInt();
		
		System.out.println("십의 자리 : " + num/10);
		System.out.println("일의 자리 : " + num%10);
		
	}
}
