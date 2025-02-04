/*
 * 사용자에게 정수 하나를 입력받고 음수/양수/0 인지 판별하는 프로그램
 */

package a_if;

import java.util.Scanner;

public class _07_guessInt {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 >> ");
		int insert = sc.nextInt();
		
		if (insert > 0) {
			System.out.print(insert + "는 양수이다.");			
		} else if (insert == 0) {
			System.out.print(insert + "0이다.");			
		} else {
			System.out.println(insert + "는 음수이다.");
		}
	}

}
