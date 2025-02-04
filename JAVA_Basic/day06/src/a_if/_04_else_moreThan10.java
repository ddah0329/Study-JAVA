/*
 * 정수를 입력받아 정수가 10보다 큰 수인지, 작은 수인지 판별하는 프로그램
 * if - else를 사용하여 만들기
 */

package a_if;

import java.util.Scanner;

public class _04_else_moreThan10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int targetNum = 10;
		System.out.print("정수 입력 >> ");
		int insert = sc.nextInt();
		
		if (insert > targetNum) {
			System.out.println(insert + "가 " + targetNum + "보다 크다.");			
		} else {
		System.out.println(insert + "가 " + targetNum + "보다 같거나 작다.");
		}	
	}
}
