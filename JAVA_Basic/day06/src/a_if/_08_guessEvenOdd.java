/*
 * 사용자에게 정수 하나를 입력받고 음수/양수/0 인지 판별하는 프로그램
 */

package a_if;

import java.util.Scanner;

public class _08_guessEvenOdd {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 >> ");
		int insert = sc.nextInt();
		
		if (insert / 2 == 1 || insert / 2 == -1) {
			System.out.println("짝수이다.");
		} else if (insert % 2 == 1 || insert % 2 == -1) {
			System.out.println("홀수이다.");
		} else if (insert == 0) {
			System.out.println("0이다.");
		}
	
	}
}
