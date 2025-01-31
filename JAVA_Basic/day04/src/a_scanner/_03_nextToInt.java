package a_scanner;

import java.util.Scanner;

public class _03_nextToInt {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		// parseInt 사용하기 -> 이런 방법도 있지만 정말 비효율적
		System.out.print("정수 1 >> ");
		int num1 = Integer.parseInt(sc.next());
		System.out.print("정수 2 >> ");
		int num2 = Integer.parseInt(sc.next());
		
		System.out.println("두 정수의 합은 " + (num1 + num2) + "입니다.");
//		System.out.println("num1 type : " + num1.getClass().getName());
//		Cannot invoke getClass() on the primitive type int
		
		// nextInt 사용하기 -> 정석 방법
		System.out.print("정수 3 >> ");
		int num3 = sc.nextInt();
		System.out.print("정수 4 >> ");
		int num4 = sc.nextInt();
		
		System.out.println("두 정수의 합은 " + (num3 + num4) + "입니다.");
//		System.out.println("num3 type : " + num3.getClass().getName());
//		Cannot invoke getClass() on the primitive type int
		
    }
}
